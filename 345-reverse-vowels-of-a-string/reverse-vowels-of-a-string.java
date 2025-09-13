class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        char[] arr=s.toCharArray();
        while(start<end){
            if(isVowel(arr[start]) &&  isVowel(arr[end])){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start+=1;
                end-=1;
            }
            else if(isVowel(arr[start]) &&  !isVowel(arr[end])){
                end--;
            }
            else{
                start++;
            }
        }
        
        return new String(arr); 
        
    }
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U'){
            return true;
        }
        return false;
    }
}