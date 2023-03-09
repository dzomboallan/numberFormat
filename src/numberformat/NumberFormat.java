/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberformat;

/**
 *
 * @author hunnytaggy
 */
import java.text.DecimalFormat;
public class NumberFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number = 4376.7863;
        
        DecimalFormat df1 = new DecimalFormat("###,##0.0#");
        DecimalFormat df2 = new DecimalFormat("###000.00");
        DecimalFormat df3 = new DecimalFormat("00.0");
        DecimalFormat df4 = new DecimalFormat("000000.00000");
        DecimalFormat df5 = new DecimalFormat("000,000.00####");
        
        System.out.println(df1.format(number));
        System.out.println(df2.format(number));
        System.out.println(df3.format(number));
        System.out.println(df4.format(number));
        System.out.println(df5.format(number));
    }
    
}
