public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Este ejercicio no se puede realizar creando objetos de
         * ninguna clase de la API, ya que sus destructores no informan
         * de nada. Para ello usaremos la clase Persona en la que
         * implementaremos un destructor: finalize().
         * Como no sabemos cuando entra en funcionamiento el recolector
         * de basura , usaremos un bucle infinito para crear objetos.
         * Será en el desctructor cuando paremos la ejecución del programa.
         * Añadiremos un atributo estático a la clase Persona para
         * contabilizar el número de objetos creados.
         */
        //Persona Paco = new Persona();
        while (true) {
            new Persona(); /*
                            * creamos objetos que no están
                            * referenciados por ninguna variable.
                            */
        }
    }
}
