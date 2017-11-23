// ListOfInt.java
import java.util.*;
public class ListOfInt{
    public static void main(String[] args){
		// 编译错误：意外的类型
		// List<int> li = new ArrayList<int>();
		// Map<int, Interger> m = new HashMap<int, Integer>();
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            li.add(i);      // int --> Integer
        }
        for(int i : li){    // Integer --> int
            System.out.print(i + " ");
        }
    }
}/* Output:
0 1 2 3 4
*/
