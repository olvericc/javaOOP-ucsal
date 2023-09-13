package entities;

public class Lights
{

    boolean status = false;

    public void onOrOff()
    {
        this.status = !this.status;
    }

    public boolean getStatus()
    {
        return this.status;
    }

}
