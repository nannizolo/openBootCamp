public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setEdad(27);
        persona1.setNombre("Gaston Zolorzano");
        persona1.setTelefono(43920821);

        System.out.println("La persona" +" "+ persona1.getNombre() +" "+ "tiene de edad " +  persona1.getEdad() +" "+"años y su numero de telefono es" +" "+ persona1.getTelefono());

    }
}
class Persona {
    private int edad;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private int telefono;
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }


}