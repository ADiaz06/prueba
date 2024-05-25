public class Camion extends VehiculoCarga{
 private int numEjes;
 public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
    super(marca, modelo, año, kilometraje, capacidadCarga);
    this.numEjes = numEjes;
 }
 public int getNumEjes(){ 
    return numEjes;
 }
 public void setNumEjes(int numEjes){
    this.numEjes = numEjes;
 }
 @Override
 public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Número de Ejes: "+numEjes);
 }
}
