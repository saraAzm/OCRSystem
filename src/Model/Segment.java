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
    private char OCRSystemLabel;
    private char UserLabel;
    private Boolean segmentCheck;
    private Image segmentImage;
    private Status  segmentStatus;

    public Segment(char OCRSystemLabel, char UserLabel, Boolean segmentCheck, Image segmentImage, Status segmentStatus) {
        this.OCRSystemLabel = OCRSystemLabel;
        this.UserLabel = UserLabel;
        this.segmentCheck = segmentCheck;
        this.segmentImage = segmentImage;
        this.segmentStatus = segmentStatus;
    }
    
  public Segment(){
      
  }

    public char getOCRSystemLabel() {
        return OCRSystemLabel;
    }

    public char getUserLabel() {
        return UserLabel;
    }

    public Boolean getSegmentCheck() {
        return segmentCheck;
    }

    public Image getSegmentImage() {
        return segmentImage;
    }

    public Status getSegmentStatus() {
        return segmentStatus;
    }

    public void setOCRSystemLabel(char OCRSystemLabel) {
        this.OCRSystemLabel = OCRSystemLabel;
    }

    public void setUserLabel(char UserLabel) {
        this.UserLabel = UserLabel;
    }

    public void setSegmentCheck(Boolean segmentCheck) {
        this.segmentCheck = segmentCheck;
    }

    public void setSegmentImage(Image segmentImage) {
        this.segmentImage = segmentImage;
    }

    public void setSegmentStatus(Status segmentStatus) {
        this.segmentStatus = segmentStatus;
    }

    
    
  
   
}
