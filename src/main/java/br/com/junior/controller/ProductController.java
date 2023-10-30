package br.com.junior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.junior.application.StoreApplication;
import br.com.junior.interfaces.ProductFactory;
import br.com.junior.productFactory.AppleFactory;
import br.com.junior.productFactory.SamsungFactory;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/sell")
    public String show(String os) {

        ProductFactory factory = null;

        switch (os) {
            case "apple":
                factory = new AppleFactory();
            break;
            case "samsung":
                factory = new SamsungFactory();
            break;
        }

        StoreApplication app = new StoreApplication(factory);
        return app.sellAll();
    }
}