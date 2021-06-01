//вариант №5
package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


    class Footbal_1 implements Serializable {

    String defaultTime;


    }

    class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner sc=new Scanner(System.in, "cp1251");
        File f=new File("1.txt");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Footbal_1 footbal_1 = new Footbal_1();
        System.out.println("Vvedite informaciu: ");
        System.out.print("defaultTime=>");
        footbal_1.defaultTime=sc.nextLine();
        oos.writeObject(footbal_1);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream oin = new ObjectInputStream(fis);
        footbal_1 = (Footbal_1) oin.readObject();
        System.out.println(" defaultTime"+ footbal_1.defaultTime);
        oos.close();


    }

    }