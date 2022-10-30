/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2java;

/**
 *
 * @author ALi NOUR
 */
public class Rectangle {
    int len,wid;
     void setL(int l)
    {
        len = l ;
    }
     void setW(int w)
    {
        wid = w ;
    }
    int getA(){
        int a;
        a=len*wid;
        return a;
    }
    int getP(){
        int p;
        p=((2*len)+(2*wid));
        return p;
    }
}
