
package nundrum.net;

import java.awt.*;
import sun.awt.*;

public class TryReflect {

	public static void main(String[] args) {
		Frame frame = new Frame("test");

		ComponentAccessor acc = AWTAccessor.getComponentAccessor();

		ComponentPeer peer = acc.getPeer(frame);

		long windowID = peer.getShell();




	}
}

