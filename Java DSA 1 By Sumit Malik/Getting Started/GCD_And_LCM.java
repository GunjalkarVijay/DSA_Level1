////////////////////////////Question/////////////////////

// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

// Input Format : 
// num1
// num2
// .. the numbers whose GCD and LCM we have to find.
// 36
// 24

// Output Format :
// a
// b
// .. where 'a' and 'b' are the GCD and LCM respectively.
// 12
// 72

////////////////////////////Solution//////////////////////

import java.util.*;
public class GCD_And_LCM {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int min=Math.min(a, b);
        int max=Math.max(a, b);
        int gcd=1, lcm=0;
        for(int i=1; i<=min; i++){
            if(max%i==0 && min%i==0){
                gcd=i;
            }
        }
        int temp=max;
        while(lcm==0){
            if(temp%min==0 && temp% max==0){
                lcm=temp;
            }
            temp+=max;

        }
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
