import java.util.Scanner;

public class Main {
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
        int toreturn = 1;
        while(true) {
            int nCk = 1;
            for(int k = 0; k<= toreturn/2; k++) {
                if (nCk == value)
                    return toreturn;
                nCk = nCk * (toreturn - 1 - k)/(k + 1);
            }
            toreturn++;
        }
    }
}