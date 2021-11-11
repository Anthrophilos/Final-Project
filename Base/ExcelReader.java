package Base;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    public ExcelReader(String filePath) throws IOException {
        this.file = new File(filePath);
        this.fis = new FileInputStream(file);
        this.wb = new XSSFWorkbook(fis);

    }

    // metoda za obradu podataka u formi Stringa
    public String getStringData(String sheetName, int rowNumber, int cellNumber) {

        this.sheet = wb.getSheet(sheetName);
        this.row = sheet.getRow(rowNumber);
        this.cell = row.getCell(cellNumber);
        return cell.getStringCellValue();

    }

    // metoda za slucaj da se u tabeli nalazi broj
    public int getIntegerData(String sheetName, int rowNumber, int cellNumber) {
        this.sheet = wb.getSheet(sheetName);
        this.row = sheet.getRow(rowNumber);
        this.cell = row.getCell(cellNumber);
        return (int) this.cell.getNumericCellValue();
    }

    public int getLastRowNumber() {

        return sheet.getLastRowNum();
    }
}
