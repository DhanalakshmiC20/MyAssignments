package weekday1.assignment;

public class Mobile {

	public void makeCall()
	{
		System.out.println("calling");
	}
	public void sendMsg()
	{
		System.out.println("msg sent sucessfully");
	}
	public static void main(String[] args) {
		Mobile obj2=new Mobile();
		obj2.makeCall();
		obj2.sendMsg();
	}
}
