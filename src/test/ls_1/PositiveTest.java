package ls_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PositiveTest {
    @Test
    void create() {
        Positive positive = new Positive("3");
        assertThat(positive.getNumber()).isEqualTo(3);
    }
}