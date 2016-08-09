import java.io.*;

public class BinaryWrite {
    public static void main(String [] args) {

        String fileName = "temp.txt";

        try {
            String bytes = "Hello theren";
            byte[] buffer = bytes.getBytes();

            FileOutputStream outputStream =
                new FileOutputStream(fileName);

            outputStream.write(buffer);

            outputStream.close();       

            System.out.println("Wrote " + buffer.length + 
                " bytes");
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing file '"
                + fileName + "'");
        }
    }
}
