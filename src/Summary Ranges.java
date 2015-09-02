public class Solution {
	public List<String> summaryRanges(int[] nums) {
		int begin, end;
		List<String> resultList = new ArrayList<String>();
		if (nums == null) {
			return resultList;
		}
		if (nums.length>=1) {
			begin = end = nums[0];
			for (int i = 1; i < nums.length; i++) {
				if (end==nums[i]||end==nums[i]-1) {
					end = nums[i];  
				}else {
					String result=new String(format(begin, end));
					resultList.add(result);
					begin=end=nums[i];
				}
			}
			String result=new String(format(begin, end));
			resultList.add(result);
		}

		return resultList;
	}

	private String format(int begin, int end) {
		String result;
		StringBuffer temp = new StringBuffer();
		if (begin == end) {
			result = String.valueOf(begin);
		} else {
			temp.append(String.valueOf(begin));
			temp.append("->");
			temp.append(String.valueOf(end));
			result = temp.toString();
		}
		return result;
	}
}