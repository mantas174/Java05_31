package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int [] masyvas = {4,7,8,5,1,2,3,6,9};

        rikiavimasMazejimo(masyvas);
        for(int i = 0; i < masyvas.length; i++){
            System.out.print(masyvas[i] +" ");
        }
    }
    public static void rikiavimasMazejimo (int [] masyvas){
        int tmp;
        for (int i = 0; i < masyvas.length - 1; i++){
            for (int j = i + 1; j < masyvas.length; j++){
                if (masyvas[i] < masyvas[j]){
                    tmp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = tmp;
                }
            }
        }
    }
}


