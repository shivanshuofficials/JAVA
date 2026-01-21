public class Getset {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    // Getter for color
  public  String getColor() {
        return this.color;
    }

    // Getter for tip
    int getTip() {
        return this.tip;
    }

    // Setter for color
    void setColor(String newColor) {
        this.color = newColor;
    }

    // Setter for tip
    void setTip(int newTip) {
        this.tip = newTip;
    }
}
