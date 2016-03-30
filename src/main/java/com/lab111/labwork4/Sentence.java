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
        Font font = new Font("Italic", Font.CENTER_BASELINE, 10);
        Font bigfont = font.deriveFont(AffineTransform.getScaleInstance(11.0, 11.0));

        int stepX = 100;
        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isAlphabetic(sentence.charAt(i))) {
                System.out.println("Character: " + sentence.charAt(i));
                g2.setColor(Color.black);
                GlyphVector gv = bigfont.createGlyphVector(g2.getFontRenderContext(), String.valueOf(sentence.charAt(i)));
                g2.drawGlyphVector(gv, (float) count, (float) 150);
                count += stepX;
                continue;
            }
            SampleGlyph glyph = (SampleGlyph) GlyphFactory.getGlyph(sentence.charAt(i));

            if (count == 0) {
                glyph.setX(10);
                count += stepX;
            } else {
                glyph.setX(count);
                count += stepX;
            }
            glyph.print();
            /*
               Just paint a glyph
               Use standard library for glyphs but paint my own glyphs
             */
            if (glyph != null) {
                g2.setColor(glyph.getColor());
                GlyphVector gv = bigfont.createGlyphVector(g2.getFontRenderContext(), String.valueOf(glyph.getSymbol()));
                g2.drawGlyphVector(gv, (float) glyph.getX(), (float) glyph.getY());
            }
        }
        count = 0;
    }
}
