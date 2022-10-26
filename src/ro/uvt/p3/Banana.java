package ro.uvt.p3;

public class Banana extends Fruit implements Peelable{
    public Banana(int weight, int sugarContent, int waterContent) {
        super(weight, sugarContent, waterContent,Color.Yellow);
    }

    @Override
    public boolean hasPeel() {
        return true;
    }

    @Override
    public void peelOff() {
        this.weight=this.weight-1;//int of seeds
    }
}
