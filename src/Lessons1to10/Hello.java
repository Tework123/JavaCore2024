package Lessons1to10;

public class Hello {
    public static void main(String[] args) {
        int myInt = 1;
        int yourInt = 10;
        short x = 9999;
        int x1 = 999999999;
        long x2 = 999999999;
        double x3 = 99999999.2;
        float x4 = 999999999.3f;
        char c = 'a';
        boolean b = true;
        byte b2 = 127;
        String str = "Lessons1to10.Hello";
        String home = "space";
        String str2 = str + home;
        System.out.println(myInt + yourInt);

        int value = 0;
        int y = 0;
        while (y < 10) {
            System.out.println(value);
            y += 1;
        }
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        if (y < 0){
            System.out.println("YES");
        } else if(y == 0){
            System.out.println("NO");
        } else {
            System.out.println("11");
        }
    }
}













