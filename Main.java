import images.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
    APImage reference = new APImage("smokey.jpg");
    APImage edge = new APImage(reference.getWidth(), reference.getHeight() -1);
    
    int height = reference.getHeight() - 1; //cant do the very edge of the image so this makes sure we dont
    int width = reference.getWidth(); //also calculating it now rather than each loop since it wont change
    
    System.out.print("Enter the threshold for edges: ");
    Double threshold = reader.nextDouble();
    Pixel WHITE = new Pixel(255, 255 ,255);
    Pixel BLACK = new Pixel(0, 0, 0);
    
    for (int j = 0; j < height; j++)
    {
    	for (int i = 1; i < width; i++)
    	{
    		Pixel active = reference.getPixel(i, j);
    		Pixel bottom = reference.getPixel(i, j + 1);
    		Pixel left = reference.getPixel(i + 1, j);
    		if (getLuminance(active) - getLuminance(bottom) > threshold || getLuminance(active) - getLuminance(left) > threshold)
    		{
    			edge.setPixel(i, j, BLACK);
    		}
    		else
    		{
    			edge.setPixel(i, j, WHITE);
    		}
    	}
    }
    edge.draw();
  }
  public static double getLuminance(Pixel pixel) {
	  return (pixel.getRed() + pixel.getGreen() + pixel.getBlue())/3;
  }
}