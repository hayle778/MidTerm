package week4;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.MouseEvent;
import java.util.logging.ConsoleHandler;

import acm.graphics.GImage;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrogger extends GraphicsProgram {

	
	
	private static final int NCOLUMNS = 7;
	private static final int  SQUARE_SIZE = 74;
	private static final int NROWS = 4;
	
	public static final int APPLICATION_HEIGHT = NROWS*SQUARE_SIZE;
	public static final int APPLICATION_WIDTH = NCOLUMNS * SQUARE_SIZE;
	private double fx;
	private double fy;
	
	
	  public void run() {
		GImage frog = new GImage("frog.gif");
		 double fx = (NCOLUMNS / 2 + 0.5) * SQUARE_SIZE;
		 double fy = (NROWS - 0.5) * SQUARE_SIZE;
		 add(frog, fx - frog.getWidth() / 2,
	     fy - frog.getHeight() / 2);
		 addMouseListeners();
	
	}	
	
	  private void moveFrog(double dx, double dy) {
		  if (insideFroggerWorld(fx + dx, fy + dy)) {
		  fx += dx;
		  fy += dy;
	
		  moveFrog(dx, dy);
		  }
		  }

	 
	  public void mouseClicked(MouseEvent e) {
		  double mx = e.getX();
		  double my = e.getY();
		  if (Math.abs(mx - fx) > Math.abs(my - fy)) {
		  if (mx > fx) {
		  moveFrog(SQUARE_SIZE, 0);
		  } else {
		  moveFrog(-SQUARE_SIZE, 0);
		  }
		  } else {
		  if (my > fy) {
		  moveFrog(0, SQUARE_SIZE);
		  } else {
		  moveFrog(0, -SQUARE_SIZE);
		  }
		  }
		  }
		  /* Moves the frog by dx/dy as long as it remains inside the world */
		  
		private boolean insideFroggerWorld(double x, double y) { 
			return (x >= 0 && x <= NCOLUMNS * SQUARE_SIZE && y >= 0 && y <= NROWS * SQUARE_SIZE); }








}

