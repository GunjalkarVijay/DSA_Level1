////////////////////////////Question/////////////////////

// 1. You are required to display the prime factorization of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

// Input Format : 
// n, an integer
// 1440

// Output Format :
// p1  p2  p3  p4.. all prime factors of n
// 2 2 2 2 2 3 3 5

////////////////////////////Solution//////////////////////

import java.util.*;
public class Prime_Factorization_Of_Number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        for(int div=2; div*div<=n; div++){
            while(n%div==0){
                n=n/div;
                System.out.println(div);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
