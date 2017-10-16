package com.codeup;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);



        boolean isBlank = StringUtils.isBlank("");
        System.out.println(isBlank);

        System.out.println("Enter something:");
        String alpha = scanner.nextLine();


        if (StringUtils.isNumeric(alpha)) {
            System.out.println(alpha + " is a number");
        } else {
            System.out.println(alpha + " is not a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(alpha));
        System.out.println("Reversed: " + StringUtils.reverse(alpha));


    }
}

