package logic;

public class Sum {
	private int num1;
	private int num2;
	private int result;
	public Sum(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		System.out.println("El resultado es "+sums(num1, num2));
	}
	
	public int sums(int num1,int num2){
		result=num1+num2;
		return result;
	}

}
