package by.my;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(
        classes = { ApplicationConfig.class, PersistenceConfig.class },
        loader = AnnotationConfigContextLoader.class )
public class SpringTest {
    @Test
    public void whenSpringContextIsInstantiated_thenNoExceptions(){
        // When
    }
}
