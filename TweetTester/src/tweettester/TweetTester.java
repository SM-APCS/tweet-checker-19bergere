/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author INSERT YOUR NAME HERE
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner reader = new Scanner(System.in);//initialize scanner
      String tweet = reader.nextLine(); // makes tweet
        int theNumer = tweet.length(); //tweets is number now
        System.out.println(theNumer); // prints the length
        
        
        /* Scanner scan = new Scanner (System.in);
         String tweet;
         
         int length = tweet.length();
         System.out.println("The lenght is: " + length);*/
    }
    
}
