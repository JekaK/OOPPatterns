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
        Glyph glyph =  hashMap.get(glyphCode);
        if (glyph == null) {
            switch (upperGlyph) {
                case 'A': {
                    glyph = new SampleGlyph('A');
                    break;
                }
                case 'B': {
                    glyph = new SampleGlyph('B');

                    break;
                }
                case 'C': {
                    glyph = new SampleGlyph(glyphCode);

                    break;
                }
                default: {
                    glyph = new SampleGlyph(glyphCode);

                }
            }
            hashMap.put(glyphCode, glyph);
            System.out.println("Creating glyph of character : " + glyphCode);
        }
        return glyph;
    }
}
