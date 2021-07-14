package com.codewithmelvin;
import java.io.*;
import  java.lang.*;
import java.util.*;
//using the keyword throw for throwing an Exception to be handled by onother Exception
public class DeepExceptions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,k,j,addition;
        i=0;
        j=0;
        addition=0;
        try{
            System.out.print("Enter an integer value (numerator) :");
            i=input.nextInt();
            System.out.print("Enter an integer value (denominator) :");
            j=input.nextInt();
            k=i/j;
            addition=i+j;
            if(addition<5){
                throw new SummationException("Min answer for summation");
            }
            else{
                System.out.println("the sum of "+ i + " " + j + " is "+ addition);
            }
            if (j==0){
                throw new  ArithmeticException();
            }
            else{
                System.out.println("The Output is when "+ i+"/"+j+ " is :" + k);
            }

            if (k<2){
                throw new MinimumAnswerException("Minimum Answer of Expression");
            }
            else{
                System.out.println("The Output is when "+ i+"/"+j+ " is :" + k);
            }
        }
        catch(SummationException se){
            System.out.println("Minimum answer when we sum "+ i + " "+ j + " must be >5");
        }
        catch (MinimumAnswerException mae){
            System.out.println("The minimum answer for this code is 3 wen we divide");
        }
        catch(ArithmeticException ae){
            System.out.println("canno divide by zero : ");
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            System.out.println("Goodbye we're done here with this code");
        }
    }
}
class MinimumAnswerException extends Exception{
    public MinimumAnswerException(String message){
        super(message);
    }
}
class SummationException extends Exception{
    public SummationException(String message){
        super(message);
    }

}