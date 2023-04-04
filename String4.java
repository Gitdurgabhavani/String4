1.What is imutable String in Java Explain with an example.
Ans.In Java, String is an immutable class, which means that once a String object is created, its value cannot be changed
  ex:public class ImmutableStringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" world!");
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}


2. WAP to reverse aString
Input:“PWSKILLS”
Output:“SLLIKSPW”
Ans.public class ReverseString {
    public static void main(String[] args) {
        String str = "PWSKILLS";
        String reversedStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
output:SLLIKSPW

3. WAP to reverse a sentence while preserving the position
Input:ThinkTwice
Output:“kniht eciwt”
Ans.import java.util.*;
    public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) 
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}

Output:Enter a sentence:
ThinkTwice
Reversed sentence: ThinkTwice


4.WAP to sort a String Alphabetically
Ans.import java.util.Arrays;

       public class SortStringAlphabetically {
       public static void main(String[] args) {
        String str = "Hello world!";

        char[] chars = str.toCharArray();

        Arrays.sort(chars);
        
        String sortedStr = new String(chars);
        
        System.out.println("Original string: " + str);
        System.out.println("Sorted string: " + sortedStr);
    }
}
