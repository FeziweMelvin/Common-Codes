package CodingWithMelvin;
import java.util.*;
import java.io.*;

public class phonebook {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

    System.out.print("How many contacts would you like to store(Integer) :");
        int contactsNo = input.nextInt();
        String[] name= new String[contactsNo];
        String[] numbers = new String[contactsNo];

        File myFile = new File("contacts.txt");
        try{
            FileWriter myWriter = new FileWriter("contacts.txt");
            for(int contNo=0; contNo<contactsNo; contNo++){
                if(myFile.canWrite() && myFile.exists() ){ //can the new file write
                    int humanView = contNo+1; //for confusion if the user will see contact zero(0) will be confused
                    System.out.print("Enter the contact name for  no"+ humanView + ":");
                    String conName = input.next();
                    name[contNo]=conName;


                    System.out.print("Enter the contact number for no"+ humanView + ":");
                    String conNumber = input.next();
                    numbers[contNo]=conNumber;

                }
                else{
                    System.out.println("The file cannot write");
            }

        }
            for(int lnCount = 0; lnCount<contactsNo; lnCount++){
                myWriter.write(name[lnCount] +" "+ numbers[lnCount] + "\n");

            }
            myWriter.close(); //To close the writer otherwise it won't appear on you txt file

        }
        catch(Exception e){
            System.out.println("There's an Exception found :"+ e);
        }
    }
}
