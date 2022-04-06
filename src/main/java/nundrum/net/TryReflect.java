
package nundrum.net;

import static java.lang.System.out;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.awt.*;
import java.awt.peer.ComponentPeer;
import java.awt.peer.*;
import sun.awt.AWTAccessor.ComponentAccessor;
import sun.awt.*;
import sun.awt.X11.*;

public class TryReflect {

	public static void main(String[] args) {
		Frame frame = new Frame("test");

		frame.setVisible(true);
		frame.setVisible(false);

		ComponentAccessor acc = AWTAccessor.getComponentAccessor();

		ComponentPeer peer = acc.getPeer(frame);

		Class pc = peer.getClass();
		try {
			Method gs = pc.getMethod("getShell",null); gs.setAccessible(true);
			Object o = gs.invoke(peer);
			out.format("Got ID %d", (long) o);
		} 
		catch (NoSuchMethodException x) { x.printStackTrace(); }
		catch (IllegalAccessException x) { x.printStackTrace(); }
		catch (InvocationTargetException x) { x.printStackTrace(); }

		//long windowID = peer.getShell();




	}
}

