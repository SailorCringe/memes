package tests;

import java.util.Scanner;

public class secretmsj {
    public static void main(String[] args){
            
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        StringBuilder sr = new StringBuilder();
        
        String msg;
        short n;
        
        while(sc.hasNext()) {
            
            msg = sc.nextLine();
            for(short i = 0; i < msg.length(); i+=2) {
                
                s.append(msg.charAt(i));
                s.append(msg.charAt(i+1));
                n = Short.parseShort(s.toString());
                if(n < 32) {
                    s.append(msg.charAt(i+2));
                    n = Short.parseShort(s.toString());
                    i++;
                }
                sr.append((char)n);
                s = new StringBuilder();
            }
            sr.append("\n");
        }        
        System.out.print(sr);
    }
}