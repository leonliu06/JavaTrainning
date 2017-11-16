// InitialValues.java
public class InitialValues{
	int j;
	char c;
	MyClass mc;
	public static void main(String[] args){
		int i;
		//i++;
		InitialValues obj = new InitialValues();
		System.out.println(obj.c);
		System.out.println(obj.j);
		System.out.println(obj.mc);
	}
}
class MyClass{}