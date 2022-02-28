
public class ReverseNumber {

	public static void main(String[] args) {
		long num = 123456;
		//System.out.println(new StringBuffer(String.valueOf(num)).reverse());//1st method
		StringBuffer num1 = new StringBuffer(String.valueOf(num));//2nd Method
				System.out.println(num1.reverse());
	}
}
