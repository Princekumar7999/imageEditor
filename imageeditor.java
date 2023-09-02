
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.image.ImagingOpException;
import java.awt.image.RenderedImage;

import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;

import java.awt.*;

public class imageeditor {
    
     /* public static BufferedImage convertToGrayScale(BufferedImage inputImage){
      int height = inputImage.getheight();
      int width = inputImage.getwidth();
      BufferedImage outputImage = new BufferedImage(width, height,
      BufferedImage.TYPE_BYTE_GRAY);
      for(int i=0;i<height;i++){
      for(int j=0;j<width;j++){
      outputImage.setRGB(j, i, inputImage.getRGB(j,i));
      
     }
      }
      return(outputImage);
    }
     
    public static BufferedImage changeBrightness(BufferedImage inputImage, int increase){
    int height = inputImage.getHeight();
    int width = inputImage.getWidth();
    BufferedImage outputImage = new BufferedImage(width,height,BufferedImage.TYPE_3BYTE_BGR);
    for(int i=0;i<height;i++){
        for(int j=0;j<width;j++){
            Color pixel = new Color(inputImage.getRGB(j,i));
            int red=pixel.getRed();
            int blue=pixel.getBlue();
            int green=pixel.getGreen();
            int increase;
            red=red+(increase*red)/100;
            blue=blue+(increase*blue/100);
            green=green+(increase*green)/100;
            if(red>255) red=255;
            if(blue>255) blue=255;
            if(green>255) green=255;
            if(red<0) red=0;
            if(blue<0) blue=0;
            if(green<0) green=0;
            Color newPixel = new Color(red,green,blue);
            outputImage.setRGB(j,i,newPixel.getRGB());
        }
    }
    return(outputImage);
}

    
     public static void printPixelValues(BufferedImage inputImage){
      int height = inputImage.getHeight();
      int width = inputImage.getWidth();
     for(int i=0; i<height; i++){
     for(int j=0; j<width; j++){
      //System.out.print(inputImage.getRGB(j,i) + " ");
      color pixel = new color(inputImage.getRGB(j, i));
      System.out.print("("+pixel.getRed()+" "pixel.getBlue()+" "pixel.getGreen()+
      ")");
      // pixel.getGreen();
      }
      System.out.println();
      }
      }
     */
    /*public static BufferedImage rotateClockwise(BufferedImage inputImage){
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                outputImage.setRGB(i, j, inputImage.getRGB(j, i));
            }
        }
        return outputImage;
    }*/

  /*  public static BufferedImage rotateAntiClockwise(BufferedImage inputImage){
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                outputImage.setRGB(i, width-j-1, inputImage.getRGB(j,i));
            }
        }
        return outputImage;*/
    

    public static BufferedImage flipHorizontal(BufferedImage inputImage){
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                outputImage.setRGB(width-j-1, i, inputImage.getRGB(j, i));
            }
        }
        return outputImage;
    }   

    public static void main(String args[]){
        File inputFile = new File("image.jpg");
        
    try {
        BufferedImage inputImage = ImageIO.read(inputFile);
    //printPixelValues(inputImage);
    //BufferedImage grayScale=convertToGrayScale(inputImage);
   /*  File grayScaleImage = newFile("grayScaleImage.jpg");
    ImageIO imageIO;
    ImageIO.write(grayScale,"jpg",grayScaleImage);*/
   /*  BufferedImage changedBrightness = changeBrightness(inputImage,10);
File changedBrightnessImage = new File("changedBrightnessImage.jpg");
    ImageOutputStream changedBrightnessImage;
    ImageOutputStream changedBrightnessImage;
    ImageIO.write(changedBrightness,"jpg",changedBrightnessImage);*/
    /*BufferedImage rotatedClockwise = rotateClockwise(inputImage);
File rotateClockwise = new File("rotatedClockwise.jpg");

ImageIO.write(rotatedClockwise,"jpg",rotateClockwise);*/
   /*  BufferedImage rotatedAntiClockwise = rotateAntiClockwise(inputImage);
File rotateAntiClockwise = new File("rotatedAntiClockwise.jpg");


ImageIO.write(rotatedAntiClockwise,"jpg",rotateAntiClockwise);*/
BufferedImage flipedHorizontal = flipHorizontal(inputImage);
File flipHorizontal = new File ("flipedHorizontal.jpg");


ImageIO.write(flipedHorizontal,"jpg",flipHorizontal);

    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
}


