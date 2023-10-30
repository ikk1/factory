package br.com.junior.productFactory;

import br.com.junior.interfaces.Keyboard;
import br.com.junior.interfaces.ProductFactory;
import br.com.junior.interfaces.Screen;
import br.com.junior.products.keyboards.AppleKeyboard;
import br.com.junior.products.screens.AppleScreen;

public class AppleFactory implements ProductFactory {

    @Override
    public Screen createScreen() {
        return new AppleScreen();
    }

    @Override
    public Keyboard createKeyboard() {
        return new AppleKeyboard();
    }

}
