interface Document {
    void open();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
public class Factory_Method_Pattern {
	public static void main(String[] args) {
		
	
		 DocumentFactory wordFactory = new WordDocumentFactory();
	        Document wordDoc = wordFactory.createDocument();
	        wordDoc.open(); // Output: Opening a Word document.

	        DocumentFactory pdfFactory = new PdfDocumentFactory();
	        Document pdfDoc = pdfFactory.createDocument();
	        pdfDoc.open(); // Output: Opening a PDF document.

	        DocumentFactory excelFactory = new ExcelDocumentFactory();
	        Document excelDoc = excelFactory.createDocument();
	        excelDoc.open(); // Output: Opening an Excel document.
	}
}
