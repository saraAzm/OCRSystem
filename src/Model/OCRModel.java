/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Enumeration;
import java.util.Vector;
import javafx.scene.image.*;

/**
 *
 * @author sanjab
 */
public class OCRModel {
    private char OCRSystemResult;
    private char OCRUserResult;
    private Boolean segmentCheck;
    private Image segmentImage;
    private Status  segmentStatus;

    public OCRModel(char OCRSystemResult, char OCRUserResult, Boolean segmentCheck, Image segmentImage, Status segmentStatus) {
        this.OCRSystemResult = OCRSystemResult;
        this.OCRUserResult = OCRUserResult;
        this.segmentCheck = segmentCheck;
        this.segmentImage = segmentImage;
        this.segmentStatus = segmentStatus;
    }
    
  public OCRModel(){
      
  }

    public char getOCRSystemResult() {
        return OCRSystemResult;
    }

    public char getOCRUserResult() {
        return OCRUserResult;
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

    public void setOCRSystemResult(char OCRSystemResult) {
        this.OCRSystemResult = OCRSystemResult;
    }

    public void setOCRUserResult(char OCRUserResult) {
        this.OCRUserResult = OCRUserResult;
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
