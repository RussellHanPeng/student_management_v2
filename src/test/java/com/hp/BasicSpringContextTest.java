package com.hp;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {
        "classpath*:config/spring/local/appcontext-*.xml",
        "classpath*:config/spring/local/applicationContext-*.xml"

})
public abstract class BasicSpringContextTest {
}
