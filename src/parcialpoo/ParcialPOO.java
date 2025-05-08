/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialpoo;
import java.util.Scanner;
/**
 *
 * @author Sergio Gomez
 */
public class ParcialPOO {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            // TODO code application logic here

            Scanner C_Input = new Scanner(System.in);
            BibliotecaParcial Biblioteca = new BibliotecaParcial();

            boolean boolregistro = true;
            while(boolregistro){
                System.out.println("""
                Bienvenido a la Bibliteca virtual de Java. Aqui podras registrar libros
                de diferentes categorias: matematicas, literatura y ciencias.

                Es usted un estudiante o un docente? Digite un numero para seleccionar.
                1. Estudiante                   
                2. Docente
                3. Salir        
                                     """);
                int x = C_Input.nextInt();

                switch(x){

                    case 1:
                        System.out.println("Ha escogido la opcion Estudiante\nIngrese su"
                                + "nombre");
                        C_Input.nextLine();
                        String Studentname = C_Input.nextLine();

                        Biblioteca.registroestudiante(Studentname);
                        break;
                    case 2: 
                        System.out.println("Ha escogido la opcion Docente\nIngrese su"
                                + "nombre");
                        C_Input.nextLine();
                        String Docentename = C_Input.nextLine();

                        Biblioteca.registrodocente(Docentename);
                        break;
                    case 3:
                        System.out.println("Hasta pronto");
                            boolregistro = false;
                            
                            break;
                    default:
                        System.out.println("Opcion no valida");
                        break;


                }
                
                boolean boollibro = true;
                if(boolregistro == false){
                boollibro = false;
                }
                while (boollibro){
                if(Biblioteca.getStudentName() != null || Biblioteca.getDocenteName() != null){

                    System.out.println("""
                                       Bienvenido a la biblioteca virtual, escoja la 
                                       categoría del libro que desea registrar:
                                       1. Matematicas
                                       2. Literatura
                                       3. Ciencia
                                       4. Consultar libros existentes
                                       5. Mostrar todos los registrados
                                       6. Salir
                                       """);
                    int opcionlibro = C_Input.nextInt();
                    switch(opcionlibro){
                        case 1:
                            System.out.println("Ingrese el nombre del Libro que desee registrar:");
                            C_Input.nextLine();
                            String LibroMath = C_Input.nextLine();

                            Biblioteca.registroLibros(1, LibroMath);
                            break;
                        case 2: 
                            System.out.println("Ingrese el nombre del Libro que desee registrar:");
                            C_Input.nextLine();
                            String LibroLiterature = C_Input.nextLine();

                            Biblioteca.registroLibros(2, LibroLiterature);
                            break;
                        case 3: 
                            System.out.println("Ingrese el nombre del Libro que desee registrar:");
                            C_Input.nextLine();
                            String LibroScience = C_Input.nextLine();
                            Biblioteca.registroLibros(2, LibroScience);
                            break;
                        case 4:
                            System.out.println("Los libros existentes en la Biblioteca son: ");
                            System.out.println("Libros de Matematicas: "+ Biblioteca.getLibroMath());
                            System.out.println("Libros de Literatura: "+ Biblioteca.getLibroLiterature());
                            System.out.println("Libros de Ciencia: "+ Biblioteca.getLibroScience());
                            break;
                        case 5: 
                            System.out.println("Todos los registrados son:\n Docentes: "
                                    +Biblioteca.getDocenteName()+"\nEstudiantes: "+Biblioteca.getStudentName());
                        case 6: 
                            System.out.println("Hasta pronto");
                            boollibro = false;
                            break;
                        default:
                            System.out.println("Opcion no válida");
                            break;

                    }


                }
            }

        }

    }
}    
