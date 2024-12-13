package store.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Product {

    public List<List<String>> product = new ArrayList<>();

    public Product(List<List<String>> product) {
        this.product = product;
    }

    public List<List<String>> getProduct() {
        return product;
    }

    public int getProductQuantityByProductName(String productName) {
        int count = 0;
        for (List<String> product : product) {
            if (product.get(0).equals(productName)) {
                count += Integer.parseInt(product.get(2));
            }
        } return count;
    }
}
