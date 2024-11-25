package tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Q1 {

    public static void main(String[] args) {
        //WebDriver
        System.setProperty("webdriver.edge.driver", "E:\\work soft\\external drivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //Excel File
            String filePath = "E:\\work soft\\ec_directory\\Q1\\src\\tasks\\Data.xlsx"; // Update if needed
            fis = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fis);

            
            Sheet sheet = workbook.getSheetAt(0);

            //Iterating through the rows
            for (Row row : sheet) {
                //keyword from column 3
                Cell keywordCell = row.getCell(2);
                if (keywordCell == null || keywordCell.getCellType() != Cell.CELL_TYPE_STRING) {
                    continue;
                }

                String keyword = keywordCell.getStringCellValue();
                System.out.println("Keyword: " + keyword);

                //Google Search
                driver.get("https://www.google.com/");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
                searchBox.sendKeys(keyword + Keys.RETURN);

                //Wait
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li")));
                List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

                //Longest and Shortest
                String shortest = null, longest = null;
                for (WebElement suggestion : suggestions) {
                    String text = suggestion.getText();
                    if (text != null && !text.isEmpty()) {
                        if (shortest == null || text.length() < shortest.length()) {
                            shortest = text;
                        }
                        if (longest == null || text.length() > longest.length()) {
                            longest = text;
                        }
                    }
                }

                //Writing to Excel
                Cell shortestCell = row.createCell(3); // Column 4 for shortest suggestion
                Cell longestCell = row.createCell(4);  // Column 5 for longest suggestion
                shortestCell.setCellValue(shortest != null ? shortest : "No suggestion found");
                longestCell.setCellValue(longest != null ? longest : "No suggestion found");

                System.out.println("Shortest: " + shortest);
                System.out.println("Longest: " + longest);
            }

            //Save Excel File
            fis.close(); // Close input stream before writing
            fos = new FileOutputStream("E:\\work soft\\ec_directory\\testProject\\src\\testPackage\\Data.xlsx");
            workbook.write(fos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            driver.quit(); // Ensure browser closes
        }
    }
}
