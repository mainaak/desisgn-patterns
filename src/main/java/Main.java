import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return Arrays.asList(1);
        if(rowIndex == 1) return Arrays.asList(1,1);
        List<Integer> prevRow = getRow(rowIndex - 1);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        for(int i = 0; i < prevRow.size() - 1; i++) {
            currentRow.add(prevRow.get(i) + prevRow.get(i+1));
        }
        currentRow.add(1);
        return currentRow;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getRow(4));
    }
}
