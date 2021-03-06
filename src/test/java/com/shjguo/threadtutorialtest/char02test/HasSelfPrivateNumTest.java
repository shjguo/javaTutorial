package com.shjguo.threadtutorialtest.char02test;

import com.shjguo.threadtutorial.char02.HasSelfPrivateNum;
import com.shjguo.threadtutorial.char02.SelfPrivateThreadA;
import com.shjguo.threadtutorial.char02.SelfPrivateThreadB;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/1/1.
 * Mail to byhieg@gmail.com
 */
public class HasSelfPrivateNumTest extends TestCase {
    public void testAddI() throws Exception {
        HasSelfPrivateNum numA = new HasSelfPrivateNum();
        HasSelfPrivateNum numB = new HasSelfPrivateNum();
        SelfPrivateThreadA threadA = new SelfPrivateThreadA(numA);
        threadA.start();
        SelfPrivateThreadB threadB = new SelfPrivateThreadB(numB);
        threadB.start();
        Thread.sleep(1000 * 3);
    }
}