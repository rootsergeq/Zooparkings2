import Animals.*;
import Foods.Chiken;
import Foods.Pig;
import Foods.Seno;
import Foods.Ukrop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Zoopark {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pig pig = new Pig();
        Chiken chiken = new Chiken();
        Ukrop ukrop = new Ukrop();
        Seno seno = new Seno();

        Lion lion = new Lion();
        Bear bear = new Bear();
        Tiger tiger = new Tiger();

        Lenivec lenivec = new Lenivec();
        Belka belka = new Belka();
        Rebbit rebbit = new Rebbit();
        rebbit.eating(chiken);
        bear.eating(pig);

    }

}


