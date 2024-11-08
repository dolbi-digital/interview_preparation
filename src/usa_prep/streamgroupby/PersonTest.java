package usa_prep.streamgroupby;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    @Test
    void checkEquality() {
        Person first = new Person("Jim", 25);
        Person second = new Person("Jim", 25);

        assertThat(first).isEqualTo(second);
    }
}
