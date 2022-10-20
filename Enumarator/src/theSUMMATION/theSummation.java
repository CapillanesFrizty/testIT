package theSUMMATION;

import java.util.Scanner;

public class theSummation {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count =0, sum = 0, size = 3;
        int[] numArr = new int[size];
        System.out.println("Enter a Value: ");
        
        while (size != count) {            
            System.out.print("Value: ");
            numArr[count] = scn.nextInt();
            count++;
        }
        
        for (int i : numArr) {
            sum =sum+ i;
        }
        System.out.print("The SUM: "+ sum);

    }
}
