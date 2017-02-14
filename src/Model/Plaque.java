/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sanjab
 */
public class Plaque {
    private String plaqueImage;
    private Boolean readability;
    private Boolean completeness;
    private Boolean rotation;
    private Boolean smallness;
    private Color plaqueColor;
    private OCR plaqueOCR;

    public Plaque(String plaqueImage, Boolean readability, Boolean completeness, Boolean rotation, Boolean smallness, Color plaqueColor, OCR plaqueOCR) {
        this.plaqueImage = plaqueImage;
        this.readability = readability;
        this.completeness = completeness;
        this.rotation = rotation;
        this.smallness = smallness;
        this.plaqueColor = plaqueColor;
        this.plaqueOCR = plaqueOCR;
    }
    
    public String getPlaqueImage() {
        return plaqueImage;
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

    public Color getPlaqueColor() {
        return plaqueColor;
    }

    public OCR getPlaqueOCR() {
        return plaqueOCR;
    }

    public void setPlaqueImage(String plaqueImage) {
        this.plaqueImage = plaqueImage;
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

    public void setPlaqueColor(Color plaqueColor) {
        this.plaqueColor = plaqueColor;
    }

    public void setPlaqueOCR(OCR plaqueOCR) {
        this.plaqueOCR = plaqueOCR;
    }
    
  
}


