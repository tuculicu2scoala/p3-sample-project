package ro.uvt.p3.io;

import ro.uvt.p3.Apple;
import ro.uvt.p3.Banana;
import ro.uvt.p3.Fruit;

import java.awt.*;

public class InputDevice {

    public String nextLine(){
        return "The quick brown fox jumps over the lazy dog.";
    }
    public Fruit[] readFruit(){
        Fruit[] result=new Fruit[3];
        result[0]=new Apple(3,10,50, Fruit.Color.Green);
        result[1]=new Banana(1,10,50);
        result[2]=new Apple(4,8,55, Fruit.Color.Yellow);
        return result;
    }
    public int computeWeight(Fruit[] fruits){
        int totalWeight=0;
        for(int i=0;i<= fruits.length;i++){
            totalWeight=totalWeight+fruits[i].getWeight();
        }
        return totalWeight;
    }
    public int computeSugarContent(Fruit[] fruits){
        int totalSugar=0;
        for(int i=0;i<= fruits.length;i++){
            totalSugar=totalSugar+fruits[i].getWeight();
        }
        return totalSugar;
    }
}
