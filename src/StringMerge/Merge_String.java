package StringMerge;


public class Merge_String {

	  
    public static String merge(String s1, String s2, String s3) 
    { 
       
        StringBuilder result = new StringBuilder(); 
  
        
        for (int i = 0; i < s1.length() || i < s2.length() || i < s3.length(); i++) { 
  
            
            
            if (i < s1.length()) 
                result.append(s1.charAt(i)); 
  
             
            if (i < s2.length()) 
                result.append(s2.charAt(i));
            if (i <s3.length())
            	result.append(s3.charAt(i));
        } 
  
        return result.toString(); 
    } 
  
   
    public static void main(String[] args) 
    { 
        String s1 = "geeks"; 
        String s2 = "forgeeks"; 
        String s3 = "Ankit";
        System.out.println(merge(s1, s2,s3)); 
    } 
} 