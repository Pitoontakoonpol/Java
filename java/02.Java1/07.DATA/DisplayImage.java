import java.awt.Graphics;
import java.awt.Image;
import java.applet.Applet;
import java.lang.ref.SoftReference;

public class DisplayImage extends Applet {

	SoftReference sr = null;

	public void init() {
	    System.out.println("Initializing");
	}

	public void paint(Graphics g) {
	    Image im = (sr == null) ? null : (Image)(sr.get());
	    if (im == null) {
	        System.out.println("Fetching image");
	        im = getImage(getCodeBase(), "truck1.gif");
	        sr = new SoftReference(im);
	    }
	    System.out.println("Painting");
	    g.drawImage(im, 25, 25, this);
	    im = null;        /* Clear the strong reference to the image */
	}

	public void start() {
            System.out.println("Starting");
	}

	public void stop() {
	    System.out.println("Stopping");
	}

}
