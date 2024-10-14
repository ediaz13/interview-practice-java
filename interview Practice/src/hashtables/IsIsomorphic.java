package hashtables;

import java.util.HashMap;

public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mappingS = new HashMap<>();
        HashMap<Character, Character> mappingT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mappingS.containsKey(charS)) {
                if (mappingS.get(charS) != charT) {
                    return false;
                }
            }
            if (mappingT.containsKey(charT)) {
                if (mappingT.get(charT) != charS) {
                    return false;
                }

            } else {
                mappingS.put(charS, charT);
                mappingT.put(charT, charS);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        IsIsomorphic isIsomorphic = new IsIsomorphic();
        System.out.println(isIsomorphic.isIsomorphic(s, t));

    }

}
