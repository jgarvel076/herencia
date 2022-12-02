public class principal {
    public static void main(String[] args) {
        persona persona1 = new persona();
        jugador jugador1 = new jugador();
        equipos equipos1 = new equipos();

        persona1.setNombre("Jose");
        persona1.setPrimerApellido("González");
        persona1.setSegundoApellido("Chavez");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Nombre completo: " + persona1.getNombre() + " " + persona1.getPrimerApellido() + " " + persona1.getSegundoApellido());
        persona1.setEdad(21);
        System.out.println("Edad: " + persona1.getEdad());
        jugador1.setEquipo("Real Madrid");
        System.out.println("Equipo: " + jugador1.getEquipo());
        equipos1.setCiudad("Madrid");
        System.out.println("Ciudad: " + equipos1.getCiudad());
        equipos1.setCategoria("Liga Iberdrola");
        System.out.println("Liga: " + equipos1.getCategoria());


    }
}
