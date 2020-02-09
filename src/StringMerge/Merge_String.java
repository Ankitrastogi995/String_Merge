package StringMerge;
import java.util.*;


public class Merge_String {

	String result="";
	int i=0;
    public String merge(String s1, String s2, String s3,int len) 
    { 
        
    	if(i<len) {
    		result=result+s1.charAt(i)+s2.charAt(i)+s3.charAt(i);
    		i++;
    		merge(s1, s2, s3, len);
    	}
    	return result;
    } 
  
   
    public static void main(String[] args) 
    { 
        System.out.println("enter the String of equal length :");
        Scanner sc =new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine(); 
        String s3 = sc.nextLine();
        
        int len=s1.length();
        Merge_String m=new Merge_String();
        System.out.println(m.merge(s1, s2,s3,len)); 
    } 
} 