package javaapplication3;


public class JavaApplication3 {

    public static void main(String[] args) {
        
        // DECLARACION DE OBJETOS
        
        NewClass alu1 = new NewClass ();
        NewClass alu2 = new NewClass (1,"Braian","Rojas");
    
        // MOSTRAR EN CONSOLA LOS ATRIBITOS DEL OBJETO ALU2
        
        System.out.println("el ID del alumno es: " + alu2.getId());
        System.out.println("el Nombre del alumno es: " + alu2.getNombre());
        System.out.println("el Apellido del alumno es: " + alu2.getApellido());
        
        System.out.println("-------------------------");
        // DECLARAR LOS ATRIBUTOS DEL OBJETO VACIO ALU1 CON EL METODO SET
        
        alu1.setId(2);
        alu1.setNombre("Victoria");
        alu1.setApellido("Deprati");
        
        // MOSTRAR EN CONSOLA LOS ATRIBUTOS MODIFICADOS
        
        System.out.println("el ID del alumno es: " + alu1.getId());
        System.out.println("el Nombre del alumno es: " + alu1.getNombre());
        System.out.println("el Apellido del alumno es: " + alu1.getApellido());
        
        
    }

    public JavaApplication3() {
    }
    
}
