////////////////////////////Question/////////////////////

// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

// Input Format : 
// A number t
// A number n
// A number n
// .. t number of times

// Output Format :
// prime
// not prime
// not prime
// .. t number of times

////////////////////////////Solution//////////////////////

import java.util.*;
public class Is_A_Number_Prime {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        for(int j=0; j<t; j++){
            int n= scn.nextInt();
            boolean isPrime=true;
            for(int i=2; i<n; i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}
