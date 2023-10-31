public class esercizio15di1 {
        private String nombre;
        private String apellido;
        private int identificacion;

        // Constructor
        public esercizio15di1(String nombre, String apellido, int identificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.identificacion = identificacion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getIdentificacion() {
            return identificacion;
        }

        public void setIdentificacion(int identificacion) {
            this.identificacion = identificacion;
        }

        public static void main(String[] args) {
            esercizio15di1 estudiante = new esercizio15di1("Devy", "Cantalupo", 1999);

            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Identificación: " + estudiante.getIdentificacion());
        }
    }

