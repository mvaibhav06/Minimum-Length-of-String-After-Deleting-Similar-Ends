public class MinLength {
    public static int minimumLength(String s){
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if(s.charAt(i) == s.charAt(i+1)){
                if(i+1 == j){
                    return 0;
                }
                i++;
            }else if(s.charAt(j) == s.charAt(j-1)){
                j--;
            }else if(s.charAt(i) == s.charAt(j)){
                s = s.substring(i+1, j);
                i = 0;
                j = s.length()-1;
            }else{
                break;
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(minimumLength("cabaabac"));
    }
}
