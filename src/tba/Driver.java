package tba;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
       Operator or = new Operator();
       Operand od  = new Operand();   
       Scanner masukan = new Scanner(System.in);
        System.out.println("Logika proposisi : ");
        String Cekpqrs  = masukan.nextLine();
        String Cek = "";
        List lexic = new ArrayList();
        int i = 0;
        boolean Error = false; 
        boolean TT = false; 
        Cekpqrs+=' '; 
        do {
         if(Cekpqrs.charAt(i) != ' '){
             Cek+=Cekpqrs.charAt(i); 
             if(Cekpqrs.charAt(i) == ')' || Cekpqrs.charAt(i) == '('){
                 TT = true;
             }
         }
          
         if(Cekpqrs.charAt(i) == ' ' || TT == true || Cekpqrs.charAt(i+1) == ')' 
                 || Cekpqrs.charAt(i+1)== '(' ){  
             if(od.CekOperand(Cek)){
                lexic.add("1");
            }else if(or.CekAnd(Cek)){
                lexic.add("3");
            }else if (or.CekOr(Cek)){
                lexic.add("4");
            }else if (or.CekNot(Cek)){
                lexic.add("2");
            }else if (or.CekIf(Cek)){
                lexic.add("6");
            }else if (or.CekXor(Cek)){
                lexic.add("5");
            }else if (or.CekIff(Cek)){
              lexic.add("8");
            }else if (or.CekThen(Cek)){
                lexic.add("7");
            }else if (or.CekBk(Cek)){
                lexic.add("9");
            }else if (or.CekTk(Cek)){
                lexic.add("10");
            }else if (Cekpqrs.charAt(i) == ' ' && Cek == ""){ 
                   
            }else {
                
                Error = true;
               
            }
            Cek ="";
            TT = false;
         }
             
         i++;    
           
          } while(i<Cekpqrs.length() && Error != true);
       
          System.out.print("lexic : ");
          if(Error ==  false){  
               
              System.out.println(lexic);
          }else {
              System.out.println("error");
          }
      
        TsValidasi validasi = new TsValidasi();
        
        if(validasi.Validasi(lexic) == true && Error == false ){
            
            System.out.println("VALID");
        }else{
            System.out.println("TIDAK VALID");
        }
    }
    
    
}
