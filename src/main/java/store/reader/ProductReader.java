package store.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import store.dto.Product;

public class ProductReader {
    public Product readResource(String path) {
        Map<String, List<String>> productList = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            bufferedReader.readLine();
            String resourceName = null;
            List<String> info = new ArrayList<>();
            String productName = "";
            while ((resourceName = bufferedReader.readLine()) != null) {
                String[] name = resourceName.split(",");
                productName = name[0].trim();
                for (int i = 1; i < name.length; i++) {
                    info.add(name[i]);
                }
                productList.put(productName, info);
            }
        } catch (IOException e) {
            return null;
        }
        return new Product(productList);
    }
}
