package day8_string_manipulation.lesson2;

public class StringPoolUnderstanding {
    public static void main(String[] args) {
        String word1 = "java"; // String pool
        String word2 = "java"; // String pool, re-use
        String word3 = new String("java"); // outside String pool but still in heap
        System.out.println(word1 == word2); // true because both are pointed to same object

        System.out.println(word1 == word3); // false because they are not pointing the same object. word1 pointing to the object inside string pool word3 pointing the object in the heap but outsde the string pool

        String word4 = new String("java");
        System.out.println(word3 == word4); // false because they are pointing to different objects, although they are both in the heap and outside string pool

        String word5 = word4;
        System.out.println(word4 == word5); // true because they are pointing the same object and they have same value

        System.out.println(word1 == word4); // false because checks what are they pointing
        System.out.println(word1.equals(word4)); //true because checks character by character is equals or not

        String str = "macbook"; // string pool in heap
        String str2 = "macbook"; // re-use macbook in string pool
        String str3 = str; // re-using macbook in string pool




    }
}
