package Lessons30to40;




public class Quiz4 {
    public static void main(String[] args) {
//        char[] listChars1 = {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
//        char[] listChars2 = {'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w'};
//        char[] listChars3 = {'s', 'w', 's', 'w', 's', 'w', 's', 'w', 's', 'w'};
//        char[] listChars4 = {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
//        System.out.println(isValid(listChars1));
//        System.out.println(isValid(listChars2));
//        System.out.println(isValid(listChars3));
//        System.out.println(isValid(listChars4));
        String input = "aThe sunset sets at twelve o' clock.";
        System.out.println(alphabetPosition(input));


    }


//    public static boolean isValid(char[] walk) {
//        HashMap<Character, Integer> result = new HashMap<>();
//        for (char element : walk) {
//            if (result.containsKey(element)) {
//                result.replace(element, result.get(element) + 1);
//            } else {
//                result.put(element, 1);
//            }
//        }
//
//        List<Integer> list = new ArrayList(result.values());
//        int sum = list.stream().mapToInt(Integer::intValue).sum();
//        if (result.get('n') == result.get('s') && result.get('w') == result.get('e') && sum == 10) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static String alphabetPosition(String text) {
//        check number char in certain scale (97 to 122)
        text = text.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (97 <= text.charAt(i) && text.charAt(i) <= 122) {
                result.append((int) text.charAt(i) - 96).append(" ");
            }
        }


        return result.toString();

    }
}




