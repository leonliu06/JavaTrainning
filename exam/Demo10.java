// Demo10.java
public class Demo10{
	public static void main(String args[]){ 
        int i = 1 ;     
        int j = i++ ; // j = 1, i = 2
        if((i==(++j)) /*j = 2, i = 2*/
			&& ((i++)==j)){ /*j = 2, i = 3 */
			i += j ; /**/
        }
        System.out.println("i = "+i); 
    }
}