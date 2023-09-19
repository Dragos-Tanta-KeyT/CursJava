package curs4;

public class OperatorTernar {

	public static void main(String[] args) {

		// ? : --> operator ternar
		
		int a = 130;
		int b = 80;
		
		int x = (a>b) ? a : b ;
		//var = conditie ? valoare daca conditie este true : val daca conditia este false;
		System.out.println(x);
		
		
		if(a >b) {
			x = a;
		}else {
			x = b;
		}
		
		System.out.println("---------------");
		
		int num1 = 5;
		int num2 = 9;
		int num3 = 20;
		
		int y = (num1>num2)? num1 : (num2>num3)? num2 :num3;
		
		if(num1>num2) {
			y = num1;
		}else if(num2>num3) {
			y=num2;
		}else {
			y=num3;
		}
		
	}

}
