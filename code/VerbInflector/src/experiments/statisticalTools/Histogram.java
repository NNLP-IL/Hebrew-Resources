package statisticalTools;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;


public class Histogram {

	private ArrayList<String> sampels;
	private HashMap<String, Integer> histogramTable;
	private int totalInstances;


	public Histogram(List<String> sampels){
		this.sampels = new ArrayList<String>();
		this.histogramTable = new HashMap<String, Integer>();
		for(String s : sampels){
			this.sampels.add(s);
			this.addOne(s);
		}
	}

	public void addOne(String s){
		this.totalInstances++;
		if(!this.histogramTable.containsKey(s)){
			this.histogramTable.put(s, 1);
		} else{
			this.histogramTable.put(s, this.histogramTable.get(s)+1);
		}
	}
	
	public void add(String s, int times){
		this.totalInstances += times;
		if(!this.histogramTable.containsKey(s)){
			this.histogramTable.put(s, times);
		} else{
			this.histogramTable.put(s, this.histogramTable.get(s)+times);
		}
	}
	
	public double getClassProbibility(String className){
		if (!this.histogramTable.containsKey(className)){
			return 0;
		} else{
			return (double)this.histogramTable.get(className)/(double)this.totalInstances;
		}
	}

	public String toString(){
		String ret = new String("");
		for(String k : this.histogramTable.keySet()){
			ret += k + ", " + this.histogramTable.get(k) + "\n";
		}
		return ret;
	}

	public void plotToPNG(String pathAndName, String pngHeadline){
		try {
			int strokeSize = 3;
			int pictureOutlineStrokeSize = 5;
			int padding = 50;
			int width = 500 + padding*2;
			int height = 300 + padding*2;
			int histSize = this.histogramTable.size();
			Integer[] originalData = new Integer[histSize];
			int spaceBetweenPoints = (width-padding*2)/(originalData.length);
			this.histogramTable.values().toArray(originalData);
			Arrays.sort(originalData);
			Integer[] scaledData = new Integer[histSize];
			this.histogramTable.values().toArray(scaledData);
			Arrays.sort(scaledData);
			
			// Scaling the data
			if(scaledData[scaledData.length-1]!=0){
				for(int i=0; i<scaledData.length; i++){
					scaledData[i] = scaledData[i]*(height-padding*2)/scaledData[scaledData.length-1];
				}
			}
			BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			
			// Drawing the data
			Graphics2D g2d = bi.createGraphics();
			Rectangle2D bkgrnd = new Rectangle(pictureOutlineStrokeSize,pictureOutlineStrokeSize,width-pictureOutlineStrokeSize*2,height-pictureOutlineStrokeSize*2);
			g2d.setColor(Color.WHITE);
			g2d.fill(bkgrnd);
			g2d.setColor(Color.BLACK);
			g2d.setStroke(new BasicStroke(pictureOutlineStrokeSize));
			g2d.draw(bkgrnd);
			int nPoints = scaledData.length;//+2;
			int[] xPoints = new int[nPoints];
			int[] yPoints = new int[nPoints];
			for(int i=scaledData.length-1; i>=0; i--){
				xPoints[i] = padding + (scaledData.length-1-i)*spaceBetweenPoints;
				yPoints[i] = height - padding - scaledData[i];
			}
			for(int i=0; i<xPoints.length;i++){
				Rectangle rect = new Rectangle(xPoints[i],yPoints[i],spaceBetweenPoints,height-yPoints[i]-padding);
				g2d.setColor(Color.BLUE);
				g2d.fill(rect);
			}
			if (spaceBetweenPoints>6){
				for(int i=0; i<xPoints.length; i++){
					g2d.setColor(Color.BLACK);
					g2d.setStroke(new BasicStroke(strokeSize));
					g2d.drawLine(xPoints[i], yPoints[i], xPoints[i]+spaceBetweenPoints, yPoints[i]);
					g2d.drawLine(xPoints[i]+spaceBetweenPoints, yPoints[i], xPoints[i]+spaceBetweenPoints, height-padding);
				}
			}
			
			// Drawing the axis
			int axisSize = 3;
			Rectangle xLine = new Rectangle(padding, height-padding, width-padding*2, axisSize);
			Rectangle yLine = new Rectangle(padding, padding, axisSize, height-padding*2);
			g2d.setColor(Color.BLACK);
			g2d.fill(xLine);
			g2d.fill(yLine);
			
			// Lines Definitions
			int fontSize = 12;
			g2d.setFont(new Font("Goudy Handtooled BT", Font.PLAIN, fontSize));
			float dash1[] = {10.0f};
			BasicStroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, dash1, 0);
			g2d.setColor(Color.RED);
			g2d.setStroke(dashed);
			
			// Quantity lines
			int spaceBetweenQuantityLines = 50;
			int stringSpaceFromY = 15;
			g2d.drawString(""+0, padding - fontSize - stringSpaceFromY,height - padding);
			double numberOfQLines = (double)(height-padding*2)/spaceBetweenQuantityLines;
		    double yq = (double)(originalData[originalData.length-1]/numberOfQLines);
		    double deltayq = yq;
			for (int i=spaceBetweenQuantityLines; i<scaledData[scaledData.length-1]+spaceBetweenQuantityLines; i+=spaceBetweenQuantityLines){
				int y = height - padding - i;
				Line2D.Double dashedLine = new Line2D.Double(padding, y,width-padding, y); 
				g2d.draw(dashedLine);
				g2d.drawString(""+(int)yq, padding-fontSize-stringSpaceFromY, y);
				yq += deltayq;
			}
			
			// X lines
			int spaceBetweenXLines = Math.max(50, spaceBetweenPoints);
			int stringSpaceFromX = 15;
			g2d.drawString(""+0, padding , height - padding + stringSpaceFromX);
		    int start = 0;
		    int currPos = 0;
		    int xCounter = 0; 
			while(currPos+start<=width-2*padding){
				if (currPos>=spaceBetweenXLines){
					int x = padding + currPos + start;
					Line2D.Double dashedLine = new Line2D.Double(x, height-padding,x, padding); 
					g2d.draw(dashedLine);
					g2d.drawString(""+xCounter, x , height - padding + stringSpaceFromX);
					start += currPos; 
					currPos = 0;
				} else{
					xCounter++;
					currPos += spaceBetweenPoints;
				}
			}
			
			//Histogram PNG Headline
			int headlineFontSize = 20;
			g2d.setColor(Color.BLACK);
			g2d.setFont(new Font("Goudy Handtooled BT", Font.BOLD, headlineFontSize));
			g2d.drawString(pngHeadline,padding,padding*2/3);
			
			ImageIO.write(bi, "PNG", new File(pathAndName));
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
