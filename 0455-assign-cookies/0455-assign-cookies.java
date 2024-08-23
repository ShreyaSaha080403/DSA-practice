class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);//i
        Arrays.sort(s);// j conter for this
        int cnt=0;
        int i=0,j=0;
        while(i<g.length&& j<s.length){
            if(g[i]<=s[j]){
                cnt++;
                i++;
            }
            j++;
        }
        return cnt;
    }
}