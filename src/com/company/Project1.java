package com.company;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        boolean isFirst = false;
        byte classPosition = 1;

        double testResult = 50.5;
        boolean isGraduating = (isFirst) || testResult > 60;
        System.out.println(isGraduating);
        boolean isGraduating2 = (classPosition == 1) || testResult > 60;
        System.out.println(isGraduating2);


    }
}
