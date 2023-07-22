import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {

        String str= "Mama";
        char target='a';
        System.out.println(stringsearch(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));

    }

    static boolean stringsearch(String str, char target){
        if(str.length()==0){
            return false;
        }

        for (char ch:str.toCharArray()
             ) {
            if(ch==target)
                return true;
            
        }
        return false;

    }
}
