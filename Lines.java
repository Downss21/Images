import images.*;

public class Lines {

	public static void main(String[] args) {
		APImage image = new APImage("smokey.jpg");
		int height = image.getHeight();
		Pixel RED = new Pixel(255, 0, 0);
		Pixel GREEN = new Pixel(0, 255, 0);
		Pixel BLUE = new Pixel(0, 0, 255);
		
		for (int j = 0; j < height; j++)
		{
			image.setPixel(50, j, RED);
			image.setPixel(100, j, GREEN);
			image.setPixel(150, j, BLUE);
		}
		image.draw();
	}

}
