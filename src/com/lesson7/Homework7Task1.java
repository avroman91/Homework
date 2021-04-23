package com.lesson7;

import java.util.Locale;

/*1) Продемонстрировать работу перечисленных методов string:

charAt,     contains, endsWith, startsWith, equals,    equalsIgnoreCase,
format,    indexOf,   isEmpty, length, replace,  substring,
   toLowerCase,   toUpperCase, trim
*valueOf
*split
*/

public class Homework7Task1 {
    public static void main(String[] args) {
        String string = "This string was created to show all functions of method string";
        string.charAt(0); // result: T  ; gave in result symbol located at index 0.
        string.contains("method"); //result : true  ; check that string contain substring "method".
        string.endsWith("g"); //result: true  ; check for the last symbol in string.
        string.startsWith("T"); //result: true  ; check for the first symbol in string.
        string.equals("This string was created to show all functions of method string"); //result: true  ; check for equals.
        string.equalsIgnoreCase("this string was created to show all functions of method string"); //result: true  ; check for equals ignoring CASE.
        String test = String.format("This is similar to System.out.printf, like next : My name is %s , i'm %s years old", "Roman", 30);
        string.indexOf("created"); //result: 16 ; This result is becouse "created" in string starts from index 15;
        string.isEmpty();  //result: false ; this method check if string is empty or not . If yes - true; no - false.
        string.length(); //result: 62 ; returns total length of the string.
        String test2 = string.replace("created", "destroyed");
        /* result: This string was destroyed to show all functions of method string
        replace some substring of the string , but saves only in new String (like test2) or in old, but also need to make equality:
        String string = string.replace(......)*/
        string.substring(16, 24); /*result: created ; returns substring wich start at index 16 and end at index 24-1 (this "bug" created to make
        possible string.substring(15, string.length), because string.length = 62, but last index is 61;*/
        string.toLowerCase(Locale.ROOT); // make all string only at lower case;
        string.toUpperCase(Locale.ROOT); // make all string only at UPPER case;
        string.trim(); //cut all "space" at start and end ot the string;
        String test3 = String.valueOf(1335.5); // add to a string all other types of variable, like boolean, double etc.
        String[] arr = string.split("\\s+"); /*result: [This, string, was, created, to, show, all, functions, of, method, string]
        This method split the string to an array , splitting by "space" (\\s+).  */
    }
}