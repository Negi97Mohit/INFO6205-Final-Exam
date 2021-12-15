package com.company;

public class Pell {

    public long get(int n) {

        if (n<=2){
            return n;

        }
        long a = 1;
        long b = 2;
        long result = 0;
        for (int i = 3; i<=n;i++){
            result = 2 * b+a;
            a=b;
            b=result;
        }
        return result;
    }


    public Pell(){

    }
}
