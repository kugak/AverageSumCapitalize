package th1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Name: Kuga Kugaraja
 * Prof: Riche Smith
 * Course: Prog 10082
 * Assignment 1
 */

public class StudyHard
{
    //main header
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in); //instanciate scanner
        WorkHard set1 = new WorkHard(); // instanciate new set of values (set1)

        //get values from user with jOptionPane
        String inputDouble, lowerCase; // variables for user input
        inputDouble = JOptionPane.showInputDialog("Enter Decimal Value1: ");
        set1.value1 = Double.parseDouble(inputDouble);
        inputDouble = JOptionPane.showInputDialog("Enter Decimal Value2: ");
        set1.value2 = Double.parseDouble(inputDouble);
        inputDouble = JOptionPane.showInputDialog("Enter Decimal Value3: ");
        set1.value3 = Double.parseDouble(inputDouble);
        lowerCase = JOptionPane.showInputDialog("Enter a Lowercase Word: ");

        //call method outputSumNums()
        set1.outputSumNums();

        //call method returnSumNums()
        double sumReturn = set1.returnSumNums();

        //display result in dialogebox
        JOptionPane.showMessageDialog(
                null,
                "The Sum of " + set1.value1 + ", " + set1.value2 + " and "
                + set1.value3 + " is: \n"
                + sumReturn,
                "Result from returnSumNums()",
                JOptionPane.INFORMATION_MESSAGE);

        //call method ourputAve ()
        set1.outputAve();

        //call method getAve()
        double aveReturn = set1.getAve();

        //display result in dialogebox
        JOptionPane.showMessageDialog(
                null,
                "The Average of " + set1.value1 + ", " + set1.value2 + " and "
                + set1.value3 + " is: \n"
                + aveReturn,
                "Result from getAve()",
                JOptionPane.INFORMATION_MESSAGE);

        //call method shout() with argument
        set1.shout(lowerCase);

        //call method returnShout()
        String returnUpperCase = set1.returnShout(lowerCase);
        //display result in dialogebox
        JOptionPane.showMessageDialog(
                null,
                "The Capitilized '" + lowerCase + "' is: \n"
                + returnUpperCase,
                "Result from returnShout()",
                JOptionPane.INFORMATION_MESSAGE);

    }// main method ends

}// StudyHard class ends
