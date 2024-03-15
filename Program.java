

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Cat[] catList = {
            new Cat("Izol`da", 5),
            new Cat("Anatoliy", 15),
            new Cat("Vasiliy", 35),
            new Cat("Fyntik", 25),
            new Cat("Zhorik", 30),
            new Cat()};

            Plate plate = new Plate(100);

            plate.info();
            for (Cat cat : catList) {
                
                plate.setFood(cat.eat(plate.getFood()));
                if (cat.isSatiety()) {
                    System.out.println("Кот " + cat.getName() + " накормлен");
                }
                else {
                    System.out.println("Кот " + cat.getName() + " голодный");
                }
                plate.info();

            }
                       
        }
    
               
    }
    

