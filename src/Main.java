import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> dict = new TreeMap<>();
        int max = 0;
        String maxword = "";
        try {
            File f = new File("D:\\test1.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()){
                String word = sc.useDelimiter("\\s+").next();
                Integer count = dict.get(word);
                if (count == null){
                    count = 0;
                }
                dict.put(word, ++count);
            }
            for (String k :dict.keySet()) {
                if (max <= dict.get(k)){
                    maxword = k;
                    max = dict.get(k);
                }
                System.out.println(k + " = " + dict.get(k));
            }
            System.out.println("больше всего встречается следующее слово: '" + maxword + "' оно встречается " + max + " раз");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
