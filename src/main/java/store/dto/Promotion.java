package store.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Promotion {
    public Map<String, List<String>> promotion = new HashMap<>();

    public Promotion(Map<String, List<String>> promotion) {
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
