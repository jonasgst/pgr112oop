package org.pgr112.lesson7;

import java.awt.*;

public abstract class AbstractShape {

    private boolean isFilled;
    protected Color color;

    public abstract boolean isFilled();

    public abstract Color getColor();
}
