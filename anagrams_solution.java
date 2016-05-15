// Compiled at: http://ideone.com/pNOtNm
// Author: Tung Thanh Le
// Email: ttungl at gmail
// Date: May 15, 2016
// Description: Anagram analysis

import java.util.*;
class Ideone
{
	public static boolean permut(String s1, String s2){
 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
        if(s1==null||s2==null){
            return false;
        }
 
        if (s1.length()!=s2.length())
        {
            return false;
        }
 
        for (int i=0; i<s1.length(); i++)
        {
            int count = 1;
            char c = s1.charAt(i);
            if (map.containsKey(c)){
                int k = map.get(c); // get value
                count += k;
            }    
            map.put(c, count);
        }
 
        for(int i=0; i<s2.length(); i++){
            char c = s2.charAt(i);
            if (!map.containsKey(c)){
                return false;
            }
 
            int count = map.get(c);
            if (count==1){
                map.remove(c);
            } else {
                map.put(c,--count);
            }
        }
 
        return true;
    }   
 
    public static void Print_Unique_Anagrams(String [] strlist){
        ArrayList<String> uniqueList = new ArrayList<String>();
        ArrayList<String> uniqueListcheck = new ArrayList<String>();
        int strlen = strlist.length;
        int counter=0;
        boolean checkPointAnagram;
        for (int i=0; i<strlen-1; i++){
            for (int j=i+1; j<strlen; j++){
                counter++;
                String str11 = strlist[i].replaceAll("\\s+","");    // space-free strings
                String str21 = strlist[j].replaceAll("\\s+",""); 
                String s1 = str11.toLowerCase();                    // uppercase-free strings
                String s2 = str21.toLowerCase();
 
                checkPointAnagram = permut(s1, s2);
                if (checkPointAnagram == true){
                    if (!uniqueListcheck.isEmpty())
                    {
                        for (String eachOne : uniqueListcheck){                            
                            boolean checkunique = permut(s1, eachOne); 
                            if (!s1.equals(eachOne) && (checkunique==false)){
                                uniqueList.add(strlist[i]);
                            } 
                        }
 
                    } else {
                        uniqueListcheck.add(s1);
                        uniqueList.add(strlist[i]);
                    }
                } 
            }
        }
        System.out.println("Unique list: "+uniqueList);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		String [] strs = { "Aaagmnrs", "TopCoder", "anagrams", "Drop Cote"};
	        String [] strs1 = { "SnapDragon vs tomek", "savants groped monk", "Adam vents prongs ok" };
	        String [] strs2 = { "Radar ghost jilts Kim", "patched hers first", "DEPTH FIRST SEARCH", "DIJKSTRAS ALGORITHM" };
	        Print_Unique_Anagrams(strs);
	        Print_Unique_Anagrams(strs1);
	        Print_Unique_Anagrams(strs2);
	}
}
