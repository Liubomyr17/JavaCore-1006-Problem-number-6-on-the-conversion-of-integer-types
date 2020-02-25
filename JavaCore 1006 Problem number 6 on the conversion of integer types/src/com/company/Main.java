package com.company;

/*

1006 Problem number 6 on the conversion of integer types
Remove unnecessary typecast operators to get the answer: result: 1000.0
short b = (short) 45;
char c = (short) ‘c’;
short s = (short) 1005.22;
int i = (short) 150000;
float f = (short) 4.10f;
double d = (short) 1.256d;
double result = (f * b) + (i / c) - (d * s) + 562.78d;
Requirements:
1. The program should display the text on the screen.
2. You cannot change the display command.
3. The main () method must contain a variable b of type short.
4. The main () method must contain a char variable of type c.
5. The main () method must contain an s variable of type short.
6. The main () method must contain an i variable of type int.
7. The main () method must contain a variable f of type float.
8. The main () method must contain a d variable of type double.
9. The main () method must contain a result variable of type double.
10. The initial value of the variables during initialization cannot be changed. You can add only cast operators.
11. The program should display the text "result: 1000.0".

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        short b = (short) 45;
        char c = (short) 'c';
        short s = (short) 1005.22;
        int i = (int) 150000;
        float f = (float) 4.10f;
        double d = (double) 1.256d;
        double result = (f * b) + (i / c) - (d * s) + 562.78d;
        System.out.println("result: " + result);
    }
}















