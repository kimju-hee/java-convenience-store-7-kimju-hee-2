package store.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import store.dto.Promotion;

public class PromotionReader {
    public Promotion readResource(String path) {
        LinkedHashMap<String, List<String>> promotionList = new LinkedHashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            bufferedReader.readLine();
            String resourceName = null;
            List<String> info = new ArrayList<>();
            String promotionName = "";
            while ((resourceName = bufferedReader.readLine()) != null) {
                String[] name = resourceName.split(",");
                promotionName = name[0].trim();
                for (int i = 1; i < name.length; i++) {
                    info.add(name[i]);
                }
                promotionList.put(promotionName, info);
            }
        } catch (IOException e) {
            return null;
        }
        return new Promotion(promotionList);
    }
}

