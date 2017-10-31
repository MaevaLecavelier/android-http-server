package ro.polak.http.utilities;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static ro.polak.http.ExtraMarchers.utilityClass;

public class RandomStringGeneratorTest {

    @Test
    public void shouldNotBeInstantiable() {
        assertThat(RandomStringGenerator.class, is(utilityClass()));
    }

    @Test
    public void shouldGenerateTwoDifferentRandomStrings() {
        String s1 = RandomStringGenerator.generate();
        String s2 = RandomStringGenerator.generate();

        assertThat(s1.length(), is(32));
        assertThat(s2.length(), is(32));
        assertThat(s1, is(not(s2)));
    }
}