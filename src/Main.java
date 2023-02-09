public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro(65,66,75);
        Camion camion = new Camion(75,76,95);
        Mula mula = new Mula(95,96,110);

        Comparendo compCarro = new Comparendo(carro);
        Comparendo compCamion = new Comparendo(camion);
        Comparendo compMula = new Comparendo(mula);


        System.out.println(compCarro.calcularComparendo(carro,100));
        System.out.println(compCarro.enviarCorreoFotomulta(carro));


        System.out.println(compMula.calcularComparendo(mula,100));
        System.out.println(compMula.enviarCorreoFotomulta(mula));


        System.out.println(compCamion.calcularComparendo(camion,75));
        System.out.println(compCamion.enviarCorreoFotomulta(camion));

    }
}
