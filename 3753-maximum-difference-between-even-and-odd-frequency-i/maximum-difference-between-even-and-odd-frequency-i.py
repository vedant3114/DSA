class Solution:
    def maxDifference(self, s: str) -> int:
        hashmap={}
        for char in s:
            hashmap[char]= hashmap.get(char,0)+1
        even=[]
        odd=[]
        for i in hashmap.values():
            if i%2==0:
                even.append(i)
            else:
                odd.append(i)
        if not even or not  odd:
            return 0
        else:
            return max(odd)-min(even)
        