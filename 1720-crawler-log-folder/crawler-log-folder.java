class Solution {
    public int minOperations(String[] logs) {
        Stack<String>stack =new Stack<>();
        int count=0;
        for(String i:logs){
            if(i.equals("../")){
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if(i.equals("./")){
                
            }
            else{
                stack.push(i);
            }
        }
        return  stack.size();
        
    }
}