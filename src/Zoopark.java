
import Animals.*;
import Foods.*;

import java.io.IOException;
import java.util.ArrayList;


public class Zoopark {
    public static void main(String[] args) throws IOException {
        Animal[] volier1 = new Animal[3];

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

       Zoopark zoo = new Zoopark();
       zoo.eating(rebbit, pig); //добавь животное и еду через запятую

       zoo.addvolier(rebbit);
       zoo.addvolier(tiger);




    }

    public void eating (Animal animal, Food food){
        if((animal.equals("Cornivorous")&&food.equals("Meat"))||(animal.equals("Herbivore")&&food.equals("Grass"))){
            System.out.println("Мм вкусно");
        } else{
            System.out.println("я тебя сейчас сожру");
        }
    }

  public void addvolier(Animal animal){
        System.out.println("Volier");
      Animal[] volier1 = new Animal[3];
   for(int i =0; i<3;i++){
       volier1[i] = animal;
       System.out.println(volier1[i]);
   }

        Animal[] volier2 = new Animal[3];
        for(int i = 0; i<3;i++){
            volier2[i] = animal;
   }
        //add.volier
 }

}
