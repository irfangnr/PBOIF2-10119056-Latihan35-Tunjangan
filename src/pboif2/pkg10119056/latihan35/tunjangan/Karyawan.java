/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan35.tunjangan;

/**
 *
 * @author ACER
 */
public class Karyawan{
        public String status;
        public int gajiPokok;
        private double tunjangan,totalGaji;
        
        public double tunjangan(){
            if("Menikah".equals(status)){
                tunjangan = 0.35 * gajiPokok;
            }else{
                tunjangan=0;
            }
                return tunjangan;
            }
        
        public double totalGaji(){
            return totalGaji=gajiPokok + tunjangan;
            }
}

