class Solution {
    public String finalString(String s) {
        String str="";
        String rev="";
         for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                str = reverse(str);  
            } else {
                str += s.charAt(i);   
            }
        }
        return str; 
        
    }
    static String reverse(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;

    }
}