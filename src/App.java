public class App {
    public static void main(String[] args) throws Exception
    {
       Museo m = new Museo(3);
       Turista t1 = new Turista("Pablo", m);
       Turista t2 = new Turista("Xie", m);
       Turista t3 = new Turista("Ndojone", m);
       Turista t4 = new Turista("andrea", m);

       t1.start();
       t2.start();
       t3.start();
       t4.start();
       
    }
}
