// Parcel.java
interface Contents{
	int value();
}
public class Parcel{
	public Contents contents(){
		return new Contents(){	// insert a class definition
			private int i = 11;
			public int value(){
				return i;
			}
		};	// Semicolon required in this case
	}
	public static void main(String[] args){
		Parcel p = new Parcel();
		Contents c = p.contents();
		System.out.println(c.value());
	}
}



