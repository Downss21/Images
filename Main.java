import images.*;

class Main {
  public static void main(String[] args) {
    APImage image = new APImage("smokey.jpg");
		
		Pixel pixel = new Pixel (0, 0, 0);
		int x = image.getWidth();
		int y = image.getHeight();
		for (int j = 0; j < y; j++)
	{
		for (int i = 0; i < x; i++)
		{
			Pixel original = image.getPixel(i,j);
			Pixel negative = new Pixel(original.getRed() + 127, original.getGreen() + 127, original.getBlue() + 127);
			image.setPixel(i, j, negative);
		}
	}
	image.draw();
  }
}