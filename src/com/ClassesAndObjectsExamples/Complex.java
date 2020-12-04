package com.ClassesAndObjectsExamples;

public class Complex {
    public String getSumValue(String number1, String number2) {
        String[] str = number1.split(" ");
        String[] str1 = number2.split(" ");
        int realPartTotal = Integer.parseInt(str[0]) + Integer.parseInt(str1[0]);
        int imagPartTotal = Integer.parseInt(str[1].substring(1)) + Integer.parseInt(str1[1].substring(1));
        if (imagPartTotal < 0)
            return realPartTotal + " -i" + (-imagPartTotal);
        else
            return realPartTotal + " +i" + (imagPartTotal);    }

    public String getDifferenceValue(String number1, String number2) {
        String[] str = number1.split(" ");
        String[] str1 = number2.split(" ");
        int realPartTotal = Integer.parseInt(str[0]) - Integer.parseInt(str1[0]);
        int imagPartTotal = Integer.parseInt(str[1].substring(1)) - Integer.parseInt(str1[1].substring(1));
        if (imagPartTotal < 0)
            return realPartTotal + " -i" + (-imagPartTotal);
        else
            return realPartTotal + " +i" + (imagPartTotal);
    }

    public String getProductValue(String number1, String number2) {
        String[] str = number1.split(" ");
        String[] str1 = number2.split(" ");
        int realPartTotal = (Integer.parseInt(str[0]) * Integer.parseInt(str1[0])) - (Integer.parseInt(str[1].substring(1)) * Integer.parseInt(str1[1].substring(1)))  ;
        int imagPartTotal = (Integer.parseInt(str[0])*Integer.parseInt(str1[1].substring(1))) + (Integer.parseInt(str1[0])*Integer.parseInt(str[1].substring(1)));
        if (imagPartTotal < 0)
            return realPartTotal + " -i" + (-imagPartTotal);
        else
            return realPartTotal + " +i" + (imagPartTotal);
    }

}
