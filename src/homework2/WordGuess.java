package homework2;
import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) {
        int tries = 0;

        boolean iterated = false;
        String temp = "";
        String holder = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your secret word:");
        String word = sc.nextLine();

        do {
            System.out.println("Key in one character or your guess word :");
            String guess = sc.nextLine();
            for(int i = 0; i < word.length(); i ++) {
                if (guess.equals(Character.toString(word.charAt(i)))) {
                    if(!iterated)
                        temp += Character.toString(word.charAt(i));
                    else {
                        holder = Character.toString(temp.charAt(i)).replace("-", guess);
                        temp = temp.substring(0, i) + holder + temp.substring( i + 1, temp.length());
                    }
                } else {
                    if(!iterated) {
                        temp += "-";
                    }
                }
            }
            tries++;
            iterated = true;
            System.out.println("trial " + tries + ": " +temp);
            if(temp.equals(word)) {
                System.out.println("Congratulation !");
                System.out.println("You got in " + tries + "trials");
                break;
            }
        }while (true);

    }
}