class Metro{
	String line;
	int distance;
	String start;
	String destination;
	double capacity;
	
	Metro(){
		System.out.println("Running with no arguments....");
		
	}
	
	Metro(String line,int distance){
		System.out.println("Metro running with line&distance......");
		this.line=line;
		this.distance=distance;
	}
	
	
	Metro(String line,int distance,String start){
		this(line,distance);
		System.out.println("Metro running with line, distance & start.....");
		this.start=start;
	}
	
	Metro(String line,int distance,String start,String destination){
		this(line,distance,start);
		System.out.println("Metro running with line, distance, start, destination.....");
		this.destination=destination;
	}
	
	
	
	
	Metro(String line,int distance,String start,String destination,double capacity){
		this(line,distance,start,destination);
		System.out.println("Metro running with line, distance, start, destination, capacity......");
		this.capacity=capacity;
	}
}