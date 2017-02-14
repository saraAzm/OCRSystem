/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.Image;

/**
 *
 * @author sanjab
 */
public class Plate {
    private Image plateImage;
    private Boolean readability;
    private Boolean completeness;
    private Boolean rotation;
    private Boolean smallness;
    private Color plateColor;
    private Segment[] segments;

    public Plate(Image plateImage, Boolean readability, Boolean completeness, Boolean rotation, Boolean smallness, Color plateColor, Segment sgmts[]) {
        this.plateImage = plateImage;
        this.readability = readability;
        this.completeness = completeness;
        this.rotation = rotation;
        this.smallness = smallness;
        this.plateColor = plateColor;
        this.segments = sgmts;
    }
    public Plate(){
        
    }

    public Image getPlateImage() {
        return plateImage;
    }

    public Boolean getReadability() {
        return readability;
    }

    public Boolean getCompleteness() {
        return completeness;
    }

    public Boolean getRotation() {
        return rotation;
    }

    public Boolean getSmallness() {
        return smallness;
    }

    public Color getPlateColor() {
        return plateColor;
    }

    public Segment[] getSegments() {
        return segments;
    }

    public void setPlateImage(Image plateImage) {
        this.plateImage = plateImage;
    }

    public void setReadability(Boolean readability) {
        this.readability = readability;
    }

    public void setCompleteness(Boolean completeness) {
        this.completeness = completeness;
    }

    public void setRotation(Boolean rotation) {
        this.rotation = rotation;
    }

    public void setSmallness(Boolean smallness) {
        this.smallness = smallness;
    }

    public void setPlateColor(Color plateColor) {
        this.plateColor = plateColor;
    }

    public void setSegments(Segment[] segments) {
        this.segments = segments;
    }


    
  
}


