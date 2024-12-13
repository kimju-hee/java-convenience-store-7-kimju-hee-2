package store;

import java.util.List;
import store.controller.MainController;
import store.dto.Product;
import store.dto.Promotion;
import store.reader.ProductReader;
import store.reader.PromotionReader;

public class Application {
    public static void main(String[] args) {
        ProductReader productReader = new ProductReader();
        PromotionReader promotionReader = new PromotionReader();

        String productPath = "src/main/resources/products.md";
        String promotionPath = "src/main/resources/promotions.md";
        Product product = productReader.readResource(productPath);
        Promotion promotion = promotionReader.readResource(promotionPath);

        MainController mainController = new MainController(product);
        mainController.start();
    }
}
