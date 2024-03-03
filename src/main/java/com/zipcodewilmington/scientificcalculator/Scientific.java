package com.zipcodewilmington.scientificcalculator;
import java.lang.String;

public class Scientific {
        private int value;
        private String con;

        public Scientific() {
                this.value = 0;
                this.con = "";
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

        public String octCon () {

                this.con = Integer.toBinaryString(this.value);

                return this.con;
        }

        public String decCon() {

                this.con = Integer.toOctalString(this.value);

                return this.con;
        }

        public String hexCon() {

                this.con = Integer.toBinaryString(this.value);

                return this.con;
        }
}



