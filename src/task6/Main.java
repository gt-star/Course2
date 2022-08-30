package task6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> list = new ArrayList<>(List.of("Артем","Артем","Сергей","Артем","Сергей","Евгений"));

        sortOdd(nums);
        System.out.println();
        sortEven(nums);
        System.out.println();
        sortContains(list);
        System.out.println();
        sortDouble(list);
    }
    public static void sortOdd(List<Integer> num){
        for (Integer i : num){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void sortEven(List<Integer> num){
        Collections.sort(num);
        int number = Integer.MIN_VALUE;
        for (Integer i : num){
            if (i % 2 == 0 && i != number){
                System.out.println(i);
                number = i;
            }
        }
    }

    public static void sortContains(List<String> list){
//        Set<String> newList = new HashSet<>(list);
//        System.out.println(newList);
        List<String> newList = new ArrayList<>();
        for (String s : list){
            if (!newList.contains(s)){
                newList.add(s);
            }
        }
        System.out.println(newList);
    }

    public static void sortDouble(List<String> list){
//        Set<String> newList = new HashSet<>(list);
//        System.out.println(list.size()- newList.size());
        int count = 0;
        List<String> newList = new ArrayList<>();
        for (String s : list){
            if (!newList.contains(s)){
                newList.add(s);
                count++;
            }
        }

        System.out.println("Количество повторяющихся элементов " + count);
    }
}
