class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(n,"",0,0,ans);
        return ans;
    }
    public void backtrack(int n,String current,int open,int close,List<String>ans){
        if(current.length()==2*n){
            ans.add(current);
            return;
        }
        if(open<n )
        {
            current=current+"(";
            backtrack(n,current,open+1,close,ans);
            current=current.substring(0,current.length()-1);
        }
        if(close<open)
        {
            current = current +")";
            backtrack(n,current,open,close+1,ans);
            current=current.substring(0,current.length()-1);
        }
    }
}