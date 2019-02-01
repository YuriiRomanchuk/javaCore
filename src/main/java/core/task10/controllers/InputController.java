package core.task10.controllers;

import javax.swing.*;
import java.io.File;
import java.util.Optional;

public class InputController {

    private JFileChooser fileChooser = new JFileChooser();

    private String receiveFilePath(boolean openFile) {

        int ret = openFile ? fileChooser.showDialog(null, "Open file") : fileChooser.showSaveDialog(null);

        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            return file.getAbsolutePath();
        } else {
            return "";
        }
    }

    public String showChangeTextRequest(String currentText) {

        nameOfButton("Ok", "Cancel");

        Optional optionalText = Optional.ofNullable(JOptionPane.showInputDialog("", currentText));

        if (optionalText.isPresent()) {
            return String.valueOf(optionalText.get());
        } else {
            return currentText;
        }

    }

    private boolean receiveAction(String text, String nameButtonOk, String nameButtonCancel) {

        nameOfButton(nameButtonOk, nameButtonCancel);

        int res = JOptionPane.showConfirmDialog(null, text, "",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        nameOfButton("Ok", "Cancel");

        return res == JOptionPane.OK_OPTION;
    }

    private void nameOfButton(String nameButtonOk, String nameButtonCancel) {
        UIManager.put("OptionPane.cancelButtonText", nameButtonCancel);
        UIManager.put("OptionPane.okButtonText", nameButtonOk);
    }

    public void showInformationDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public boolean askIfCreateNewFile() {
        return receiveAction("Create new file or change existing?", "Create", "Open");
    }

    public boolean askIfContinueWork() {
        return receiveAction("Continue to work with the program?", "Yes", "No");
    }

    public String receiveOpenFilePath() {
        return receiveFilePath(true);
    }

    public String receiveSaveFilePath() {
        return receiveFilePath(false);
    }

}
