package lab2;
import java.util.Scanner;

public class Dec2Hex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		int dec = sc.nextInt();
		System.out.println("The equivalent hexadecimal number is " + Dec2Hex(dec));
	}
	public static String Dec2Hex(int dec){    
	     int rem;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	    while(dec>0)  
	     {  
	       rem=dec%16;   
	       hex=hexchars[rem]+hex;   
	       dec=dec/16;  
	     }  
	    return hex;  
	}    
}
