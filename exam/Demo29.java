// Demo29.java
abstract class MyInter{
	static void f(){}
}

class MyInterImp extends MyInter{
	
}

public class Demo29{
	public static void main(String[] args){
		MyInter m = new MyInterImp();
		System.out.println(m);
	}
}