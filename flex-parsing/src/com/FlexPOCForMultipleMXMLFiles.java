package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FlexPOCForMultipleMXMLFiles {

	enum EventsCap {
		id, click, change, clean, focusIn, focusOut, clear, initialize, contextMenu, copy, currentState,
		currentStateChange, currentStateChanging, doubleClick;
	}

	private final String fileLocation = "C:\\Users\\719911\\Documents\\workspace-sts\\Flex-Parsing\\src\\mxml";
	private final String mxmlFileExtension = ".mxml";
	private final String IDAttribute = "id";

	public static void main(String[] args) throws IOException {
		FlexPOCForMultipleMXMLFiles mainClass = new FlexPOCForMultipleMXMLFiles();
		/* Code for generating excel for MXML files */
		mainClass.getAllInforForFlexElement();
	}

	private void getAllInforForFlexElement() throws IOException {
		try {
			File folder = new File(fileLocation);
			File[] listOfFiles = folder.listFiles();
			if (listOfFiles != null) {

				List<Map<String, Object[]>> multipleMXML = new ArrayList<Map<String, Object[]>>();
				for (File file : listOfFiles) {
					if (checkForFileExtension(file.getName(), mxmlFileExtension)) {
						BufferedReader br = new BufferedReader(new FileReader(file));
						String content = br.lines().collect(Collectors.joining("\n"));
						Document document = Jsoup.parse(content);
						List<String> idList = new ArrayList<String>();
						Elements sampleDiv = document.getAllElements();
						Map<String, Object[]> SimpleMap = new TreeMap<String, Object[]>();
						for (Element ele : sampleDiv) {
							String id = ele.id();
							if (!"".equals(id)) {
								idList.add(id);
								Attributes attributes = ele.attributes();
								StringBuffer generateStringArrayForEvents = generateStringArrayForEvents(attributes);
								attributeDelete(attributes);
								List<Attribute> asList = attributes.asList();
								Object[] array = asList.toArray();
								StringBuffer[] requiredDataArray = new StringBuffer[4];
								StringBuffer sf = new StringBuffer();
								for (Object i : array) {
									sf.append(i);
									sf.append(",");
								}
								StringBuffer nodename = new StringBuffer(ele.nodeName());
								StringBuffer elementID = new StringBuffer(id);
								requiredDataArray[0] = elementID;
								requiredDataArray[1] = nodename;
								requiredDataArray[2] = sf;
								requiredDataArray[3] = generateStringArrayForEvents;
								SimpleMap.put(id, requiredDataArray);
							}

						}
						multipleMXML.add(SimpleMap);
						br.close();
					}
				}
				if (!multipleMXML.isEmpty()) {
					WriteDataToExcel(multipleMXML);
				} else {
					System.out.println("No Data present to be written to the excel sheet");
				}
			} else {
				System.out.println("No MXML files present in the folder :" + fileLocation);
			}

		} catch (IOException ioExecption) {
			System.out.println("No mxml file found at the respective location");
			throw new IOException();
		}

	}

	private void WriteDataToExcel(List<Map<String, Object[]>> SimpleMapList) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		for (int count = 0; count < SimpleMapList.size(); count++) {
			XSSFSheet sheet = workbook.createSheet("MXML AnalyReport" + count);
			int rownum = 0;
			Row headerRow = sheet.createRow(rownum++);
			Cell createHeaderKeyCell = headerRow.createCell(0);
			Cell createValueCell1 = headerRow.createCell(1);
			Cell createValueCell2 = headerRow.createCell(2);
			Cell createValueCell3 = headerRow.createCell(3);
			createHeaderKeyCell.setCellValue("UNIQUE-ID");
			createValueCell1.setCellValue("CONFIG");
			createValueCell2.setCellValue("PROPERTY");
			createValueCell3.setCellValue("EVENTS");

			Set<String> keyset = SimpleMapList.get(count).keySet();
			for (String key : keyset) {
				Row row = sheet.createRow(rownum++);
				Object[] objArr = SimpleMapList.get(count).get(key);
				int cellnum = 0;
				for (Object obj : objArr) {
					Cell cell = row.createCell(cellnum++);
					String stringVal = obj.toString();
					cell.setCellValue(stringVal);
				}
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(new File("MXMLAttributeInformation.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("MXMLAttributeInformation written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void attributeDelete(Attributes attributes) {
		for (EventsCap eventval : EventsCap.values()) {
			attributes.remove(eventval.name());
		}
	}

	private StringBuffer generateStringArrayForEvents(Attributes attributes) throws FileNotFoundException {
		attributes.remove(IDAttribute);
		StringBuffer sf2 = new StringBuffer();
		for (EventsCap eventval : EventsCap.values()) {
			boolean hasKey = attributes.hasKey(eventval.name());
			if (hasKey) {
				sf2.append(eventval.name() + ":" + attributes.get(eventval.name()) + ",");
			}
		}
		return sf2;
	}

	private boolean checkForFileExtension(String fileName, String fileExtension) {
		int lastIndexOf = fileName.lastIndexOf(".");
		if (lastIndexOf == -1) {
			return false;
		}
		if (fileName.substring(lastIndexOf).equals(fileExtension)) {
			return true;
		}
		System.out.println("File ignored as it is not MXML : " + fileName);
		return false;
	}

}
