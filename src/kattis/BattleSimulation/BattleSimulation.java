package kattis.BattleSimulation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * LINK: https://open.kattis.com/problems/battlesimulation
 *
 * @author beaver
 */
public class BattleSimulation {

    private static final String[] combos = {"RBL", "RLB", "BLR", "BRL", "LRB", "LBR"};

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        String line = io.nextLine();
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < line.length()) {
            if (!((i + 3) > (line.length()))) {
                if (Arrays.asList(combos).contains(line.substring(i, i + 3))) {
                    builder.append("C");
                    i = i + 3;
                    continue;
                }
            }
            char n = line.charAt(i);
            switch (n) {
                case 'R':
                    builder.append("S");
                    break;

                case 'B':
                    builder.append("K");
                    break;

                case 'L':
                    builder.append("H");
                    break;
            }
            i++;
        }

        System.out.println(builder.toString());
        io.close();
    }
}
