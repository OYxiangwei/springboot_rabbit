package com.test;

import static org.junit.Assert.assertTrue;

import com.test.consumer.Consumer;
import com.test.provider.Provider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest 
{
    @Autowired
    private Provider provider;

    @Test
    @Before
    public void testProvider(){
        this.provider.sendMessage("阳祥伟");
    }


}
