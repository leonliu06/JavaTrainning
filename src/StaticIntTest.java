// StaticIntTest.java

class Value{
	public static int i = 0;
}

public class StaticIntTest{
	public static void main(String[] args){
		Value v1 = new Value();
		System.out.println(v1.i);
		v1.i++;
		System.out.println(v1.i);
		Value v2 = new Value();
		System.out.println(v2.i);
	}
}



