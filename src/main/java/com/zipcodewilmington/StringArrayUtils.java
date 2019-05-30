package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        for (int i = 0; i < 9; i++)
        {

        }
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        for (int i = 0; i < 8; i++)
        {

        }

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        boolean check = false;
        for(int i = 0; i < array.length; i++ )
        {
            if(array[i] == value)
            {
                check = true;
            }
        }
        return check;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for  (int i = 0; i<array.length/2; i++)
        {
            String copy = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = copy;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean check = false;

        for(int i = 0; i<array.length/2; i++)
        {
            String copy = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = copy;
            if (copy == array[i])
            {
                check = true;
            }
        }
        return check;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

        String str = Arrays.toString(array).toLowerCase();



        //boolean dash = true;
        //boolean makeSure = false;
        for (String letter : alphabet) {

            if(containsLetter(str, letter) )
            {
                return false;
            }

        }

        return true;
    }
    private static boolean containsLetter(String str, String letter) {
        return !str.contains(letter);
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int countVar = 0;

        for(int i = 0; i<10; i++)
        {
            if(value == array[i])
            {
                countVar++;
            }
        }
        return countVar;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> result = new LinkedList();

        for (String s : array) {
            if(!valueToRemove.equals(s))
            {
                result.add(s);
            }

        }
        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> str = new ArrayList<String>(0);
        String prev = array[0];

        int k = 0;
        for(int i = 0; i <array.length-1; i++)
        {
            if(!(array[i].equals(array[i+1])))
            {
                str.add(array[i]);

            }
        }
        str.add(array[array.length-1]);
        //array = str.toArray(new String[str.size()]);

        return str.toArray(new String[str.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> str = new ArrayList<String>(0);
        StringBuilder pack = new StringBuilder();
        pack.append(array[0]);

        for(int i = 1; i < array.length; i++)
        {
            if(array[i].equals(array[i -1]) )
            {

                pack.append(array[i]);
            }
            else
            {
                str.add(pack.toString());
                pack = new StringBuilder();

            }
        }


        return str.toArray(new String[str.size()]);
    }

}



