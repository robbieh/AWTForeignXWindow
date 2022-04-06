
package nundrum.net;

import java.awt.*;
import java.awt.peer.ComponentPeer;
import sun.awt.AWTAccessor.ComponentAccessor;
import sun.awt.*;

public class TryReflect {

	public static void main(String[] args) {
		Frame frame = new Frame("test");

		ComponentAccessor acc = AWTAccessor.getComponentAccessor();

		ComponentPeer peer = acc.getPeer(frame);

		long windowID = peer.getShell();




	}
}

