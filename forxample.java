public class For {
    public static void main(String[] args){
        int i;
        for(i=0;i<=10;i++){
            System.out.println("LOOP "+ i +" HELLO");
        }
        System.out.println(+i);
        double amnt= 10000.0;

        for(double irate=1.0;irate<=8;irate++) {
            calcamnt(10000.0,irate);
        }
    }
    public static double calcamnt(double x,double y){
        double total=x*(y/100);
        double z=x+total;

        System.out.println(y+" intrest for 10000 is " +total+"and total amount is"+z);
        return z ;
    }

}
