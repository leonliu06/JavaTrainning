// Hide.java
class Homer{
	void doh(char c){
		System.out.println("doh(char)");
	}
	void doh(float f){
		System.out.println("doh(float)");
	}
}

class Milhouse{}

class Bart extends Homer{
	/* 如果使用这个注解，编译时会报错：
	*  “方法不会覆盖或实现超类型的方法” -- method does not override a method from its superclass
	*/
	//@Override 
	void doh(Milhouse m){
		System.out.println("doh(Milhouse)");
	}
}

public class Hide{
	public static void main(String[] args){
		Bart b = new Bart();
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}
/* Output:

*/