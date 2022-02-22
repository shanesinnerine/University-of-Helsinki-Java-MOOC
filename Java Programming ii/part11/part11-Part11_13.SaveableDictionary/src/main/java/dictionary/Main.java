package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary("word.txt");
        boolean worked = s.load();
        System.out.println("Success: " + worked);
        s.printAll();
    }
}
