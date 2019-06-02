package com.zipcodewilmington;


import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean result;
        if (Arrays.asList(array).contains(value)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
        Collections.reverse(arrayList);
        String[] resultArray = arrayList.toArray(new String[arrayList.size()]);
        return resultArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        Boolean result;
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
        Collections.reverse(arrayList);
        String[] resultArray = arrayList.toArray(new String[arrayList.size()]);

        return Arrays.equals(array, resultArray);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arrayString = Arrays.toString(array);
        Long result = arrayString.toUpperCase().chars().filter(ch -> ch >= 'A' && ch <= 'Z').distinct().count();

        return result == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return ArrayUtils.removeElement(array, valueToRemove);
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                list.add(array[i]);
            }
        }
        list.add(array[array.length - 1]);
        String[] resultArray = list.toArray(new String[list.size()]);
        return resultArray;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        System.out.println("method called");
        String result = "";

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                result += array[i - 1];
            } else {
                result += array[i - 1] + " ";
            }


        }
        result += array[array.length - 1];
        String[] resultArray = result.split(" ");
        for(int i =0; i < resultArray.length; i++){
            System.out.print(resultArray[i] + " ");
        }
        return resultArray;
}
}
