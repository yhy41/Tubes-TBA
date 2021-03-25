package tba;
public class GetTabel {
    public  String GetTabel(int NT,int T){
            String [][] parseTabel = new String[3][11];
            parseTabel[0][0] = "1 S'";
            parseTabel[0][1] = "2 S S'";
            parseTabel[0][2] = "ERROR";
            parseTabel[0][3] = "ERROR";
            parseTabel[0][4] = "ERROR";
            parseTabel[0][5] = "6 S 7 S S'";
            parseTabel[0][6] = "ERROR";
            parseTabel[0][7] = "ERROR";
            parseTabel[0][8] = "9 S 10 S'";
            parseTabel[0][9] = "ERROR";
            parseTabel[0][10] = "ERROR";
            
            parseTabel[1][0] = "ERROR";
            parseTabel[1][1] = "ERROR'";
            parseTabel[1][2] = "P S S'";
            parseTabel[1][3] = "P S S'";
            parseTabel[1][4] = "P S S'";
            parseTabel[1][5] = "ERROR";
            parseTabel[1][6] = "e";
            parseTabel[1][7] = "P S S'";
            parseTabel[1][8] = "ERROR";
            parseTabel[1][9] = "e";
            parseTabel[1][10] = "e";
            
            parseTabel[2][0] = "ERROR";
            parseTabel[2][1] = "ERROR'";
            parseTabel[2][2] = "3";
            parseTabel[2][3] = "4";
            parseTabel[2][4] = "5";
            parseTabel[2][5] = "ERROR";
            parseTabel[2][6] = "ERROR";
            parseTabel[2][7] = "8";
            parseTabel[2][8] = "ERROR";
            parseTabel[2][9] = "ERROR";
            parseTabel[2][10] = "ERROR";
            
            
            return parseTabel[NT][T];
            
        } 
}
