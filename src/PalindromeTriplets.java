import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PalindromeTriplets {
    public static List<List<Integer>> palinDrome(String [] words){
        int l = words.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                if(i != j){
                    for(int k = 0; k < l; k++){
                        if(k != j && k != i){
                            String combine = words[i] + words[j] + words[k];
                            boolean pal = true;
                            int left = 0;
                            int right = combine.length() - 1;
                            while(left < right){
                                if(combine.charAt(left) != combine.charAt(right)){
                                    pal = false;
                                    break;
                                }
                                left++;
                                right--;
                            }
                            if(pal){
                                result.add(Arrays.asList(i,j,k));
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        String [] test = {"test", "bad", "apple", "race", "car"};
        System.out.println(palinDrome(test));
    }
}
