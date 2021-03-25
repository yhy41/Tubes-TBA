package tba;
import java.util.Scanner;
public class Operand {
     public static boolean CekOperand (String c){ 
         int s = 0;
         for (int i = 0; i < c.length(); i++) {
             if(c.charAt(i) == 'p' && s == 0 || c.charAt(i) == 'q'&& s == 0
                 || c.charAt(i) == 'q'&& s == 0|| c.charAt(i) == 'r' && s == 0 
                 ||c.charAt(i) == 's' && s == 0 || c.charAt(i) == ' ' && s == 0){
                 s = 1;
             }else{
                 s = 2;
             }
          
        }if (s == 1 ){
            return true;
        }else{
            return false;
        }
    }

   
}
