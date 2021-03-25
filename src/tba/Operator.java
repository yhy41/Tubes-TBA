package tba;
import java.util.Scanner;
public class Operator {
    
    public boolean CekAnd (String c){
         int s = 0;
        for (int i = 0; i < c.length(); i++) {
            if(c.charAt(i) == 'a' && s == 0){
           s = 1;
        }else if (c.charAt(i) == 'n' && s == 1){
            s = 2;
        }else if (c.charAt(i) == 'd' && s == 2){
            s = 3;
        }else if (c.charAt(i) == ' ' && s == 3){
            s = 0;
        }else{
            s = 4;
        } 
            
    }
        if(s == 3){
            return true;
        }else {
            return false;
        }
    }
    public static boolean CekOr(String c){
        int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == 'o' && s == 0 ){
            s = 1;
        }else if(c.charAt(i) == 'r' && s == 1){
            s = 2;
        }else if (c.charAt(i) == ' ' && s == 2){
            s = 0;
        }else{
            s =3;
        }
     }
        if (s == 2){
            return true;
        }else {
            return false;
        }
    }
    public static boolean CekNot(String c){
        int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == 'n' && s == 0 ){
            s = 1;
        }else if(c.charAt(i) == 'o' && s == 1){
            s = 2;
        }else if (c.charAt(i) == 't' && s == 2){
            s = 3;
        }else if (c.charAt(i) == ' ' && s == 3) {
            s =0;
        }else {
            s = 4;
        }
    }
        if (s == 3){
            return true;
        }else {
            return false;
        }
    
    }
    public static boolean CekXor(String c){
        int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == 'x' && s == 0 ){
            s = 1;
        }else if(c.charAt(i) == 'o' && s == 1){
            s = 2;
        }else if (c.charAt(i) == 'r' && s == 2) {
            s =3;
        }else if (c.charAt(i) == ' ' && s == 3) {
            s = 0;
        }else {
            s = 4;
        }
    }
        if (s == 3){
            return true;
        }else {
            return false;
        }
    }
    public static boolean CekIf(String c){   
        int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == 'i' && s == 0 ){
            s = 1;
        }else if(c.charAt(i) == 'f' && s == 1){
            s = 2;
        }else if (c.charAt(i) == ' ' && s == 2) {
            s =0;
        }else {
            s = 3;
        }
    }
        if (s == 2){
            return true;
        }else {
            return false;
        }
    
    }
    public static boolean CekIff(String c){
       int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == 'i' && s == 0 ){
            s = 1;
        }else if(c.charAt(i) == 'f' && s == 1){
            s = 2;
        }else if (c.charAt(i) == 'f' && s == 2) {
            s =3;
        }else if (c.charAt(i) == ' ' && s == 3){
            s = 0;
        }else {
            s = 4;
        }
    }
        if (s == 3){
            return true;
        }else {
            return false;
        }
    }
    public static boolean CekThen(String c){
      int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == 't' && s == 0 ){
            s = 1;
        }else if(c.charAt(i) == 'h' && s == 1){
            s = 2;
        }else if (c.charAt(i) == 'e' && s == 2) {
            s =3;
        }else if (c.charAt(i) == 'n' && s == 3){
            s = 4;
        }else if (c.charAt(i) == ' ' && s == 4 ){
            s = 0;
        }else{
            s = 5;
        }
    }
        if (s == 4){
            return true;
        }else {
            return false;
        }
    }
    public static boolean CekBk(String c){
      int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == '(' && s == 0 ){
            s = 1;
        }else if (c.charAt(i) == ' ' && s == 1 ){
            s = 0;
        }else{
            s = 2;
        }
    }
        if (s == 1){
            return true;
        }else {
            return false;
        }
    }
    public static boolean CekTk(String c){
      int s = 0;
        for (int i = 0; i < c.length(); i++) {
        if(c.charAt(i) == ')' && s == 0 ){
            s = 1;
        }else if (c.charAt(i) == ' ' && s == 1 ){
            s = 0;
        }else{
            s = 2;
        }
    }
        if (s ==1){
            return true;
        }else {
            return false;
        }
    }
    
    
    
}