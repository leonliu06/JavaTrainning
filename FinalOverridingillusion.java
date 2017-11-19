// FinalOverridingIllusion.java
class WithFinals{
	private final void f(){
		System.out.println("WithFinals.f()");
	}
	// Automatically "final"
	private void g(){
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals{
	public final void f(){
		System.out.println("OverridingPrivate.f()");
	}
	public void g(){
		System.out.println("OverridingPrivate.g()");
	}
}

public class FinalOverridingillusion{
	public static void main(String[] args){
		OverridingPrivate op = new OverridingPrivate();
		op.f();
		op.g();
		// You can upcast
		WithFinals wf = op;
		// But you can't call the methods:
		//wf.f();
		//wf.g();
	}
}
/* Output:
* OverridingPrivate.f()
* OverridingPrivate.g()
* */