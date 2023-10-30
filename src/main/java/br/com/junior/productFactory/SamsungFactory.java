package br.com.junior.productFactory;

import br.com.junior.interfaces.Keyboard;
import br.com.junior.interfaces.ProductFactory;
import br.com.junior.interfaces.Screen;
import br.com.junior.products.keyboards.SamsungKeyboard;
import br.com.junior.products.screens.SamsungScreen;

public class SamsungFactory implements ProductFactory {

    @Override
    public Screen createScreen() {
        return new SamsungScreen();
    }

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

}
