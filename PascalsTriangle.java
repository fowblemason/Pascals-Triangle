import java.util.Scanner;
// Mason Fowble, Victor Strachan, Jehong Kim, Weihua Huang
// CS202 Winter 2025
// Pascal's Triangle Team Assignment 

public class PascalsTriangle {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Welcome to the CS202 Pascal's Triangle project.");
        System.out.println("The program outputs the row number where the number first shows in Pascal's triangle.");
        System.out.println("Type a number: ");
        int value = myObj.nextInt(); 
        int number = returnPascalRowNumber(value);
        System.out.println("The row number is: " + number);
    }
    public static int returnPascalRowNumber(int value) {
        int toReturn = 1;
        while(true) {
            int nCk = 1;
            for(int k = 0; k<= toReturn/2; k++) {
                if (nCk == value)
                    return toReturn;
                nCk = nCk * (toReturn - 1 - k)/(k + 1);
            }
            toReturn++;
        }
    }
}
