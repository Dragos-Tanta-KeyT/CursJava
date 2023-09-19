package curs2;

public class SalaryCalculator {

	public static void main(String[] args) {

		Tester tester1 = new Tester("Ioana", 25);
		System.out.println(tester1.nume);
		//System.out.println(tester1.nume.length());
		//tester1.nume = "Ioana";
		System.out.println(tester1.ratePerHour);
		
		Tester tester2 =  new Tester("Maria", 35);
		System.out.println(tester2.nume);
		//tester2.nume = "Maria";
		System.out.println(tester2.ratePerHour);
		
		SalaryCalculator calculator = new SalaryCalculator();
		
		System.out.println("Salariul lui " + tester1.nume
				+ " este " + calculator.calculateWeekSalary(tester1.ratePerHour));
		
		//Salariul lui Ioana este 123
	}
	
	
	public int calculateWeekSalary(int salaryPerHour) {
		
		return 40 * salaryPerHour;
	}
	

}
