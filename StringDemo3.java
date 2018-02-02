
package javaapplication29;


public class StringDemo3 {
    public static void main(String[] args) {
       String country="   bangladesh is   my country  ";
        System.out.println("country "+country);
        
        char ch=country.charAt(0);
        System.out.println("counrty "+country);
        
        int sou=country.codePointAt(0);
        System.out.println("sou "+sou);
        
        int coi=country.indexOf("b");
        System.out.println("the first position of b "+coi);
        
        int sum=country.lastIndexOf("n");
        System.out.println("the last position of n "+sum);
        
        String c=country.trim();
        System.out.println(c);
        
        
        
    }
    
    
    
}
