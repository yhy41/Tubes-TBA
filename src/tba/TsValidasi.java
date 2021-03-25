package tba;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class TsValidasi {
    public static String Baca(List lexic){
        if(!lexic.isEmpty()){
            return lexic.get(0).toString();
        }else{
            return null;
        }
    }
    public static int GetIndex(String Simbol){
        switch(Simbol){ 
            
            case "S" : return 0;
            case "S'": return 1;
            case "P" : return 2;
            case "1" : return 0;
            case "2" : return 1;
            case "3" : return 2;
            case "4" : return 3;
            case "5" : return 4;
            case "6" : return 5;
            case "7" : return 6;
            case "8" : return 7;
            case "9" : return 8;
            case "10": return 9;
            case "#" : return 10;
            default  : return 212;
    } 
 }  
    public static boolean Validasi(List lexicawal){
        Stack stack = new Stack(); 
        String Simbol ;
        boolean isError = false;
        List lexic = lexicawal ;
        lexic.add("#"); 
        GetTabel tabel = new GetTabel();
        stack.push("#");
        stack.push("S");
        
        Simbol = Baca(lexic);
        
       
        while (!stack.isEmpty() && isError != true) {
       
            switch(stack.peek().toString()){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                    
                    if (stack.peek().equals(Simbol) ) {
                        stack.pop();
                        lexic.remove(0); 
                        Simbol = Baca(lexic);
                    }else{
                        isError = true;
                    }
                    break;
                        
                case "S": 
                case "S'": 
                case "P": 
                    
                    
                    int x = GetIndex(stack.peek().toString());
                    
                    int y = GetIndex(Simbol);
      
                    StringtoList STL = new StringtoList();
                    List dataXY = new ArrayList();
                    dataXY = STL.Convert(tabel.GetTabel(x,y)); 
                    
                    if (dataXY.get(0) != "ERROR"){  
                       stack.pop();
                       for(int i = dataXY.size()-1; i>=0; i--){
                           stack.push(dataXY.get(i));
                       }
                    }else{
                        isError = true;
                    }
                    break;
                case "e" : 
                    
                    stack.pop();
                    break;
                    
                default :
                    isError = true;
        }
    }
        if(stack.peek() == "#" && Simbol == "#"){ 
            return true;
        }else{
            return false;
        }
     
  }
}
    


