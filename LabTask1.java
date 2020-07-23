/*
* Author :- Harshit K Agnihotri
* Date:- 22-07-2020
 */


package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Data types\t\t Size in Bits\t\tSize in Bytes\t\tRange");
        System.out.println("byte\t"+Byte.size+"\t"+Byte.size/8 + "\tfrom" + Byte.MIN_VALUE + "to" + Byte.MAX_VALUE);
        System.out.println("Char\t"+Character.size+"\t"+Character.size/8 + "\tfrom" + Character.MIN_VALUE + "to" + Character.MAX_VALUE);
        System.out.println("Short\t"+Short.size+"\t"+Short.size/8 + "\tfrom" + Short.MIN_VALUE + "to" + Short.MAX_VALUE);
        System.out.println("Integer\t"+Integer.size+"\t"+Integer.size/8 + "\tfrom" + Integer.MIN_VALUE + "to" + Integer.MAX_VALUE);
        System.out.println("Long\t"+Long.size+"\t"+Long.size/8 + "\tfrom" + Long.MIN_VALUE + "to" + Long.MAX_VALUE);
        System.out.println("Float\t"+Float.size+"\t"+Float.size/8 + "\tfrom" + Float.MIN_VALUE + "to" + Float.MAX_VALUE);
        System.out.println("Double\t"+Double.size+"\t"+Double.size/8 + "\tfrom" + Double.MIN_VALUE + "to" + Double.MAX_VALUE);
        System.out.println("Boolean\t\t\t"+"\t\t\t" + "\t\t\tfrom" + Boolean.false + "to" + Boolean.true);


    }
}
