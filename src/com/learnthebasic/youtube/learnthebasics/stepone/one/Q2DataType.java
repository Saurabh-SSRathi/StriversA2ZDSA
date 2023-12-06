package com.learnthebasic.youtube.learnthebasics.stepone.one;

//Print the the size of data type

import java.util.Scanner;

public class Q2DataType {

    public static int dataTypes(String type) {

        return switch (type) {
            case "Long", "Double" -> Long.BYTES;
            case "Float", "Integer" -> Float.BYTES;
            case "Character" -> Character.BYTES;
            default -> 0;
        };
    }

/*
            if (type.equals("Long") ||  type.equals("Double") ) {
        return Long.BYTES;
    } else if(type.equals("Float") || type.equals("Integer")) {
        return Float.BYTES;
    }  else if(type.equals("Character")) {
        return Character.BYTES;
    }
        return 0;
}
*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = dataTypes(str);
        System.out.println(a);
    }
}