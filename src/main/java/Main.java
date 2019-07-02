package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//      Task #3
        System.out.println("Sorting {2,3,1,7,11} array by DESC:");
        int[] intArray = {2,3,1,7,11};

//        Sort.bubbleSort(intArray);
        Sort.bubbleSortDesc(intArray);

        for (int element: intArray) {
            System.out.println(element);
        }

//      Task #4
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("One");
        arrlist.add("Two");
        arrlist.add("Tree");
        arrlist.add("Four");

        arrlist.set(2,"Three");

        System.out.println(arrlist);

//      Task #5
        Number[] arrayNumbers = {11,22,-1,-3};
        Number[] arrayNumbersNegative = {-1,-2,-3};
        System.out.println("SUM of positive Numbers: " + ArrayUtils.sumPositive(arrayNumbers));
        System.out.println("SUM of positive Numbers with no positive elements: " + ArrayUtils.sumPositive(arrayNumbersNegative));

//      Task #6
        Number[] arrayAvarage = {2,4,6,2,3};
        System.out.println("Avarage value of array: " + ArrayUtils.avg(arrayAvarage));

//      Task #7
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(22);
        System.out.println("Elements from {3,9,11,18,20,22} not divisible by 3: " + ArrayUtils.divisibleby(arrayList, 3));
    }
}
