package com.mycompany.primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;

public class PrimeiroPrograma {

    public static void main(String[] args) {
       Locale lingua= Locale.getDefault();
       System.out.print("a linguagem de seu computador esta em: ");
       System.out.println(lingua.getDisplayLanguage());
       Toolkit tool=Toolkit.getDefaultToolkit();
       Dimension res = tool.getScreenSize();
       System.out.println("a resolução de seu computador esta em: "+res.width+"X"+res.height);
        System.out.println(lingua.getCountry());
        System.out.println(lingua.getDisplayCountry());
        System.out.println(res.getSize());
    }
}
