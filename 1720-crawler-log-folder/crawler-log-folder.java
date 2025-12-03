class Solution {
    public int minOperations(String[] logs) {
        Stack<String>stack =new Stack<>();
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