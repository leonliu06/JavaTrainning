// Overflow.java
// Surprise! Java lets you overflow.
public class Overflow{
	public static void main(String[] args){
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int big1 = big + 1;
		System.out.println("big1 = " + big1);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);		
	}
}
/* Output:
big = 2147483647
big1 = -2147483648
bigger = -4
*/