//вариант №5
package com.company;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Football> fytbol = new ArrayList<>();
        fytbol.add(new first_command());

        fytbol.add(new second_command());

        fytbol.add(new third_command());

        fytbol.add(new fourth_command());

        fytbol.add(new fifth_command());

        for (Football football : fytbol) {

            football.voice();



        }

    }

}


abstract class Football {
    int x;
public Football(){};
    abstract void voice();

}


class first_command extends Football {

    void voice() {

        System.out.println("первая команда - 5 голлов");


    }

}



class second_command extends Football {

    void voice() {

        System.out.println("вторая команда - 6 голлов");


    }

}


class third_command extends Football {

    void voice() {

        System.out.println("третья команда - 7 голлов");


    }

}


interface Printable {
 int x;
    void voice();

}


class fourth_command extends Football implements Printable {

    public void voice() {
        System.out.println("четвертая команда - 8 голлов");

    }

}

class fifth_command extends Football implements Printable {

    public void voice() {
        System.out.println("пятая команда - 9 голлов");

    }

}
