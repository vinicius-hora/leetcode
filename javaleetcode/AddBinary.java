package javaleetcode;
/*
 * https://leetcode.com/problems/add-binary/description/
 * Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */

public class AddBinary {

    public static void main(String[] args) {
        // String a = "11", b = "1";
        String a = "1010", b = "1011";
        // String a = "1111", b = "1111";
        // String a = "100", b = "110010";
        // String a = "1", b = "111";


        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary(a, b));
    }
    public String addBinary(String a, String b) {

        int i = 0;
        String resultado = "";
        int carry = 0;
        int numeroA;
        int numeroB;
        if(a.length() > b.length()){
            b = adiconarZero(a, b);
        }
        if(b.length() > a.length()){
            a = adiconarZero(a, b);
        }

        for(i=a.length()-1; i>=0; i--){
            numeroA = Character.getNumericValue(a.charAt(i));
            numeroB = Character.getNumericValue(b.charAt(i));
            if(numeroA == 1 && numeroB == 1 && carry == 0){
                resultado = "0" + resultado;
                carry = 1;
                continue;
            }
            if(numeroA == 1 && numeroB == 0 && carry == 0){
                resultado = "1" + resultado;
                carry = 0;
                continue;
            }
            if(numeroA == 1 && numeroB == 0 && carry == 1){
                resultado = "0" + resultado;
                carry = 1;
                continue;
            }
            if(numeroA == 0 && numeroB == 1 && carry == 0){
                resultado = "1" + resultado;
                carry = 0;
                continue;
            }
            if(numeroA == 0 && numeroB == 1 && carry == 1){
                resultado = "0" + resultado;
                carry = 1;
                continue;
            }
            if(numeroA == 0 && numeroB == 0 && carry == 1){
                resultado = "1" + resultado;
                carry = 0;
                continue;
            }
            if(numeroA == 0 && numeroB == 0 && carry == 0){
                resultado = "0" + resultado;
                carry = 0;
                continue;
            }
            if(numeroA == 1 && numeroB == 1 && carry == 1){
                resultado = "1" + resultado;
                carry = 1;
                continue;
            }
            
        }

        if(carry == 1){
            resultado = "1" + resultado;
        }
        

        return resultado;
    }

    public String adiconarZero(String a, String b){
        int contadorMaior = 0;
        boolean aMaior = false;
        boolean bMaior = false;
        int i = 0;

        if(a.length() > b.length()){
            contadorMaior = a.length() - b.length();
            aMaior = true;
        }
        if(b.length() > a.length()){
            contadorMaior = b.length() - a.length();
            bMaior = true;
        }

        if(aMaior){
            for(i=0; i<contadorMaior; i++){
                b = "0" + b;
            }
            return b;
        }
        if(bMaior){
            for(i=0; i<contadorMaior; i++){
                a = "0" + a;
            }
            return a;
        }

        return "";

    }
    
}
