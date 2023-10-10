package entities;

public class LampadaAjustavel extends Lampada 
{
    private int brilho; 

    public LampadaAjustavel() 
    {
        super();
        this.brilho = 0; 
    }

    public void aumentaBrilho() 
    {
        if (this.getEstado()) 
        {
            if (this.brilho < 100) 
            {
                this.brilho += 10;
                System.out.println("Aumentando o brilho da lâmpada para " + this.brilho + "%");
            } 
            else 
            {
                System.out.println("O brilho já está no máximo.");
            }
        } 
        else 
        {
            System.out.println("A lâmpada está desligada. Não é possível aumentar o brilho.");
        }
    }

    public int getBrilho() 
    {
        return this.brilho;
    }

    public void desligar() 
    {
        super.acionaOnOff();
        this.brilho = 0;
        System.out.println("A lâmpada foi desligada.");
    }

    public void aumentaLuminosidade() 
    {
        if (this.getEstado()) 
        {
            if (this.brilho < 100) 
            {
                this.brilho += 10;
                System.out.println("Aumentando a luminosidade da lâmpada para " + this.brilho + "%");
            } 
            else 
            {
                System.out.println("A luminosidade já está no máximo.");
            }
        } 
        else 
        {
            System.out.println("A lâmpada está desligada. Não é possível aumentar a luminosidade.");
        }
    }

	public void diminuiLuminosidade() {
		if (this.brilho > 0) 
        {
            this.brilho -= 10;
            System.out.println("Diminuindo o brilho da lâmpada para " + this.brilho + "%");
            if (this.brilho == 0) 
            {
                this.desligar();
                System.out.println("A lâmpada foi desligada devido à ausência de brilho.");
            }
        } 
        else 
        {
            System.out.println("O brilho já está no mínimo.");
        }
	}
}
