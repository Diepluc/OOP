package sample.demo;

import javafx.scene.control.Alert;

public class DialogDisplay {
    public void errorDis() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setContentText("Khong co tu nay trong tu dien");
        alert.showAndWait();
    }

    public void existWord() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setContentText("Da co tu nay trong tu dien");
        alert.showAndWait();
    }

    public void exportSuccess() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Success!");
        alert.setContentText("Xuat file thanh cong");
        alert.showAndWait();
    }
}
