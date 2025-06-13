class Solution:
    def numDecodings(self, s: str) -> int:
        n=len(s)
        if s[0]=='0' or n==0:
            return 0
        prev=1
        curr=1
        for i in range(1,n):
            temp=0
            if s[i]!='0':
                temp+=curr
            if 10 <= int(s[i-1:i+1]) <=26:
                temp+=prev
            prev=curr
            curr=temp
        return curr
        