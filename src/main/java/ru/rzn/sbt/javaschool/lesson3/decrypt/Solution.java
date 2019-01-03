package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     *
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     *
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     *
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted){
        if (encrypted == null) {
            return null;
        }
        char[] arr = encrypted.toCharArray();
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = convertSymbol(arr[i]);
        }
        System.out.println(arr);
        return String.valueOf(arr);
    }

    private static char convertSymbol(char symbol) {
        int item = (int) symbol;
        boolean upper;
        if (item >= 97 && item <= 122) {
            upper = false;
        } else if (item >= 65 && item <= 90) {
            upper = true;
        } else {
            return symbol;
        }
        item -= 9;
        if (upper) { // заглавная буква
            if (item < 65) {
                item = 90 - (65 - item) + 1;
            }
        } else { // строчная буква
            if (item < 97) {
                item = 122 - (97 - item) + 1;
            }
        }
        return (char) item;
    }
}
