package curs4;

public class IncrementDecrementExample {

	public static void main(String[] args) {

		// num++     num = num+1     num+=1
		//POST --> num++ 
		//PRE --> ++num
		
		System.out.println("----POST");
		int num = 10;
		System.out.println("Val lui num inainte de increment " + num);
		System.out.println("Val lui num in POST increment " + num++);
		System.out.println("Val lui num dupa increment " + num);

		System.out.println("----PRE");
		int num2 = 10;
		System.out.println("Val lui num inainte de increment " + num2);
		System.out.println("Val lui num in PRE increment " + ++num2);
		System.out.println("Val lui num dupa increment " + num2);
		
		
		System.out.println("----POST");
		int num3 = 10;
		System.out.println("Val lui num inainte de decrement " + num3);
		System.out.println("Val lui num in POST decrement " + num3--);
		System.out.println("Val lui num dupa decrement " + num3);

		System.out.println("----PRE");
		int num4 = 10;
		System.out.println("Val lui num inainte de decrement " + num4);
		System.out.println("Val lui num in PRE decrement " + --num4);
		System.out.println("Val lui num dupa decrement " + num4);
	}

}
