class Solution {

    public void sortColors(int[] nums) {

        // 处理元素取值范围是 [0, R) 的计数排序
        int R = 3;

        int[] cnt = new int[R];
        for(int num: nums)
            cnt[num] ++;

        // [index[i], index[i + 1]) 的值为 i
        int[] index = new int[R + 1];
        for(int i = 0; i < R; i ++)
            index[i + 1] = index[i] + cnt[i];

        for(int i = 0; i + 1 < index.length; i ++)
            // [index[i], index[i + 1]) 的值为 i
            for(int j = index[i]; j < index[i + 1]; j ++)
                nums[j] = i;
    }
}