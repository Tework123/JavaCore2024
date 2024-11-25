package Lessons1to10;

import java.util.ArrayList;
import java.util.Collections;


public class quiz {
    public static void main(String[] args) {
        //1
//        String name = "patrik Vashington";
//        System.out.println(abrevName(name));
        //2
//        int year = 1892;
//        System.out.println(century(year));
        //3
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list1.add(1);
//        list1.add(4);
//        System.out.println(mergeTwoLists(list1, list2));
        int[] list = {3, 2, 2, 3, 5};
        int value = 3;
        System.out.println(removeElement(list, value));

    }

    static String abrevName(String name) {
        String[] array = name.split(" ");
        String result = (array[0].charAt(0) + "." + array[1].charAt(0)).toUpperCase();
        return result;

    }

    static int century(int number) {
        int result = number / 100;
        if (number % 100 > 0) {
            result += 1;


        }
        return result;
    }

    static ArrayList<Integer> mergeTwoLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (Integer element : list1) {
            resultList.add(element);
        }
        for (Integer element : list2) {
            resultList.add(element);
        }
        Collections.sort(resultList);


        return resultList;
    }

    static int removeElement(int[] nums, int val) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            } else {
                result += 1;
            }
        }
        System.out.println(list);

        return result;
    }


}
fix grandle with guide for future projects(not spring)






