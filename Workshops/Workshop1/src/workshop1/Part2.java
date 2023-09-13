/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;

import java.util.Scanner;

/**
 *
 * @author thang
 */
public class Part2 {
    public static void main(String[] args) {
        float num1,num2;
        String op;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the number 1:");
        num1 = sc.nextFloat();
        System.out.println("Input the number 2:");
        num2 = sc.nextFloat();
        System.out.println("Input the operator(+-*/):");
//        sc= new Scanner(System.in);
        sc.nextLine();
        op = sc.nextLine();
        if(op.equals("+")){
            System.out.println("the result of "+num1+ op+ num2 + "="+(num1+num2));
        }
        else if(op.equals("-")){
            System.out.println("the result of "+num1+ op+ num2 + "="+(num1-num2));
        }
        else if(op.equals("*")){
            System.out.println("the result of "+num1+ op+ num2 + "="+(num1*num2));
        }
        else if(op.equals("/")){
            if(num2==0){
                System.out.println("Cannot be divided by zero");
                return ;
            }
            else System.out.println("the result of "+num1+ op+ num2 + "="+(float)(num1/num2));
        }
    }
}
