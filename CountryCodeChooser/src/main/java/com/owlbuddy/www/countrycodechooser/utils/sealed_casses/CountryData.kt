package com.owlbuddy.www.countrycodechooser.utils.sealed_casses
import com.owlbuddy.www.countrycodechooser.R

sealed class CountryData(
    val countryNameResId: Int,
    val flagResId: Int,
    val countryCodeWithPrefix: String,
    val countryCodeWithoutPrefix: String,
    val iso2 : String,
    val iso3Code : String
) {
    object Afghanistan : CountryData(
        R.string.afghanistan,
        R.drawable.afghanistan_flag,
        "+93",
        "93",
        "AF",
        "AFG"
    )

    object Albania : CountryData(
        R.string.albania,
        R.drawable.albania_flag,
        "+355",
        "355",
        "AL",
        "ALB"
    )

    object Algeria : CountryData(
        R.string.algeria,
        R.drawable.algeria_flag,
        "+213",
        "213",
        "DZ",
        "DZA"
    )

    object Andorra : CountryData(
        R.string.andorra,
        R.drawable.andorra_flag,
        "+376",
        "376",
        "AD",
        "AND"
    )

    object Angola : CountryData(
        R.string.angola,
        R.drawable.angola_flag,
        "+244",
        "244",
        "AO",
        "AGO"
    )

    object AntiguaAndBarbuda : CountryData(
        R.string.antigua_and_barbuda,
        R.drawable.antigua_and_barbuda_flag,
        "+1 268",
        "1268",
        "AG",
        "ATG"
    )

    object Argentina : CountryData(
        R.string.argentina,
        R.drawable.argentina_flag,
        "+54",
        "54",
        "AR",
        "ARG"
    )

    object Armenia : CountryData(
        R.string.armenia,
        R.drawable.armenia_flag,
        "+374",
        "374",
        "AM",
        "ARM"
    )

    object Australia : CountryData(
        R.string.australia,
        R.drawable.australia_flag,
        "+61",
        "61",
        "AU",
        "AUS"
    )

    object Austria : CountryData(
        R.string.austria,
        R.drawable.austria_flag,
        "+43",
        "43",
        "AT",
        "AUT"
    )

    object Azerbaijan : CountryData(
        R.string.azerbaijan,
        R.drawable.azerbaijan_flag,
        "+994",
        "994",
        "AZ",
        "AZE"
    )

    object Bahamas : CountryData(
        R.string.bahamas,
        R.drawable.bahamas_flag,
        "+1 242",
        "1242",
        "BS",
        "BHS"
    )

    object Bahrain : CountryData(
        R.string.bahrain,
        R.drawable.bahrain_flag,
        "+973",
        "973",
        "BH",
        "BHR"
    )

    object Bangladesh : CountryData(
        R.string.bangladesh,
        R.drawable.bangladesh_flag,
        "+880",
        "880",
        "BD",
        "BGD"
    )

    object Barbados : CountryData(
        R.string.barbados,
        R.drawable.barbados_flag,
        "+1 246",
        "1246",
        "BB",
        "BRB"
    )

    object Belarus : CountryData(
        R.string.belarus,
        R.drawable.belarus_flag,
        "+375",
        "375",
        "BY",
        "BLR"
    )

    object Belgium : CountryData(
        R.string.belgium,
        R.drawable.belgium_flag,
        "+32",
        "32",
        "BE",
        "BEL"
    )

    object Belize : CountryData(
        R.string.belize,
        R.drawable.belize_flag,
        "+501",
        "501",
        "BZ",
        "BLZ"
    )

    object Benin : CountryData(
        R.string.benin,
        R.drawable.benin_flag,
        "+229",
        "229",
        "BJ",
        "BEN"
    )

    object Bhutan : CountryData(
        R.string.bhutan,
        R.drawable.bhutan_flag,
        "+975",
        "975",
        "BT",
        "BTN"
    )

    object Bolivia : CountryData(
        R.string.bolivia,
        R.drawable.bolivia_flag,
        "+591",
        "591",
        "BO",
        "BOL"
    )

    object BosniaAndHerzegovina : CountryData(
        R.string.bosnia_and_herzegovina,
        R.drawable.bosnia_and_herzegovina_flag,
        "+387",
        "387",
        "BA",
        "BIH"
    )

    object Botswana : CountryData(
        R.string.botswana,
        R.drawable.botswana_flag,
        "+267",
        "267",
        "BW",
        "BWA"
    )

    object Brazil : CountryData(
        R.string.brazil,
        R.drawable.brazil_flag,
        "+55",
        "55",
        "BR",
        "BRA"
    )

    object Brunei : CountryData(
        R.string.brunei,
        R.drawable.brunei_flag,
        "+673",
        "673",
        "BN",
        "BRN"
    )

    object Bulgaria : CountryData(
        R.string.bulgaria,
        R.drawable.bulgaria_flag,
        "+359",
        "359",
        "BG",
        "BGR"
    )

    object BurkinaFaso : CountryData(
        R.string.burkina_faso,
        R.drawable.burkina_faso_flag,
        "+226",
        "226",
        "BF",
        "BFA"
    )

    object Burundi : CountryData(
        R.string.burundi,
        R.drawable.burundi_flag,
        "+257",
        "257",
        "BI",
        "BDI"
    )

    object Cambodia : CountryData(
        R.string.cambodia,
        R.drawable.cambodia_flag,
        "+855",
        "855",
        "KH",
        "KHM"
    )

    object Cameroon : CountryData(
        R.string.cameroon,
        R.drawable.cameroon_flag,
        "+237",
        "237",
        "CM",
        "CMR"
    )

    object Canada : CountryData(
        R.string.canada,
        R.drawable.canada_flag,
        "+1",
        "1",
        "CA",
        "CAN"
    )

    object CapeVerde : CountryData(
        R.string.cape_verde,
        R.drawable.cape_verde_flag,
        "+238",
        "238",
        "CV",
        "CPV"
    )

    object CentralAfricanRepublic : CountryData(
        R.string.central_african_republic,
        R.drawable.central_african_republic_flag,
        "+236",
        "236",
        "CF",
        "CAF"
    )

    object Chad : CountryData(
        R.string.chad,
        R.drawable.chad_flag,
        "+235",
        "235",
        "TD",
        "TCD"
    )

    object Chile : CountryData(
        R.string.chile,
        R.drawable.chile_flag,
        "+56",
        "56",
        "CL",
        "CHL"
    )

    object China : CountryData(
        R.string.china,
        R.drawable.china_flag,
        "+86",
        "86",
        "CN",
        "CHN"
    )

    object Colombia : CountryData(
        R.string.colombia,
        R.drawable.colombia_flag,
        "+57",
        "57",
        "CO",
        "COL"
    )

    object Comoros : CountryData(
        R.string.comoros,
        R.drawable.comoros_flag,
        "+269",
        "269",
        "KM",
        "COM"
    )

    object Congo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.congo_flag,
        "+242",
        "242",
        "CG",
        "COG"
    )

    object CostaRica : CountryData(
        R.string.costa_rica,
        R.drawable.costa_rica_flag,
        "+506",
        "506",
        "CR",
        "CRI"
    )

    object Croatia : CountryData(
        R.string.croatia,
        R.drawable.croatia_flag,
        "+385",
        "385",
        "HR",
        "HRV"
    )

    object Cuba : CountryData(
        R.string.cuba,
        R.drawable.cuba_flag,
        "+53",
        "53",
        "CU",
        "CUB"
    )

    object Cyprus : CountryData(
        R.string.cyprus,
        R.drawable.cyprus_flag,
        "+357",
        "357",
        "CY",
        "CYP"
    )

    object CzechRepublic : CountryData(
        R.string.czech_republic,
        R.drawable.czech_republic_flag,
        "+420",
        "420",
        "CZ",
        "CZE"
    )

    object DemocraticRepublicOfCongo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.democratic_republic_of_congo_flag,
        "+243",
        "243",
        "CD",
        "COD"
    )

    object Denmark : CountryData(
        R.string.denmark,
        R.drawable.denmark_flag,
        "+45",
        "45",
        "DK",
        "DNK"
    )

    object Djibouti : CountryData(
        R.string.djibouti,
        R.drawable.djibouti_flag,
        "+253",
        "253",
        "DJ",
        "DJI"
    )

    object Dominica : CountryData(
        R.string.dominica,
        R.drawable.dominica_flag,
        "+1 767",
        "1767",
        "DM",
        "DMA"
    )

    object DominicanRepublic : CountryData(
        R.string.dominican_republic,
        R.drawable.dominican_republic_flag,
        "+1 809",
        "1809",
        "DO",
        "DOM"
    )

    object Ecuador : CountryData(
        R.string.ecuador,
        R.drawable.ecuador_flag,
        "+593",
        "593",
        "EC",
        "ECU"
    )

    object Egypt : CountryData(
        R.string.egypt,
        R.drawable.egypt_flag,
        "+20",
        "20",
        "EG",
        "EGY"
    )

    object ElSalvador : CountryData(
        R.string.el_salvador,
        R.drawable.el_salvador_flag,
        "+503",
        "503",
        "SV",
        "SLV"
    )

    object EquatorialGuinea : CountryData(
        R.string.equatorial_guinea,
        R.drawable.equatorial_guinea_flag,
        "+240",
        "240",
        "GQ",
        "GNQ"
    )

    object Eritrea : CountryData(
        R.string.eritrea,
        R.drawable.eritrea_flag,
        "+291",
        "291",
        "ER",
        "ERI"
    )

    object Estonia : CountryData(
        R.string.estonia,
        R.drawable.estonia_flag,
        "+372",
        "372",
        "EE",
        "EST"
    )

    object Eswatini : CountryData(
        R.string.eswatini,
        R.drawable.eswatini_flag,
        "+268",
        "268",
        "SZ",
        "SWZ"
    )

    object Ethiopia : CountryData(
        R.string.ethiopia,
        R.drawable.ethiopia_flag,
        "+251",
        "251",
        "ET",
        "ETH"
    )

    object Fiji : CountryData(
        R.string.fiji,
        R.drawable.fiji_flag,
        "+679",
        "679",
        "FJ",
        "FJI"
    )

    object Finland : CountryData(
        R.string.finland,
        R.drawable.finland_flag,
        "+358",
        "358",
        "FI",
        "FIN"
    )

    object France : CountryData(
        R.string.france,
        R.drawable.france_flag,
        "+33",
        "33",
        "FR",
        "FRA"
    )

    object Gabon : CountryData(
        R.string.gabon,
        R.drawable.gabon_flag,
        "+241",
        "241",
        "GA",
        "GAB"
    )

    object Gambia : CountryData(
        R.string.gambia,
        R.drawable.gambia_flag,
        "+220",
        "220",
        "GM",
        "GMB"
    )

    object Georgia : CountryData(
        R.string.georgia,
        R.drawable.georgia_flag,
        "+995",
        "995",
        "GE",
        "GEO"
    )

    object Germany : CountryData(
        R.string.germany,
        R.drawable.germany_flag,
        "+49",
        "49",
        "DE",
        "DEU"
    )

    object Ghana : CountryData(
        R.string.ghana,
        R.drawable.ghana_flag,
        "+233",
        "233",
        "GH",
        "GHA"
    )

    object Greece : CountryData(
        R.string.greece,
        R.drawable.greece_flag,
        "+30",
        "30",
        "GR",
        "GRC"
    )

    object Grenada : CountryData(
        R.string.grenada,
        R.drawable.grenada_flag,
        "+1 473",
        "1473",
        "GD",
        "GRD"
    )

    object Guatemala : CountryData(
        R.string.guatemala,
        R.drawable.guatemala_flag,
        "+502",
        "502",
        "GT",
        "GTM"
    )

    object Guinea : CountryData(
        R.string.guinea,
        R.drawable.guinea_flag,
        "+224",
        "224",
        "GN",
        "GIN"
    )

    object GuineaBissau : CountryData(
        R.string.guinea_bissau,
        R.drawable.guinea_bissau_flag,
        "+245",
        "245",
        "GW",
        "GNB"
    )

    object Guyana : CountryData(
        R.string.guyana,
        R.drawable.guyana_flag,
        "+592",
        "592",
        "GY",
        "GUY"
    )

    object Haiti : CountryData(
        R.string.haiti,
        R.drawable.haiti_flag,
        "+509",
        "509",
        "HT",
        "HTI"
    )

    object Honduras : CountryData(
        R.string.honduras,
        R.drawable.honduras_flag,
        "+504",
        "504",
        "HN",
        "HND"
    )

    object Hungary : CountryData(
        R.string.hungary,
        R.drawable.hungary_flag,
        "+36",
        "36",
        "HU",
        "HUN"
    )

    object Iceland : CountryData(
        R.string.iceland,
        R.drawable.iceland_flag,
        "+354",
        "354",
        "IS",
        "ISL"
    )

    object India : CountryData(
        R.string.india,
        R.drawable.india_flag,
        "+91",
        "91",
        "IN",
        "IND"
    )

    object Indonesia : CountryData(
        R.string.indonesia,
        R.drawable.indonesia_flag,
        "+62",
        "62",
        "ID",
        "IDN"
    )

    object Iran : CountryData(
        R.string.iran,
        R.drawable.iran_flag,
        "+98",
        "98",
        "IR",
        "IRN"
    )

    object Iraq : CountryData(
        R.string.iraq,
        R.drawable.iraq_flag,
        "+964",
        "964",
        "IQ",
        "IRQ"
    )

    object Ireland : CountryData(
        R.string.ireland,
        R.drawable.ireland_flag,
        "+353",
        "353",
        "IE",
        "IRL"
    )

    object Israel : CountryData(
        R.string.israel,
        R.drawable.israel_flag,
        "+972",
        "972",
        "IL",
        "ISR"
    )

    object Italy : CountryData(
        R.string.italy,
        R.drawable.italy_flag,
        "+39",
        "39",
        "IT",
        "ITA"
    )

    object IvoryCoast : CountryData(
        R.string.ivory_coast,
        R.drawable.ivory_coast_flag,
        "+225",
        "225",
        "CI",
        "CIV"
    )

    object Jamaica : CountryData(
        R.string.jamaica,
        R.drawable.jamaica_flag,
        "+1 876",
        "1876",
        "JM",
        "JAM"
    )

    object Japan : CountryData(
        R.string.japan,
        R.drawable.japan_flag,
        "+81",
        "81",
        "JP",
        "JPN"
    )

    object Jordan : CountryData(
        R.string.jordan,
        R.drawable.jordan_flag,
        "+962",
        "962",
        "JO",
        "JOR"
    )

    object Kazakhstan : CountryData(
        R.string.kazakhstan,
        R.drawable.kazakhstan_flag,
        "+7",
        "7",
        "KZ",
        "KAZ"
    )

    object Kenya : CountryData(
        R.string.kenya,
        R.drawable.kenya_flag,
        "+254",
        "254",
        "KE",
        "KEN"
    )

    object Kiribati : CountryData(
        R.string.kiribati,
        R.drawable.kiribati_flag,
        "+686",
        "686",
        "KI",
        "KIR"
    )

    object Kosovo : CountryData(
        R.string.kosovo,
        R.drawable.kosovo_flag,
        "+383",
        "383",
        "XK",
        "XKX"
    )

    object Kuwait : CountryData(
        R.string.kuwait,
        R.drawable.kuwait_flag,
        "+965",
        "965",
        "KW",
        "KWT"
    )

    object Kyrgyzstan : CountryData(
        R.string.kyrgyzstan,
        R.drawable.kyrgyzstan_flag,
        "+996",
        "996",
        "KG",
        "KGZ"
    )

    object Laos : CountryData(
        R.string.laos,
        R.drawable.laos_flag,
        "+856",
        "856",
        "LA",
        "LAO"
    )

    object Latvia : CountryData(
        R.string.latvia,
        R.drawable.latvia_flag,
        "+371",
        "371",
        "LV",
        "LVA"
    )

    object Lebanon : CountryData(
        R.string.lebanon,
        R.drawable.lebanon_flag,
        "+961",
        "961",
        "LB",
        "LBN"
    )

    object Lesotho : CountryData(
        R.string.lesotho,
        R.drawable.lesotho_flag,
        "+266",
        "266",
        "LS",
        "LSO"
    )

    object Liberia : CountryData(
        R.string.liberia,
        R.drawable.liberia_flag,
        "+231",
        "231",
        "LR",
        "LBR"
    )

    object Libya : CountryData(
        R.string.libya,
        R.drawable.libya_flag,
        "+218",
        "218",
        "LY",
        "LBY"
    )

    object Liechtenstein : CountryData(
        R.string.liechtenstein,
        R.drawable.liechtenstein_flag,
        "+423",
        "423",
        "LI",
        "LIE"
    )

    object Lithuania : CountryData(
        R.string.lithuania,
        R.drawable.lithuania_flag,
        "+370",
        "370",
        "LT",
        "LTU"
    )

    object Luxembourg : CountryData(
        R.string.luxembourg,
        R.drawable.luxembourg_flag,
        "+352",
        "352",
        "LU",
        "LUX"
    )

    object Madagascar : CountryData(
        R.string.madagascar,
        R.drawable.madagascar_flag,
        "+261",
        "261",
        "MG",
        "MDG"
    )

    object Malawi : CountryData(
        R.string.malawi,
        R.drawable.malawi_flag,
        "+265",
        "265",
        "MW",
        "MWI"
    )

    object Malaysia : CountryData(
        R.string.malaysia,
        R.drawable.malaysia_flag,
        "+60",
        "60",
        "MY",
        "MYS"
    )

    object Maldives : CountryData(
        R.string.maldives,
        R.drawable.maldives_flag,
        "+960",
        "960",
        "MV",
        "MDV"
    )

    object Mali : CountryData(
        R.string.mali,
        R.drawable.mali_flag,
        "+223",
        "223",
        "ML",
        "MLI"
    )

    object Malta : CountryData(
        R.string.malta,
        R.drawable.malta_flag,
        "+356",
        "356",
        "MT",
        "MLT"
    )

    object MarshallIslands : CountryData(
        R.string.marshall_islands,
        R.drawable.marshall_islands_flag,
        "+692",
        "692",
        "MH",
        "MHL"
    )

    object Mauritania : CountryData(
        R.string.mauritania,
        R.drawable.mauritania_flag,
        "MR",
        "+222",
        "222"
    )
        
    object Mauritius : CountryData(
        R.string.mauritius,
        R.drawable.mauritius_flag,
        "+230",
        "230",
        "MU",
        "MUS"
    )

    object Mexico : CountryData(
        R.string.mexico,
        R.drawable.mexico_flag,
        "+52",
        "52",
        "MX",
        "MEX"
    )

    object Micronesia : CountryData(
        R.string.micronesia,
        R.drawable.micronesia_flag,
        "+691",
        "691",
        "FM",
        "FSM"
    )

    object Moldova : CountryData(
        R.string.moldova,
        R.drawable.moldova_flag,
        "+373",
        "373",
        "MD",
        "MDA"
    )

    object Monaco : CountryData(
        R.string.monaco,
        R.drawable.monaco_flag,
        "+377",
        "377",
        "MC",
        "MCO"
    )

    object Mongolia : CountryData(
        R.string.mongolia,
        R.drawable.mongolia_flag,
        "+976",
        "976",
        "MN",
        "MNG"
    )

    object Montenegro : CountryData(
        R.string.montenegro,
        R.drawable.montenegro_flag,
        "+382",
        "382",
        "ME",
        "MNE"
    )

    object Morocco : CountryData(
        R.string.morocco,
        R.drawable.morocco_flag,
        "+212",
        "212",
        "MA",
        "MAR"
    )

    object Mozambique : CountryData(
        R.string.mozambique,
        R.drawable.mozambique_flag,
        "+258",
        "258",
        "MZ",
        "MOZ"
    )

    object Myanmar : CountryData(
        R.string.myanmar,
        R.drawable.myanmar_flag,
        "+95",
        "95",
        "MM",
        "MMR"
    )

    object Namibia : CountryData(
        R.string.namibia,
        R.drawable.namibia_flag,
        "+264",
        "264",
        "NA",
        "NAM"
    )

    object Nauru : CountryData(
        R.string.nauru,
        R.drawable.nauru_flag,
        "+674",
        "674",
        "NR",
        "NRU"
    )

    object Nepal : CountryData(
        R.string.nepal,
        R.drawable.nepal_flag,
        "+977",
        "977",
        "NP",
        "NPL"
    )

    object Netherlands : CountryData(
        R.string.netherlands,
        R.drawable.netherlands_flag,
        "+31",
        "31",
        "NL",
        "NLD"
    )

    object NewZealand : CountryData(
        R.string.new_zealand,
        R.drawable.new_zealand_flag,
        "+64",
        "64",
        "NZ",
        "NZL"
    )

    object Nicaragua : CountryData(
        R.string.nicaragua,
        R.drawable.nicaragua_flag,
        "+505",
        "505",
        "NI",
        "NIC"
    )

    object Niger : CountryData(
        R.string.niger,
        R.drawable.niger_flag,
        "+227",
        "227",
        "NE",
        "NER"
    )

    object Nigeria : CountryData(
        R.string.nigeria,
        R.drawable.nigeria_flag,
        "+234",
        "234",
        "NG",
        "NGA"
    )

    object NorthKorea : CountryData(
        R.string.north_korea,
        R.drawable.north_korea_flag,
        "+850",
        "850",
        "KP",
        "PRK"
    )

    object NorthMacedonia : CountryData(
        R.string.north_macedonia,
        R.drawable.north_macedonia_flag,
        "+389",
        "389",
        "MK",
        "MKD"
    )

    object Norway : CountryData(
        R.string.norway,
        R.drawable.norway_flag,
        "+47",
        "47",
        "NO",
        "NOR"
    )

    object Oman : CountryData(
        R.string.oman,
        R.drawable.oman_flag,
        "+968",
        "968",
        "OM",
        "OMN"
    )

    object Pakistan : CountryData(
        R.string.pakistan,
        R.drawable.pakistan_flag,
        "+92",
        "92",
        "PK",
        "PAK"
    )

    object Palau : CountryData(
        R.string.palau,
        R.drawable.palau_flag,
        "+680",
        "680",
        "PW",
        "PLW"
    )

    object Panama : CountryData(
        R.string.panama,
        R.drawable.panama_flag,
        "+507",
        "507",
        "PA",
        "PAN"
    )

    object PapuaNewGuinea : CountryData(
        R.string.papua_new_guinea,
        R.drawable.papua_new_guinea_flag,
        "+675",
        "675",
        "PG",
        "PNG"
    )

    object Paraguay : CountryData(
        R.string.paraguay,
        R.drawable.paraguay_flag,
        "+595",
        "595",
        "PY",
        "PRY"
    )

    object Peru : CountryData(
        R.string.peru,
        R.drawable.peru_flag,
        "+51",
        "51",
        "PE",
        "PER"
    )

    object Philippines : CountryData(
        R.string.philippines,
        R.drawable.philippines_flag,
        "+63",
        "63",
        "PH",
        "PHL"
    )

    object Poland : CountryData(
        R.string.poland,
        R.drawable.poland_flag,
        "+48",
        "48",
        "PL",
        "POL"
    )

    object Portugal : CountryData(
        R.string.portugal,
        R.drawable.portugal_flag,
        "+351",
        "351",
        "PT",
        "PRT"
    )

    object Qatar : CountryData(
        R.string.qatar,
        R.drawable.qatar_flag,
        "+974",
        "974",
        "QA",
        "QAT"
    )

    object Romania : CountryData(
        R.string.romania,
        R.drawable.romania_flag,
        "+40",
        "40",
        "RO",
        "ROU"
    )

    object Russia : CountryData(
        R.string.russia,
        R.drawable.russia_flag,
        "+7",
        "7",
        "RU",
        "RUS"
    )

    object Rwanda : CountryData(
        R.string.rwanda,
        R.drawable.rwanda_flag,
        "+250",
        "250",
        "RW",
        "RWA"
    )

    object SaintKittsAndNevis : CountryData(
        R.string.saint_kitts_and_nevis,
        R.drawable.saint_kitts_and_nevis_flag,
        "+1869",
        "1869",
        "KN",
        "KNA"
    )

    object SaintLucia : CountryData(
        R.string.saint_lucia,
        R.drawable.saint_lucia_flag,
        "+1758",
        "1758",
        "LC",
        "LCA"
    )

    object SaintVincentAndTheGrenadines : CountryData(
        R.string.saint_vincent_and_the_grenadines,
        R.drawable.saint_vincent_and_the_grenadines_flag,
        "+1784",
        "1784",
        "VC",
        "VCT"
    )

    object Samoa : CountryData(
        R.string.samoa,
        R.drawable.samoa_flag,
        "+685",
        "685",
        "WS",
        "WSM"
    )

    object SanMarino : CountryData(
        R.string.san_marino,
        R.drawable.san_marino_flag,
        "+378",
        "378",
        "SM",
        "SMR"
    )

    object SaoTomeAndPrincipe : CountryData(
        R.string.sao_tome_and_principe,
        R.drawable.sao_tome_and_principe_flag,
        "+239",
        "239",
        "ST",
        "STP"
    )

    object SaudiArabia : CountryData(
        R.string.saudi_arabia,
        R.drawable.saudi_arabia_flag,
        "+966",
        "966",
        "SA",
        "SAU"
    )

    object Senegal : CountryData(
        R.string.senegal,
        R.drawable.senegal_flag,
        "+221",
        "221",
        "SN",
        "SEN"
    )

    object Serbia : CountryData(
        R.string.serbia,
        R.drawable.serbia_flag,
        "+381",
        "381",
        "RS",
        "SRB"
    )

    object Seychelles : CountryData(
        R.string.seychelles,
        R.drawable.seychelles_flag,
        "+248",
        "248",
        "SC",
        "SYC"
    )

    object SierraLeone : CountryData(
        R.string.sierra_leone,
        R.drawable.sierra_leone_flag,
        "+232",
        "232",
        "SL",
        "SLE"
    )

    object Singapore : CountryData(
        R.string.singapore,
        R.drawable.singapore_flag,
        "+65",
        "65",
        "SG",
        "SGP"
    )

    object Slovakia : CountryData(
        R.string.slovakia,
        R.drawable.slovakia_flag,
        "+421",
        "421",
        "SK",
        "SVK"
    )

    object Slovenia : CountryData(
        R.string.slovenia,
        R.drawable.slovenia_flag,
        "+386",
        "386",
        "SI",
        "SVN"
    )

    object SolomonIslands : CountryData(
        R.string.solomon_islands,
        R.drawable.solomon_islands_flag,
        "+677",
        "677",
        "SB",
        "SLB"
    )

    object Somalia : CountryData(
        R.string.somalia,
        R.drawable.somalia_flag,
        "+252",
        "252",
        "SO",
        "SOM"
    )

    object SouthAfrica : CountryData(
        R.string.south_africa,
        R.drawable.south_africa_flag,
        "+27",
        "27",
        "ZA",
        "ZAF"
    )

    object SouthKorea : CountryData(
        R.string.south_korea,
        R.drawable.south_korea_flag,
        "+82",
        "82",
        "KR",
        "KOR"
    )

    object SouthSudan : CountryData(
        R.string.south_sudan,
        R.drawable.south_sudan_flag,
        "+211",
        "211",
        "SS",
        "SSD"
    )

    object Spain : CountryData(
        R.string.spain,
        R.drawable.spain_flag,
        "+34",
        "34",
        "ES",
        "ESP"
    )

    object SriLanka : CountryData(
        R.string.sri_lanka,
        R.drawable.sri_lanka_flag,
        "+94",
        "94",
        "LK",
        "LKA"
    )

    object Sudan : CountryData(
        R.string.sudan,
        R.drawable.sudan_flag,
        "+249",
        "249",
        "SD",
        "SDN"
    )

    object Suriname : CountryData(
        R.string.suriname,
        R.drawable.suriname_flag,
        "+597",
        "597",
        "SR",
        "SUR"
    )

    object Sweden : CountryData(
        R.string.sweden,
        R.drawable.sweden_flag,
        "+46",
        "46",
        "SE",
        "SWE"
    )

    object Switzerland : CountryData(
        R.string.switzerland,
        R.drawable.switzerland_flag,
        "+41",
        "41",
        "CH",
        "CHE"
    )

    object Syria : CountryData(
        R.string.syria,
        R.drawable.syria_flag,
        "+963",
        "963",
        "SY",
        "SYR"
    )

    object Taiwan : CountryData(
        R.string.taiwan,
        R.drawable.taiwan_flag,
        "+886",
        "886",
        "TW",
        "TWN"
    )

    object Tajikistan : CountryData(
        R.string.tajikistan,
        R.drawable.tajikistan_flag,
        "+992",
        "992",
        "TJ",
        "TJK"
    )

    object Tanzania : CountryData(
        R.string.tanzania,
        R.drawable.tanzania_flag,
        "+255",
        "255",
        "TZ",
        "TZA"
    )

    object Thailand : CountryData(
        R.string.thailand,
        R.drawable.thailand_flag,
        "+66",
        "66",
        "TH",
        "THA"
    )

    object TimorLeste : CountryData(
        R.string.timor_leste,
        R.drawable.timor_leste_flag,
        "+670",
        "670",
        "TL",
        "TLS"
    )

    object Togo : CountryData(
        R.string.togo,
        R.drawable.togo_flag,
        "+228",
        "228",
        "TG",
        "TGO"
    )

    object Tonga : CountryData(
        R.string.tonga,
        R.drawable.tonga_flag,
        "+676",
        "676",
        "TO",
        "TON"
    )

    object TrinidadAndTobago : CountryData(
        R.string.trinidad_and_tobago,
        R.drawable.trinidad_and_tobago_flag,
        "+1 868",
        "1868",
        "TT",
        "TTO"
    )

    object Tunisia : CountryData(
        R.string.tunisia,
        R.drawable.tunisia_flag,
        "+216",
        "216",
        "TN",
        "TUN"
    )

    object Turkey : CountryData(
        R.string.turkey,
        R.drawable.turkey_flag,
        "+90",
        "90",
        "TR",
        "TUR"
    )

    object Turkmenistan : CountryData(
        R.string.turkmenistan,
        R.drawable.turkmenistan_flag,
        "+993",
        "993",
        "TM",
        "TKM"
    )

    object Tuvalu : CountryData(
        R.string.tuvalu,
        R.drawable.tuvalu_flag,
        "+688",
        "688",
        "TV",
        "TUV"
    )

    object Uganda : CountryData(
        R.string.uganda,
        R.drawable.uganda_flag,
        "+256",
        "256",
        "UG",
        "UGA"
    )

    object Ukraine : CountryData(
        R.string.ukraine,
        R.drawable.ukraine_flag,
        "+380",
        "380",
        "UA",
        "UKR"
    )

    object UnitedArabEmirates : CountryData(
        R.string.united_arab_emirates,
        R.drawable.united_arab_emirates_flag,
        "+971",
        "971",
        "AE",
        "ARE"
    )

    object UnitedKingdom : CountryData(
        R.string.united_kingdom,
        R.drawable.united_kingdom_flag,
        "+44",
        "44",
        "GB",
        "GBR"
    )

    object UnitedStates : CountryData(
        R.string.united_states,
        R.drawable.united_states_flag,
        "+1",
        "1",
        "US",
        "USA"
    )

    object Uruguay : CountryData(
        R.string.uruguay,
        R.drawable.uruguay_flag,
        "+598",
        "598",
        "UY",
        "URY"
    )

    object Uzbekistan : CountryData(
        R.string.uzbekistan,
        R.drawable.uzbekistan_flag,
        "+998",
        "998",
        "UZ",
        "UZB"
    )

    object Vanuatu : CountryData(
        R.string.vanuatu,
        R.drawable.vanuatu_flag,
        "+678",
        "678",
        "VU",
        "VUT"
    )

    object VaticanCity : CountryData(
        R.string.vatican_city,
        R.drawable.vatican_city_flag,
        "+379",
        "379",
        "VA",
        "VAT"
    )

    object Vietnam : CountryData(
        R.string.vietnam,
        R.drawable.vietnam_flag,
        "+84",
        "84",
        "VN",
        "VNM"
    )

    object Venezuela : CountryData(
        R.string.venezuela,
        R.drawable.venezuela_flag,
        "VE",
        "+58",
        "58"
    )
        
    object Yemen : CountryData(
        R.string.yemen,
        R.drawable.yemen_flag,
        "+967",
        "967",
        "YE",
        "YEM"
    )

    object Zambia : CountryData(
        R.string.zambia,
        R.drawable.zambia_flag,
        "+260",
        "260",
        "ZM",
        "ZMB"
    )

    object Zimbabwe : CountryData(
        R.string.zimbabwe,
        R.drawable.zimbabwe_flag,
        "+263",
        "263",
        "ZW",
        "ZWE"
    )
}

fun getAllCountries(): List<CountryData> {
    val countryList = mutableListOf<CountryData>()

    countryList.add(CountryData.Afghanistan)
    countryList.add(CountryData.Albania)
    countryList.add(CountryData.Algeria)
    countryList.add(CountryData.Andorra)
    countryList.add(CountryData.Angola)
    countryList.add(CountryData.AntiguaAndBarbuda)
    countryList.add(CountryData.Argentina)
    countryList.add(CountryData.Armenia)
    countryList.add(CountryData.Australia)
    countryList.add(CountryData.Austria)
    countryList.add(CountryData.Azerbaijan)
    countryList.add(CountryData.Bahamas)
    countryList.add(CountryData.Bahrain)
    countryList.add(CountryData.Bangladesh)
    countryList.add(CountryData.Barbados)
    countryList.add(CountryData.Belarus)
    countryList.add(CountryData.Belgium)
    countryList.add(CountryData.Belize)
    countryList.add(CountryData.Benin)
    countryList.add(CountryData.Bhutan)
    countryList.add(CountryData.Bolivia)
    countryList.add(CountryData.BosniaAndHerzegovina)
    countryList.add(CountryData.Botswana)
    countryList.add(CountryData.Brazil)
    countryList.add(CountryData.Brunei)
    countryList.add(CountryData.Bulgaria)
    countryList.add(CountryData.BurkinaFaso)
    countryList.add(CountryData.Burundi)
    countryList.add(CountryData.CapeVerde)
    countryList.add(CountryData.Cambodia)
    countryList.add(CountryData.Cameroon)
    countryList.add(CountryData.Canada)
    countryList.add(CountryData.CentralAfricanRepublic)
    countryList.add(CountryData.Chad)
    countryList.add(CountryData.Chile)
    countryList.add(CountryData.China)
    countryList.add(CountryData.Colombia)
    countryList.add(CountryData.Comoros)
    countryList.add(CountryData.Congo)
    countryList.add(CountryData.CostaRica)
    countryList.add(CountryData.Croatia)
    countryList.add(CountryData.Cuba)
    countryList.add(CountryData.Cyprus)
    countryList.add(CountryData.CzechRepublic)
    countryList.add(CountryData.DemocraticRepublicOfCongo)
    countryList.add(CountryData.Denmark)
    countryList.add(CountryData.Djibouti)
    countryList.add(CountryData.Dominica)
    countryList.add(CountryData.DominicanRepublic)
    countryList.add(CountryData.Ecuador)
    countryList.add(CountryData.Egypt)
    countryList.add(CountryData.ElSalvador)
    countryList.add(CountryData.EquatorialGuinea)
    countryList.add(CountryData.Eritrea)
    countryList.add(CountryData.Estonia)
    countryList.add(CountryData.Eswatini)
    countryList.add(CountryData.Ethiopia)
    countryList.add(CountryData.Fiji)
    countryList.add(CountryData.Finland)
    countryList.add(CountryData.France)
    countryList.add(CountryData.Gabon)
    countryList.add(CountryData.Gambia)
    countryList.add(CountryData.Georgia)
    countryList.add(CountryData.Germany)
    countryList.add(CountryData.Ghana)
    countryList.add(CountryData.Greece)
    countryList.add(CountryData.Grenada)
    countryList.add(CountryData.Guatemala)
    countryList.add(CountryData.Guinea)
    countryList.add(CountryData.GuineaBissau)
    countryList.add(CountryData.Guyana)
    countryList.add(CountryData.Haiti)
    countryList.add(CountryData.Honduras)
    countryList.add(CountryData.Hungary)
    countryList.add(CountryData.Iceland)
    countryList.add(CountryData.India)
    countryList.add(CountryData.Indonesia)
    countryList.add(CountryData.Iran)
    countryList.add(CountryData.Iraq)
    countryList.add(CountryData.Ireland)
    countryList.add(CountryData.Israel)
    countryList.add(CountryData.Italy)
    countryList.add(CountryData.IvoryCoast)
    countryList.add(CountryData.Jamaica)
    countryList.add(CountryData.Japan)
    countryList.add(CountryData.Jordan)
    countryList.add(CountryData.Kazakhstan)
    countryList.add(CountryData.Kenya)
    countryList.add(CountryData.Kiribati)
    countryList.add(CountryData.Kosovo)
    countryList.add(CountryData.Kuwait)
    countryList.add(CountryData.Kyrgyzstan)
    countryList.add(CountryData.Laos)
    countryList.add(CountryData.Latvia)
    countryList.add(CountryData.Lebanon)
    countryList.add(CountryData.Lesotho)
    countryList.add(CountryData.Liberia)
    countryList.add(CountryData.Libya)
    countryList.add(CountryData.Liechtenstein)
    countryList.add(CountryData.Lithuania)
    countryList.add(CountryData.Luxembourg)
    countryList.add(CountryData.Madagascar)
    countryList.add(CountryData.Malawi)
    countryList.add(CountryData.Malaysia)
    countryList.add(CountryData.Maldives)
    countryList.add(CountryData.Mali)
    countryList.add(CountryData.Malta)
    countryList.add(CountryData.MarshallIslands)
    countryList.add(CountryData.Mauritania)
    countryList.add(CountryData.Mauritius)
    countryList.add(CountryData.Mexico)
    countryList.add(CountryData.Micronesia)
    countryList.add(CountryData.Moldova)
    countryList.add(CountryData.Monaco)
    countryList.add(CountryData.Mongolia)
    countryList.add(CountryData.Montenegro)
    countryList.add(CountryData.Morocco)
    countryList.add(CountryData.Mozambique)
    countryList.add(CountryData.Myanmar)
    countryList.add(CountryData.Namibia)
    countryList.add(CountryData.Nauru)
    countryList.add(CountryData.Nepal)
    countryList.add(CountryData.Netherlands)
    countryList.add(CountryData.NewZealand)
    countryList.add(CountryData.Nicaragua)
    countryList.add(CountryData.Niger)
    countryList.add(CountryData.Nigeria)
    countryList.add(CountryData.NorthKorea)
    countryList.add(CountryData.NorthMacedonia)
    countryList.add(CountryData.Norway)
    countryList.add(CountryData.Oman)
    countryList.add(CountryData.Pakistan)
    countryList.add(CountryData.Palau)
    countryList.add(CountryData.Panama)
    countryList.add(CountryData.PapuaNewGuinea)
    countryList.add(CountryData.Paraguay)
    countryList.add(CountryData.Peru)
    countryList.add(CountryData.Philippines)
    countryList.add(CountryData.Poland)
    countryList.add(CountryData.Portugal)
    countryList.add(CountryData.Qatar)
    countryList.add(CountryData.Romania)
    countryList.add(CountryData.Russia)
    countryList.add(CountryData.Rwanda)
    countryList.add(CountryData.SaintKittsAndNevis)
    countryList.add(CountryData.SaintLucia)
    countryList.add(CountryData.SaintVincentAndTheGrenadines)
    countryList.add(CountryData.Samoa)
    countryList.add(CountryData.SanMarino)
    countryList.add(CountryData.SaoTomeAndPrincipe)
    countryList.add(CountryData.SaudiArabia)
    countryList.add(CountryData.Senegal)
    countryList.add(CountryData.Serbia)
    countryList.add(CountryData.Seychelles)
    countryList.add(CountryData.SierraLeone)
    countryList.add(CountryData.Singapore)
    countryList.add(CountryData.Slovakia)
    countryList.add(CountryData.Slovenia)
    countryList.add(CountryData.SolomonIslands)
    countryList.add(CountryData.Somalia)
    countryList.add(CountryData.SouthAfrica)
    countryList.add(CountryData.SouthKorea)
    countryList.add(CountryData.SouthSudan)
    countryList.add(CountryData.Spain)
    countryList.add(CountryData.SriLanka)
    countryList.add(CountryData.Sudan)
    countryList.add(CountryData.Suriname)
    countryList.add(CountryData.Sweden)
    countryList.add(CountryData.Switzerland)
    countryList.add(CountryData.Syria)
    countryList.add(CountryData.Taiwan)
    countryList.add(CountryData.Tajikistan)
    countryList.add(CountryData.Tanzania)
    countryList.add(CountryData.Thailand)
    countryList.add(CountryData.TimorLeste)
    countryList.add(CountryData.Togo)
    countryList.add(CountryData.Tonga)
    countryList.add(CountryData.TrinidadAndTobago)
    countryList.add(CountryData.Tunisia)
    countryList.add(CountryData.Turkey)
    countryList.add(CountryData.Turkmenistan)
    countryList.add(CountryData.Tuvalu)
    countryList.add(CountryData.Uganda)
    countryList.add(CountryData.Ukraine)
    countryList.add(CountryData.UnitedArabEmirates)
    countryList.add(CountryData.UnitedKingdom)
    countryList.add(CountryData.UnitedStates)
    countryList.add(CountryData.Uruguay)
    countryList.add(CountryData.Uzbekistan)
    countryList.add(CountryData.Vanuatu)
    countryList.add(CountryData.VaticanCity)
    countryList.add(CountryData.Venezuela)
    countryList.add(CountryData.Vietnam)
    countryList.add(CountryData.Yemen)
    countryList.add(CountryData.Zambia)
    countryList.add(CountryData.Zimbabwe)

    return countryList.toList()
}
