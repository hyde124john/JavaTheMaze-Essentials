import java.util.*;
class HashMapUtility1 {
    public static void main(String[] args) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int[] arr = new int[]{1,4,2,3,3,6,7,8};
        for(int i = 0; i < arr.length; i ++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0) + 1);
        }
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            System.out.println(it.getKey());
            System.out.println("-");
            System.out.println(it.getValue());
            System.out.println("-------------");
        }
    }
}
