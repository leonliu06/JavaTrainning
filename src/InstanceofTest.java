// InstanceofTest.java
class Super{}
class Sub extends Super{}

interface Interf{}
class Impl implements Interf{}

public class InstanceofTest{
	public static void main(String[] args){
		Super sup = new Sub();
		System.out.println(sup instanceof Super);
		System.out.println(sup instanceof Sub);

		Sub sub = new Sub();
		System.out.println(sub instanceof Super);
		System.out.println(sub instanceof Sub);

		Interf intf = new Impl();
		System.out.println(intf instanceof Interf);
		System.out.println(intf instanceof Impl);

		Impl impl = new Impl();
		System.out.println(impl instanceof Interf);
		System.out.println(impl instanceof Impl);
	}
}