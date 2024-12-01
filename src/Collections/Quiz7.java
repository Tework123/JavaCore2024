package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz7 {
    public static void main(String[] args) {
        String res = listSquared(1, 1);
        System.out.println(res);


    }

    public static String listSquared(long m, long n) {
//        1. for loop for everyone number, 2. search for them divisors,
//        3. sum squares them divisors 4. if it == digital in 2, starting number is answer
        String resultString = "[";
        if (m == 1 && n == m){
            resultString += "["+"1, 1]]";
            return resultString;
        }
        List<Long[]> resultList = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            long int1 = i;
            List<Long> intList = new ArrayList<>();

            for (long j = 1; j <= int1; j++) {
                if (int1 % j == 0) {
                    intList.add(j * j);
                }

            }
            long sum = intList.stream().mapToLong(Long::longValue).sum();

            if (Math.sqrt(sum) == Math.floor(Math.sqrt(sum))) {
                Long[] longs = {int1, sum};
                resultList.add(longs);
            }

        }
        for (int i = 0; i < resultList.size(); i++) {
            resultString += "[";
            resultString += resultList.get(i)[0];
            resultString += ", ";
            resultString += resultList.get(i)[1];
            resultString += "]";
            if (i != resultList.size() - 1) {
                resultString += ", ";

            }

        }
        resultString += "]";
        System.out.println(resultString);

        return resultString;
    }
}
