import java.util.Scanner;

public class SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int nMax = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int i = 35;
        int j = 64;

        for (int k = 1; k <= a; k++) {
            for (int l = 1; l <= b; l++) {
                char first = (char)(i);
                char second = (char) j;
                char fifth = (char) j;
                char sixth = (char) i;
                System.out.printf("%c%c%d%d%c%c|",first, second, k, l, fifth, sixth);

                count++;

                if ((k == a && l == b) || count == nMax) {
                    return;
                }

                i++;
                j++;

                if (i > 55) {
                    i = 35;
                }

                if (j > 96) {
                    j = 64;
                }
            }
        }
    }
}