package day5_boolean_operators_and_if_statements.lesson1;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        int myNumber = 100;
        System.out.println("My number: " + myNumber);
        myNumber++;
        System.out.println("My number: " + myNumber);
        ++myNumber;
        System.out.println("My number: " + myNumber);
        ++myNumber;++myNumber;++myNumber;
        System.out.println("My number: " + myNumber);
        ++myNumber;
        myNumber++;
        ++myNumber;
        System.out.println("My number: " + myNumber);

        int booksToRead = 5;
        System.out.println("Books to read: " + booksToRead);
        booksToRead--;
        System.out.println("Books to read: " + booksToRead);
        --booksToRead;
        --booksToRead;
        System.out.println("Books to read: " + booksToRead);
        --booksToRead;
        booksToRead--;
        System.out.println("Books to read: " + booksToRead);
        --booksToRead;
        System.out.println("Books to read: " + booksToRead);

        char letter = 'A'; // 65 in ASCII table
        System.out.println(letter);
        letter++; // 66 in ASCII table as you see adding one and printing what stands in ASCII table
        System.out.println(letter);
        ++letter; // 67 in ASCII table
        System.out.println(letter);
        --letter; //66 in ASCII table
        System.out.println(letter);

        char myChar = '!';
        System.out.println("My char: " + myChar);
        myChar++;
        System.out.println("My char: " + myChar);
        myChar += 10;
        System.out.println("My char: " + myChar);
    }
}
