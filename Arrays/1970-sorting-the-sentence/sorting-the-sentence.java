class Solution {
    public String sortSentence(String s) {
        s+=" ";
        int n = s.length();
        int c=0;
        for(int i=0;i<n;i++)
            {
                if(s.charAt(i)==' ')c++;
            }
        String arr[] = new String[c];
        String str = "";
        int idx = 1;
        for(int i=0;i<n;i++)
            {
                char ch = s.charAt(i);
                if(ch > 48 && ch <= 57)
                {
                    idx = ch - '0';
                }
                else if(ch != ' ')
                {
                    str+=ch;
                }
                else
                {
                    arr[idx-1]=str;
                    str="";
                }
            }
        String res = "";
        for(String t : arr)
            {
                res+=t;
                res+=" ";
            }
        return res.trim();
    }
}