class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Answer = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < i + 1; j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }
                else{
                    temp.add(Answer.get(i - 1).get(j - 1) + Answer.get(i - 1).get(j));
                }
            }
            Answer.add(temp);
        }
        return Answer;
    }
}