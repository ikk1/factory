package br.com.junior.products.keyboards;

import br.com.junior.interfaces.Keyboard;

public class SamsungKeyboard implements Keyboard {
    
    @Override
    public String type() {
        return "Samsung keyboard typing...";
    }
    
}