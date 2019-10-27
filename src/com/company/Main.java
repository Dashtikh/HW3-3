package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exep {
        Scanner scanner =new Scanner(System.in);
        System.out.println("name khod va sepas moaddel khod ra vared konid !");
        String name1=scanner.nextLine();
        int moaddel=scanner.nextInt();
        NameExp nameExp = new NameExp();
        Moaddel moaddel1 = new Moaddel();
        nameExp.name(name1);
        moaddel1.age(moaddel);



    }
}
