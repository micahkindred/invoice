package invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice test1=new Invoice(5400,500,11,12,2016);
		System.out.println(test1);
		
		Invoice test2=new Invoice(100,100,8,1,2015);
		System.out.println(test2);
		
		Invoice test3=new Invoice(3142,100,14,0,2023);
		System.out.println(test3);
		
		Invoice test4=new Invoice(3142,100,0,13,2011);
		System.out.println(test4);
	}

}
