package ro.uvt.p3.io;

import ro.uvt.p3.Apple;
import ro.uvt.p3.Banana;
import ro.uvt.p3.Fruit;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputDevice {

    public String nextLine(){
        return "The quick brown fox jumps over the lazy dog.";
    }
    public Fruit[] readFruit(){
        Fruit[] result=new Fruit[3];
        result[0]=new Apple(3,10,50, Fruit.Color.Green,12);
        result[1]=new Banana(1,10,50,true);
        result[2]=new Apple(4,8,55, Fruit.Color.Yellow,6);
        return result;
    }
    public List<Fruit> readFruitL(){
        List<Fruit> list=new ArrayList<>();
        list.add(new Apple(4,10,50, Fruit.Color.Green,12));
        list.add(new Banana(1,10,50,true));
        list.add(new Apple(4,8,55, Fruit.Color.Yellow,6));
        return list;
    }
    public int computeWeight(Fruit[] fruits){
        int totalWeight=0;
        for(int i=0;i< fruits.length;i++){
            totalWeight=totalWeight+fruits[i].getWeight();
        }
        return totalWeight;
    }
    public int computeSugarContent(Fruit[] fruits){
        int totalSugar=0;
        for(int i=0;i< fruits.length;i++){
            totalSugar=totalSugar+fruits[i].getSugarContent();
        }
        return totalSugar;
    }
    public void prepareFruit(Fruit[] fruits){
        for(int i=0;i< fruits.length;i++){
            if(fruits[i] instanceof Apple){
               // Apple apple=new Apple()HOW DO I ACCESS PEELABLE AND SEEDABLE?
            }
        }
    }
    public Map<String,Integer> countFruit(List<Fruit> list){
        HashMap<String, Integer> map=new HashMap<String,Integer>();
        Integer a=0,b=0;
        for(Fruit fruit:list){
            if(fruit instanceof Apple){
                a++;
            }
            if(fruit instanceof Banana){
                b++;
            }
        }
        map.put("Apple",a);
        map.put("Banana",b);//AS FII VRUT SA FAC CU UN MAP FORMAT DIN FRUCTE NU STRING
        return map;
    }

}
