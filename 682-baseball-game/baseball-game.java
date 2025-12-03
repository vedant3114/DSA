class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String i: operations){
            if(i.equals("C")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(i.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(i.equals("+")){
                int last=stack.pop();
                int secondlast=stack.peek();
                stack.push(last);
                stack.push(last+secondlast);

            }
            else{
                stack.push(Integer.parseInt(i));
            }

        }
        int sum=0;
        if(stack.size()==0){
            return 0;
        }
        while(!stack.isEmpty()){
            sum+=stack.peek();
            stack.pop();
        }
        return sum;
        
    }
   
}