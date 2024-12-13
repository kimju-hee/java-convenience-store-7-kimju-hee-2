package store.view.validation;

public enum ErrorMessage {
    INVALID_ORDER("구매 입력은 [상품(한글)-개수(숫자)] 형태여야 합니다."),
    INVALID_ORDER_NUMBER("재고가 부족합니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

