package com.gayi.Abstractclass;

public class Main {
    public static void main(String[] args) {


        Son son = new Son(34);
        son.career();
        Daughter daughter = new Daughter(2);
        daughter.career();
        Parent mom = new Parent(66) {

        @Override
        void partner () {

        }
        @Override
        void career () {

        }
    };

    }
}
