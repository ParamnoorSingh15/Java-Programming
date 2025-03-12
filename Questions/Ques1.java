package Questions;


public class Ques1 {
	
	public static class Area{
		
		int length;
		int breadth;
		
		public Area(int length, int breadth){
			this.length = length;
			this.breadth = breadth;
		}


		public void setDim(int length, int breadth) {
			this.length = length;
			this.breadth = breadth;
		}

		public void getArea() {
			System.out.printf("%d", length*breadth);
		}
		
	}

	public static void main(String[] args) {
		Area ar = new Area(10,20);
		ar.setDim(10, 20);
		ar.getArea();

	}
}