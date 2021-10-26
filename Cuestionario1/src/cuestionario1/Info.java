/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario1;


public class Info {

    long AveragePrice;
    long Volume;
    long smallHass;
    long largeHass;
    long extraLargeHass;
    long TotalBags;

    public Info(long AveragePrice, long Volume, long smallHass, long largeHass, long extraLargeHass, long TotalBags) {
        this.AveragePrice = AveragePrice;
        this.Volume = Volume;
        this.smallHass = smallHass;
        this.largeHass = largeHass;
        this.extraLargeHass = extraLargeHass;
        this.TotalBags = TotalBags;
    }
    
   

    @Override
    public String toString() {
        return "Info{" + "AveragePrice=" + AveragePrice + ", Volume=" + Volume + ", smallHass=" + smallHass + ", largeHass=" + largeHass + ", extraLargeHass=" + extraLargeHass + ", TotalBags=" + TotalBags + '}';
    }

    public long getVolume() {
        return Volume;
    }

    public long getTotalBags() {
        return TotalBags;
    }
    
    
    
    
    
}
