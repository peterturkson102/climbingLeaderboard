class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
        List<Integer> result = new ArrayList<>();
        
        //TreeSet removes duplicates and sorts elements
        Set<Integer> rank = new TreeSet<Integer>(ranked);
        List<Integer> ranking = new ArrayList<>();
        
        for(Integer a: player){
            rank.add(a);
             List<Integer> position = new ArrayList<>(rank);
             int index = position.size()-position.indexOf(a);
            result.add(index);
               
        }
        
    
    return result;
    }

}
