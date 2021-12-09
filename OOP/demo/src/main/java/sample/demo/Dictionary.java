package sample.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Dictionary {
    public List<Word> words;

//    public Dictionary(List<Word> words) {
//        this.words = words;
//    }
    public Dictionary() {

    }

    DialogDisplay dis = new DialogDisplay();

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    public int searchPosInsert(String word) {
        if (words.isEmpty()) {
            return 0;
        }
        int first = 0;
        int end = words.size() - 1;

        while (first < end) {
            int mid = (end + first) / 2;
            String str = words.get(mid).getWord_targe();
            if (word.compareToIgnoreCase(str) > 0) {
                first = mid + 1;
            } else if (word.compareToIgnoreCase(str) < 0) {
                end = mid - 1;
            } else if (word.compareToIgnoreCase(str) == 0) return -1;
        }
        String strEnd = words.get(first).getWord_targe();
        if (word.compareToIgnoreCase(strEnd) == 0) return -1;
        if (word.compareToIgnoreCase(strEnd) > 0) {
            return first + 1;
        }

        return first;
    }

    public int searchPosWord(String wordTarge) {
        if (words.isEmpty()) {
            return -1;
        }
        int first = 0;
        int end = words.size() - 1;

        while (first < end) {
            int mid = (end + first) / 2;
            String str = words.get(mid).getWord_targe();
            if (wordTarge.compareToIgnoreCase(str) > 0) {
                first = mid + 1;
            } else if (wordTarge.compareToIgnoreCase(str) < 0) {
                end = mid - 1;
            } else if (wordTarge.compareToIgnoreCase(str) == 0) {
                return mid;
            }
        }
        String strEnd = words.get(first).getWord_targe();
        if (wordTarge.compareToIgnoreCase(strEnd) == 0) {
            return first;
        }
        return -1;
    }


    public int searchPosSubWord(String subWord) {
        if (words.isEmpty()) {
            return -1;
        }
        int first = 0;
        int end = words.size() - 1;

        while (first < end) {
            int mid = (end + first) / 2;
            String str = words.get(mid).getWord_targe();
            if (str.startsWith(subWord)) {
                return mid;
            } else if (subWord.compareToIgnoreCase(str) < 0) {
                end = mid - 1;
            } else if (subWord.compareToIgnoreCase(str) > 0) {
                first = mid + 1;
            }
        }

        String strEnd = words.get(first).getWord_targe();
        if (strEnd.startsWith(subWord)) {
            return first;
        }
        return -1;
    }

    public void addWord(Word word) {
        int pos = searchPosInsert(word.getWord_targe());
        if (pos == -1) {
            System.out.println("Da co tu nay trong tu dien: " + word.getWord_targe());
            dis.existWord();
        } else {
            this.words.add(pos, word);
        }
    }

    public void removeWord(String target) {
        int pos = searchPosWord(target);
        if (pos == -1) {
            System.out.println("Khong co tu nay trong tu dien, khong the xoa");
            dis.errorDis();
        } else {
            words.remove(pos);
        }
    }

}