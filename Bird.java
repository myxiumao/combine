package courstest;


public class Bird {
	private Animal animal;
	
	public Bird() {	}
	
	public Bird(Animal animal) {
		this.animal = animal;
	}
	
	public void breath() {
		animal.breath();
		
	}

}
