package com.lab111.labwork4;

import javax.swing.*;
import java.awt.*;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;


/**
 * Created by kruku on 28.03.2016.
 */

/**
 * Client
 */
public class Sentence extends JFrame {
    private String sentence;
    private int count = 0;

    /**
     * Create window  and set param
     *
     * @param s sets local sentence param
     */
    public Sentence(String s) {
        super();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        sentence = s;
    }

    /**
     * Overrided method from supperclass with draw logic
     *
     * @param g from awt context
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;


        int stepX = 100;
        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isAlphabetic(sentence.charAt(i))) {
                System.out.println("Character: " + sentence.charAt(i));
                g2.setColor(Color.black);
                Font font = new Font("Italic", Font.CENTER_BASELINE, 10);
                Font bigfont = font.deriveFont(AffineTransform.getScaleInstance(11.0, 11.0));
                GlyphVector gv = bigfont.createGlyphVector(g2.getFontRenderContext(), String.valueOf(sentence.charAt(i)));
                g2.drawGlyphVector(gv, (float) count, (float) 150);
                count += stepX;
                continue;
            }
            Glyph glyph = GlyphFactory.getGlyph(sentence.charAt(i));
            AllState context = new AllState();
            context.setY(150);
            context.setColor(Color.RED);
            if (count == 0) {
                context.setX(10);
                count += stepX;
            } else {
                context.setX(count);
                count += stepX;
            }
            glyph.print(context);
            /*
               Just paint a glyph
               Use standard library for glyphs but paint my own glyphs
             */
            if (glyph != null) {
                Font  font = new Font("Italic", Font.HANGING_BASELINE, 10);
                Font bigfont = font.deriveFont(AffineTransform.getScaleInstance(11.0, 11.0));

                g2.setColor(context.getColor());
                GlyphVector gv = bigfont.createGlyphVector(g2.getFontRenderContext(), String.valueOf(glyph.getSymbol()));
                g2.drawGlyphVector(gv, (float) context.getX(), (float) context.getY());
            }
        }
        count = 0;
    }
}
