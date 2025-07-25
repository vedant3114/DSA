class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for c in s:
            if c=="[" or c=="(" or c=="{":
                stack.append(c)
            else:
                if not stack:
                    return False
                else:
                    top=stack.pop()
                    if c==")" and top!="(" or c=="}" and top!="{"  or c=="]" and top!="[":
                        return False
        return not stack