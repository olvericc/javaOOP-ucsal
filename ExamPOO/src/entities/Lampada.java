package entities;

public class Lampada 
{
    protected boolean estado;
    protected int luminosidade;

    public Lampada() 
    {
        this.estado = false;
        this.luminosidade = 0; 
    }

    public boolean getEstado() 
    {
        return estado;
    }

    public int getLuminosidade() 
    {
        return luminosidade;
    }

    public void acionaOnOff() 
    {
        estado = !estado;
        if (estado) 
        {
            luminosidade = 100; 
        } 
        else 
        {
            luminosidade = 0; 
        }
    }
}
