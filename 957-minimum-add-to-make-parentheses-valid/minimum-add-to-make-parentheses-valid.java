class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>stack=new Stack<>();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    sum+=1;
                }
            }
        }
        return sum+stack.size();
        
    }
}