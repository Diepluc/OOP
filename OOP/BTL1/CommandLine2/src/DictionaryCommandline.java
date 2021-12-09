import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryCommandline {
    DictionaryManagement dManagement;
    Dictionary dictionary;

    public DictionaryCommandline(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.dManagement = new DictionaryManagement(dictionary);
    }

    public void showAllWords() {
        List<Word> words = dictionary.getWords();
        if (words.size() == 0) {
            System.out.println("Tu dien dang trong, moi ban them tu vao tu dien");
        } else {
            System.out.println("No\t\t" + "English\t\t\t\t" + "Vietnamese");
            int number = 1;
            for (Word word : words) {
                System.out.print(number + "\t\t ");
                number++;
                System.out.print(word.getWord_targe());
                int len = word.getWord_targe().length();
                for (int j = 0; j < 21 - len; j++) {
                    System.out.print(" ");
                }
                System.out.println(word.getWord_explain());
            }
        }
    }


    public void dictionarySearcher() {
        System.out.println('\n' + "Nhap tu hien thi danh sach goi y: ");
        Scanner sc = new Scanner(System.in);
        String subWord = sc.nextLine();
        List<Word> words = dictionary.getWords();
        int posStart = dictionary.searchPosSubWord(subWord);
        List<String> arrSub = new ArrayList<>();

        int left = posStart;
        int right = posStart;
        while (left >= 0) {
            Word word = words.get(left);
            String strTest1 = word.getWord_targe();
            if (strTest1.startsWith(subWord)) left--;
            else break;
        }

        while (right < words.size()) {
            Word word = words.get(right);
            String strTest2 = word.getWord_targe();
            if (strTest2.startsWith(subWord)) right++;
            else break;
        }

        for (int i = left + 1; i < right; i++) {
            Word word = words.get(i);
            arrSub.add(word.getWord_targe());
        }

        for (String sWord : arrSub) {
            System.out.println(sWord);
        }
    }

    public void dictionaryBasic() {
        dManagement.insertFromCommandline();
        showAllWords();
    }

    private void disPlay() {
        System.out.println("Nhap so:");
        System.out.println("1. Hien thi toan bo tu\n2. Nhap du lieu file\n3. Xuat ra file");
        System.out.println("4. Them tu\n5. Sua tu\n6. Xoa tu\n7. Tra tu\n8. Thoat" +
                "\n9. Menu\n10. Tra nghia\n11. Phat am");
    }


    public void dictionaryAdvanced() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int numberDis = 1;
        int chose = 0;
        while (true) {
            if (numberDis == 1) {
                disPlay();
                numberDis = 0;
            }
            try {
                chose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Nhap khong hop le, vui long nhap lai");
                dictionaryAdvanced();
                e.printStackTrace();
            }
            switch (chose) {
                case 1:
                    showAllWords();
                    break;
                case 2:
                    dManagement.insertFromFile();
                    break;
                case 3:
                    dManagement.dictionaryExportToFile();
                    break;
                case 4:
                    System.out.println("Nhap tu can them");
                    String wordTarge = sc.nextLine();
                    System.out.println("Nhap nghia");
                    sc.nextLine();
                    String wordexplain = sc.nextLine();
                    if (wordTarge == null || wordexplain == null) {
                        System.out.println("ban chua nhap het tu hoac nghia");
                    } else {
                        Word word = new Word(wordTarge, wordexplain);
                        dictionary.addWord(word);
                        System.out.println("Them tu thanh cong");
                    }
                    break;
                case 5:
                    dictionary.fixWord();
                    break;
                case 6:
                    dictionary.removeWord();
                    break;
                case 7:
                    dictionarySearcher();
                    break;
                case 8:
                    exit = true;
                case 9:
                    numberDis = 1;
                    break;
                case 10:
                    dManagement.dictionaryLookup();
                    break;
                case 11:
                    TextSpeech speech = new TextSpeech();
                    System.out.println("Nhap tu ban muon phat am: ");
                    String word = sc.next();
                    speech.textSpeech(word);
                    break;
                default:
                    System.out.println("Vui long nhap tu 1-11");
            }
            if (exit) {
                break;
            }

        }

    }

}
