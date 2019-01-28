package core.task10.controllers;

import javax.swing.*;
import java.io.File;
import java.util.Optional;

public class JFileController {

    private JFileChooser fileChooser = new JFileChooser();

    public String receiveFilePath(boolean openFile) {

        int ret = openFile ? fileChooser.showDialog(null, "Open file") : fileChooser.showSaveDialog(null);

        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
           return file.getAbsolutePath();
        } else {
            return "";
        }
    }

    public String changeText(String currentText) {

        UIManager.put("OptionPane.cancelButtonText", "Cancel");
        UIManager.put("OptionPane.okButtonText", "Ok");

        Optional optionalText = Optional.ofNullable(JOptionPane.showInputDialog("", currentText));

        if (optionalText.isPresent()) {
            return String.valueOf(optionalText.get());
        } else {
            return currentText;
        }

    }

    public boolean receiveAction(String text, String nameButtonOk, String nameButtonCancel) {

        UIManager.put("OptionPane.cancelButtonText", nameButtonCancel);
        UIManager.put("OptionPane.okButtonText", nameButtonOk);

        int res = JOptionPane.showConfirmDialog(null, text, "",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        return res == JOptionPane.OK_OPTION;
    }
}
