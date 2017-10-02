package roman;

import java.util.ArrayList;
import java.util.List;

public class RomanToArabic {

    private List<Roman> romans = new ArrayList<>();

    public synchronized int convert(String input) {
        input.toUpperCase().chars()
                .mapToObj(c -> (char) c)
                .map(c -> Roman.valueOf(Character.toString(c))).forEach(romans::add);

        validateInput();

        int value = 0;
        while (!romans.isEmpty()) {
            Roman current = romans.remove(0);
            if (!romans.isEmpty() && current.shouldCombine(romans.get(0))) {
                value += current.toInt(romans.remove(0));
            } else {
                value += current.toInt();
            }
        }

        return value;
    }

    private void validateInput() {
        //TODO: make some validation
    }
}
