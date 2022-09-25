public class CarPrice {
    public int ncp;
     public int gasprice;
    public int  milespy;
   // private double effi;
    public int revalue;
    public double effi;
    public CarPrice( int ncp, int gasprice,int milespy,int revalue,double effi)
    {
        this.ncp=ncp;
        this.gasprice =  gasprice ;
        this. milespy=milespy;
        this.revalue= revalue;
        this.effi = effi ;
    }
    int gp;
    public  void gasPrice()
    {
        gp=  gasprice * milespy ;
    }
    double tp;
    public void totalPrice()
    {
         tp= ncp +( 5 * gp)/effi ;
    }
    public double getRemainingMoney()
    {
        return tp-revalue;
    }


}
