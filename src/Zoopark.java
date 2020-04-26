
import Animals.Animal;
import Animals.Rebbit;
import Animals.Tiger;
import Foods.Food;
import Foods.Pig;

import java.io.IOException;
import java.util.ArrayList;


public class Zoopark {
    public static void main(String[] args) throws IOException {
        Animal[] volier1 = new Animal[3];
       Pig pig = new Pig();
       Tiger tiger = new Tiger();
        Rebbit reb = new Rebbit();
       Zoopark zoo = new Zoopark();
       zoo.eating(reb, pig);
       zoo.addvolier(reb);
       System.out.println(volier1);



    }

    public void eating (Animal animal, Food food){
        if((animal.equals("Cornivorous")&&food.equals("Meat"))||(animal.equals("Herbivore")&&food.equals("Grass"))){
            System.out.println("Мм вкусно");
        } else{
            System.out.println("я тебя сейчас сожру");
        }
    }

  public void addvolier(Animal animal){
      Animal[] volier1 = new Animal[3];
   for(int i =0; i<3;i++){
       volier1[i] = animal;
       //System.out.println(volier1[i]);
   }
   for(int i=0; i<volier1.length;i++){
       System.out.println(volier1[i]);
   }
 }

}
