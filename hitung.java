class hitung {
	public static void main(String[] args) {
		int nilai = 89;
		if(nilai >= 86 && nilai <= 100 ){
			System.out.println("A");
		}else if(nilai >= 70 && nilai <= 85){
			System.out.println("B");
		}else if (nilai >= 56 && nilai <= 69){
			System.out.println("C");
		}else if (nilai >= 41 && nilai <= 45){
			System.out.println("D");
		}else if (nilai >= 0 && nilai <= 40){
			System.out.println("E");
		}else{
			System.out.println("Error");
		}
	}
}