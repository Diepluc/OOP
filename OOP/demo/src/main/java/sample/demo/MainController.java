package sample.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.*;


public class MainController implements Initializable {
    List<Word> words = Dictionary.words;
    Dictionary dictionary = new Dictionary(words);
    Dictionary dictionary;
    DictionaryManagement dManagement;
    TextSpeech speechText = new TextSpeech();

    @FXML
    private TextField wTarget;

    @FXML
    private TextField wordTarget;

    @FXML
    private Label wordExplain;

    @FXML
    private ListView<String> listView;

    private ObservableList<String> obList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectWord();
        targeAction();
        viewList();
    }


    public void viewList() {
        this.listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue)
                -> wordTarget.setText(newValue.trim()));
    }

    public void targeAction() {
        wordTarget.textProperty().addListener((observable, oldValue, newValue) -> {
            this.listView.getItems().clear();
            this.listView.getItems().addAll(Objects.requireNonNull(dManagement.dictionarySearcher(wordTarget.getText())));
        });
    }

    public void updadeList() {
        String fWord = wordTarget.getText();
        List<String> s1 = dManagement.dictionarySearcher(fWord);
        obList.setAll(s1);
        listView.setItems(obList);
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void selectWord() {
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String explain = dManagement.dictionaryLookup(newValue);
            wordExplain.setText(Objects.requireNonNullElse(explain, ""));
//            int pos = dictionary.searchPosWord(newValue);
//            String exx = words.get(pos).getWord_targe();
//            wTarget.setText(Objects.requireNonNullElse(exx, ""));
//            wordTarget.setText(exx);
        });
        updadeList();
    }

    public void addWord() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("add-word.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 245);
        stage.setScene(scene);
        stage.showAndWait();
        updadeList();
    }

    public void removeWord() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("remove-word.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 245);
        stage.setScene(scene);
        stage.showAndWait();
        stage.close();
        updadeList();
    }

    public void changeWord() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("change-word.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 245);
        stage.setScene(scene);
        stage.show();
        updadeList();
    }

    public void exportFile() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("export-file.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 180);
        stage.setScene(scene);
        stage.showAndWait();
        stage.close();
    }

    public void textSpeech() {
        String target = wordTarget.getText();
        speechText.textSpeech(target);
    }

    public void removeTarget() {
        wordTarget.setText("");
    }

}