/**
 * Questo oggetto rappresenta un museo che puo contenere un determinato numero di persone
 * @author Di Carlo
 */
public class Museo
{
    private int personeDentro;
    private int spazioMassimo;

    /**
     * 
     * @param spazioMassimo la capacità massima di persone
     */
    public Museo(int spazioMassimo)
    {
        this.personeDentro = 0;
        this.spazioMassimo = spazioMassimo;
    }

    /**
     * Chiamando questo metodo entrerà un nuovo turista nel museo, in caso non potesse verrebbe messo in attesa
     * @throws Exception
     */
    public synchronized void entrata() throws Exception
    {
        while (this.personeDentro == this.spazioMassimo)
        {
            System.out.println(Thread.currentThread().getName() + " ha provato ad entrare nel museo ma è occupato");
            wait();
        }

        this.personeDentro += 1;
    }

    /**
     * Chiamando questo metodo il turista uscirà dal museo lasciando spazio per gli altri
     */
    public synchronized void uscita()
    {
        if (this.personeDentro > 0)
        {
            this.personeDentro -= 1;
            notifyAll();
        }
    }

    /**
     * 
     * @return le persone attualmente all'interno del museo
     */
    public int getPersoneDentro()
    {
        return this.personeDentro;
    }

    /**
     * 
     * @return lo spazio massimo del museo
     */
    public int getSpazioMassimo()
    {
        return this.spazioMassimo;
    }
}