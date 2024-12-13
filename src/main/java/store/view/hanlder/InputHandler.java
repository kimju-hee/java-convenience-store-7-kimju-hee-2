package store.view.hanlder;

import java.util.function.Supplier;
import store.view.ErrorView;
import store.view.InputView;

public class InputHandler {
    private final InputView inputView;

    public InputHandler(InputView inputView) {
        this.inputView = inputView;
    }

    public String receiveValidatedOrder() {
        return receiveValidatedInput(inputView::orderInput);
    }

    private <T> T receiveValidatedInput(Supplier<T> inputView) {
        while (true) {
            try {
                return inputView.get();
            } catch (IllegalArgumentException exception) {
                ErrorView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
