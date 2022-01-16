public class Test {

    public static String replaceCharacter(String input, char c1, char c2) {
		
		if(input.length()==0)
            return input;
		String ans = "";
        if(input.charAt(0)==c1){
            ans = ans+c2;
			input=ans+input.substring(1);
        }
        String smallAns = replaceCharacter(input.substring(1),c1,c2);
        return ans+smallAns;
    }
	public static void main(String[] args) {
		String str = "hassan";
		str=replaceCharacter(str,'s','a');
		System.out.println(str);
	}
}