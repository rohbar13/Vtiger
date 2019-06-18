package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestData {

	@Test
	public Map<String, String> getTestData(String moduleName, String testCaseId) throws Exception {
		Map<String, String> values = new HashMap<String, String>();

		String sheetPath = "testdata/"+moduleName+".xlsx";

		File file = new File(sheetPath);

		if (file.exists()) {

			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);

			Sheet sh = wb.getSheetAt(0);

			int rowCount = sh.getLastRowNum();

			for (int x = 0; x <= rowCount; x++) {
				Row row_key = sh.getRow(x);
				Row row_Values = sh.getRow(x + 1);
				try {
					Cell cell = row_key.getCell(0);

					if (cell.getStringCellValue().equalsIgnoreCase(testCaseId)) {
						int cellCount = row_key.getLastCellNum();
						for (int y = 1; y < cellCount; y++) {
							Cell cellK = row_key.getCell(y);
							Cell cellV = row_Values.getCell(y);

							String key = cellK.getStringCellValue();
							String value = cellV.getStringCellValue();

							// System.out.println(key+" "+value);

							values.put(key, value);

						}
					}
				} catch (Exception e) {

				}

			}
			wb.close();

		}
		
		for (Map.Entry<String, String> entry : values.entrySet()) {
		     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		return values;
	}
}
