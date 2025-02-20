import java.util.*;

public class ArrayLlist {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    // public static boolean pairSum(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;

    // }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {// breaking point
                bp = i;
                break;
            }
        }
        int lp = bp + 1;// smallest
        int rp = bp;// largest
        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // case 3
                rp = (n + rp - 1) % n;

            }
        }
        return false;
    }

    public static void main(String args[]) {

        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for (int i = 1; i <= 5; i++) {
        // list1.add(i * 1);// 1 2 3 4 5
        // list2.add(i * 2);// 2 4 6 8 10
        // list3.add(i * 3);// 3 6 9 12 15
        // }
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // list2.remove(2);// we can remove
        // System.out.println(mainList);

        // // nested loops
        // for (int i = 0; i < mainList.size(); i++) {
        // ArrayList<Integer> currList = mainList.get(i);
        // for (int j = 0; j < currList.size(); j++) {
        // System.out.println(currList.get(j) + " ");
        // }
        // System.out.println();
        // }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(24);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 83;
        System.out.println(pairSum2(list, target));

    }

}
