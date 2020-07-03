/*
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
package eimpina1106ejvecestdin;
*/
package eimpina1106ejvecestdin;

import java.util.Scanner;

     
public class EimPina1106EjVecEstDin {

       /*
    Realizar un programa que contenga  3 vectores estáticos con la siguiente informacion :
    -Nombre
    -Edad
    -Sexo
    Cargar los tres vectores con  datos (5 usuarios) y recorrer los 3 vectores,  
    para imprimir el listado de usuarios por consola.
    */

    public static void main(String[] args) {
        
        
    String separador="------------------------------------------------------";   

    //carga estatica de los vectores    
    
    int usuarios,intro;
    String chequear,respuesta;
    String [] nombreEST = {"juan","pedro","maria","soledad","roberto"}; 
    int [] edadEST = { 11 , 23 , 32 , 55 , 42 };
    String sexoEST [] = {"masculino","masculino","femenino","femenino","masculino"}; 
    
    Scanner lector=new Scanner (System.in);

    do{
        System.out.println(separador);
        System.out.println("Ingrese la opcion de carga del vector: ");
        System.out.println("Para imprimir uno estatico ingrese 1 [1]:");
        System.out.println("Para imprimir uno dinamico ingrese 2 [2]:");
        System.out.println(separador);

        intro=lector.nextInt();
        respuesta=Integer.toString(intro);
    }while (!respuesta.matches("[1-2]+"));
        
    switch (intro){
        
    case 1:
        System.out.println(separador);
        System.out.println(separador);
        System.out.println("LISTADO DE USUARIOS CARGADOS:");
        System.out.println(separador);
    
        System.out.println( "NOMBRE"+"\t\t"+ "EDAD"+"\t\t"+"SEXO");
        System.out.println(separador);

        for (int indice=0; indice<nombreEST.length; indice++){
            System.out.println(nombreEST [indice]+"\t\t"+ edadEST[indice]+"\t\t"+sexoEST[indice]);
            }
    
        System.out.println(separador);
        System.out.println(separador);
    
        break;
        
    case 2:
        do{
            System.out.println ("Ingrese la cantidad de usuarios a cargar: [1-5]");
            usuarios=lector.nextInt();
            chequear=Integer.toString(usuarios);
        }while (!(chequear.matches("[1-5]+")));
    
        System.out.println ("Ud. ingreso "+usuarios+" usuarios.");
    
    
    //carga de vectores dinamicos con la cantidad ingresada de usuarios a cargar
        String [] nombre = new String [usuarios] ;
        int [] edad = new int [usuarios];
        String [] sexo = new String [usuarios];

        
        for (int indice=0; indice<nombre.length; indice++){
            do{
                System.out.println("Ingrese el "+(indice+1)+" nombre: ");
                nombre[indice]=lector.next();
            }while (!(nombre[indice].matches("[a-zA-Z]+")) );
            
                System.out.println("Ingrese la "+(indice+1)+" edad: ");
                edad[indice]=lector.nextInt();
                System.out.println("Ingrese el "+(indice+1)+" sexo: ");
                sexo[indice]=lector.next();
        }
       
            
    System.out.println(separador);
    System.out.println(separador);
    System.out.println("LISTADO DE USUARIOS CARGADOS:");
    System.out.println(separador);
    
    System.out.println( "NOMBRE"+"\t\t"+ "EDAD"+"\t\t"+"SEXO");
    System.out.println(separador);

    for (int indice=0; indice<nombre.length; indice++){
        System.out.println(nombre [indice]+"\t\t"+ edad[indice]+"\t\t"+sexo [indice]);
            }
    
    System.out.println(separador);
    System.out.println(separador);

    break;    
    }   //switch
    
}    
}
