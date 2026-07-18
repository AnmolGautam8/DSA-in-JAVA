class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // for(int i=0; i<s.length(); i++){
        //     int countS =0;
        //     int countT =0;
        //     for(int j=0; j<s.length(); j++){
        //         if(s.charAt(i)==s.charAt(j)){
        //             countS++;
        //         }
        //     }
        //     for(int j=0; j<t.length(); j++){
        //         if(s.charAt(i)==t.charAt(j)){
        //             countT++;
        //         }
        //     }
        //     if(countS != countT){
        //         return false;
        //     }
        // }
        // return true;

        // optimised apporach 
        int[] freq = new int[26];
        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int i =0; i<freq.length-1; i++){
            if(freq[i] !=0){
                return false;
            }
        }
        return true;
        
        
    }
}