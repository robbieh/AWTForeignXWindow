# AWTForeignXWindow
Using an existing window with AWT (experimental; not working yet)

# What I'm trying to do

In `sun.awt.X11.XBaseWindow`, it creates a new window with a call to native `XCreateWindow`.

I'm trying to inject a window ID there instead of making that call. And to do that, I'm trying to extend the classes in this tree:

```
sun.awt.X11.XBaseWindow
    sun.awt.X11.XWindow
        sun.awt.X11.XComponentPeer
            sun.awt.X11.XCanvasPeer
                sun.awt.X11.XPanelPeer
                    sun.awt.X11.XWindowPeer
```

# Build it
```
mvn compile
```


