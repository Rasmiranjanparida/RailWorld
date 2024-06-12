package interfaces;

public class normalInterface {
	public static void main(String[] args) {
		 new rectangle().draw();
		 new trangle().draw();
	}

}

interface Drawable {
	void draw();
}
class rectangle implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw rectangle");
		
	}
	
}
class trangle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw trangle");
		
	}
	
}
