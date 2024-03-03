package com.zipcodewilmington.scientificcalculator;
import java.lang.String;
import java.util.Scanner;

public class Scientific {
        private int value;
        private String con;

        private double save;

        public Scientific() {
                this.value = 0;
                this.con = "";


        }

        public double getA() {
                return save;
        }

        public void setSave(double save) { this.save = save;

        }

        public int getValue() {
                return value;
        }

        public void setValue(int value) {
                this.value = value;
        }

        public String getCon (){
                return con;
        }

        public void setCon(String con) {
                this.con = con;
        }

        public String binCon(int num) {
                this.con = Integer.toBinaryString(num);
                return this.con;
        }

        public String octCon (int num1) {

                this.con = Integer.toOctalString(num1);

                return this.con;
        }

        public String decCon(int num2) {

                return this.con;
        }

        public String hexCon() {

                this.con = Integer.toHexString(this.value);

                return this.con;
        }

        public void Madd(){


        }
}



