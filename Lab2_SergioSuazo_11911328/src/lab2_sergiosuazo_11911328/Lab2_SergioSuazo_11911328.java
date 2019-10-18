
package lab2_sergiosuazo_11911328;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_SergioSuazo_11911328 {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Universidades> lista=new ArrayList<>();
        int opcion =0;
        while(opcion!=9)
        {
            System.out.println(""
                    + "1- Crear Universidades\n"
                    + "2- Eliminar universidades\n"
                    + "3- Log in"
                    + "4- Ascender Universidad"
                    + "5- Listar Universidades y su Sucursal"
                    + "6- Modificar Universidad"
                    + "7- Descender Universidad"
                    + "8- Random"
                    + "9- Salir");
            if(opcion==1)
            {
                String nombre,sucursal,rector;
                int maestros,estudiantes,nivel,año;
                System.out.print("Ingrese nombre de la Universidad: ");
                nombre=leer.next();
                System.out.print("Ingrese nombre del rector: ");
                rector=leer.next();
                System.out.print("Ingrese sucursal: ");
                sucursal=leer.next();
                System.out.print("Ingrese cantidad de maestros: ");
                maestros=leer.nextInt();
                System.out.print("Ingrese cantidad de estudiantes: ");
                estudiantes=leer.nextInt();
                System.out.print("Ingrese año de creacion: ");
                año=leer.nextInt();
                System.out.print("Ingrese nivel de la Universidad (1-privada 2-publica): ");
                nivel=leer.nextInt();
                Universidades u=new Universidades();
                u.setNombre(nombre);
                u.setRector(rector);
                u.setSucusal(sucursal);
                u.setMaestros(maestros);
                u.setEstudiantes(estudiantes);
                u.setAño(año);
                u.setNivel(nivel);
                lista.add(u);
            }
            if(opcion==2)
            {
                int pos;
                System.out.print("Posicion a eliminar");
                pos=leer.nextInt();
                if(pos<=lista.size())
                {
                    lista.remove(pos);
                }
                else
                {
                    System.out.println("Posicion equivocada");
                }                
            }
        }
    }
    
}
