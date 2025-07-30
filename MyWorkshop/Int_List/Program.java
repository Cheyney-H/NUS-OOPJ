import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, -2, 4, -1, 5, -10, 2, 1};
        IntList list = new IntList(arr);

        list.print();

        System.out.printf("Mean: %.2f\n", list.getMean());

        list.removeFront(2);

        list.print();

        list.removeBack(3);

        list.print();

        System.out.printf("Mean: %.2f\n", list.getMean());
    }
}

