public class FactoryMethodTest {
    public static void main(String[] args) {

        DocumentFactory wordDocument = new WordDocumentFactory();
        Document wordDoc = wordDocument.createDocument();
        wordDoc.open();

        DocumentFactory excelDocument = new ExcelDocumentFactory();
        Document excelDoc = excelDocument.createDocument();
        excelDoc.open();

        DocumentFactory pdfDocument = new PdfDocumentFactory();
        Document pdfDoc = pdfDocument.createDocument();
        pdfDoc.open();

    }
}