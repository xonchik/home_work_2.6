import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ///Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        //Код должен работать с любой последовательностью и объемом списка чисел.

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println();

        ///Напишите код, с помощью которого можно напечатать только четные числа без повторений в
        //порядке возрастания.

        List<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !nums2.contains(nums.get(i))) {
                nums2.add(nums.get(i));
            }
        }
        Collections.sort(nums2);
        System.out.println(nums2);
        System.out.println();

        ///Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором
        //могут встречаться дубли.

        List<String> words = new ArrayList<>(List.of("mother", "father", "brother", "sister",
                "animal", "baby", "mother", "sister", "baby", "dog", "cat", "dog"));
        HashSet<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            uniqueWords.add(words.get(i));
        }
        System.out.println(uniqueWords);
        System.out.println();

        ///Напишите код, который выводит в консоль все количество дублей из списка слов.
        //Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.В таком
        //случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.

       int repeat = (words.size() - uniqueWords.size()) * 2;
        System.out.println("Количество повторяющихся слов : " + repeat);

    }
}