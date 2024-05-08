package colecoes.mapas;

import java.util.Map;
import java.util.HashMap;

class debugger2 {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();

        if(s == t){
            return true;
        }

        Map<Character, Integer> mapT = new HashMap<Character, Integer>();

        for(char testeS : charArray){
            if(mapT.containsKey(testeS)){
                return true;
            }
            mapT.put(testeS, 1);
        }

        return false;
        
    }
    public static void main(String[] args){
        debugger2 d = new debugger2();
        
        System.out.println(d.isAnagram("a", "a"));
    }
}