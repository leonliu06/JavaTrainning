// Demo1.java
public class Demo1 { 
    public static void main(String args[])     { 
                     int i = 1 ;     
                     int j = i++ ; // i=2， j=1
					 System.out.println(j);
                     if((i==(++j))&&((i++)==j))     { // 2 2 3 2
                         i += j ; 
                     } 
                     System.out.println("i = "+i); 
					 
					 System.out.println("--------------");
					
					 int num = 68 ; 
                     char c = (char) num ; 
                     System.out.println(c) ;
					System.out.println((int)'A');

                 }            
				 
} 