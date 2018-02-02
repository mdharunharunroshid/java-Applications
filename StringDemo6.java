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
public class StringDemo6 {
    
    public static void main(String[] args) {
        
        String s1="madam";
        
        StringBuffer sb=new StringBuffer("madam");
        String s2=sb.reverse().toString();
        
        if(s1.equals(s2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
        
    }
    
}
