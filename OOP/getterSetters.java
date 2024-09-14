package OOP;

public class getterSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
    static class Pen{
        private String color;
        private int tip;
        String getColor() {
            return color;
        }
        int getTip() {
            return tip;
        }
        void setColor(String newColor) {
            color = newColor;
        }
        void setTip(int newTip){
            tip = newTip;
        }

    }


}
