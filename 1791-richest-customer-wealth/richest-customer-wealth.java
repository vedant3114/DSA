class Solution {
    public int maximumWealth(int[][] accounts) {
       
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<accounts.length;i++){
             int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            list.add(sum);
        }
        int max=list.get(0);
        for (int num:list){
            if (num>max){
                max=num;
            }
        }
        return max;
    }
}