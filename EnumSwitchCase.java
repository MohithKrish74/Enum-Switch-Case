package com.keyword;

import java.util.Scanner;

enum Directions {NORTH,SOUTH,EAST,WEST}
public class EnumSwitchCase
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Direction: ");
        Scanner in =new Scanner(System.in);
        String direction = in.next();
        switch (direction)
        {
            case "NORTH":
                System.out.println("The Direction you entered is NORTH");
                break;
            case "SOUTH":
                System.out.println("The Direction you entered is SOUTH.");
                break;
            case "EAST":
                System.out.println("The Direction you entered is EAST.");
                break;
            case "WEST":
                System.out.println("The Direction you entered is WEST.");
                break;
        }
    }
}
