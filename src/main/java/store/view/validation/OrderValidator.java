package store.view.validation;

import store.dto.Product;

public class OrderValidator {
    public final Product product;

    public OrderValidator(Product product) {
        this.product = product;
    }

    public void validator(String input) {
        String[] string = input.split(",");
        isValid(string);
        isValidNumber(string);
    }

    public void isValid(String[] string) {
        for (String str : string) {
            String[] s = str.split("-");
            String s1 = s[0].trim().replace("[", "");
            String s2 = s[1].trim().replace("]", "");
            if (!s1.matches("^[ㄱ-ㅎ가-힣]+$")) {
                throwError();
            }
            if (!s2.matches("\\d+")) {
                throwError();
            }
        }
    }

    public void isValidNumber(String[] string) {
        for (String str : string) {
            String[] s = str.split("-");
            int c = product.getProductQuantityByProductName(s[0].trim().replace("[", ""));
            int count = Integer.parseInt(s[1].trim().replace("]", ""));
            if (count > c) {
                throwError2();
            }
        }
    }

    private static void throwError() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER.getMessage());
    }

    private static void throwError2() {
        throw new IllegalArgumentException(ErrorMessage.INVALID_ORDER_NUMBER.getMessage());
    }
}
