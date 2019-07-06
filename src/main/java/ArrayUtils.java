package main.java;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ArrayUtils {
    public static Number sumPositive(Number[] arrayNumbers) {
        Number sum = 0;
        BigDecimal sumBig = new BigDecimal(sum.doubleValue());
        Integer z = 0;
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            BigDecimal bigDecimal = new BigDecimal(arrayNumbers[i].doubleValue());
            BigDecimal zero = new BigDecimal(z.doubleValue());
            if (bigDecimal.compareTo(zero) == 1) {
                sumBig = sumBig.add(bigDecimal);//sumBig.add(bigDecimal);
            }
        }
        return sumBig;
    }

    public static Number avg(Number[] array) {
        BigDecimal avg = new BigDecimal(array[0].doubleValue());
        Integer l = array.length;
        BigDecimal length = new BigDecimal(l.doubleValue());
        for (int i = 1; i <= l - 1 ; i++) {
            BigDecimal element = new BigDecimal(array[i].doubleValue());
            avg = avg.add(element);
        }
        return avg.divide(length);
    }

    public static ArrayList<Integer> divisibleby(ArrayList<Integer> arrlist, int divby) {
        int i = 0;
        while (i < arrlist.size()) {
            if (arrlist.get(i) % divby == 0) {
                arrlist.remove(i);
            }
            else i++;
        }

        return arrlist;
    }
}
