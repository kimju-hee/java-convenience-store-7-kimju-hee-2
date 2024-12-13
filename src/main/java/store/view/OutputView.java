package store.view;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import store.dto.Product;
import store.util.MoneyFormatter;

public class OutputView {

    public void printFirst() {
        System.out.println("안녕하세요. W편의점입니다.");
        System.out.println("현재 보유하고 있는 상품입니다.");
        System.out.println();
    }

    public void printStoreProducts(List<String> info) {
        String temp = "-";
        for (int i = 0; i < 4; i ++) {
            if (i == 0) {
                temp += info.get(0);
            }
            if (i == 1) {
                temp += " " + MoneyFormatter.format(Integer.parseInt(info.get(1)));
            }
            if (i == 2) {
                if (Integer.parseInt(info.get(2)) == 0) {
                    temp += " 재고 없음";
                }
                if (Integer.parseInt(info.get(2)) != 0) {
                    temp += " " + info.get(2) + "개";
                }
            }
            if (i == 3) {
                if (!info.get(3).equals("null")) {
                    temp += " " + info.get(3);
                }
            }
        }
        System.out.println(temp);
    }
}
