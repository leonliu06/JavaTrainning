// ScopeTest.java

public class ScopeTest{
	
	public static void main(String[] args){
		{
			int x = 1;
			{
				System.out.println(x);
			}
		}
		//int x = 2;
		//System.out.println(x);
	}
	
}
