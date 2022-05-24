public class Turista extends Thread
{
    private Museo museoDaVisitare;

    public Turista(String nome, Museo museoDaVisitare)
    {
        super(nome);
        this.museoDaVisitare = museoDaVisitare;
    }

    @Override
    public void run()
    {
        int tempoDaAspettare = (int)((Math.random()*10) + 1) * 1000;
        try {
            museoDaVisitare.entrata();
            System.out.println(Thread.currentThread().getName() + " è entrato nel museo");
            Thread.sleep(tempoDaAspettare);
            museoDaVisitare.uscita();
            System.out.println(Thread.currentThread().getName() + " è uscito dal museo");
        } catch (Exception e) {}
    }
}
