/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javaapplication3.Triangulo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Aluno
 */
@RunWith(Parameterized.class)
public class TTriangulo {

    private static Triangulo t;
    private int l1, l2, l3;
    private String row;
    private boolean _valido;
    private String _tipo;

    public TTriangulo() {

    }

    @Parameters
    public static Collection data() throws IOException {
        ArrayList<String> rows = new ArrayList<>();
        File excelFile = new File("excelteste.xlsx");
        FileInputStream fis = new FileInputStream(excelFile);

        // we create an XSSF Workbook object for our XLSX Excel File
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // we get first sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        // we iterate on rows
        Iterator<Row> rowIt = sheet.iterator();
        String linha;
        while (rowIt.hasNext()) {
            Row row = rowIt.next();

            // iterate on cells for the current row
            Iterator<Cell> cellIterator = row.cellIterator();
            linha = "";
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                //System.out.print(cell.toString() + ";");
                linha += cell.toString() + ";";
            }
            //System.out.println();
            rows.add(linha);
        }

        workbook.close();
        fis.close();
        return rows;
    }

    public TTriangulo(String row) {
        String[] aux = row.split(";");
        l1 = (int) Double.parseDouble(aux[0]);
        l2 = (int) Double.parseDouble(aux[1]);
        l3 = (int) Double.parseDouble(aux[2]);
        _valido = aux[3].toLowerCase().contains("true");
        _tipo = (aux.length > 4) ? aux[4] : "";
    }

    @BeforeClass
    public static void setUpClass() throws IOException {
        t = new Triangulo();

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void verificaTipo() {
        /*for (String row : rows) {
            String[] aux = row.split(";");
            l1 = (int) Double.parseDouble(aux[0]);
            l2 = (int) Double.parseDouble(aux[1]);
            l3 = (int) Double.parseDouble(aux[2]);
            _valido = aux[3].toLowerCase().contains("true");
            _tipo = (aux.length > 4) ? aux[4] : "";

            t.setL1(l1);
            t.setL2(l2);
            t.setL3(l3);
            Assert.assertEquals(_valido, t.isValido());

            if (!_tipo.isEmpty()) {
                Assert.assertEquals(_tipo, t.getTipo());
            }
        }*/
        TTriangulo ttr = new TTriangulo();
        
        t.setL1(l1);
        t.setL2(l2);
        t.setL3(l3);
        Assert.assertEquals(_valido, t.isValido());

        if (!_tipo.isEmpty()) {
            Assert.assertEquals(_tipo, t.getTipo());
        }

    }
}
