package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

import java.sql.SQLOutput;
import java.util.List;

public class Application {
    private InputDevice id;
    private OutputDevice od;

    public Application(InputDevice id, OutputDevice od) {
        this.id = id;
        this.od = od;
    }
  //version3.4
    public void run(){
        List<Fruit> fruits= id.readFruitL();//HOW CAN I OVERLOAD THIS
        System.out.println(fruits.get(2).compareTo(fruits.get(0)));

    }
}
