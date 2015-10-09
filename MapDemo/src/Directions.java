
public enum Directions {
	N(-15, 15, "N"), NNW(16, 30, "NNW"), NW(31, 60, "NW"), NWW(61, 75, "NWW"), W(76, 105, "W");
	private int max;
	private int min;
	private String name;
	private Directions(int max, int min, String name) {
		this.max = max;
		this.min = min;
		this.name = name;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getMin() {
		return min;
	}
	
	public String toString() {
		return name;
	}
	
	public static Directions getDirection(int val) {
		for(Directions d : Directions.values()) {
			if(d.getMax() <= val && d.getMin() >= val) {
				return d;
			}
		}
		return null;
	}
}
