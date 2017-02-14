/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author sanjab
 */
public class OCR {
    private String OCRSystemResult;
    private String OCRUserResult;
    private Boolean segmentCheck[];
    private String segmentImage[];
    private Status  segmentStatus[];

    public OCR(String OCRSystemResult, String OCRUserResult, Boolean[] segmentCheck, String[] segmentImage, Status[] segmentStatus) {
        this.OCRSystemResult = OCRSystemResult;
        this.OCRUserResult = OCRUserResult;
        this.segmentCheck = segmentCheck;
        this.segmentImage = segmentImage;
        this.segmentStatus = segmentStatus;
    }
    
  

    public String getOCRSystemResult() {
        return OCRSystemResult;
    }

    public String getOCRUserResult() {
        return OCRUserResult;
    }

    public Boolean[] getSegmentCheck() {
        return segmentCheck;
    }

    public String[] getSegmentImage() {
        return segmentImage;
    }

    public Status[] getSegmentStatus() {
        return segmentStatus;
    }

    public void setOCRSystemResult(String OCRSystemResult) {
        this.OCRSystemResult = OCRSystemResult;
    }

    public void setOCRUserResult(String OCRUserResult) {
        this.OCRUserResult = OCRUserResult;
    }

    public void setSegmentCheck(Boolean[] segmentCheck) {
        this.segmentCheck = segmentCheck;
    }

    public void setSegmentImage(String[] segmentImage) {
        this.segmentImage = segmentImage;
    }

    public void setSegmentStatus(Status[] segmentStatus) {
        this.segmentStatus = segmentStatus;
    }
   
    
  
   
}
