package usa_prep;

import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return;
        else if (remain == 0) result.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, remain - candidates[i], i); // Allow reusing same element
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        List<List<Integer>> combinations1 = solution.combinationSum(candidates1, target1);
        System.out.println("Combinations for candidates [2, 3, 6, 7] and target 7:");
        System.out.println(combinations1);

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        List<List<Integer>> combinations2 = solution.combinationSum(candidates2, target2);
        System.out.println("Combinations for candidates [2, 3, 5] and target 8:");
        System.out.println(combinations2);

        int[] candidates3 = {2};
        int target3 = 1;
        List<List<Integer>> combinations3 = solution.combinationSum(candidates3, target3);
        System.out.println("Combinations for candidates [2] and target 1:");
        System.out.println(combinations3);
    }
}
