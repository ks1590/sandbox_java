public class Ex_04_02 {
    public static void main(String[] args) {
	    total(generateArray(args));
    }
    
    public static int[] generateArray(String[] stringArray) {
    	int[] numberArray = new int[stringArray.length];
    	for (int i = 0; i < stringArray.length; i++) {
    		numberArray[i] = Integer.parseInt(stringArray[i]);
    	}
    	return numberArray;
    }
    
    public static void total(int[] list) {
        int total = 0;
    	for (int i = 0; i < list.length; i++) {
    	    total += list[i];
    	}
    	System.out.println(total);
    }
}
