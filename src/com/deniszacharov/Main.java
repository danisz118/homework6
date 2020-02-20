package com.deniszacharov;

/*
Написать метод который принимает 2 строки - a, b. 
Метод должне вернуть количество символов которые у них различаются. 
Если строки разной длины то вернуть -1.
*/
public class Main {
    public static void main(String[] args) {

        String a = "aaa";
        String b = "fga";
        DifferentString result = new DifferentString();
        System.out.println(result.differentChar(a,b));

    }


}
