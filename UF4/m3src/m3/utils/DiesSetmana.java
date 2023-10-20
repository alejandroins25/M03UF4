package m3.utils;

public class DiesSetmana {

    public static String obtenirDiaSetmana(int numero) {
        String diaSetmana = "";
        switch (numero) {
            case 1:
                diaSetmana = "Dilluns";
                break;
            case 2:
                diaSetmana = "Dimarts";
                break;
            case 3:
                diaSetmana = "Dimecres";
                break;
            case 4:
                diaSetmana = "Dijous";
                break;
            case 5:
                diaSetmana = "Divendres";
                break;
            case 6:
                diaSetmana = "Dissabte";
                break;
            case 7:
                diaSetmana = "Diumenge";
                break;
            default:
                diaSetmana = "Error: Introdueix un valor entre 1 i 7";
                break;
        }
        return diaSetmana;
    }
}
