/**
 * JavaCore. Homework 2. MainClass
 *
 * @author Denis Kononovich
 * @version 29.11.21
 */

package ru.geekbrains.qa.java2.lesson2.homeWork;
import ru.geekbrains.qa.java2.lesson2.homeWork.Exception_lesson.*;

class MainClass {
    public static void main(String[] args) {

        String[][] arr1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arr2 = {{"1", "2", "3", "4"}, {"a", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arr3 = new String[5][5];
        String[][] arr4 = new String[4][4];
        String[][] arr5 = new String[4][5];

        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.setStrings(arr1);
        arrayChecker.checkLengthStrings(arr1);
        arrayChecker.summ();
        arrayChecker.setStrings(arr2);
        arrayChecker.checkLengthStrings(arr2);
        arrayChecker.summ();
        arrayChecker.setStrings(arr3);
        arrayChecker.checkLengthStrings(arr3);
        arrayChecker.summ();
        arrayChecker.setStrings(arr4);
        arrayChecker.checkLengthStrings(arr4);
        arrayChecker.summ();
        arrayChecker.setStrings(arr5);
        arrayChecker.checkLengthStrings(arr5);
        arrayChecker.summ();
    }
}