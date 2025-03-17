//Complexity Type	Value
//Time Complexity	O(n)
//Space Complexity	O(n)
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Isomorphic_naive{
    public static boolean isIsomrphic (String s1,String s2){
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        
        for(int i=0;i<s1.length();++i){
            if(!m1.containsKey(s1.charAt(i))){
                m1.put(s1.charAt(i),i);
            }
            if(!m2.containsKey(s2.charAt(i))){
                m2.put(s2.charAt(i),i);
            }
            if(!m1.get(s1.charAt(i)).equals (m2.get(s2.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=sc.next();
        System.out.println("Enter String 2:");
        String s2=sc.next();
        System.out.println(isIsomrphic(s1,s2));
    }
}