
public class ProductID {
	
	private int[] characters;
	private String code;
	
	public ProductID(String code) {
		this.characters = countChars(code);
		this.code = code;
	}

	private int[] countChars(String code) {
		int[] chars = new int[26];
		int length = code.length();
		int i = 0;
		while (i < length) {
			chars[code.charAt(i) - 'a']++;
			i++;
		}
		
		return chars;
	}
	
	public Boolean getNumConsecutive(int length) {
		Boolean ret = false;
		for (int i : this.characters) {
			if (i == length) {
				ret = true;
			}
		}
		return ret;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
