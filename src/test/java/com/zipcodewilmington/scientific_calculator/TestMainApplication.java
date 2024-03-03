package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScienceCalc2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
//    @Test
//    public void switchDisplayModeRotate(){
//         ScienceCalc switchDisplayModeRotate = new ScienceCalc();
//         assertEquals(4,switchDisplayModeRotate.);
//    }
//    @Test
//    public void switchDisplayModeSet(){
//        ScienceCalc switchDisplayModeSet = new ScienceCalc();
//        assertEquals(4,switchDisplayModeSet.);
//    }
//    @Test
//    public void mKey(){
//        ScienceCalc mKey = new ScienceCalc();
//        assertEquals(4,mKey.);
//    }
//    @Test
//    public void mcKey(){
//        ScienceCalc mcKey = new ScienceCalc();
//        assertEquals(4,mcKey.);
//    }
//    @Test
//    public void mrcKey(){
//        ScienceCalc mrcKey = new ScienceCalc();
//        assertEquals(4,mrcKey.);
//    }
    @Test
    public void sine() {
        ScienceCalc2 sine = new ScienceCalc2();
        assertEquals(-0.9589242746631385, sine.sine(5),0.0001);
    }
    @Test
    public void cosine(){
        ScienceCalc2 cosine = new ScienceCalc2();
        assertEquals(.283662185,cosine.cosine(5) ,0.0001);
    }
    @Test
    public void tangent(){
        ScienceCalc2 tangent = new ScienceCalc2();
        assertEquals(-3.38051501,tangent.tangent(5) ,0.0001);
    }
    @Test
    public void sineD() {
        ScienceCalc2 sineD = new ScienceCalc2();
        assertEquals(.0872, sineD.sineD(5),0.0001);
    }
    @Test
    public void cosD(){
        ScienceCalc2 cosD = new ScienceCalc2();
        assertEquals(.996194698,cosD.cosD(5) ,0.0001);
    }
    @Test
    public void tanD(){
        ScienceCalc2 tanD = new ScienceCalc2();
        assertEquals(.0875,tanD.tanD(5) ,0.0001);
    }
    @Test
    public void asin(){
        ScienceCalc2 asin = new ScienceCalc2();
        assertEquals(0,asin.asin(0) ,0.0001);
    }
    @Test
    public void acos(){
        ScienceCalc2 acos = new ScienceCalc2();
        assertEquals(0,acos.acos(1) ,0.0001);
    }
    @Test
    public void atan() {
        ScienceCalc2 atan = new ScienceCalc2();
        assertEquals(1.10714872, atan.atan(2) ,0.0001);
    }
    @Test
    public void asinD(){
        ScienceCalc2 asinD = new ScienceCalc2();
        assertEquals(.017454416230255062, asinD.asinD(1) ,0.0001);
    }
    @Test
    public void acos(){
        ScienceCalc2 acos = new ScienceCalc2();
        assertEquals(0,acos.acos(1) ,0.0001);
    }
//    @Test
//    public void atan() {
//        ScienceCalc2 atan = new ScienceCalc2();
//        assertEquals(1.10714872, atan.atan(2) ,0.0001);
//    }
//    @Test
////    public void switchUnitModeRotate() {
////        ScienceCalc2 switchUnitModeRotate = new ScienceCalc2();
////        assertEquals(4, switchUnitModeRotate.);
////    }
//    @Test
//    public void switchUnitModeSet() {
//        ScienceCalc switchUnitModeSet = new ScienceCalc();
//        assertEquals(4, switchUnitModeSet.);
//    }
//    @Test
//    public void log() {
//        ScienceCalc log = new ScienceCalc();
//        assertEquals(4, log.);
//    }
//    @Test
//    public void invLog() {
//        ScienceCalc invLog = new ScienceCalc();
//        assertEquals(4, invLog.);
//    }
//    @Test
//    public void naturalLog() {
//        ScienceCalc naturalLog = new ScienceCalc();
//        assertEquals(4, naturalLog.);
//    }
//    @Test
//    public void factorial() {
//        ScienceCalc factorial = new ScienceCalc();
//        assertEquals(4, factorial.);
//    }
}
