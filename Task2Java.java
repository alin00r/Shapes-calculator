/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task2java;

import java.util.Scanner;

/**
 * @created @t 3:04 AM 30/10/2022
 * @author ALi NOUR
 */
public class Task2Java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        do {
            System.out.println("********************************");
            System.out.println("* Welcome To Shapes calculator *");
            System.out.println("********************************");
            System.out.println("[1]-Circle");
            System.out.println("[2]-Square");
            System.out.println("[3]-Rectangle");
            System.out.println("[4]-Rhombus");
            System.out.println("[5]-Exit");
            System.out.print("Enter choice: ");
            ch = in.nextInt();
            switch (ch) {
                case 1 -> {
                    Circle c = new Circle() ; 
                    System.out.print("Enter the radius of the Circle: ");
                    double r = in.nextDouble();
                    c.setr(r);
                    System.out.println("Your Choise:");
                    System.out.println("[1]-Area of the Shape");
                    System.out.println("[2]-Perimeter of the Shape");
                    int ch2=in.nextInt();
                    if(ch2==1){
                        System.out.println("The Area of the given radius:" + c.getA()+"cm³");
                    }
                    else if(ch2==2)
                    {
                        System.out.println("The Perimeter of the given radius:" + c.getP()+"cm²");
                    }
                    break;
                }
                case 2 -> {                           
                    Square s = new Square();
                    System.out.print("Enter The Length of the Square : ");
                    int l = in.nextInt();
                    s.setL(l);
                    System.out.println("Your Choise:");
                    System.out.println("[1]-Area of the Shape");
                    System.out.println("[2]-Perimeter of the Shape");
                    int ch3=in.nextInt();
                    if(ch3==1){
                    System.out.println("The Area of the given Length:" + s.getA()+"cm³");
                    }else if(ch3==2){
                    System.out.println("The Perimeter of the given Length:" + s.getP()+"cm²"); 
                  } 
                    break;
               }
                case 3 -> {
                    Rectangle r = new Rectangle() ; 
                    System.out.print("Enter The Length of the Rectangle:");
                    int l = in.nextInt();
                    System.out.print("Enter the Width of the Rectangle:");
                    int w = in.nextInt();
                    r.setL(l);
                    r.setW(w);
                    System.out.println("Your Choise:");
                    System.out.println("[1]-Area of the Shape");
                    System.out.println("[2]-Perimeter of the Shape");
                    int ch4=in.nextInt();
                    if(ch4==1){
                    System.out.println("The Area of the given Length:" + r.getA()+"cm³");
                    }else if(ch4==2){
                    System.out.println("The Perimeter of the given Length:" + r.getP()+"cm²"); 
                    }
                break ;
                    
                }
                case 4 ->{
                    Rhombus r = new Rhombus();
                    System.out.print("Enter The Length of the Rhombus : ");
                    int l = in.nextInt();
                    r.setL(l);
                    System.out.println("Your Choise:");
                    System.out.println("[1]-Area of the Shape");
                    System.out.println("[2]-Perimeter of the Shape");
                    int ch5=in.nextInt();
                    if(ch5==1){
                    System.out.println("The Area of the given Length:" + r.getA()+"cm³");
                    }else if(ch5==2){
                    System.out.println("The Perimeter of the given Length:" + r.getP()+"cm²"); 
                  } 
                    break;
               }

                default -> System.exit(0);
            }
        } while (ch != 5);


    }
}   

