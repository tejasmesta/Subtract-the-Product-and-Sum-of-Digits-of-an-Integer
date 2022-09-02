class Solution {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        
        int l = s.length();
        
        int product = 1;
        int sum = 0;
        
        for(int i=0;i<l;i++)
        {
            int j = Integer.parseInt(s.charAt(i)+"");
            product *= j;
            sum += j;
        }
        
        return product-sum;
    }
}
