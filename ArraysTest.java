import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {
    public static ArrayList<String> arrayList = new ArrayList<String>();
    public static int[][][] array = new int[4][2][9];

    public static void main(String args[]) {

        array[3][1][7] = 2;

        System.out.println(Arrays.deepToString(array));

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("!");

        System.out.println(arrayList.get(1));

        System.out.println(arrayList);
    }
    
}
//[],[]
// [0,0]
// [0,0,0]
//  [
//    [[0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0]]
//    [[0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0]]
//    [[0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0]]
//    [[0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,2,0]]
// ]
