import java.util.ArrayList;

public class IntList {
    private ArrayList<Integer> list = new ArrayList<>();

    public IntList(int[]arr){
        for (int num : arr){
            list.add(num);
        }
    }

    public void print(){
        System.out.println(list);
    }

    public float getMean(){
        if (list.isEmpty()){
            return 0.0f;
        }
        int sum = 0;
        for (int num : list){
            sum += num;
        }
        return (float)sum/list.size();
    }

    public int removeFront(int n){
        int removed = Math.min(n, list.size());
        for (int i = 0; i < removed; i++){
            list.remove(0);
        }
        return removed;
    }

    public int removeBack(int n){
        int removed = Math.min(n, list.size());
        for (int i = 0; i < removed; i++){
            list.remove(list.size() - 1);
        }
        return removed;
    }










}
