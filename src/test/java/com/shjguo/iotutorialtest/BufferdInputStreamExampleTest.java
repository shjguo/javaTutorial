package com.shjguo.iotutorialtest;

import com.shjguo.iotutorial.bytestreamio.BufferdInputStreamExample;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/2/23.
 * Mail byhieg@gmail.com
 */
public class BufferdInputStreamExampleTest extends TestCase {
    public void testReadFromFile() throws Exception {
        new BufferdInputStreamExample().readFromFile();
    }

}