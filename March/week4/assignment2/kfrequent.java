class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String>[] buc = new List[words.length +1];
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        
        for(String str : words) 
            map.put(str, map.getOrDefault(str, 0) +1);
        
        for(String key : map.keySet()) {
            int freq = map.get(key);
            
            if(buc[freq] == null) {
                buc[freq] = new ArrayList<String>();
            }
            buc[freq].add(key);
        }
        
        for(int i = buc.length -1; i >= 0 && ans.size() < k; i--) {
            if(buc[i] != null) {
                Collections.sort(buc[i]);
                ans.addAll(buc[i]);
            }
        }
        
        return ans.subList(0,k);
    }
}
