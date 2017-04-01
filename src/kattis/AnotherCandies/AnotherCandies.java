package kattis.AnotherCandies;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * LINK: https://open.kattis.com/problems/anothercandies
 *
 * @author beaver
 */
public class AnotherCandies {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        
        int cases = io.nextInt();
        while(cases > 0) {
            int children = io.nextInt();
            // Try biginteger instead of long
            BigInteger candies = BigInteger.ZERO; 
            for(int i = 0; i < children; i++) {
                candies = candies.add(BigInteger.valueOf(io.nextLong()));
            }
            // modulus and math.floormod with long dont work at test 3 case, try biginteger
            if (candies.mod(BigInteger.valueOf(children)) 
                    .equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
            cases--;
        }
        
        io.close();
    }
}
