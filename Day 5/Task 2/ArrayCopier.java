class ArrayCopier{
	//int[] src = new int[4];
	//int[] dst = new int[4];
	//int[] result = new int[4];
	
	public static void main(String[] args){
		
		ArrayCopier AC = new ArrayCopier();
			
		AC.begin();
	}
	
	public void begin() {
		
		int[] src = {1,2,3,4};
		int[] dst = new int[4];
		
		if(src.length > dst.length){
			
			
		}else if(dst.length > src.length){
			
			
			
		}
		
		int[] result = new int[4];
		result = copy(src, dst);
		
		printArray(result);
		
		
	}
	public int[] copy(int[] src, int[] dst){
		
		
		for (int i= 0; i <= src.length - 1; i++){
			
			dst[i] = src[i];
			
		}
		
		return dst;
			
	}
	
	private void printArray(int[] array){
		
		
		for (int j = 0; j < array.length; j++){
			
			System.out.print(array[j]);
			
		}
		
		
	}
	
	
	
	
	
	
	
}