public class VehiculoPasajeros extends Vehiculo{
   private int numPasajeros;
   //Constructor
   public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
    super(marca, modelo, año, kilometraje); //Son como los sett, hace referencia a la clase base
    this.numPasajeros = numPasajeros;
   }
   //Getter y Setter para numnPasajeros;
   public int getNumPasajeros() {
    return numPasajeros;
   } 
   public void setNumPasajeros(int numPasajeros) {
    this.numPasajeros = numPasajeros;
   } 
   public void RealizarMant() {
      System.out.println("Realizando Mantenimiento.......");
      System.out.println("- Cambio de aceite");
      System.out.println("- Revisión de frenos");
      System.out.println("- Revisión de neumáticos");
   }
   //Sobrescribir el método mostrarInfo()
   @Override //Sobreescribe el método de la calse base
   public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Número de Pasajeros: "+ numPasajeros);
    RealizarMant();
   } 
}
