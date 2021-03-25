package tba;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class StringtoList { // digunakan untuk mengkonvert String to list
    public List Convert(String masukan){
        List keluaran = new ArrayList();
        String input = masukan;
        int i = 0;
        while (input != "") {
            if (i < input.length()){
                if (input.charAt(i) == ' '){
                    keluaran.add(input.substring(0, i));
                    input = input.substring(i+1);
                    i = 0;
                }
                i++;
            }else{
                keluaran.add(input);
                input = "";
            }
        }
        return keluaran;
    }
}
