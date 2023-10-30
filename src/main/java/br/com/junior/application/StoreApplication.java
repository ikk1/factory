package br.com.junior.application;

import br.com.junior.interfaces.Keyboard;
import br.com.junior.interfaces.ProductFactory;
import br.com.junior.interfaces.Screen;

public class StoreApplication {

    private Screen screen;
    private Keyboard keyboard;

    public StoreApplication(ProductFactory factory) {
        screen = factory.createScreen();
        keyboard = factory.createKeyboard();
    }

    public String sellScreen() {
        return screen.show();
    }

    public String sellKeyboard() {
        return keyboard.type();
    }

    public String sellAll() {
        return "Selling " + screen.show() + " and " + keyboard.type();
    }

}
