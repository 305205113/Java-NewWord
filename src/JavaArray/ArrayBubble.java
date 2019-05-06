package JavaArray;

public class ArrayBubble {
	public static void main(String[] args) {
		int array[] = {15,4,53,25,532,56,34,673,938};
		int temp = 0;
		//Ã°ÅİÅÅĞò
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){
				if (array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int total = 0;
		for (int i = 0;i < array.length;i++){
			System.out.println(array[i]);
			total += array[i];
		}
		System.out.println(total);
		
		//Ñ¡ÔñÅÅĞò
		//15,4,53,25,532,56,34,673,938
		
		
		for (int i = 0;i < array.length;i++){
			int index = i;
			for (int j = index+1;j < array.length;j++){
				if (array[index] > array[j]){
					index = j;
				}
			}		
			if (index != i){
				temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
		for (int i = 0; i < array.length;i++){
			System.out.println("******"+array[i]);
		}
		
	}
}
