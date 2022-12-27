package validParenthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {



    public static boolean validParenthesis(String s){

        char [] chars = s.toCharArray();

        int count = 0;
        boolean isValid = false;
        while (count < chars.length){

            if(chars.length % 2 == 1)
                return false;

            if((chars[count] == '(' ) && (chars[count + 1] == ')')){
                isValid = true;
            }

            if((chars[count] == '{' ) && (chars[count + 1] == '}')){
                isValid = true;
            }

            if((chars[count] == '[' ) && (chars[count + 1] == ']')){
                isValid = true;
            }

            count = count + 2;
        }

        return isValid;
    }


    public static boolean validParenthesis2(String s){

        if (s.length() % 2 != 0) {
            return false;
        }

        char[] sArr = s.toCharArray();

        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');

        Stack<Character> st = new Stack<>();

        for(char c : sArr) {
            if (!hm.containsKey(c)) {
                st.push(c);
            } else {
                if (st.isEmpty() || st.pop() != hm.get(c)) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static boolean validParenthesis3(String s){

        if(s.length() % 2 == 1)
            return false;

        Map<Character, Character> characters = new HashMap<>();
        characters.put(']', '[');
        characters.put('}', '{');
        characters.put(')', '(');

        char [] chars = s.toCharArray();

        Stack<Character> characterStack = new Stack<>();

        for(char c : chars){

            if(c == '(' || c == '{' || c == '['){
                characterStack.push(c);
            }else {
                if(characterStack.isEmpty())
                    return false;

                char characterFromStack = characterStack.pop();

                if(characters.get(c) != characterFromStack)
                    return false;
            }
        }


        return characterStack.isEmpty();
    }
}
