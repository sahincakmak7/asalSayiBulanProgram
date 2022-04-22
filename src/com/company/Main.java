package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int i, j;

        for (i = 3; i < 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;

            }if(count==0)
                System.out.println(i);
            count=0;
        }
    }
}


