package weekday1.assignment;

public class TwoWheeler {
	
		int noofwheels;
		float mileage;
		char bikemodel;
		boolean isPuncture;
		public static void main(String[] args) {
		TwoWheeler obj3=new TwoWheeler();
		obj3.noofwheels=2;
		System.out.println("No. of wheels in the bike is " +obj3.noofwheels);
		obj3.mileage=24.6f;
		System.out.println("No. of mileage the bike gives " +obj3.mileage);
		obj3.bikemodel='R';
		System.out.println("The bikemodel is " +obj3.bikemodel);
		obj3.isPuncture=true;
		System.out.println("bike punctured " +obj3.isPuncture);
}
}