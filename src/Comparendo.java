public class Comparendo {

    private Carro carro;
    private Camion camion;
    private Mula mula;

    public Comparendo(Carro carro) {
        this.carro = carro;
    }

    public Comparendo(Camion camion) {
        this.camion = camion;
    }

    public Comparendo(Mula mula) {
        this.mula = mula;
    }

    public void construirFotoMulta(int comparendo, String mensaje, int velocidad, Object object) {
        comparendo = calcularComparendo(object,velocidad);
        mensaje = enviarCorreoFotomulta(velocidad);
        if(comparendo == -1){
            System.out.println("no hay calculo para el tipo de vehiculo" + "corre: " + mensaje);
        }else {
            System.out.println("----el tipo de comparendo es: " + comparendo + " ----cuerpo del correo" + mensaje);
        }

    }

    public int calcularComparendo(Object object,int velocidad) {
        if(object instanceof Carro){
            return carro.calcularComparendo(velocidad);
        } else if (object instanceof Camion) {
            return camion.calcularComparendo(velocidad);
        } else if (object instanceof Mula) {
            return mula.calcularComparendo(velocidad);
        }
        return 0;
    }


    public String enviarCorreoFotomulta(Object object) {
        if(object instanceof Carro){
            return carro.enviarCorreoFotomulta();
        } else if (object instanceof Camion) {
            return camion.enviarCorreoFotomulta();
        } else if (object instanceof Mula) {
            return mula.enviarCorreoFotomulta();
        }
        return "Error de envio de foto multa";
    }

}
