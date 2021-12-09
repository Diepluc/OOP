public class Word {
    private String word_targe;
    private String word_explane;

    public Word(String word_targe, String word_explane) {
        this.word_targe = word_targe;
        this.word_explane = word_explane;
    }

    public void setWord_targe(String word_targe) {
        this.word_targe = word_targe;
    }

    public String getWord_targe() {
        return word_targe;
    }

    public void setWord_explane(String word_explane) {
        this.word_explane = word_explane;
    }

    public String getWord_explane() {
        return word_explane;
    }
}
