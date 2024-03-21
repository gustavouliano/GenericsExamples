package generics.exemplo2;

import java.util.List;

public class Utils {

	public static <T> int findIndexOfElement(List<T> list, T target) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
}
