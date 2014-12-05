package de.skatescs;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Created by kai-uwe on 05.12.14.
 */
public class Main {
    public Main()
    {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
