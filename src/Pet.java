
public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void eat() {
		System.out.println("Давай пожрем макарон с гречкой!!!");
	}
	
	public void sleep() {
		System.out.println("Спокойной ночи человек!");
	}
	
	public String say(String aWord) {
		String petResponse = "Ну ладно!!" + aWord;
		return petResponse;
	}
}
