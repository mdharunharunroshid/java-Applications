/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

/**
 *
 * @author Harun
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String s1="Harun roshid";
        String s2="Harun roshid";
        System.out.println("s1"+s1);
        System.out.println("s2"+s2);
        
        int len=s1.length();
        System.out.println(len);
        
       boolean con=s1.contains("aik");
        System.out.println(con);
        
        boolean cim=s1.isEmpty();
        System.out.println(cim);
        
        
    }
    
}
