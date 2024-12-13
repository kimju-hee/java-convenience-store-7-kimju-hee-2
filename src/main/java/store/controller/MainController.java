package store.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import store.dto.Product;
import store.view.OutputView;

public class MainController {
    public final Product product;
    private List<List<String>> products = new ArrayList<>();

    OutputView outputView = new OutputView();

    public MainController(Product product) {
        this.product = product;
    }

    public void start() {
        products = product.getProduct();
        printGreeting();
    }

    public void printGreeting() {
        outputView.printFirst();
        for (List<String> information : products) {
            outputView.printStoreProducts(information);
        }
    }
}
