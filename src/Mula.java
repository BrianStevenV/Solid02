public class Mula implements InformeFotoMulta {
    private int limiteInferiorMula = 95;
    private int limiteInferiorIntermedioMula = 96;
    private int limiteSuperiorMula = 110;

    public Mula(int limiteInferiorMula, int limiteInferiorIntermedioMula, int limiteSuperiorMula) {
        this.limiteInferiorMula = limiteInferiorMula;
        this.limiteInferiorIntermedioMula = limiteInferiorIntermedioMula;
        this.limiteSuperiorMula = limiteSuperiorMula;
    }

    @Override
    public int calcularComparendo(int velocidad) {
        if(velocidad<=limiteInferiorMula) {
            return 0;
        }else if (velocidad >=limiteInferiorIntermedioMula && velocidad<=limiteSuperiorMula) {
            return 1;
        }
        return 2;
    }

    @Override
    public String enviarCorreoFotomulta() {
        String cuerpoMensaje = "//enviando correo para el tipo mula.";
        String asunto = "//asunto: comparendo mula";
        return   asunto + cuerpoMensaje;
    }
}
