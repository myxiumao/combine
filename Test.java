package courstest;

public class Test {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird(animal);
		bird.breath();
	}

}
