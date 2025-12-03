class Solution {
    public String makeGood(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
             if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                // Same letter, different case → remove the previous one
                stack.pop();
            } else {
                // Otherwise, just push current character
                stack.push(c);
            }
        }
        String f="";
        while(!stack.isEmpty()){
            f+=stack.peek();
            stack.pop();
        }
        StringBuilder stringBuilder = new StringBuilder(f);
        stringBuilder.reverse();
        return  stringBuilder.toString();

        
    }
}