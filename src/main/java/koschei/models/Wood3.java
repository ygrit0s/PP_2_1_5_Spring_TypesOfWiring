package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private final Hare4 hare;

    public Wood3(Hare4 hare) {
        this.hare = hare;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + hare.toString();
    }
}
