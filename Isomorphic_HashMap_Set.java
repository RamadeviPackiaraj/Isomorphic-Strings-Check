import java.util.HashMap;
import java.util.HashSet;
public class Isomorphic_HashMap_Set{
    public static boolean isIsomorphic(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
       //character mapping from s1 to s2
        HashMap<Character,Character> m1=new HashMap<>();
        //keeps track of characters in s2 that are already mapped
        HashSet<Character> set2=new HashSet<>();
       /*i	c1 (s1[i])	c2 (s2[i])	m1 (Mapping)	set2 (Used Chars)	Result
0	'e'	'a'	{'e' → 'a'}	{'a'}	✅ Valid
1	'g'	'd'	{'e' → 'a', 'g' → 'd'}	{'a', 'd'}	✅ Valid
2	'g'	'd'	{'e' → 'a', 'g' → 'd'}	{'a', 'd'}	✅ Valid
*/
for(int i=0;i<s1.length();i++){
    char c1=s1.charAt(i),c2=s2.charAt(i);
    //if c1 is already mapped
    if(m1.containsKey(c1)){
        //check if its maps to the current character in s2
        if(m1.get(c1)!=c2) return false;
    }else{
        if(set2.contains(c2)) return false;
        m1.put(c1,c2);
        set2.add(c2);
    }
}
return true;
    }
        public static void main(String[] args) {
        System.out.println(isIsomorphic("aab", "xxy") ? "True" : "False");
}
}