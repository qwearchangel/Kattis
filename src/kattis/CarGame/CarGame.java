package kattis.CarGame;

import java.util.*;

/**
 * LINK: https://open.kattis.com/problems/cargame
 *
 * @author beaver
 */
public class CarGame {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int n = io.nextInt();
        int m = io.nextInt();

        List<String> words = new ArrayList<>();
        List<String> regs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            words.add(io.next());
        }
        for (int i = 0; i < m; i++) {
            regs.add(io.next().toLowerCase());
        }

        for (String reg : regs) {
            char[] regArray = reg.toCharArray();
            Iterator dictionary = words.iterator();
            boolean found = false;

            while (dictionary.hasNext()) {
                String word = (String) dictionary.next();
                if (checkWord(regArray, word)) {
                    System.out.println(word);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No valid word");
            }
        }
    }

    private static boolean checkWord(char[] regArray, String word) {
        // needs to be found in line DNA is not sand, SND is
        boolean result = true;
        String copy = word;
        for (char letter : regArray) {
            int index = copy.indexOf(letter);
            if (index == -1) {
                result = false;
                break;
            }

            copy = copy.substring(index + 1);
        }

        return result;
    }
}
