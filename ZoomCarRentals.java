package project1;

public class ZoomCarRentals {
	int days;

	String getcompanyname() {
		return "Zoom Car rentals";

	}

	double getdailyrentalrate() {
		return 1500;

	}

	int calculatetotalrent() {
		return (int) (getdailyrentalrate()*days);
				}
	int getinsurenceamount() {
		return 500;
	
	}
int totalcost() {
	return calculatetotalrent()+getinsurenceamount();
}
	static{
		System.out.println("welcome to zoom car rentals");
		
	}
	void print() {
		System.out.println("no of days :"+days);
		System.out.println("company name:"+getcompanyname());
		System.out.println("daily rent: "+getdailyrentalrate());
		System.out.println("insurence amount :"+getinsurenceamount());
		System.out.println("total cost :"+totalcost());
		System.out.println("****************************************");
	}
	public static void main(String[] args) {
		ZoomCarRentals z1=new ZoomCarRentals();
		z1.days=5;
		z1.getcompanyname();
		z1.getdailyrentalrate();
		z1.getinsurenceamount();
		z1.totalcost();
		z1.print();
		ZoomCarRentals z2=new ZoomCarRentals();
		z2.days=7;
		z2.getcompanyname();
		z2.getdailyrentalrate();
		z2.getinsurenceamount();
		z2.totalcost();
		z2.print();
	}

}
