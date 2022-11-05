package ro.uvt.p3;

public class Banana extends Fruit implements Peelable{
    boolean hasShell;
    public Banana(int weight, int sugarContent, int waterContent,boolean hasShell) {
        super(weight, sugarContent, waterContent,Color.Yellow);
        this.hasShell=hasShell;
    }

    @Override
    public boolean hasPeel() {
        return true;
    }

    @Override
    public void peelOff() {
        this.hasShell=false;
    }

}
