
package lab2_sergiosuazo_11911328;

public class Universidades 
{
    private String nombre,rector,sucursal,nivelS;
    private int año,maestros,estudiantes,nivel,costo;

    
    public Universidades()
    {
        
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
     public void setRector(String rector)
    {
        this.rector=rector;
    }
    public String getRector()
    {
        return rector;
    }
     public void setSucusal(String sucursal)
    {
        this.sucursal=sucursal;
    }
    public String getSucursal()
    {
        return sucursal;
    }
      public void setAño(int año)
    {
        this.año=año;
    }
    public int getAño()
    {
        return año;
    }
    public void setMaestros(int maestros)
    {
        this.maestros=maestros;
    }
    public int getMaestros()
    {
        return maestros;
    }  
    public void setEstudiantes(int estudiantes)
    {
        this.estudiantes=estudiantes;
    }
    public int getEstudiantes()
    {
        return estudiantes;
    }  
    public void setNivel(int nivel)
    {
        this.nivel=nivel;
    }
    public int getNivel()
    {
        return nivel;
    }
    public void setNivelS(int nivel)
    {
        String nivelS="";
        if(nivel==1)
        {
            nivelS="Privada";
        }
        if(nivel==2)
        {
            nivelS="Publica";
        }
        if(nivel==3)
        {
            nivelS="Publica Prestigiosa";
        }
        if(nivel==4)
        {
            nivelS="Privada Prestigiosa";
        }
        if(nivel==5)
        {
            nivelS="Nacional";
        }
        this.nivelS=nivelS;
    }
    public void setCosto(int nivel)
    {
        int costo=0;
        if(nivel==1)
        {
            costo=6000;
        }
        if(nivel==2)
        {
            costo=0;
        }
        if(nivel==3)
        {
            costo=200;
        }
        if(nivel==4)
        {
            costo=12000;
        }
        if(nivel==1)
        {
            costo=500;
        }
        this.costo=costo;
    }
    public int getCosto()
    {
        return costo;
    }
    
    @Override
    public String toString()
    {
        return ""+nombre+" "+sucursal;
    }
}
