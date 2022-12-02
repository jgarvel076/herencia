public class persona {
        private String nombre;
        private String PrimerApellido;
        private String SegundoApellido;

        private int edad;

        persona () {

        }
        persona (String nombre, String PrimerApellido){
            this.nombre = nombre;
            this.PrimerApellido = PrimerApellido;
            this.SegundoApellido = SegundoApellido;
        }
        public String getPrimerApellido() {
            return PrimerApellido;
        }
        public void setPrimerApellido(String PrimerApellido) {
            this.PrimerApellido = PrimerApellido;
        }
        public String getSegundoApellido() {
            return SegundoApellido;
        }
        public void setSegundoApellido(String SegundoApellido) {
            this.SegundoApellido = SegundoApellido;
        }
        public void MostrarNombreCompleto(){
            System.out.println(nombre + " " + PrimerApellido + " " + SegundoApellido);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
}
