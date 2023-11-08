
package modelo;



public class CampoDeportivo{

 private int idCampo;
    private String nombre;
    private String ubicacion;
    private String Fvalido;
    private String Ftamaño; 
    private double FprecioMinuto;
    private String Vvalido;
    private String Vtamaño; 
    private double VprecioMinuto;
    private String Bvalido;
    private String Btamaño; 
    private double BprecioMinuto;

    public CampoDeportivo() {
        
        this.idCampo = 0;
        this.nombre = "";
        this.ubicacion = "";
        this.Fvalido = "";
        this.Ftamaño = "";
        this.FprecioMinuto = 0.0;
        this.Vvalido = "";
        this.Vtamaño = "";
        this.VprecioMinuto = 0.0;
        this.Bvalido = "";
        this.Btamaño = "";
        this.BprecioMinuto = 0.0;
        
}

    public CampoDeportivo(int idCampo, String nombre, String ubicacion, String Fvalido, String Ftamaño, double FprecioMinuto, String Vvalido, String Vtamaño, double VprecioMinuto, String Bvalido, String Btamaño, double BprecioMinuto) {
        this.idCampo = idCampo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.Fvalido = Fvalido;
        this.Ftamaño = Ftamaño;
        this.FprecioMinuto = FprecioMinuto;
        this.Vvalido = Vvalido;
        this.Vtamaño = Vtamaño;
        this.VprecioMinuto = VprecioMinuto;
        this.Bvalido = Bvalido;
        this.Btamaño = Btamaño;
        this.BprecioMinuto = BprecioMinuto;
    }

    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFvalido() {
        return Fvalido;
    }

    public void setFvalido(String Fvalido) {
        this.Fvalido = Fvalido;
    }

    public String getFtamaño() {
        return Ftamaño;
    }

    public void setFtamaño(String Ftamaño) {
        this.Ftamaño = Ftamaño;
    }

    public double getFprecioMinuto() {
        return FprecioMinuto;
    }

    public void setFprecioMinuto(double FprecioMinuto) {
        this.FprecioMinuto = FprecioMinuto;
    }

    public String getVvalido() {
        return Vvalido;
    }

    public void setVvalido(String Vvalido) {
        this.Vvalido = Vvalido;
    }

    public String getVtamaño() {
        return Vtamaño;
    }

    public void setVtamaño(String Vtamaño) {
        this.Vtamaño = Vtamaño;
    }

    public double getVprecioMinuto() {
        return VprecioMinuto;
    }

    public void setVprecioMinuto(double VprecioMinuto) {
        this.VprecioMinuto = VprecioMinuto;
    }

    public String getBvalido() {
        return Bvalido;
    }

    public void setBvalido(String Bvalido) {
        this.Bvalido = Bvalido;
    }

    public String getBtamaño() {
        return Btamaño;
    }

    public void setBtamaño(String Btamaño) {
        this.Btamaño = Btamaño;
    }

    public double getBprecioMinuto() {
        return BprecioMinuto;
    }

    public void setBprecioMinuto(double BprecioMinuto) {
        this.BprecioMinuto = BprecioMinuto;
    }
    
    
    
    
}

