
public class MapDemo {
	public static void main(String[] args) {
		Directions d = Directions.getDirection(Integer.parseInt(args[0]));
		if(d == Directions.NW) {
			System.err.println("Its NW!!!!!");
		} else {
			System.out.println(d.toString());
		}
	}
	
}
