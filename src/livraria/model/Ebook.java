package livraria.model;

public class Ebook extends Livraria {
	private double fileSize;
	private String format;
	
	public Ebook(String title, String author, double price, double fileSize, String format) {
		super.Book(title, author, price);
		this.fileSize = fileSize; 
		this.format = format;
	}
	// Métodos Getter e Setter
	public double getFileSize() { 
		return fileSize;
	}
	public void setFileSize(double fileSize) { 
		this.fileSize = fileSize;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) { 
		this.format = format;
	}
	
	@Override public void displayInfo() {
		super.displayInfo();
		System.out.println("File Size: " + fileSize + "MB, Format: " + format);
	}

}
