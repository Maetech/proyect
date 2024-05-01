package com.aluraproyecto.principal;


import com.aluraproyecto.modelos.Conversion;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner entradaUsuario = new Scanner(System.in);
        int opcion;


        System.out.println("""
                ******************************************
                Sea bievenid@ al conversor de moneda =)
                ******************************************
                """);
        System.out.println("\n Esta aplicacion da soporte a " +
                "161 monedas mundiales que circulan habitualmente");
        System.out.println("---------------++++++++----------------");

//        String menu = """
//                ******************************************
//                Sea bievenid@ al conversor de moneda =)
//                ******************************************
//
//                1. Dolar estadounidense (USD) => Peso argentino (ARS)
//                2. Peso argentino (ARS) => Dolar estadounidense (USD)
//                3. Dolar estadounidense (USD) => Peso chileno (CLP)
//                4. Peso chileno (CLP) => Dolar estadounidense (USD)
//                5. Dolar estadounidense (USD) => Peso colombiano (COP)
//                6. Peso colombiano (COP) => Dolar estadounidense (USD)
//                7. Dolar estadounidense (USD) => Peso mexicano (MXN)
//                8. Peso mexicano (MXN) => Dolar estadounidense (USD)
//                9. Salir de la aplicacion
//                """;

        do {
            System.out.println("\n Menu de opciones: ");
            System.out.println("1. Lista de monedas de cambio permitidos");
            System.out.println("2. Conversion de monedas");
            System.out.println("3. Salir de la aplicacion");
            System.out.println("Por favor, elija una opcion del menu: ");
            opcion = entradaUsuario.nextInt();

            switch (opcion) {
                case 1:
                    muestraPaises();
                    break;

                case 2:
                    convertirMoneda(entradaUsuario);
                    break;

                case 3:
                    System.out.println("Gracias por utilizar nuestro servicio. Vuelva pronto!!!");
                    break;

                default:
                    System.out.println("La opcion ingresada no se encuentra en el menu");
            }
        } while (opcion!=3);
    }

    private static void convertirMoneda(Scanner scanner) {
        System.out.println("Ingresa el codigo del pais del que quieres convertir: ");
        String codigoBase = scanner.next();
        System.out.println("Ingresa el codigo del pais al cual quieres convertir: ");
        String codigoObjetivo = scanner.next();
        System.out.println("Ingrese el monto total a convertir: ");
        double montoConvertir = scanner.nextDouble();
        Conversion conversion = new Conversion(codigoBase, codigoObjetivo, montoConvertir);
        try {
            double resultado = conversion.convert();
            System.out.println(montoConvertir + " " + codigoBase + " son " + resultado + " " + codigoObjetivo);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }

    public static void muestraPaises(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("DEA Emiratos Árabes Unidos\t| AFN Afganistán");
        System.out.println("TODO Albania\t| AMD Armenia");
        System.out.println("ANG Antillas Holandesas\t| AOA Angola");
        System.out.println("ARS Argentina\t| AUD Australia");
        System.out.println("AWG Aruba\t| AZN Azerbaiyán");
        System.out.println("bam Bosnia y Herzegovina\t| BBD Barbados");
        System.out.println("BDT Bangladesh\t| BGN Bulgaria");
        System.out.println("BHD Bahréin\t| BIF Burundi");
        System.out.println("DMO islas Bermudas\t| BND Brunéi");
        System.out.println("BETO bolivia\t| reales Brasil");
        System.out.println("BSD bahamas\t| BTN Bután");
        System.out.println("BWP Botsuana\t| BYN Bielorrusia");
        System.out.println("BZD Belice\t| CANALLA Canadá");
        System.out.println("CDF República Democrática del Congo\t| CHF Suiza");
        System.out.println("CLP Chile\t| CNY Porcelana");
        System.out.println("POLICÍA Colombia\t| CDN Costa Rica");
        System.out.println("TAZA Cuba\t| CVE Cabo Verde");
        System.out.println("coronas checas República Checa\t| DJF Yibuti");
        System.out.println("coronas danesas Dinamarca\t| DOP República Dominicana");
        System.out.println("DZD Argelia\t| EGP Egipto");
        System.out.println("ERN Eritrea\t| ETB Etiopía");
        System.out.println("EUR unión Europea\t| FJD Fiyi");
        System.out.println("FKP Islas Malvinas\t| FOK Islas Faroe");
        System.out.println("GBP Reino Unido\t| GEL Georgia");
        System.out.println("GGP Guernesey\t| GHS Ghana");
        System.out.println("PIB Gibraltar\t| GMD Gambia");
        System.out.println("GNF Guinea\t| GTQ Guatemala");
        System.out.println("GYD Guayana\t| dólares de Hong Kong Hong Kong");
        System.out.println("HNL Honduras\t| HRK Croacia");
        System.out.println("HTG Haití\t| HUF Hungría");
        System.out.println("IDR Indonesia\t| ILS Israel");
        System.out.println("DIABLILLO Isla del hombre\t| INR India");
        System.out.println("IQD Irak\t| TIR Irán");
        System.out.println("corona islandesa Islandia\t| JEP Jersey");
        System.out.println("JMD Jamaica\t| JOD Jordán");
        System.out.println("Guay Japón\t| KES Kenia");
        System.out.println("kgs Kirguistán\t| KHR Camboya");
        System.out.println("NIÑO Kiribati\t| KMF Comoras");
        System.out.println("KRW Corea del Sur\t| kwd Kuwait");
        System.out.println("KYD Islas Caimán\t| KZT Kazajstán");
        System.out.println("LAK Laos\t| dolor lumbar Líbano");
        System.out.println("LKR Sri Lanka\t| LRD Liberia");
        System.out.println("LSL Lesoto\t| LYD Libia");
        System.out.println("ENOJADO Marruecos\t| MDL Moldavia");
        System.out.println("mga Madagascar\t| MKD Macedonia del Norte");
        System.out.println("MMK Birmania\t| TMN Mongolia");
        System.out.println("FREGAR Macao\t| MRU Mauritania");
        System.out.println("MURO Mauricio\t| MVR Maldivas");
        System.out.println("MWK Malaui\t| MXN México");
        System.out.println("MYR Malasia\t| MZN Mozambique");
        System.out.println("NAD Namibia\t| NGN Nigeria");
        System.out.println("NÍO Nicaragua\t| NO OK Noruega");
        System.out.println("NPR Nepal\t| moneda neozelandesa Nueva Zelanda");
        System.out.println("OMR Omán\t| PAB Panamá");
        System.out.println("BOLÍGRAFO Perú\t| PGK Papúa Nueva Guinea");
        System.out.println("PHP Filipinas\t| PKR Pakistán");
        System.out.println("PLN Polonia\t| PYG Paraguay");
        System.out.println("QAR Katar\t| RON Rumania");
        System.out.println("RSD Serbia\t| FROTAR Rusia");
        System.out.println("RWF Ruanda\t| RAE Arabia Saudita");
        System.out.println("SBD Islas Salomón\t| RCS Seychelles");
        System.out.println("ODS Sudán\t| coronas suecas Suecia");
        System.out.println("SGD Singapur\t| SHP santa elena");
        System.out.println("LES Sierra Leona\t| LLAMADA DE SOCORRO Somalia");
        System.out.println("SDR Surinam\t| SSP Sudán del Sur");
        System.out.println("ESTN Santo Tomé y Príncipe\t| SYP Siria");
        System.out.println("SZL Suazilandia\t| THB Tailandia");
        System.out.println("TJS Tayikistán\t| TMT Turkmenistán");
        System.out.println("TND Túnez\t| TOP Tonga");
        System.out.println("TRY Turquía\t| TTD Trinidad y Tobago");
        System.out.println("TWD Taiwán\t| TZS Tanzania");
        System.out.println("UAH Ucrania\t| UGX Uganda");
        System.out.println("USD Estados Unidos\t| UYU Uruguay");
        System.out.println("UZS Uzbekistán\t| VES Venezuela");
        System.out.println("VND Vietnam\t| VUV Vanuatu");
        System.out.println("WST Samoa\t| XAF CFA Franc BEAC");
        System.out.println("XAG Plata (onza troy)\t| XAU Oro (onza troy)");
        System.out.println("XCD Dólar del Caribe Oriental\t| XDR Derechos Especiales de Giro");
        System.out.println("XOF CFA Franc BCEAO\t| XPD Paladio (onza troy)");
        System.out.println("XPF Franco CFP\t| XPT Platino (onza troy)");
        System.out.println("YER Yemen\t| ZAR Sudáfrica");
        System.out.println("ZMW Zambia\t| ZWL Zimbabue");
        System.out.println("-------------------------------------------------------------------------------------------");

    }
}
