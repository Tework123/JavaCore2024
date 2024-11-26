package Lessons20to30;

public class Lol {
    public static void main(String[] args) {
        Lol2 lol2 = new Lol2(123);
        System.out.println(lol2);
    }
}

class Lol2 {
    int digit;

    public Lol2(int digit) {
        this.digit = digit;
    }
    public String toString(){
        return "hel";
    }
}