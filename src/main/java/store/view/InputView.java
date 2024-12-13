package store.view;

import camp.nextstep.edu.missionutils.Console;
import store.dto.Product;
import store.view.validation.OrderValidator;

public class InputView {
    private final Product product;
    private OrderValidator orderValidator;

    public InputView(Product product) {
        this.product = product;
        this.orderValidator = new OrderValidator(product);
    }

    public String orderInput() {
        String order = Console.readLine();
        orderValidator.validator(order);
        return order;
    }
}
