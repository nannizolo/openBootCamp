public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setEdad(27);
        cliente1.setNombre("Gaston Zolorzano");
        cliente1.setTelefono(43920821);
        cliente1.setCredito(2000);

        System.out.println("El cliente es" +" "+ cliente1.getNombre() +" "+ "tiene de edad " +  cliente1.getEdad() +" "+"años y su numero de telefono es" +" "+ cliente1.getTelefono());
        System.out.println("El credito de la persona es de" + " " + cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();

        trabajador1.setEdad(20);
        trabajador1.setNombre("Nahuel Diaz");
        trabajador1.setTelefono(43922121);
        trabajador1.setSalario(4000);

        System.out.println("El trabajador es" +" "+ trabajador1.getNombre() +" "+ "tiene de edad " +  trabajador1.getEdad() +" "+"años y su numero de telefono es" +" "+ trabajador1.getTelefono());
        System.out.println("El salario mensual de la persona es de" + " " + trabajador1.getSalario());

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
class Cliente extends Persona{
    private int credito;
        public void setCredito (int credito){
            this.credito = credito;
        }
        public int getCredito(){
            return this.credito;
        }
}

class Trabajador extends Persona{
    private int salario;
    public void setSalario (int salario){
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}
