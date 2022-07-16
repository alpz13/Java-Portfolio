package Creationals.Factory_Method.factory;

import Creationals.Factory_Method.button.Button;
import Creationals.Factory_Method.button.HtmlButton;

public class HtmlDialog extends Dialog {


    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}