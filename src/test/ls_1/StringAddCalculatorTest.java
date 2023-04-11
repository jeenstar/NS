package ls_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static ls_1.StringAddCalculator.splitAndSum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class StringAddCalculatorTest {
    @Test
    @DisplayName("빈문자열 또는 null 체크")
    void 빈문자열_null() {
        int actual = splitAndSum(null);
        assertThat(actual).isEqualTo(0);

        actual = splitAndSum("");
        assertThat(actual).isEqualTo(0);
    }

    @Test
    @DisplayName("빈문자열 또는 null 체크2")
    void 빈문자열_null2() {
        assertThat(splitAndSum(null)).isEqualTo(0);
        assertThat(splitAndSum("")).isEqualTo(0);
    }

    @Test
    @DisplayName("컴마구분")
    void 컴마구분자() {
        String[] values = "1,2".split(",");
        assertThat(values).hasSize(2);
        assertThat(values).containsExactly("1", "2");

        values = "1".split(",");
        assertThat(values).hasSize(1);
        assertThat(values).containsExactly("1");
    }

    @Test
    void 콜론구분자() {
        assertThat(splitAndSum("1,2:3")).isEqualTo(6);
    }

    @Test
    void 음수() {
        assertThatThrownBy(() -> splitAndSum("-1,2:3"))
                .isInstanceOf(RuntimeException.class);
    }
}