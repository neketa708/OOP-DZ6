package org.example.view;

import org.example.model.BinaryCalcul;
import org.example.model.NumCalcul;

public class Main {
    public static void main(String[] args) {
        NumCalcul numCalcul = new NumCalcul("1","2");
        System.out.println(numCalcul.sum());
        System.out.println(numCalcul.sub());
        System.out.println(numCalcul.multi());
        System.out.println(numCalcul.divide());

        BinaryCalcul binaryCalcul = new BinaryCalcul("011","111");
        System.out.println(binaryCalcul.sum());
        System.out.println(binaryCalcul.sub());
        System.out.println(binaryCalcul.multi());
        System.out.println(binaryCalcul.divide());
    }
}
