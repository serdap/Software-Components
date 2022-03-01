package homework1;

import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an Octal String: ");
		String inStr = sc.next();
		sc.close();
		int onum = Integer.parseInt(inStr);
		int num = 0;
        int p = 0;
        while(true){
            if(onum == 0){
                break;
            } else {
                int temp = onum%10;
                num += temp*Math.pow(8, p);
                onum = onum/10;
                p++;
            }
        }
        System.out.println("The equivalent decimal number "+inStr+" is: "+ num);
	}
}

