////////////////////////////Question/////////////////////

// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

// Input Format : 
// "n" where n is any integer.

// Output Format :
// d1
// d2
// d3
// ... digits of the number

////////////////////////////Solution//////////////////////

import java.util.*;
public class Digits_Of_Number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int temp = n;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int div= (int)Math.pow(10, count-1);
        while(div!=0){
            int ans = n/div;
            n=n%div;
            System.out.println(ans);
            div=div/10;
        }
    }
}
