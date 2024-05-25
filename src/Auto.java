public class Auto extends VehiculoPasajeros{
  private String tipoCombustible;
  private double costoPorKm;
  private int kilometrosRecorridos;
  private double costoTotal;
  //Constructor
  public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible, double costoPorKm, int kilometrosRecorridos, double costoTotal) {
    super(marca, modelo, año, kilometraje, numPasajeros);
    this.tipoCombustible = tipoCombustible;
    this.costoPorKm = costoPorKm;
    this.kilometrosRecorridos = kilometrosRecorridos;
  }  
  //Getter y Setter para tipoCombustible
  public String getTipoCombustible() {
    return tipoCombustible;
  }  
  public void setTipoCombustible(String tipoCombustible) {
    this.tipoCombustible = tipoCombustible;
  }  
  public double getCostoPorKm() {
    return costoPorKm;
  }
  public void setCostoPorKm(double costoPorKm) {
    this.costoPorKm = costoPorKm;
  }
  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  public double getCostoTotal() {
    return costoTotal;
  }
  public void setCostoTotal(double costoTotal) {
    this.costoTotal = costoTotal;
  }

  public double calcularCostoMantenimiento(double costoPorKm, int kilometrosRecorridos) {
    double costoTotal = costoPorKm * kilometrosRecorridos;
    return costoTotal;
  }

  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Tipo de combustible: " +tipoCombustible);
    System.out.println("El costo de Mantenimiento es: " +costoTotal );
  }
}
