/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class Main
{
	public static void main(String[] args) {
		getMax("Heeaallo");
	}
	
	static void getMax(String str){
	    

        if(isStringOnlyAlphabet(str)){
            
            Map<String, Long> charCount = str.toLowerCase().codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
            Long max = 1l;
            String result = "";
            
            // System.out.println(charCount);
            for (Map.Entry <String, Long> entry : charCount.entrySet()) {
        
                if (max < entry.getValue()) {
        
                    max = entry.getValue();
                    result = entry.getKey();
                }
            }
        
        System.out.println(result +":"+ max);
	    }
	}
	
    static boolean isStringOnlyAlphabet(String str){
        return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
    }
}
