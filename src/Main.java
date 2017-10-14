import java.util.Scanner;

/**
 * Exercises on if, for and while loops
 */
public class Main {

    // Look up the documentation for Scanner and what methods are available
    private Main() {
    Scanner input = new Scanner(System.in);
    int number1; // first number to compare
    int number2; // second number to compare
    }

    //TODO: Write a Java program to compare two numbers.
public void compare(int num2){
        if(num1 > num2){
            System.out.print("The Bigger Number is"+num1+'\n');//if variable num1 is bigger than variable num2 then print the bigger number is variable num1
        }else {
            System.out.print("The Bigger Number is"+num2+'\n');//if variable num1 is not bigger than variable num2 then print the bigger number is variable num2
        }
}

    // TODO: Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // TODO: Otherwise, print "positive" or "negative".
public void read(double num3){
    if (num3==0) {
        System.out.print("The number is zero" + num3 + '\n');//if variable num3 is equivalent to 0 then print zero
    } else
                    if (num3>0) {
                        System.out.print("The number is positive" + "+" +'\n');//if variable num3 is bigger tahn 0 then print positive
                    }else
        System.out.print("The number is negative"+ "-" + '\n');//if variable num3 is not biigger than 0 then print negative
                    }
        }



    // TODO: Write a program in Java to display the first 10 natural numbers.
public static void display(String[]args) {
    int fnm;//fnm stands for first natural number
    fnm = 1;// fnm is equal to 1
    while (fnm < 11) {
        System.out.print("The natural number is:" + fnm);//The program is printing ther fnm variable value
        fnm++;// the program is adding 1 to the previous fnm variable
    }
}

    // TODO: Write a Java program to reverse a string. Print the before and after.
    public static String reverse (String){
        String sreverse;
        sreverse="canada";
        System.out.print(sreverse);
        int begin = 0;
        int end = (sreverse.lenght - 1);//It is -1 because the first position of the string is zero
        char temp;
        while (end > begin) {
            temp = sreverse.chartAt(begin);//The begin position character is stored at temp variable
            sreverse.CharAt(begin) = sreverse.CharAt(end);// writting in the begin position the value of end position
            sreverse.CharAt(end) = temp;
            begin++;
            end--;// after this it returns to the while cycle until it is proven false that end is bigger than begin
        }
        System.out.print('\n');
        System.out.print(sreverse);//when it is proven false it print the reverse string
        // Written by Emilio Guzman
    }