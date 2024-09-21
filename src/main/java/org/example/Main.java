package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int num = 198765;
        out.println("Сумма цифр чила " + num + " = "+ sum(num));
        out.println("Сумма чисел 8 и 15 = " + sum(8, 15));
        out.println("Факториал числа " + 5 + " = " + fact(5));
        out.println("Вывод строк через '_' " + myOverload("Hello"));
        out.println("Вывод массива с возведенными в квадрат значениями" + Arrays.toString( myOverload(new int[]{1,4,9})));
    }
    //Вывод суммы цифр числа
    public static int sum(int i){
        int mySum = 0;
        String iStr = Integer.toString(i);
        String[] iArr = iStr.split("");
        for(String s: iArr) mySum += Integer.parseInt(s);
        return mySum;
    }
    //Вывод суммы двух чисел
    public static int sum(int i, int n){
        return i + n;
    }

    //Вычисление фактор факториала заданного числа при помощи рекурсивной функции
    public static int fact(int n){
        if (n == 0) return 1;
        return fact(n -1) * n;
    }
    //Вывод строки 3 раза четез строку "_"
    public static String myOverload(String s){
        StringBuilder stringBuilder = new StringBuilder();
        String t = "";
        for (int i = 0; i <= 2 ; i++) {
            if (i == 2) t += s;
            else {
                t = stringBuilder.append(s).append("_").toString();
            }
        }
        return t;
    }
    @Contract(pure = true)
    public static int @NotNull [] myOverload(int[] v){
        int[] t = new int[v.length];
        int n = 0;
        for(int i: v) {
            t[n]= (int) Math.pow(i, 2);
            n++;
        }
        return t;
    }

}