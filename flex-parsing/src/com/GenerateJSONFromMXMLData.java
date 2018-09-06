package com;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenerateJSONFromMXMLData {
	public static final String MXML_FILE_PATH = "C:\\Users\\719911\\Documents\\workspace-sts\\Flex-Parsing\\MXMLAttributeInformation.xlsx";

	public static void main(String[] args) throws Exception {
		GenerateJSONFromMXMLData getDataFromExcel = new GenerateJSONFromMXMLData();
		Map<String, List<StringBuffer>> getmapOfRequiredDataFromExcel = getDataFromExcel
				.getmapOfRequiredDataFromExcel();
		getDataFromExcel.GenerateJsonObject(getmapOfRequiredDataFromExcel);

	}

	private Map<String, List<StringBuffer>> getmapOfRequiredDataFromExcel() throws Exception {
		FileInputStream file = new FileInputStream(new File(MXML_FILE_PATH));
		Workbook workbook = WorkbookFactory.create(file);
		//System.out.println(workbook.getNumberOfSheets());
		Map<String, List<StringBuffer>> sheetDataInMap = new HashMap<String, List<StringBuffer>>();
		for (int sheetCount = 0; sheetCount < workbook.getNumberOfSheets(); sheetCount++) {
			List<StringBuffer> sheetData = new ArrayList<StringBuffer>();

			//System.out.println(workbook.getSheetName(sheetCount));
			Sheet sheetWithData = workbook.getSheetAt(sheetCount);
			DataFormatter dataFormatter = new DataFormatter();
			Iterator<Row> rowIterator = sheetWithData.rowIterator();
			while (rowIterator.hasNext()) {
				Row next = rowIterator.next();
				Iterator<Cell> cellIterator = next.cellIterator();
				StringBuffer rowData = new StringBuffer();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if (cell.getColumnIndex() == 1 || cell.getColumnIndex() == 2) {
						String cellValue = dataFormatter.formatCellValue(cell);
						rowData.append(cellValue + "*");
					}
				}
				sheetData.add(rowData);

			}

			sheetDataInMap.put(workbook.getSheetName(sheetCount), sheetData);
		}

		return sheetDataInMap;
	}

	private void GenerateJsonObject(Map<String, List<StringBuffer>> getmapOfRequiredDataFromExcel) {
		
		Set<String> keySet = getmapOfRequiredDataFromExcel.keySet();
		for(String singleSheetData : keySet) {
			List<StringBuffer> eachSheetlist = getmapOfRequiredDataFromExcel.get(singleSheetData);
			for(StringBuffer listElements : eachSheetlist) {
				System.out.println(listElements);
			}
		}
		
		
	}

}
