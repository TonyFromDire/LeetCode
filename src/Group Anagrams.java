public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> answers = new ArrayList<List<String>>();
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();

		for (int i = 0; i < strs.length; i++) {
			char[] test = strs[i].toCharArray();
			Arrays.sort(test);
			String testString = new String(test);
			if (map.containsKey(testString)) {
				List<String> tempList = map.get(testString);
				tempList.add(strs[i]);
				map.put(testString, tempList);
			} else {
				List<String> tempList = new ArrayList<String>();
				tempList.add(strs[i]);
				map.put(testString, tempList);
			}

		}
		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			List<String> val = map.get(key);
			Collections.sort(val);	
			answers.add(val);
		}
		return answers;
    }
}