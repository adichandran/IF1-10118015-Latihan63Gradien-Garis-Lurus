/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan63gradiengarislurus;

/**
 *
 * @author ACER
 */
public class IF110118015Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat kd1 = new Koordinat(2, 10, 5, 7);
        Koordinat kd2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik (2,10) dan "
                + "titik (5,7) memiliki gradien sebesar "+ kd1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan "
                + "titik (3,12) memiliki gradien sebesar " + kd2.hitungGradien());
    }
    
}
