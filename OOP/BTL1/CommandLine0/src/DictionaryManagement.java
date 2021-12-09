import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary;

    public DictionaryManagement(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        String word_targe = sc.nextLine();
        String word_explane = sc.nextLine();
        Word word = new Word(word_targe, word_explane);
        dictionary.addWord(word);
    }
}
