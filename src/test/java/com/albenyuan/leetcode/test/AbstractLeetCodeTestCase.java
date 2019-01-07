package com.albenyuan.leetcode.test;

import org.junit.Test;

/**
 * @Author Alben Yuan
 * @Date 2019-01-07 11:44
 */

public abstract class AbstractLeetCodeTestCase {

    @Test
    public void action() {
        run();
    }

    public abstract void run();
}
