package voyagerwoo.dp.cafe;

import org.junit.Test;
import voyagerwoo.dp.cafe.decorator.Mocha;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VoyagerCafeTest {
    @Test
    public void mochaEspressoTest() {
        Beverage mochaEspresso = new Mocha(new Espresso());

        assertThat(mochaEspresso.cost(), is(2.19));
    }
}
