package store;

import java.util.List;
import store.controller.MainController;
import store.dto.Product;
import store.dto.Promotion;
import store.reader.ProductReader;
import store.reader.PromotionReader;
import store.view.InputView;
import store.view.OutputView;
import store.view.hanlder.InputHandler;

public class Application {
    public static void main(String[] args) {
        ProductReader productReader = new ProductReader();
        PromotionReader promotionReader = new PromotionReader();

        String productPath = "src/main/resources/products.md";
        String promotionPath = "src/main/resources/promotions.md";
        Product product = productReader.readResource(productPath);
        Promotion promotion = promotionReader.readResource(promotionPath);

        OutputView outputView = new OutputView();
        InputView inputView = new InputView(product);
        InputHandler inputHandler = new InputHandler(inputView);
        MainController mainController = new MainController(product, outputView, inputView, inputHandler);
        mainController.start();
    }
}
