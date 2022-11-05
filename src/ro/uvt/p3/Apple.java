package ro.uvt.p3;

public class Apple extends Fruit{
    int seedCount;
    public Apple(int weight, int sugarContent, int waterContent, Color color,int seedCount) {
        super(weight, sugarContent, waterContent, color);
        this.seedCount=seedCount;
    }
    boolean hasSeeds(){
        if(this.seedCount>0)
            return true;
        else
            return false;
    }
    void removeSeeds(){
        while(this.seedCount>0) {
            System.out.println("One seed removed!");
            this.seedCount=this.seedCount-1;
        }
    }
}
