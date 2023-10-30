package br.com.junior.products.keyboards;

import br.com.junior.interfaces.Keyboard;

public class AppleKeyboard implements Keyboard {

    @Override
    public String type() {
        return "Apple keyboard typing...";
    }

}
