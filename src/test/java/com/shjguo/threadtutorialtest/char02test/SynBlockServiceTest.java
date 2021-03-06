package com.shjguo.threadtutorialtest.char02test;

import com.shjguo.threadtutorial.char02.SynBlockService;
import com.shjguo.threadtutorial.char02.SynBlockThreadA;
import com.shjguo.threadtutorial.char02.SynBlockThreadB;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/1/3.
 * Mail to byhieg@gmail.com
 */
public class SynBlockServiceTest extends TestCase {
    public void testSetUSernamePassword() throws Exception {
        SynBlockService service = new SynBlockService();
        SynBlockThreadA a = new SynBlockThreadA(service);
        a.setName("A");
        a.start();

        SynBlockThreadB b = new SynBlockThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000 * 7);

    }

}