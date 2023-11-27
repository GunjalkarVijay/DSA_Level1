////////////////////////////Question/////////////////////

// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).

// Input Format : 
// low 
// high

// Output Format :
// n1
// n2
// .. all primes between low and high (both included)

////////////////////////////Solution//////////////////////

import java.util.*;
public class Print_All_Prime_Till_N {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int low= scn.nextInt();
        int high=scn.nextInt();
        for(int i=low; i<=high; i++){
            boolean isPrime=true;;
            for(int j=2; j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
