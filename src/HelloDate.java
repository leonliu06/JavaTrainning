// HelloDate.java
//
//package net.mrliuli.training;
import java.util.*;

public class HelloDate{
	public static void main(String[] args){
		System.out.println("Hello it's ");
		System.out.println(new Date());
		MyClass m = new MyClass();
		f(m);
	}
	
	private static void f(MyClass m){
		m.foo();
		System.out.println(m);		
	}
}

class MyClass{
	public void foo(){
		
	}
}



