import org.junit.Test;
import static org.junit.Assert.*;

public class L12345678_5_Test {

    // 测试用例1：空数组
    // 预期输出：0，因为没有任何子序列
    @Test
    public void testEmptyArray() {
        Solution5 solution = new Solution5();
        assertEquals(0, solution.numSubseq(new int[]{}, 10));
    }

    // 测试用例2：单个元素数组
    // 预期输出：1，因为只有一个子序列 [3] 满足条件
    @Test
    public void testSingleElement() {
        Solution5 solution = new Solution5();
        assertEquals(1, solution.numSubseq(new int[]{3}, 5));
    }

    // 测试用例3：常规数组
    // 预期输出：4，示例数组 [3,5,6,7] 满足的子序列有 [3], [3,5], [3,6], [3,5,6]
    @Test
    public void testNormalArray() {
        Solution5 solution = new Solution5();
        assertEquals(4, solution.numSubseq(new int[]{3, 5, 6, 7}, 9));
    }

    // 测试用例4：大数组边界值
    // 预期输出：数组的所有非空子序列都满足条件，数量为 2^n - 1
    @Test
    public void testLargeArray() {
        Solution5 solution = new Solution5();
        int[] nums = new int[100000];
        Arrays.fill(nums, 1);
        assertEquals((int)((Math.pow(2, 100000) - 1) % 1000000007), solution.numSubseq(nums, 2));
    }
}
