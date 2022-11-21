package weekday1.assignment;

public class Mobile1 {

char mobileLogo;
short noOfMobilePiece;
int modelNumber;
float mobilePrice;
boolean isDamaged;
public static void main(String[] args) {
	Mobile1 obj4=new Mobile1();
	obj4.mobileLogo='^';
	System.out.println("mobileLogo is "+obj4.mobileLogo);
	obj4.noOfMobilePiece=12;
	System.out.println("no of mobile pieces available: "+obj4.noOfMobilePiece);
	obj4.modelNumber=1259;
	System.out.println("model number: "+obj4.modelNumber);
	obj4.mobilePrice=10999.5f;
	System.out.println("Price of the mobile: "+obj4.mobilePrice);
	obj4.isDamaged=false;
	System.out.println("Is mobile damaged: "+obj4.isDamaged);
	
}

}
