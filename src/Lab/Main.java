
package Lab;


public class Main {
    public static void main(String[] args) {
        Estudiante est1= new Estudiante();
        
        est1.setNombre("Eber Lopez");
        est1.setMatricula("1292756");
        est1.setFacultad("FCQI");
        est1.setSemestre(4);
        
        System.out.println("Nombre: " + est1.getNombre());
        System.out.println("Matricula: " + est1.getMatricula());
        System.out.println("Facultad: " + est1.getFacultad());
        System.out.println("Semestre: " + est1.getSemestre());
        
        System.out.println("------------------------");
        
        Estudiante est2= new Estudiante();
        est2.setNombre("Melco Mora");
        est2.setMatricula("2343345");
        est2.setFacultad("FCQI");
        est2.setSemestre(6);
        
        System.out.println("Nombre: " + est2.getNombre());
        System.out.println("Matricula: " + est2.getMatricula());
        System.out.println("Facultad: " + est2.getFacultad());
        System.out.println("Semestre: " + est2.getSemestre());
        
        System.out.println("------------------------");
        
        Estudiante est3= new Estudiante();
        est3.setNombre("Martin Guzman");
        est3.setMatricula("209432");
        est3.setFacultad("FCQI");
        est3.setSemestre(3);
        
        System.out.println("Nombre: " + est3.getNombre());
        System.out.println("Matricula: " + est3.getMatricula());
        System.out.println("Facultad: " + est3.getFacultad());
        System.out.println("Semestre: " + est3.getSemestre());
    }
    
}

