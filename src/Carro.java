public class Carro implements InformeFotoMulta {
    private int limiteInferiorCarro = 65;
    private int limiteInferiorIntermedioCarro = 66;
    private int limiteSuperiorCarro = 85;

    public Carro(int limiteInferiorCarro, int limiteInferiorIntermedioCarro, int limiteSuperiorCarro) {
        this.limiteInferiorCarro = limiteInferiorCarro;
        this.limiteInferiorIntermedioCarro = limiteInferiorIntermedioCarro;
        this.limiteSuperiorCarro = limiteSuperiorCarro;
    }

    @Override
    public int calcularComparendo(int velocidad) {
        if(velocidad<=limiteInferiorCarro) {
            return 0;
        }else if (velocidad >=limiteInferiorIntermedioCarro && velocidad<=limiteSuperiorCarro) {

            return 1;
        }
        return 2;
    }

    @Override
    public String enviarCorreoFotomulta() {
        String cuerpoMensaje = "//enviando correo para el tipo carro.";
        String asunto = "//asunto: comparendo carro";
        return   asunto + cuerpoMensaje;
    }
}
