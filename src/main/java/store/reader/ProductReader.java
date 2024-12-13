package store.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import store.dto.Product;

public class ProductReader {
    public Product readResource(String path) {
        List<List<String>> productList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            bufferedReader.readLine();
            String resourceName = null;
            while ((resourceName = bufferedReader.readLine()) != null) {
                List<String> info = new ArrayList<>();
                String[] name = resourceName.split(",");
                for (String n : name) {
                    info.add(n);
                }
                productList.add(info);
            }
        } catch (IOException e) {
            return null;
        }
        return new Product(productList);
    }
}
