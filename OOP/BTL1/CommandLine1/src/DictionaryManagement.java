import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

   /* public void insertFromFile() {

    }*/

    public void insertFromFile() {
        String fileName = "out\\production\\dictionaries.txt";
        BufferedReader reader = null;

        try {
            String line = "";
            reader = new BufferedReader(new FileReader(fileName));

            while ((line = reader.readLine()) != null) {
                String[] wordOfLine = line.split("\t");
                for (int i = 0; i < wordOfLine.length - 1; i += 2) {
                    String word_tagre = wordOfLine[i];
                    String word_explane = wordOfLine[i + 1];
                    Word word = new Word(word_tagre, word_explane);
                    dictionary.addWord(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void dictionaryLookup() {
        Scanner sc = new Scanner(System.in);
        String wordTarge = sc.next();
        String wordExplane = dictionary.searchWordExplane(wordTarge);
        System.out.print(wordExplane);
    }

}
