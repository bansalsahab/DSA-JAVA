import java.util.*;

public class bucketSort {
    public static void main(String args[]){
        float arr[]  = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f};
            ArrayList<Float> res = bucketSort(arr);
            System.out.println(res);
    }
    public static float findMax(float nums[]){
        float maximum  = Float.MIN_VALUE;
        for(int i=0 ; i<nums.length;i++){
            maximum = Math.max(maximum,nums[i]);
        }
        return maximum;
    }
    public static ArrayList<Float> bucketSort(float arr[]){
        if(arr.length==0){
            return new ArrayList<>();
        }
        //find the bucket sizze
        float maxElement = findMax(arr);
        int maxIndex=(int) (maxElement*arr.length);
        int bucketSize = maxIndex+1;
        //initialization of bucket list
        ArrayList<Float> buckets[] =new ArrayList[bucketSize];

        for(int i=0 ;i <bucketSize;i++){
            buckets[i] =new ArrayList<>();
        }

        //insert elements into the bucket
        for(int i=0;i<arr.length; i++){
            int index= (int )(arr[i]*arr.length);
            buckets[index].add(arr[i]);
        }
        //sort the buxkets
        for(int i=0; i<bucketSize;i++){
            Collections.sort(buckets[i]);
        }
        //store the element into result list
        ArrayList<Float> res = new ArrayList<>();
        for(int i=0; i<bucketSize;i++){
            for(Float element:buckets[i]){
                res.add( element);
            }
        }
        return res;
    }
}
