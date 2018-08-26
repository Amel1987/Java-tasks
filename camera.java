package Exercise;

public class camera {

	public static void main(String[] args) {
			Camera remote1 = new Camera(); // camera = referenca, remote1 = varijabla reference, new Camera = novi objekt
			remote1.menu();
			
			TV remote2 = new TV();
			remote2.menu();
			
			Shirt myShirt = new Shirt();
			myshirt.display();
			
			Trousers myTrousers = new Trousers();
			myTrousers.display();

	}

}
