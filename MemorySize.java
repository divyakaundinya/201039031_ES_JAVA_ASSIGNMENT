class MemorySize{
	public static void main(String args[]){
		int StartAddress = 23788;
		int EndAddress = 23898;
		int bytes = (EndAddress - StartAddress)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}