package com.lab111.labwork4;

import java.awt.*;
import java.util.HashMap;

/**
 * Created by kruku on 28.03.2016.
 */

/**
 * Flyweight Factory
 */
public class GlyphFactory {
    /**
     * Alphabet for glyphs
     */
    private static final HashMap<Character, Glyph> hashMap = new HashMap<Character, Glyph>();

    /**
     * @param glyphCode code of letter
     * @return sample glyph of letter
     */
    public static Glyph getGlyph(char glyphCode) {
        char upperGlyph = Character.toUpperCase(glyphCode);
        SampleGlyph glyph = (SampleGlyph) hashMap.get(glyphCode);
        if (glyph == null) {
            switch (upperGlyph) {
                case 'A': {
                    glyph = new SampleGlyph('A');
                   /* glyph.setY(120);
                    glyph.setColor(Color.RED);*/
                    break;
                }
                case 'B': {
                    glyph = new SampleGlyph('B');
                   /* glyph.setY(160);
                    glyph.setColor(Color.green);*/
                    break;
                }
                case 'C': {
                    glyph = new SampleGlyph(glyphCode);
                    /*glyph.setY(140);
                    glyph.setColor(Color.BLUE);*/
                    break;
                }
                default: {
                    glyph = new SampleGlyph(glyphCode);
                    /*glyph.setY((int) (Math.random() * 30 + 150));
                    glyph.setColor(new Color((int) (Math.random() * 0x1000000)));*/
                }
            }
            hashMap.put(glyphCode, glyph);
            System.out.println("Creating glyph of character : " + glyphCode);
        }
        return glyph;
    }
}
