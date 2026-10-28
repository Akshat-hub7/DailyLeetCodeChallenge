class Solution {

    public static boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u'){
        return true;
        }
        return false;
    }

    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        int i = 0;
        int j = sb.length()-1;
    // IceCreAm
    //  i
    //      j


        while(i < j){
            char left = sb.charAt(i);
            char right = sb.charAt(j);

            if(isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
                sb.setCharAt(i, right);
                sb.setCharAt(j, left);

                i++;
                j--;
            }

            if(!isVowel(left)){
                i++;
            }

            if(!isVowel(right)){
                j--;
            }

        }

        return sb.toString();
        
    }
}