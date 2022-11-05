package ro.uvt.p3;

public abstract class Fruit implements Comparable<Fruit>{
    int weight;
    int sugarContent;
    int waterContent;
    Color color;


    public Fruit(int weight, int sugarContent, int waterContent, Color color) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;
        this.color = color;
    }
    @Override
    public int compareTo(Fruit o) {
        if(this.getWeight()>o.getWeight())
            return 1;
        else if (this.getWeight()<o.getWeight()) {
            return -1;
        } else if (this.getWeight()==o.getWeight()) {
           if (this.getSugarContent()>o.getSugarContent()) {
                return 1;
            } else if (this.getSugarContent()<o.getSugarContent()) {
               return -1;
           } else if (this.getSugarContent()==o.getSugarContent()) {
               return 0;
           }
        }
        return 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public int getWaterContent() {
        return waterContent;
    }

    public void setWaterContent(int waterContent) {
        this.waterContent = waterContent;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public enum Color {
        Red,
        Yellow,
        Green,
        Purple
    }
}
