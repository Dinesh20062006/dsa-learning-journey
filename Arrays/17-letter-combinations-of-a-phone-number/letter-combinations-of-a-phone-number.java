class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0)
        {
            return ans;
        }

        String [] mapping={
            "","",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        backtrack(digits,0,"",mapping,ans);
        return ans;

    }
    public void backtrack(String digits,int index,String current,String[] mapping,List<String>ans){
        if(index==digits.length())
        {
            ans.add(current);
            return;
        }
        int digit=digits.charAt(index) -'0';
        String letters=mapping[digit];
        for(char letter:letters.toCharArray()){
            current =current+letter;
            backtrack(digits,index+1,current,mapping,ans);
            current=current.substring(0,current.length()-1);
        }
    }
}