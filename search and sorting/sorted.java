import java.util.ArrayList;
import java.util.TreeMap;

public class sorted {
    public static ArrayList<Integer> commonelements(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Insert elements from first array
        for (int ele : A) {
            map.put(ele, 1);
        }

        // Update elements if present in second array
        for (int ele : B) {
            if (map.containsKey(ele) && map.get(ele) == 1) {
                map.put(ele, 2);
            }
        }

        // Update elements if present in third array
        for (int ele : C) {
            if (map.containsKey(ele) && map.get(ele) == 2) {
                map.put(ele, 3);
            }
        }

        // Collect elements present in all three arrays
        ArrayList<Integer> commonelements = new ArrayList<>();
        for (int ele : map.keySet()) {
            if (map.get(ele) == 3) {
                commonelements.add(ele);
            }
        }

        return commonelements;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 8};
        int[] arr3 = {1, 3, 4, 5, 10};

        for (int num : arr1) A.add(num);
        for (int num : arr2) B.add(num);
        for (int num : arr3) C.add(num);

        ArrayList<Integer> result = commonelements(A, B, C);
        System.out.println("Common Elements: " + result);
    }
}
