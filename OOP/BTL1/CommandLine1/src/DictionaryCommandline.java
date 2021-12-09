import java.util.List;

public class DictionaryCommandline {
    DictionaryManagement dManagement;
    Dictionary dictionary;

    public DictionaryCommandline(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.dManagement = new DictionaryManagement(dictionary);
    }

    public void showAllWords() {
        List<Word> words = dictionary.getWords();
        System.out.println("No    " + "English             " + "Vietnamese");
        int number = 1;
        for (Word word : words) {
            System.out.print(number + "     ");
            number++;
            System.out.print(word.getWord_targe());
            int len = word.getWord_targe().length();
            for (int j = 0; j < 20 - len; j++) {
                System.out.print(" ");
            }
            System.out.println(word.getWord_explane());
        }
    }

    public void dictionaryBasic() {
        dManagement.insertFromCommandline();
        showAllWords();
    }

    public void dictionaryAdvanced() {
        dManagement.insertFromFile();
        showAllWords();
        dManagement.dictionaryLookup();
    }

}
