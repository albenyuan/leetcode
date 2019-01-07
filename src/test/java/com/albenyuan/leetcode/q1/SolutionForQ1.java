package com.albenyuan.leetcode.q1;

import com.albenyuan.leetcode.test.AbstractLeetCodeTestCase;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2019-01-07 11:41
 */
public class SolutionForQ1 extends AbstractLeetCodeTestCase {

    private static final Logger logger = LoggerFactory.getLogger(SolutionForQ1.class);
    private int[] nums = {2, 7, 11, 15};
    private int target = 9;
    private int[] expect = {0, 1};

    public void run() {
        logger.info("run:{}", SolutionForQ1.class);
        int[] result = new Solution().twoSum(nums, target);
        Assert.assertArrayEquals("第一题答案应该相同", expect, result);

    }
}
