/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.*;

/**
 *
 * @author sanjab
 */
public class Segment {
    private char OCRSystemLabel; // OCRLibarary result!
    private char UserLabel;     // user guess result!
    private Boolean badSegmented; // when is bad == True, when good False!  
    private Image segmentImage;
    private Status  segmentStatus; // is correctly guessed or not!

    public Segment(char OCRSystemLabel, char UserLabel, Boolean segmentCheck, Image segmentImage, Status segmentStatus) {
        this.OCRSystemLabel = OCRSystemLabel;
        this.UserLabel = UserLabel;
        this.badSegmented = segmentCheck;
        this.segmentImage = segmentImage;
        this.segmentStatus = segmentStatus;
    }
    
  public Segment(){
      
  }

    public char getRecognize() {
        return OCRSystemLabel;
    }

    public char getLabel() {
        return UserLabel;
    }

    public Boolean getBad(){
        return badSegmented;
    }
    
    public Boolean isBad() {
        return badSegmented;
    }

    public Image getImage() {
        return segmentImage;
    }

    public Status getStatus() {
        return segmentStatus;
    }

    public void setRecognize(char OCRSystemLabel) {
        this.OCRSystemLabel = OCRSystemLabel;
    }

    public void setLabel(char UserLabel) {
        this.UserLabel = UserLabel;
    }

    public void setBad(Boolean segmentCheck) {
        this.badSegmented = segmentCheck;
    }

    public void setImage(Image segmentImage) {
        this.segmentImage = segmentImage;
    }

    public void setStatus(Status segmentStatus) {
        this.segmentStatus = segmentStatus;
    }

    
    
  
   
}
