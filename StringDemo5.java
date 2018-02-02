
package javaapplication29;


public class StringDemo5 {
    public static void main(String[] args) {
        
        StringBuffer s1=new StringBuffer("madam");
       StringBuffer s2= s1.reverse();
        //System.out.println(s2);
        
        if(s1.equals(s2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
       
        
     
    }
    
}
