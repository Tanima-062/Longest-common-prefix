package LongestCommonPrefix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] {"dog","racecar","car"};
		
		String prefix="";
		
		int index = 0, flag = 0;
		while(flag != -1 && strs.length > 0) {
			flag = 0;
			for(int i=0; i < strs.length; i++) {
				if(index == strs[i].length()) {
					flag = -1;
					break;
				}
				else if(strs[0].charAt(index) != strs[i].charAt(index)) {
					flag = 1;
				}else if(strs[0].charAt(index) == strs[i].charAt(index)) {
					int newIndex = index-1;
					while(newIndex >= 0) {
						if(strs[0].charAt(newIndex) != strs[i].charAt(newIndex)){
							flag = 1;
						}
						newIndex--;
					}
				}
			}
			if(flag == 0) {
				prefix=prefix+strs[0].charAt(index);
			}
			index++;
		}
		System.out.print("\""+prefix+"\"");
	}

}
