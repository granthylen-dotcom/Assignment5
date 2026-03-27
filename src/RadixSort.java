import java.util.ArrayList;

public class RadixSort {
    public String [] radixSort(String [] a){
        int maxLength = 0;
        for(String s : a){
           if(s.length() > maxLength){
               maxLength = s.length();
           }
        }
        ArrayList<String>[] buckets = new ArrayList[26];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        for(int i = maxLength - 1; i >= 0; i--){
            for(int j = 0; j < a.length; j++){
                int bucketDex = 0;
                if(i < a[j].length()){
                    bucketDex = a[j].charAt(i) + 1;
                }
                buckets[bucketDex].add(a[j]);
            }
            int arrDex = 0;
            for(int g = 0; g < buckets.length; g++){
                for(String s: buckets[g]){
                    a[arrDex] = s;
                }
                buckets[i].clear();
            }
        }
        return a;
    }
}
public static void main(String[] args){
    String [] test = {"bad","apple","stupid", "football"};
    for(String s: test){
        System.out.println(s);
    }
}
