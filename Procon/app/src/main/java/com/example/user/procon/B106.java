package com.example.user.procon;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by user on 2018/08/23.
 */

public class B106 {
    public static void main(String[] args) {
        new B106().run();

    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(IntStream.rangeClosed(1,n).filter(i -> i%2 != 0).filter(i ->
            IntStream.rangeClosed(1,i).filter(i1 -> i % i1 == 0).count() == 8
        ).count());
    }

}
