public class Adder {
    public long add(int a, int b){
        return a + b;
    }

    public String add(String a, String b){
        return a.concat(b);
    }

    public Color add(Color color1, Color color2){
        String color1s = color1.getColor().toLowerCase();
        String color2s = color2.getColor().toLowerCase();
        if (sameColors(color1s, color2s, "red", "blue")){
            return new Color("magenta");
        } else if (sameColors(color1s, color2s, "red", "green")){
            return new Color("yellow");
        } else if (sameColors(color1s, color2s, "blue", "green")){
            return new Color("cyan");
        } else{
            return null;
        }
    }

    private boolean sameColors(String color1, String color2, String colorA, String colorB){
        return (color1.equals(colorA) && color2.equals(colorB)) || (color1.equals(colorB) && color2.equals(colorA));
    }
}