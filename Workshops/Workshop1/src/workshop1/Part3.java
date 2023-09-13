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
public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();
        String[] studentlist = new String[numStudents];
        sc.nextLine();
        System.out.println("Enter student list:");
        for(int i=0;i<numStudents;i++){
            studentlist[i] = sc.nextLine();
        }
        System.out.println("List of students after converting to uppercase:");
        for(int i=0;i<numStudents;i++){
            String uppercaseName = studentlist[i].toUpperCase();
            System.out.println(uppercaseName);
        }
    }
}
