package com.ikkerens.serverui.components;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Logo extends JLabel {
    private static final long serialVersionUID = -6800031557055577957L;

    public Logo() {
        try {
            this.setHorizontalAlignment( SwingConstants.CENTER );
            BufferedImage logo = ImageIO.read( Logo.class.getResourceAsStream( "/images/minebuilder.png" ) );
            this.setIcon( new ImageIcon( logo ) );
        } catch ( IOException e ) {
        }
    }
}