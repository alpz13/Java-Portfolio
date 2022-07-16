package Creationals.Factory_Method.factory;


import Creationals.Factory_Method.button.Button;
import Creationals.Factory_Method.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}