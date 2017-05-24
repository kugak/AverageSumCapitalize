package th1;
import javax.swing.JOptionPane;

/**
 * Name: Kuga Kugaraja
 * Prof: Riche Smith
 * Course: Prog 10082
 * Assignment 1
 */

//class WorkHard Begins
public class WorkHard
{
    //declaring instance variables
    public double value1, value2, value3;

    //method to add values and display begins
    public void outputSumNums ()
    {
        //add values
        double sum = this.value1 + this.value2 + this.value3;

        //display result in dialogebox
        JOptionPane.showMessageDialog(
                null,
                "The Sum of " + this.value1 + ", " + this.value2 + " and "
                + this.value3 + " is: \n"
                + sum,
                "Result from outputSumNums()",
                JOptionPane.INFORMATION_MESSAGE);

    }//method ends


    //method to return the sum of values begins
    public double returnSumNums ()
    {
        double sum = this.value1 + this.value2 + this.value3;
        return sum;

    } //method ends


    //method to display average of values
    public void outputAve ()
    {
        //calculate average of values
        double ave = (this.value1 + this.value2 + this.value3) / 3;

        //display avg in dialogebox
        JOptionPane.showMessageDialog(
                null,
                "The Average of " + this.value1 + ", " + this.value2 + " and "
                + this.value3 + " is: \n"
                + ave,
                "Result from outputAve()",
                JOptionPane.INFORMATION_MESSAGE);

    } // outputAve() ends

    //method to retun avg of values
    public double getAve ()
    {
        double ave = (this.value1 + this.value2 + this.value3) / 3;
        return ave;

    } //getAve() ends

    //method to change case
    public void shout (String name)
    {
        String input = name;
        JOptionPane.showMessageDialog(
                null,
                "The Capitilized '" + name + "' is: \n"
                + input.toUpperCase(), // method to capitilize 'name' variable
                "Result from shout()",
                JOptionPane.INFORMATION_MESSAGE);
    } // shout() ends

    //method returnShout() begins
    public String returnShout (String word)
    {
        String input = word;
        String wordCapital = input.toUpperCase(); //method to capitilize 'name' variable
        return wordCapital;
    }



}// WorkHard class Ends
