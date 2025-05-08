/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialpoo;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class ParcialPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner C_Input = new Scanner(System.in);
        BibliotecaParcial Estudiante = new BibliotecaParcial();
        BibliotecaParcial Docente = new BibliotecaParcial();
        System.out.println("""
        Bienvenido a la Bibliteca virtual de Java. Aqui podras registrar libros
        de diferentes categorías: matemáticas, literatura y ciencias.
                           
        Es usted un estudiante o un docente? Digite un número para seleccionar.
        1. Estudiante                   
        2. Docente                   
                             """);
        int x = C_Input.nextInt();
        
        switch(x){
        
            case 1:
                System.out.println("Ha escogido la opción Estudiante\nIngrese su"
                        + "nombre");
                String Studentname = C_Input.nextLine();
                
                Estudiante.registroestudiante(Studentname);
                break;
            case 2: 
                System.out.println("Ha escogido la opción Docente\nIngrese su"
                        + "nombre");
                String Docentename = C_Input.nextLine();
                
                Docente.registrodocente(Docentename);
                break;
            default:
                System.out.println("Opcion no válida");
                break;
                
        
        }
        boolean bool = true;
        while (bool){
        if(Estudiante.getStudentName() != null || Docente.getDocenteName() != null){
        
            System.out.println("""
                               Bienvenido a la biblioteca virtual, escoja la 
                               categoría del libro que desea registrar:
                               1. Matematicas
                               2. Literatura
                               3. Ciencia
                               4. Consultar libros existentes
                               5. Salir
                               """);
            int opcionlibro = C_Input.nextInt();
            switch(opcionlibro){
                case 1:
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4:
                    System.out.println("Los libros existentes en la Biblioteca son: ");
                    
                    break;
                case 5: 
                    System.out.println("Hasta pronto");
                    bool = false;
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            
            }
        
        }
        }
        
    }
    
}
