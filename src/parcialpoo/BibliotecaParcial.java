/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialpoo;

/**
 *
 * @author Estudiante
 */
public class BibliotecaParcial {
    
    private String studentName;
    private String docenteName;

    public String getStudentName() {
        return studentName;
    }

    public String getDocenteName() {
        return docenteName;
    }
            
    private String  libroMath;
    private String  libroLiterature;
    private String  libroScience;
    
    
    public String getLibroMath() {
        return libroMath;
    }

    public String getLibroLiterature() {
        return libroLiterature;
    }

    public String getLibroScience() {
        return libroScience;
    }
    
    public void registroLibros(int categoria, String Libro){
        switch(categoria){
            case 1:
                libroMath += ", " +  Libro;
                break;
            case 2:
                libroLiterature += ", " + Libro;
                break;
            case 3:
                libroScience = ", " + Libro;
                break;
            default:
                break;
        
        }

    }
    public void registroestudiante(String name){
        studentName += ", " + name;
    }
    public void registrodocente(String name){
        docenteName += ", " + name;
    }
    
    
    
   
    
}
