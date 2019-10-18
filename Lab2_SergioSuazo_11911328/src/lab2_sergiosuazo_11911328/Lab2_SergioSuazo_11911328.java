
package lab2_sergiosuazo_11911328;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab2_SergioSuazo_11911328 {
    static Scanner leer=new Scanner(System.in);
    static Universidades u=new Universidades();
    static Random rand=new Random();
    public static void main(String[] args) {
        ArrayList<Universidades> lista=new ArrayList<>();
        int opcion =0;
        boolean login=false,nacional=false;
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
            if(opcion==1&&login)
            {
                String nombre,sucursal,rector;
                int maestros,estudiantes,nivel,año,costo;
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
                u.setNivelS(nivel);
                u.setCosto(nivel);
                lista.add(u);
            }
            if(opcion==2&&login)
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
            if(opcion==3)
            {
                String usuario,password;
                System.out.print("Ingrese el usuario: ");
                usuario=leer.next();
                while(!"leobanegas".equals(usuario))
                {
                    System.out.print("usuario incorrecto, ingrese nuevamente: ");
                    usuario=leer.next();                
                }
                System.out.print("Ingrese la contraseña: ");
                password=leer.next();
                while(!"99".equals(password))
                {
                    System.out.print("contraseña incorrecta, ingrese nuevamente: ");
                    password=leer.next();                
                }
                login=true;
            }
            if(opcion==4&&login)
            {
                int pos;
                System.out.println(lista);
                System.out.println("Ingrese la Universidad que desee avanzar: ");
                pos=leer.nextInt();
                if(lista.get(pos).getNivel()==5||lista.get(pos).getNivel()==4||nacional)
                {
                    System.out.println("La Universidad seleccionada no se puede avanzar");
                }
                else
                {
                    int ad;
                    ad=lista.get(pos).getNivel();
                    if(ad==1)
                    {
                        ad=4;
                    }
                    else if(ad==2)
                    {
                        ad=3;
                    }
                    else if(ad==3)
                    {
                        ad=5;
                        nacional=true;
                    }
                    
                    lista.get(pos).setNivel(ad);
                    lista.get(pos).setNivelS(ad);
                    lista.get(pos).setCosto(ad);
                }
            }
            if(opcion==5&&login)
            {
                String salida="";
                for (Object t : lista) 
                {
                    salida+=""+lista.indexOf(t)+"- "+t+"\n";
                }
                System.out.print(salida);
            }
            if(opcion==6&&login)
            {
                int mod;
                System.out.println("Ingrese lo que quiere modificar: \n"
                        + "1- Nombre universidad\n"
                        + "2- Sucursal\n"
                        + "3- Cantidad estudiantes\n"
                        + "4- Cantidad maestros\n"
                        + "5- Año\n"
                        + "6- Rector\n");
                
            }
            if(opcion==7&&login)
            {
                int pos;
                System.out.println(lista);
                System.out.println("Ingrese la Universidad que desee descender: ");
                pos=leer.nextInt();
                if(lista.get(pos).getNivel()==1||lista.get(pos).getNivel()==2)
                {
                    lista.remove(pos);
                }
                else
                {
                    int ad;
                    ad=lista.get(pos).getNivel();
                    if(ad==3)
                    {
                        ad=2;
                        lista.get(pos).setCosto(ad);
                    }
                    else if(ad==4)
                    {
                        ad=1;
                        lista.get(pos).setCosto(ad);
                    }
                    else if(ad==5)
                    {
                        ad=3;
                        lista.get(pos).setCosto(ad);
                        
                    }
                    
                    lista.get(pos).setNivel(ad);
                    lista.get(pos).setNivelS(ad);
                    lista.get(pos).setCosto(ad);
                }                
            }
            if(opcion==8&&login)
            {
                int r=rand.nextInt(lista.size());
                if(lista.get(r).getNivel()==3)
                {
                    lista.get(r).setNivel(5);
                    lista.get(r).setCosto(5);
                    lista.get(r).setNivelS(5);
                }
            }
        }
    }
    
}
