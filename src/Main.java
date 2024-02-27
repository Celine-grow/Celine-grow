import java.util.Arrays;
import java.util.Scanner;
import  java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner myinputs = new Scanner(System.in);
        System.out.println("WELCOME TO YOUR CALCULATOR");
        String[] option = new String[6];
        option[0] = " Case 1:Addition";
        option[1] = " Case 2:Substraction";
        option[2] = " Case 3:Division";
        option[3] = " Case 4:Multiplication";
        option[4] = " Case 5:Exponential";
        option[5]="Case 6:Logarithm";
        System.out.println(Arrays.toString(option));
        System.out.println("Enter your choice i.e choice number");
        int choice = myinputs.nextInt();
        switch (choice) {
            case 1:
                compute_Addition();
                break;
            case 2:
                compute_Substraction();
                break;
            case 3:
                compute_Division();
                break;
            case 4:
                compute_Multiplication();
                break;
            case 5:
                compute_Exponential();
                break;
            case 6:
                compute_Log();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void compute_Addition() {
        Scanner myinputs = new Scanner(System.in);
        double value = 0.0;
        System.out.println("Enter number of variables you desire to use");
        int num = myinputs.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter num " + (i + 1));
            double thevalue = myinputs.nextDouble();
            value += thevalue;
        }
        System.out.println("The answer is " + value);
    }

    public static void compute_Substraction() {
        Scanner myinputs = new Scanner(System.in);
        System.out.println("Enter value one ");
        double value =myinputs.nextDouble();
        System.out.println("Enter  remaining number of values you desire to use");
        int num = myinputs.nextInt();
        for (int i = 1; i <=num; i++) {
            System.out.println("Enter num " + (i+1));
            double thevalue = myinputs.nextDouble();
            value -=thevalue;
        }
        System.out.println("The final value is " + value);
    }

    public static void compute_Division() {
        Scanner myinputs = new Scanner(System.in);
        System.out.println("Enter  the dividend value ");
        double dividend_value = myinputs.nextDouble();

        System.out.println("Enter  the divisor value ");
        double divisor_value = myinputs.nextDouble();
        if(divisor_value != 0){
            double final_value = (dividend_value / divisor_value);
            System.out.println("The value is " + final_value);
        } else {
            System.out.println("Error;Use of value 0 to divide");
            System.out.println("Use other value not 0");
            System.exit(0);
        }

    }

    public static void compute_Multiplication() {
        Scanner myinputs = new Scanner(System.in);
        double value = 1.0;
        System.out.println("Enter number of variables you desire to use");
        int num = myinputs.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter num " + (i + 1));
            double thevalue = myinputs.nextDouble();
            value *= thevalue;
        }
        System.out.println("The multiplication value of your variables is " + value);
    }

    public static void compute_Exponential() {
        Scanner myinputs = new Scanner(System.in);
        System.out.println("Enter value to be raised to a certain power");
        double num1 = myinputs.nextDouble();
        System.out.println("Enter the exponent value");
        double superscript = myinputs.nextDouble();
        double ans = Math.pow(num1, superscript);
        System.out.println("The answer is " + ans);
    }
    public  static void compute_Log(){
        Scanner inputs=new Scanner(System.in);
        System.out.println("Enter value ");
        double log_value=inputs.nextDouble();
        double result=Math.log(log_value);
        System.out.println("Result is "+ result);
    }


    }
