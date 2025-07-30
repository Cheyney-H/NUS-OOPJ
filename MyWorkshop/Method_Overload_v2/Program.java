public class Program {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("Adding two integers...");
        System.out.printf("After adding: %d\n\n", adder.add(1,2));

        System.out.println("Concatenating two strings...");
        System.out.printf("After concatenating: %s\n\n", adder.add("Hello", "World!"));

        System.out.println("Mixing two colors...");
        Color red = new Color ("red");
        Color blue = new Color ("blue");
        Color mix = adder.add(red, blue);
        System.out.printf("After mixing: %s\n", (mix != null) ? mix.getColor() : "unknown");
    }
}
