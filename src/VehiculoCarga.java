public class VehiculoCarga extends Vehiculo{

    private int capacidadCarga;
    
    public VehiculoCarga (String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
          super(marca, modelo, año, kilometraje);
          this.capacidadCarga = capacidadCarga;
          
    }      
    public int getCapacidadCarga(){
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }    
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de Carga:" + capacidadCarga + "kg");
        RealizarMantenimiento();
    }
    public void RealizarMantenimiento() { 
        System.out.println("Realizando mantenimiento........");
        System.out.println("- Cambio de aceite");
        System.out.println("- Revisión de frenos");
        System.out.println("- Revisión del sistema hidráulico");
        System.out.println("- Inspección de la carga");
    }
}
