
/*

Demo test cases:

Test Case 1:
Input: Hello this is {Core} 1JAVA1
OutPut: si siht olleH {Core} 1JAVA1

Test Case 2:
Input: {Hello} i am Goutamraj $Sahu$
OutPut: jarmatuoG ma i {Hello} $Sahu$

Test Case 3:
Input: This (is) an %Animal%
OutPut: na sihT (is) %Animal%

Test Case 4:
Input: I am Goutamraj
OutPut: jarmatuoG ma I

*/



import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer strToken = new StringTokenizer(str);
        ArrayList<String> tokens = new ArrayList<>();

        ArrayList<String> withoutSpecial = new ArrayList<>();
        ArrayList<String> withSpecial = new ArrayList<>();

        while(strToken.hasMoreTokens()){
            tokens.add(strToken.nextToken());
        }

        for(int i = 0; i<tokens.size(); i++){
            if(Character.isAlphabetic(tokens.get(i).charAt(0))){
                withoutSpecial.add(tokens.get(i));
            }else{
                withSpecial.add(tokens.get(i));
            }
        }

        String opStr = "";
        String opStrRev = "";
        for(String ele: withoutSpecial){
            opStr += ele+" ";
        }

        for(int i = opStr.length()-1; i>=0; i--){
            opStrRev += opStr.charAt(i);
        }
        opStrRev = opStrRev.substring(1,opStrRev.length());

        String SpecialOpStr = "";
        for(int i = 0; i<withSpecial.size(); i++){
            SpecialOpStr+= withSpecial.get(i)+" ";
        }
        System.out.println(opStrRev+" "+SpecialOpStr);
    }
}