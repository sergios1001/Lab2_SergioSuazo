
package lab2_sergiosuazo_11911328;

public class Universidades 
{
    private String nombre,rector,sucursal;
    private int año,maestros,estudiantes,nivel;
    
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
    @Override
    public String toString()
    {
        return ""+nombre+" "+sucursal;
    }
}
