package store.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import store.dto.Product;
import store.view.InputView;
import store.view.OutputView;
import store.view.hanlder.InputHandler;

public class MainController {
    public final Product product;
    private List<List<String>> products = new ArrayList<>();
    private final OutputView outputView;
    private final InputView inputView;
    private final InputHandler inputHandler;

    public MainController(Product product, OutputView outputView, InputView inputView, InputHandler inputHandler) {
        this.product = product;
        this.outputView = outputView;
        this.inputView = inputView;
        this.inputHandler = inputHandler;
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
        outputView.printOrderInputText();
        inputHandler.receiveValidatedOrder();
    }
}
