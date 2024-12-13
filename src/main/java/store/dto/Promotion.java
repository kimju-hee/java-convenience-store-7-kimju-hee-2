package store.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Promotion {
    public LinkedHashMap<String, List<String>> promotion = new LinkedHashMap<>();

    public Promotion(LinkedHashMap<String, List<String>> promotion) {
        this.promotion = promotion;
    }

    public List<String> getPromotionName() {
        List<String> promotionNameList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : promotion.entrySet()) {
            String promotionName = entry.getKey();
            promotionNameList.add(promotionName);
        }
        return promotionNameList;
    }
}
