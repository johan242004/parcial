
package empresa_transporte;


public class transporte_ltda {
    
    String placa;
    String descripcion;
    String nombreConductor;
    String ruta;
    String marca;
    String modelo;

    public transporte_ltda(String placa, String descripcion, String nombreConductor, String ruta, String marca, String modelo) {
        this.placa = placa;
        this.descripcion = descripcion;
        this.nombreConductor = nombreConductor;
        this.ruta = ruta;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public String getRuta() {
        return ruta;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
//setter

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    
}

