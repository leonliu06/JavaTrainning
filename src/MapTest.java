// MapTest.java
import java.util.*;
public class MapTest{
	public static void main(String[] args){
		Map m = new HashMap<Integer, String>();
		Integer a = new Integer(150);
		m.put(new Integer(150), "a");
		m.put(new Integer(150), "b");
		m.put(a, "c");
		m.put(a, "d");
		System.out.println(m.size());
		
		Integer b = Integer.valueOf(47);
		Integer c = Integer.valueOf(47);
		System.out.println(b == c);	// true
		
		Integer d = Integer.valueOf(150);
		Integer e = Integer.valueOf(150);
		System.out.println(d == e);	// false
		
		int f = 150;
		System.out.println(d == f); // true
	}
}