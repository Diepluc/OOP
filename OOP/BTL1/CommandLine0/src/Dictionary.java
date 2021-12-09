import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<Word> words;

    /*public Dictionary() {
        words = new ArrayList<>();
    }*/

    public Dictionary(List<Word> works) {
        this.words = works;
    }

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
            } else if (word.compareToIgnoreCase(str) == 0) return mid;
        }
        String strEnd = words.get(first).getWord_targe();
        if(word.compareToIgnoreCase(strEnd) > 0) {
            return first + 1;
        }
        return first;
    }

    public void addWord(Word word) {
        int pos = searchPosInsert(word.getWord_targe());
        words.add(pos, word);
    }


}
