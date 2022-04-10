class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] bucket = new boolean[32+26];//ascii a - 65, A - 97, so'A' - 'a' = 32
        int count = 0;
        for(int i = 0;i < jewels.length();i++){
            bucket[jewels.charAt(i) - 65] = true;
        }
        for(int j = 0;j < stones.length();j++){
            if(bucket[stones.charAt(j) - 65]) count++;
        }
        return count;
    }
}
