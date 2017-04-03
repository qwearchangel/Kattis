package kattis.ImageDecoding;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * LINK: https://open.kattis.com/problems/imagedecoding
 *
 * @author beaver
 */
public class ImageDecoding {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        StringTokenizer line;

        boolean first = true;
        while (true) {
            int scanLines = Integer.parseInt(io.nextLine());

            if (scanLines == 0) {
                break;
            }

            if (first) {
                first = false;
            } else {
                System.out.println("");
            }

            boolean error = false;
            boolean dot = true;
            int lenght = 0;
            for (int i = 0; i < scanLines; i++) {
                line = new StringTokenizer(io.nextLine(), " ");

                String append = "";
                dot = line.nextToken().equals(".");
                while (line.hasMoreTokens()) {
                    int printNr = Integer.parseInt(line.nextToken());
                    append += ((dot == true
                            ? new String(new char[printNr]).replace("\0", ".")
                            : new String(new char[printNr]).replace("\0", "#")));
                    dot = !dot;
                }

                if (i == 0) {
                    lenght = append.length();
                } else if (append.length() != lenght) {
                    error = true;
                }

                System.out.println(append);
            }

            if (error) {
                System.out.println("Error decoding image");
            }
        }
        io.close();
    }
}
