/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 629387
 */
public class Virus extends Sprite{
    private static final Color COLOR =new Color(70, 90, 123);
    private static final int WIDTH = 3;
    private static final int HEIGHT = 3;
    private static final int SPEED = 0;

    public Virus (int x, int y) {
        super(SPEED, x, y, WIDTH, HEIGHT, COLOR);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.drawOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
