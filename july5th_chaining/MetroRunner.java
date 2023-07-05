class MetroRunner{
	public static void main(String[] args){
		System.out.println("Metro running in main class.....");
		Metro metro = new Metro();
		
		Metro metro1 = new Metro("blue",61323);
		System.out.println("line is :"+metro1.line);
		System.out.println("distance is :"+metro1.distance);
		
		Metro metro3 = new Metro("blue", 3422, "yashwanthapura");
		System.out.println("line is :"+metro3.line);
		System.out.println("distance is :"+metro3.distance);
		System.out.println("Strat from:"+metro3.start);
		
		Metro metro4 = new Metro("blue", 3422, "yashwanthapura", "Jalahalli Cross");
		System.out.println("line is :"+metro4.line);
		System.out.println("distance is :"+metro4.distance);
		System.out.println("Strat from:"+metro4.start);
		System.out.println("Destination is:"+metro4.destination);
		
		Metro metro5 = new Metro("green", 4561, "chikpette", "banashankri",7668);
		System.out.println("line is :"+metro5.line);
		System.out.println("distance is :"+metro5.distance);
		System.out.println("Strat from:"+metro5.start);
		System.out.println("Destination is:"+metro5.destination);
		System.out.println("Capacity is:"+metro5.capacity+"kg");
	}
}