package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in Km:\n");
        int km=sc.nextInt();
        System.out.print("The given distance in km="+km);
        int metres=km*1000;
        int cm=metres*100;
        System.out.println("\nThe distance present in the metres are:"+metres);
        System.out.println("\nThe distance present in the centimetres:"+cm);
        sc.close();
    }
}
