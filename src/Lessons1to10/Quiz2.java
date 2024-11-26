package Lessons1to10;

public class Quiz2 {
    public static void main(String[] args) {
//        random generator and check other solution for this task
//        dna.replace("A","B")
//              .replace("C","D")
//              .replace("T","A")
//              .replace("G","C")
//              .replace("B","T")
//              .replace("D","G");
//        it very slow because every replace check all elements in string then every replace
//        create new string
        String x = "ATTGC";
        long start = System.currentTimeMillis();
        makeComplement(x);

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);

    }

    //    public static boolean isSquare(int x) {
//        int n;
//        for (int i = 1; i < x/2; i++) {
//            n = x / i;
//            if (((n) * (n) == x)) {
//                return true;
//            }
//        }
//
//        return false; // fix me!
//    }
    public static String makeComplement(String dna) {
//        a --> t, t --> a, g --> c, c --> g

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                result.append("T");
            } else if (dna.charAt(i) == 'T') {
                result.append("A");

            } else if (dna.charAt(i) == 'G') {
                result.append("C");

            } else if (dna.charAt(i) == 'C') {
                result.append("G");
            }

        }
        return result.toString();
    }
}
