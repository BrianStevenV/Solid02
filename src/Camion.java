public class Camion implements InformeFotoMulta{
    private int limiteInferiorCamion = 75;
    private int limiteInferiorIntermedioCamion = 76;
    private int limiteSuperiorCamion = 95;

    public Camion(int limiteInferiorCamion, int limiteInferiorIntermedioCamion, int limiteSuperiorCamion) {
        this.limiteInferiorCamion = limiteInferiorCamion;
        this.limiteInferiorIntermedioCamion = limiteInferiorIntermedioCamion;
        this.limiteSuperiorCamion = limiteSuperiorCamion;
    }

    @Override
    public int calcularComparendo(int velocidad) {
        if(velocidad<=limiteInferiorCamion) {
            return 0;
        }else if (velocidad >=limiteInferiorIntermedioCamion && velocidad<=limiteSuperiorCamion) {
            return 1;
        }
        return 2;
    }

    @Override
    public String enviarCorreoFotomulta() {
        String cuerpoMensaje = "//enviando correo para el tipo camion.";
        String asunto = "//asunto: comparendo camion";
        return   asunto + cuerpoMensaje;
    }
}
