package Entornos4;
/**
 * @author juanlu
 */
public class eCesta {
    /*Propiedades de la Clase eCesta*/
    private String comercio;
    private double bono;
    private String usuario;
    private double extra=10;
    /* Constructor sin argumentos */
    public eCesta (){}
    /*Constructor con parámetros*/
    public eCesta (String comercio, double bono, String usuario) 
    {
        this.comercio=comercio;
        this.bono=bono+extra; 
        this.usuario=usuario;}
    
     public eCesta (String comercio, double bono, String usuario, double extra) 
    {
        this.comercio=comercio;
        this.bono=bono+extra; 
        this.usuario=usuario;}
   /*Método para fijar el comercio*/
     //Igual que: public void setComercio(String comercio)
    //public void AsignarComercio(String comercio) {
     //   this.setComercio(comercio);}
    /* Método que indica el usuario de la cesta electrónica */
    //IGUAL que: public String getUsuario() 
    //public String Titular(){
    //    return getUsuario();}
    /*Método de consulta de bonificación*/
     //IGUAL QUE: public double getBono() 
     //public double bonificacion (){
     //   return getBono(); }
    /* Método para actualizar el bono */
    public void ActualizarBono (double n) throws Exception{
        if (n<0)
            throw new Exception("No es posible actualizar bono");
        setBono(getBono() + n); }
    /* Método para comprar */
    public void comprar (double total) throws Exception{
        if (total<= 0)
            throw new Exception ("Imposible la compra");
        if (getBono()< total)
            throw new Exception ("Su bono es insuficiente para la compra");
        setBono(getBono() - total); }
    /*Método que me devuelve el usuario de la cesta*/
    //COMENTO YA QUE LO HE ENCAPSULADO Y no sigue el nombre de get o set
    //Igual que: public String getUsuario() 
    //public String identificacionUsuario (){
     //   return getUsuario(); }

    /**
     * @return the comercio
     */
    public String getComercio() {
        return comercio;
    }

    /**
     * @param comercio the comercio to set
     */
    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    /**
     * @return the bono
     */
    public double getBono() {
        return bono;
    }

    /**
     * @param bono the bono to set
     */
    public void setBono(double bono) {
        this.bono = bono;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the extra
     */
    public double getExtra() {
        return extra;
    }

    /**
     * @param extra the extra to set
     */
    public void setExtra(double extra) {
        this.extra = extra;
    }
}
