public class TwoSum {
	public  int[] twoSum(int[] nums,int target){
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("no two numbers add up to the target sum.");
	}

	public static void main(String[] args) {
		int nums[]= {1,5,7,2,9,3,6};
		int target=10;
		TwoSum t=new TwoSum();
		int result[]=t.twoSum(nums, target);
		System.out.println("Numbers at this indices add up to target");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
