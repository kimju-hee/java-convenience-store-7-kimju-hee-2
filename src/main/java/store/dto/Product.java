package store.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Product {

    public Map<String, List<String>> product = new HashMap<>();

    public Product(Map<String, List<String>> product) {
        this.product = product;
    }

    public List<String> getProductName() {
        List<String> productNameList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : product.entrySet()) {
            String productName = entry.getKey();
            productNameList.add(productName);
        }
        return productNameList;
    }

    public Map<String, List<String>> getProduct() {
        return product;
    }

    public List<String> getProductValueByProductName(String productName, String promotionName) {
        List<String> productInfo = product.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getKey(), productName) && entry.getValue().contains(promotionName))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(Collections.emptyList());
        return productInfo;
    }
}
