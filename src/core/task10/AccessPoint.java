package core.task10;

import core.task10.controllers.FileStreamController;
import core.task10.controllers.JFileController;
import core.task9.encryption.Encrypting;

public class AccessPoint {

    private JFileController jFileController = new JFileController();
    private FileStreamController fileStreamController = new FileStreamController();
    private Encrypting encrypting = new Encrypting();

    public void startProgram() {

        boolean start = true;

        while (start) {

            boolean action = jFileController.receiveAction("Create new file or change existing?", "Create", "Open");

            String currentText = !action ? fileStreamController.readFile(jFileController.receiveFilePath(true)) : "";
            String text = jFileController.changeText(encryptingText(currentText, false));

            if (text.compareTo(currentText) != 0) {
                fileStreamController.writeFile(encryptingText(text, true), jFileController.receiveFilePath(false));
            } else {
                System.out.println("Text has not changed");
            }

            start = jFileController.receiveAction("Сontinue to work with the program?", "Yes", "No");

        }

    }

    private String encryptingText(String text, boolean isEncode) {
        return encrypting.transformString(text, 6, isEncode);
    }

}
