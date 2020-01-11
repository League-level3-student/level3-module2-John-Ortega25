package _00_Sorting_Algorithms;

public class Bird {
	public String food() {
		return "bird food";
	}

	public void play() {
		System.out.println("I am having fun eating" + food());
	}

	public void fly() {
		System.out.println("I am flying");
	}

	public static void main(String[] args) {
		Bird sadie = new Bird();
		System.out.println(sadie.food());
		sadie.play();
		sadie.fly();
		Bird charlie = new Parrot();
		System.out.println(charlie.food());
		charlie.play();
		charlie.fly();
		Parrot c2 = (Parrot) charlie;
		c2.speak();
	}
}
