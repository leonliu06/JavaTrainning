// NotInit.java
class MyClass{
	static{
		System.out.println("MyClass Init...");
	}
}
public class NotInit{
	public static void main(String[] args){
		MyClass[] a = new MyClass[3];
	}	
}
