package discretestructureschapter1problem2;


/**
 * Author: Tejas Shah Date: 8/31/2015 Due: 9/13/2015 Chapter 1 Computer Projects
 * Problem 2 Problem: Given two bit strings of length n, find the bitwise AND,
 * bitwise OR, and bitwise XOR of these strings.
 * This is the AND portion of this problem.
 */
import java.io.*;

public class And
{

    int x = 0;
    int y = 0;
    int i = 0;
    char first;
    char second;
    String error = "error";
    String and_result = "";

    String and(String a, String b) 
    {
        int max = 0;

        if (a.length() >= b.length()) 
        {
            max = a.length();
        } 
        else 
        {
            max = b.length();
        }

        for (i = 0; i < max; i++) 
        {
            if (i < a.length()) 
            {
                first = a.charAt(i);
            }
            if (i < b.length()) 
            {
                second = b.charAt(i);
            }
            if (first == '1' && second == '1') 
            {

                and_result = and_result.concat("1");

            } 
            else if (first > '1' || second > '1')
            {
                return error;
            }
            else if (first < '0' || second < '0')
            {
                return error;
            }
            else 
            {
                and_result = and_result.concat("0");
            }
            
            

        }

        return and_result;
        
        

    }

    public static void main(String[] args)
    {
        String a = "";
        String b = "";
        And obj = new And();
        System.out.println("(And)please enter first string in byte format:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            a = br.readLine();
        } catch (IOException io) 
        {
            System.out.println("An Exception Has Occured");
            System.exit(1);
        }
        System.out.println("(And)please enter second string in byte format:");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            b = br2.readLine();
        } catch (IOException io)
        {
            System.out.println("An Exception Has Occured");
            System.exit(1);
        }

        String result = obj.and(a, b);
        System.out.print("result=" + result + "\n");
        //This prints the AND Portion

    }

}

