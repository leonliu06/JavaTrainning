// WhitherStringBuilder.java

import java.util.Random;
public class WhitherStringBuilder{
    public static String implicit(String[] fields){
        String result = "";
        for(int i = 0; i < fields.length; i++){
            result += fields[i];
        }
        return result;
    }
    public static String explicit(String[] fields){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < fields.length; i++){
            result.append(fields[i]);
        }
        return result.toString();
    }
	public static void main(String[] args){
		String[] fields = new String[1000];
		Random rand = new Random(1000);
		Integer a = rand.nextInt();
		for(int i = 0; i < 1000; i++){
			fields[i] = a.toString();
		}
        long cur = System.currentTimeMillis();
		WhitherStringBuilder.implicit(fields);
        System.out.println(System.currentTimeMillis() - cur);
        long cur1 = System.currentTimeMillis();
        WhitherStringBuilder.explicit(fields);
        System.out.println(System.currentTimeMillis() - cur1);
	}
}