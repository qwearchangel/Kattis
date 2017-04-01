package kattis.SimonSais;

import java.util.Scanner;

/**
 * LINK: https://open.kattis.com/problems/simonsays
 * @author beaver
 */
public class SimonSays {
    private static final String simon = "Simon says ";
    
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        
        int cases = io.nextInt();
        while(cases > 0){
            String line = io.nextLine();
            if(line.isEmpty()) {
                continue;
            }
            if(line.contains(simon)) {
                System.out.println(line.substring(simon.length()));
            }
            cases--;
        }
        io.close();
    }
}
