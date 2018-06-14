package invoice;
import java.text.NumberFormat;

public class Invoice {
	public Integer invoiceNumber=0;
	public double balanceDue;
	public Integer dueMonth=0;
	public Integer dueDay=0;
	public Integer dueYear=0;
	
	public Invoice(Integer number, Integer due, Integer month, Integer day, Integer year) {
		if(number>=1000) {
			invoiceNumber=number;
		}
		
		balanceDue=due;
		
		if(month>0 && month<13) {
			dueMonth=month;
		}
		
		if(day>0 && day<32) {
			dueDay=day;
		}
		
		if(year<2023 && year>2014) {
			dueYear=year;
		}
	}
	
	public String toString() {
		NumberFormat n1=NumberFormat.getCurrencyInstance();
		return("Invoice Number: "+invoiceNumber+"\nBalance Due: "+n1.format(balanceDue)+"\nDue: "+dueMonth+"/"+dueDay+"/"+dueYear+"\n");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
