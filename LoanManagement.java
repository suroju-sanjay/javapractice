package project1;

public class LoanManagement {
	String CustomerName;
	double LoanAmount;
	double IntrestRate;
	int LoanTenure;
	double intrest;
	double totalamount;
	double monthlyEMI;
	double emi;
	double calculateintrest (double LoanAmount,double IntrestRate,int LoanTenure) {
		double intrest =(LoanAmount*IntrestRate*LoanTenure)/100;
		return intrest;
	}
	double calculatetotalamount(double LoanAmount,double IntrestRate) {
		double totalamount=LoanAmount+intrest;
		return totalamount;
		
	}
	double calculatemonthlyEmi(double totalamount,int LoanTenure) {
		double emi= totalamount/(LoanTenure*12);
		return emi;
	}
	void display(double intrest1,double totalamt) {
		System.out.println("*************loan details*************");
		System.out.println("customer name :"+CustomerName);
		System.out.println("loan amount :"+LoanAmount);
		System.out.println("Intrest rate :"+IntrestRate);
		System.out.println("loan tenure :"+LoanTenure);
		System.out.println("intrest :"+intrest);
		System.out.println("total amount :"+totalamount);
		System.out.println("monthly emi :"+monthlyEMI);
		System.out.println("emi :"+emi);
		System.out.println("**********************completed***************");
	}
	public static void main(String[] args) {
	LoanManagement l1= new LoanManagement();
	l1.CustomerName="prashanth";
	l1.LoanAmount=50000.0;
	l1.IntrestRate=2.5;
	l1.LoanTenure=5;
	l1.intrest=l1.calculateintrest(l1.LoanAmount,l1.IntrestRate,l1.LoanTenure);
	l1.totalamount=l1.calculatetotalamount(l1.LoanAmount,l1.intrest);
	l1.monthlyEMI=l1.calculatemonthlyEmi(l1.totalamount,l1.LoanTenure);
	l1.display(l1.intrest,l1.totalamount);
	LoanManagement l2= new LoanManagement();
	l2.CustomerName="surya";
	l2.LoanAmount=70000.0;
	l2.IntrestRate=2;
	l2.LoanTenure=5;
	l2.intrest=l2.calculateintrest(l2.LoanAmount,l2.IntrestRate,l2.LoanTenure);
	l2.totalamount=l1.calculatetotalamount(l2.LoanAmount,l2.intrest);
	l2.monthlyEMI=l2.calculatemonthlyEmi(l2.totalamount,l2.LoanTenure);
	l2.display(l2.intrest,l2.totalamount);
	}
	}
