package Task3.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cwhee", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "cartwheel"));
    }
    public static boolean fuzzySearch(String expected, String stringToSearch){
        if (expected == null || stringToSearch==null) {
            return false;
        }
        String[] mStr = stringToSearch.split("");
        String[] mSub = expected.split("");
        int i=0;
        for (String s : mStr) {
            if (s.equals(mSub[i])) i++;
            if (i == mSub.length) return true;
        }
        return false;
    }
}
