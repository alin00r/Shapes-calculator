/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2java;

/**
 *
 * @author ALi NOUR
 */
public class Circle {
    double rad;
    void setr(double r){
        rad=r;
    }
     double getA()
    {
        double a;
        a= 3.14*rad*rad;
        return a ;  
    } 
    double getP()
    {
        double per;
        per= 2*3.14*rad ;
        return per ;  
    }
}
