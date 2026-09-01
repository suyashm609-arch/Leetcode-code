class Solution {
    public int maxVowels(String s, int k) {
        int left=0;int count=0;int ans =Integer.MIN_VALUE;
        for(int right=0;right<s.length();right++){
            if(isVowel(s.charAt(right))) count++;
             if(right-left+1==k){
                ans=Math.max(ans,count);       
            if(isVowel(s.charAt(left))) count--;
            left++;}
        }
        return ans;
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'; 
    }
}