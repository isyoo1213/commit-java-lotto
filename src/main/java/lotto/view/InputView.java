package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String askPaymentAmount() {
        return Console.readLine();
    }

    public String askAnswerLottoNumbers() {
        return Console.readLine();
    }
}
