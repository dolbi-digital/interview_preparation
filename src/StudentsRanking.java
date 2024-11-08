public class StudentsRanking {
    public static void main(String[] args) {
        String[] names = {"Dima", "Sasha", "Viktor", "Goose"};
        int[] ranks = {5, 3, 1, 33};

        System.out.println(maxMinRank(names, ranks, true));
        System.out.println(maxMinRank(names, ranks, false));
        System.out.println(maxMinRank(names, ranks, true));
    }

    public static String maxMinRank(String[] names, int[] ranks, boolean flag) {
        int res=0;
        int index=0;
        for(int i = 0; i<names.length; i++) {
            if(flag) {
                if(res<ranks[i]) {
                    res = ranks[i];
                }
                index=i;
            }
            else {
                if(res>ranks[i]) {
                    res = ranks[i];
                }
                index=i;
            }
        }
        return names[index];
    }
}
