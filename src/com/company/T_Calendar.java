package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class T_Calendar {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int selectedYear = scn.nextInt();
        System.out.println("Enter the Month : ");
        int selectMonth = scn.nextInt() - 1; //March = 3 - 1

        Calendar cal = new GregorianCalendar();
        int Cday = cal.get(Calendar.DATE);
        int cMonth = cal.get(Calendar.MONTH);
        int cYear = cal.get(Calendar.YEAR);

        GregorianCalendar gCal = new GregorianCalendar(selectedYear,selectMonth,1);
        int days = gCal.getActualMaximum(Calendar.DATE);
        int startInWeek = gCal.get(Calendar.DAY_OF_WEEK);

        gCal = new GregorianCalendar(selectedYear,selectMonth,days);
        int totalweeks = gCal.getActualMaximum(Calendar.WEEK_OF_MONTH);

        int count = 1; // Count the days
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Aug","Sep","Oct","Nov","Dec"};
        System.err.println(months[selectMonth]+"-"+selectedYear);
        System.out.println();
        System.out.println(" SU   MO   TH   WE   TH   FR   SA");
        for (int i = 1; i <= totalweeks; i++)
        {
            System.out.println(); // to next line
            for (int j =1; j <= 7; j++)
            {
                if (count < startInWeek || (count - startInWeek + 1) > 31)
                {
                    System.out.print(" __ ");
                    System.out.print(" ");

                }
                else
                {
                    if (Cday == (count - startInWeek + 1)
                        && cMonth == selectMonth
                        && cYear == selectedYear)
                    {
                        System.out.print("'"+getDay((count - startInWeek + 1))+"'");
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(" " + getDay((count - startInWeek + 1)) + " ");
                        System.out.print(" ");
                    }
                }
                count++;
            }
        }
    }
    private static int getDay(int i)
    {
        String sDate = Integer.toString(i);
        if (sDate.length() == 1)
        {
           sDate = "0"+sDate;
            return i;
        }
        return i;

    }


