package Creationals.Factory_Method.factory;

import Creationals.Factory_Method.button.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }


    public abstract Button createButton();

}