package edu.cnm.deepdive;

public class ReturningDataFromMethods {

  public static void main(String[] args) {
    int number = 2;
    String word = "xyz";
    number(number);//means that we are still using the assigned 2 to number on line 6
    number = number(number);// if we would reassign the method number() with paramater number to
    //number of line 6, then 3 would be printed.
    word = word(word);
    System.out.println(number + word);//prints 2xyza
  }

  public static int number(int number) {
    number++;
    return number;
  }

  public static String word(String word) {
    word += "a";
    return word;
  }

}
