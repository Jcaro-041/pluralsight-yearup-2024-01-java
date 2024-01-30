import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // "scans" for user input via keystrokes
        Scanner userInput = new Scanner(System.in);

        double inputOne;
        double inputTwo;
        String operand;
        double solution;

        System.out.println("Enter a first number: ");
        inputOne = userInput.nextFloat();

        System.out.println("Enter a second number: ");
        inputTwo = userInput.nextFloat();
        userInput.nextLine();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Select an operand");
        operand = userInput.nextLine();

        if(operand.equalsIgnoreCase("A"))
        {
            solution = inputOne + inputTwo;
        }
        else if(operand.equalsIgnoreCase("S")){
            solution = inputOne - inputTwo;
        }
        else if(operand.equalsIgnoreCase("M")){
            solution = inputOne * inputTwo;
        }
        else{
            solution = inputOne / inputTwo;
        }
        System.out.println(inputOne + "+" + inputTwo + "=" + solution);
    }
}