package Lessons1to10;

public class Cicle {
    public static void main(String[] args) {
        char x = '#';
        char ch = ' ';
        int left = 49;
        int right = 49;
        int middle = 2;
        int counter = 0;
        int length = 100;
        int height = 100;

        for (int i = 0; i <= height; i++) {
            if (0 < counter && counter < height / 2) {
                for (int j = 0; j <= length; j++) {
                    if (j < left) {
                        System.out.print(ch);
                    } else if (j == left) {
                        System.out.print(x);
                    } else if (j == right + middle) {
                        System.out.print(x);
                    } else if (j > left) {
                        System.out.print(ch);
                    }
                }
                left -= 1;
                middle += 1;
            }
            if (counter >= height / 2) {
                for (int j = 0; j <= length; j++) {
                    if (j < left) {
                        System.out.print(ch);
                    } else if (j == left) {
                        System.out.print(x);
                    } else if (j == right + middle) {
                        System.out.print(x);
                    } else if (j > left) {
                        System.out.print(ch);
                    }
                }
                left += 1;
                middle -= 1;
            }

            counter += 1;
            System.out.println(" ");

        }
    }
}




