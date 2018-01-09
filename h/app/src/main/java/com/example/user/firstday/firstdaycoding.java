package com.example.user.firstday;


import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class firstdaycoding {


    public static void print(List<String> stringlist) {
        // List<String> stringlist = new ArrayList<String>();


        int i = 0, j = 0;
        String str;

        if (stringlist != null && !stringlist.isEmpty()) {

            for (i = 0; i < stringlist.size(); i++) {
                str = stringlist.get(i);
                j = i + 1;

                while (j <= stringlist.size()) {

                    if (str == stringlist.get(j)) {
                        // System.out.println("string is " + stringlist.get(j));
                        System.out.println(MessageFormat.format("string is {0} at position {1} and {2} are equal", stringlist.get(j), i, j));

                    }


                    //increment iteration
                    j++;
                }

            }

        }


    }

    public static void palindrome( String str  )
    {
        int j = str.length()-1;
        int i = 0;
        boolean check = true;

        while (i < j)
        {

            if (str.indexOf(i) !=str.indexOf(j))
            {
                check = false;

                break;
            }
          i ++;
            j --;
        }
        if (check )

        {
            System.out.println( "The string is palindrome");
        }
        else
        {
            System.out.println( "The string is not palindrome");
        }
    }


    public static void fizzbuzz ( )
    {
        String  sb = "";

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                sb=  "Fizz" ;

            }
            if (i % 5 == 0) {
                sb = sb +"Buzz";

            }

            System.out.println(i + sb.toString());
            sb = "";
        }
    }

    public static void main(String [] args)

    {

        List<String> stringlist = new ArrayList<String>();

        stringlist.add("a");
        stringlist.add("b");
        stringlist.add("a");
        stringlist.add("b");

        String str = "you mam uoy";


        fizzbuzz ( );

        palindrome(str );

        print(stringlist );


        Scanner s = new Scanner(System.in);
        System.out.println();

    }


}
