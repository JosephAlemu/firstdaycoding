


import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class firstdaycoding {


    public static void print( ArrayList<String>  stringlist)
    
    {
        // List<String> stringlist = new ArrayList<String>();


        int i = 0, j = 0;
        String str = "";

            
      

            for (i = 0; i < stringlist.size(); i++)
            {
                str = stringlist.get(i);
                j = i + 1;

                while (j < stringlist.size())
                {

                    if (str == stringlist.get(j))
                    {
                      
                        System.out.println(MessageFormat.format(" Found matching string at position {0}  and {1} is  \"{2}\" ",  i, j,stringlist.get(j)));

                    }


                    //increment iteration
                    j++;
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
            System.out.println( "The string is palindromic");
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
                sb=  " Fizz" ;

            }
            if (i % 5 == 0) {
                sb = sb +" Buzz";

            }

            System.out.println(i +""+ sb.toString());
            sb = "";
        }
    }

    public static void main(String [] args)

    {

      //  List<String> stringlist = new ArrayList<String>();
      
      ArrayList<String>  stringlist=new ArrayList<String>();

        stringlist.add("a");
        stringlist.add("b");
        stringlist.add("c");
        stringlist.add("f");
        stringlist.add("d");
        stringlist.add("e");
        stringlist.add("f");
        stringlist.add("h");
         stringlist.add("c");
        String str = "you mam uoy";

        System.out.println("Question 1 Fizz Buzz ");
      
        fizzbuzz ( );
    
      /// calling a method to check a string palindromic substring  or not 
        System.out.println("\n== Question 2 palindromic substring ==\n ");
        palindrome(str );
      
      
      /// calling a method matching string list methode 

        System.out.println("\n == Question 1 Fizz Buzz ==\n ");
        print(stringlist );


      // pausing the program  
      
        Scanner s = new Scanner(System.in);
        System.out.println();

    }


}
