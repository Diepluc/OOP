import java.io.*;
import java.util.List;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary;

    public DictionaryManagement(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void insertFromCommandline() {
        System.out.println('\n' + "Nhap tu ban muon them: ");
        Scanner sc = new Scanner(System.in);
        String word_targe = sc.nextLine();
        String word_explain = sc.nextLine();
        Word word = new Word(word_targe, word_explain);
        dictionary.addWord(word);
    }

    public void insertFromFile() {
        String fileName = "out/production/dictionaries.txt";
        BufferedReader reader = null;

        try {
            String line = "";
            reader = new BufferedReader(new FileReader(fileName));
            if (reader.readLine() == null) {
                System.out.println("File dang trong, moi ban them tu vao file");
            }
            while ((line = reader.readLine()) != null) {
                String[] wordOfLine = line.split("\t");
                String word_tagre = wordOfLine[0];
                String word_explain = wordOfLine[1];
                Word word = new Word(word_tagre, word_explain);
                dictionary.addWord(word);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                System.out.println("Nhap file thanh cong");
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void dictionaryExportToFile() {
        System.out.println("Nhap ten file");
        Scanner sc = new Scanner(System.in);
        String nameFile = sc.nextLine();
        List<Word> words = dictionary.getWords();
        BufferedWriter writer = null;
        try {
            File fileName = new File(nameFile);
            writer = new BufferedWriter(new FileWriter(fileName));

            for (Word word : words) {
                String wordTarge = word.getWord_targe();
                String wordexplain = word.getWord_explain();
                writer.write(wordTarge + "   " + wordexplain + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                System.out.println("Xuat file thanh cong");
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void dictionaryLookup() {
        System.out.println("Nhap tu ban muon biet nghia: ");
        Scanner sc = new Scanner(System.in);
        String wordTarge = sc.nextLine();
        int pos = dictionary.searchPosWord(wordTarge);
        if (pos == -1) {
            System.out.println("Khong co tu nay trong tu dien");
        } else {
            List<Word> words = dictionary.getWords();
            Word word = words.get(pos);
            String wordexplain = word.getWord_explain();
            System.out.print(wordexplain);
        }
    }
}
