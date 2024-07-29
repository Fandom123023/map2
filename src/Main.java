
import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "abc", "dcd", "dcd", "e" ));

    public static void main(String[]args) {
        task();
    }
    public static void task(){
        for (int num : nums){
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    public static void task2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num == prevNum){
                System.out.println(num);
                prevNum = num;
            }
        }
    }
    public static void task3() {
        Set<String> unigueWords = new HashSet<>(words);
        System.out.println(unigueWords);
    }
    public static void task4(){
        Set<String> unigueWords = new HashSet<>(words);
        System.out.println(words.size() - unigueWords.size());
    }
}