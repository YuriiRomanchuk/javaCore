package core.task10;

import core.task10.controllers.FileStreamController;
import core.task10.controllers.InputController;
import core.task9.encryption.Encrypting;

public class AccessPoint {

    private InputController inputController = new InputController();
    private FileStreamController fileStreamController = new FileStreamController();
    private Encrypting encrypting = new Encrypting(6);

    public void startProgram() {

        boolean continueWork = true;

        while (continueWork) {

            boolean newFile = inputController.askIfCreateNewFile();

            String decryptText = "";

            if (!newFile) {
                String OpenFilePath = inputController.receiveOpenFilePath();
                String currentText = fileStreamController.readFile(OpenFilePath);
                decryptText = encrypting.decrypt(currentText);
            }

            String text = inputController.showChangeTextRequest(decryptText);

            if (text.compareTo(decryptText) != 0) {
                fileStreamController.writeFile(encrypting.encrypt(text), inputController.receiveSaveFilePath());
            } else {
                inputController.showInformationDialog("Text has not changed");
            }

            continueWork = inputController.askIfContinueWork();
        }

    }

}
