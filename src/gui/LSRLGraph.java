package gui;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.paint.Color;
import math.*;

/**
 * @author Alek
 * @version 5/17/2016
 */
public class LSRLGraph extends Scene {

    private LSRLLine line;
    private Data stats;

    public LSRLGraph(Parent root, LSRLLine l, Data s) {
        super(root, 250, 250);
        line = l;
        stats = s;
        setFill(Color.FIREBRICK);
    }
}
