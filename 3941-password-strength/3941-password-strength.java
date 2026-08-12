class Solution {
    public int passwordStrength(String s) {
        boolean []a=new boolean[128];
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!a[c]){
                a[c]=true;
                if(c>='a'&&c<='z')
                ans++;
                else if(c>='A'&&c<='Z')
                ans+=2;
                else if(c>='0'&&c<='9')
                ans+=3;
                else
                ans+=5;
            }
        }
        return ans;
    }
}