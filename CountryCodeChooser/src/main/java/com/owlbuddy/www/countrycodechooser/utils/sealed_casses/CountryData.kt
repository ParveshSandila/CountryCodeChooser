package com.owlbuddy.www.countrycodechooser.utils.sealed_casses
import com.owlbuddy.www.countrycodechooser.R

sealed class CountryData(
    val countryNameResId: Int,
    val flagResId: Int,
    val countryCode: String,
    val iso2Code : String,
    val iso3Code : String
) {

    val countryCodeWithPrefix: String = "+$countryCode"
    data object Afghanistan : CountryData(
        R.string.afghanistan,
        R.drawable.afghanistan_flag,
        "93",
        "AF",
        "AFG"
    )

    data object Albania : CountryData(
        R.string.albania,
        R.drawable.albania_flag,
        "355",
        "AL",
        "ALB"
    )

    data object Algeria : CountryData(
        R.string.algeria,
        R.drawable.algeria_flag,
        "213",
        "DZ",
        "DZA"
    )

    data object Andorra : CountryData(
        R.string.andorra,
        R.drawable.andorra_flag,
        "376",
        "AD",
        "AND"
    )

    data object Angola : CountryData(
        R.string.angola,
        R.drawable.angola_flag,
        "244",
        "AO",
        "AGO"
    )

    data object AntiguaAndBarbuda : CountryData(
        R.string.antigua_and_barbuda,
        R.drawable.antigua_and_barbuda_flag,
        "1268",
        "AG",
        "ATG"
    )

    data object Argentina : CountryData(
        R.string.argentina,
        R.drawable.argentina_flag,
        "54",
        "AR",
        "ARG"
    )

    data object Armenia : CountryData(
        R.string.armenia,
        R.drawable.armenia_flag,
        "374",
        "AM",
        "ARM"
    )

    data object Australia : CountryData(
        R.string.australia,
        R.drawable.australia_flag,
        "61",
        "AU",
        "AUS"
    )

    data object Austria : CountryData(
        R.string.austria,
        R.drawable.austria_flag,
        "43",
        "AT",
        "AUT"
    )

    data object Azerbaijan : CountryData(
        R.string.azerbaijan,
        R.drawable.azerbaijan_flag,
        "994",
        "AZ",
        "AZE"
    )

    data object Bahamas : CountryData(
        R.string.bahamas,
        R.drawable.bahamas_flag,
        "1242",
        "BS",
        "BHS"
    )

    data object Bahrain : CountryData(
        R.string.bahrain,
        R.drawable.bahrain_flag,
        "973",
        "BH",
        "BHR"
    )

    data object Bangladesh : CountryData(
        R.string.bangladesh,
        R.drawable.bangladesh_flag,
        "880",
        "BD",
        "BGD"
    )

    data object Barbados : CountryData(
        R.string.barbados,
        R.drawable.barbados_flag,
        "1246",
        "BB",
        "BRB"
    )

    data object Belarus : CountryData(
        R.string.belarus,
        R.drawable.belarus_flag,
        "375",
        "BY",
        "BLR"
    )

    data object Belgium : CountryData(
        R.string.belgium,
        R.drawable.belgium_flag,
        "32",
        "BE",
        "BEL"
    )

    data object Belize : CountryData(
        R.string.belize,
        R.drawable.belize_flag,
        "501",
        "BZ",
        "BLZ"
    )

    data object Benin : CountryData(
        R.string.benin,
        R.drawable.benin_flag,
        "229",
        "BJ",
        "BEN"
    )

    data object Bhutan : CountryData(
        R.string.bhutan,
        R.drawable.bhutan_flag,
        "975",
        "BT",
        "BTN"
    )

    data object Bolivia : CountryData(
        R.string.bolivia,
        R.drawable.bolivia_flag,
        "591",
        "BO",
        "BOL"
    )

    data object BosniaAndHerzegovina : CountryData(
        R.string.bosnia_and_herzegovina,
        R.drawable.bosnia_and_herzegovina_flag,
        "387",
        "BA",
        "BIH"
    )

    data object Botswana : CountryData(
        R.string.botswana,
        R.drawable.botswana_flag,
        "267",
        "BW",
        "BWA"
    )

    data object Brazil : CountryData(
        R.string.brazil,
        R.drawable.brazil_flag,
        "55",
        "BR",
        "BRA"
    )

    data object Brunei : CountryData(
        R.string.brunei,
        R.drawable.brunei_flag,
        "673",
        "BN",
        "BRN"
    )

    data object Bulgaria : CountryData(
        R.string.bulgaria,
        R.drawable.bulgaria_flag,
        "359",
        "BG",
        "BGR"
    )

    data object BurkinaFaso : CountryData(
        R.string.burkina_faso,
        R.drawable.burkina_faso_flag,
        "226",
        "BF",
        "BFA"
    )

    data object Burundi : CountryData(
        R.string.burundi,
        R.drawable.burundi_flag,
        "257",
        "BI",
        "BDI"
    )

    data object Cambodia : CountryData(
        R.string.cambodia,
        R.drawable.cambodia_flag,
        "855",
        "KH",
        "KHM"
    )

    data object Cameroon : CountryData(
        R.string.cameroon,
        R.drawable.cameroon_flag,
        "237",
        "CM",
        "CMR"
    )

    data object Canada : CountryData(
        R.string.canada,
        R.drawable.canada_flag,
        "1",
        "CA",
        "CAN"
    )

    data object CapeVerde : CountryData(
        R.string.cape_verde,
        R.drawable.cape_verde_flag,
        "238",
        "CV",
        "CPV"
    )

    data object CentralAfricanRepublic : CountryData(
        R.string.central_african_republic,
        R.drawable.central_african_republic_flag,
        "236",
        "CF",
        "CAF"
    )

    data object Chad : CountryData(
        R.string.chad,
        R.drawable.chad_flag,
        "235",
        "TD",
        "TCD"
    )

    data object Chile : CountryData(
        R.string.chile,
        R.drawable.chile_flag,
        "56",
        "CL",
        "CHL"
    )

    data object China : CountryData(
        R.string.china,
        R.drawable.china_flag,
        "86",
        "CN",
        "CHN"
    )

    data object Colombia : CountryData(
        R.string.colombia,
        R.drawable.colombia_flag,
        "57",
        "CO",
        "COL"
    )

    data object Comoros : CountryData(
        R.string.comoros,
        R.drawable.comoros_flag,
        "269",
        "KM",
        "COM"
    )

    data object Congo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.congo_flag,
        "242",
        "CG",
        "COG"
    )

    data object CostaRica : CountryData(
        R.string.costa_rica,
        R.drawable.costa_rica_flag,
        "506",
        "CR",
        "CRI"
    )

    data object Croatia : CountryData(
        R.string.croatia,
        R.drawable.croatia_flag,
        "385",
        "HR",
        "HRV"
    )

    data object Cuba : CountryData(
        R.string.cuba,
        R.drawable.cuba_flag,
        "53",
        "CU",
        "CUB"
    )

    data object Cyprus : CountryData(
        R.string.cyprus,
        R.drawable.cyprus_flag,
        "357",
        "CY",
        "CYP"
    )

    data object CzechRepublic : CountryData(
        R.string.czech_republic,
        R.drawable.czech_republic_flag,
        "420",
        "CZ",
        "CZE"
    )

    data object DemocraticRepublicOfCongo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.democratic_republic_of_congo_flag,
        "243",
        "CD",
        "COD"
    )

    data object Denmark : CountryData(
        R.string.denmark,
        R.drawable.denmark_flag,
        "45",
        "DK",
        "DNK"
    )

    data object Djibouti : CountryData(
        R.string.djibouti,
        R.drawable.djibouti_flag,
        "253",
        "DJ",
        "DJI"
    )

    data object Dominica : CountryData(
        R.string.dominica,
        R.drawable.dominica_flag,
        "1767",
        "DM",
        "DMA"
    )

    data object DominicanRepublic : CountryData(
        R.string.dominican_republic,
        R.drawable.dominican_republic_flag,
        "1809",
        "DO",
        "DOM"
    )

    data object Ecuador : CountryData(
        R.string.ecuador,
        R.drawable.ecuador_flag,
        "593",
        "EC",
        "ECU"
    )

    data object Egypt : CountryData(
        R.string.egypt,
        R.drawable.egypt_flag,
        "20",
        "EG",
        "EGY"
    )

    data object ElSalvador : CountryData(
        R.string.el_salvador,
        R.drawable.el_salvador_flag,
        "503",
        "SV",
        "SLV"
    )

    data object EquatorialGuinea : CountryData(
        R.string.equatorial_guinea,
        R.drawable.equatorial_guinea_flag,
        "240",
        "GQ",
        "GNQ"
    )

    data object Eritrea : CountryData(
        R.string.eritrea,
        R.drawable.eritrea_flag,
        "291",
        "ER",
        "ERI"
    )

    data object Estonia : CountryData(
        R.string.estonia,
        R.drawable.estonia_flag,
        "372",
        "EE",
        "EST"
    )

    data object Eswatini : CountryData(
        R.string.eswatini,
        R.drawable.eswatini_flag,
        "268",
        "SZ",
        "SWZ"
    )

    data object Ethiopia : CountryData(
        R.string.ethiopia,
        R.drawable.ethiopia_flag,
        "251",
        "ET",
        "ETH"
    )

    data object Fiji : CountryData(
        R.string.fiji,
        R.drawable.fiji_flag,
        "679",
        "FJ",
        "FJI"
    )

    data object Finland : CountryData(
        R.string.finland,
        R.drawable.finland_flag,
        "358",
        "FI",
        "FIN"
    )

    data object France : CountryData(
        R.string.france,
        R.drawable.france_flag,
        "33",
        "FR",
        "FRA"
    )

    data object Gabon : CountryData(
        R.string.gabon,
        R.drawable.gabon_flag,
        "241",
        "GA",
        "GAB"
    )

    data object Gambia : CountryData(
        R.string.gambia,
        R.drawable.gambia_flag,
        "220",
        "GM",
        "GMB"
    )

    data object Georgia : CountryData(
        R.string.georgia,
        R.drawable.georgia_flag,
        "995",
        "GE",
        "GEO"
    )

    data object Germany : CountryData(
        R.string.germany,
        R.drawable.germany_flag,
        "49",
        "DE",
        "DEU"
    )

    data object Ghana : CountryData(
        R.string.ghana,
        R.drawable.ghana_flag,
        "233",
        "GH",
        "GHA"
    )

    data object Greece : CountryData(
        R.string.greece,
        R.drawable.greece_flag,
        "30",
        "GR",
        "GRC"
    )

    data object Grenada : CountryData(
        R.string.grenada,
        R.drawable.grenada_flag,
        "1473",
        "GD",
        "GRD"
    )

    data object Guatemala : CountryData(
        R.string.guatemala,
        R.drawable.guatemala_flag,
        "502",
        "GT",
        "GTM"
    )

    data object Guinea : CountryData(
        R.string.guinea,
        R.drawable.guinea_flag,
        "224",
        "GN",
        "GIN"
    )

    data object GuineaBissau : CountryData(
        R.string.guinea_bissau,
        R.drawable.guinea_bissau_flag,
        "245",
        "GW",
        "GNB"
    )

    data object Guyana : CountryData(
        R.string.guyana,
        R.drawable.guyana_flag,
        "592",
        "GY",
        "GUY"
    )

    data object Haiti : CountryData(
        R.string.haiti,
        R.drawable.haiti_flag,
        "509",
        "HT",
        "HTI"
    )

    data object Honduras : CountryData(
        R.string.honduras,
        R.drawable.honduras_flag,
        "504",
        "HN",
        "HND"
    )

    data object Hungary : CountryData(
        R.string.hungary,
        R.drawable.hungary_flag,
        "36",
        "HU",
        "HUN"
    )

    data object Iceland : CountryData(
        R.string.iceland,
        R.drawable.iceland_flag,
        "354",
        "IS",
        "ISL"
    )

    data object India : CountryData(
        R.string.india,
        R.drawable.india_flag,
        "91",
        "IN",
        "IND"
    )

    data object Indonesia : CountryData(
        R.string.indonesia,
        R.drawable.indonesia_flag,
        "62",
        "ID",
        "IDN"
    )

    data object Iran : CountryData(
        R.string.iran,
        R.drawable.iran_flag,
        "98",
        "IR",
        "IRN"
    )

    data object Iraq : CountryData(
        R.string.iraq,
        R.drawable.iraq_flag,
        "964",
        "IQ",
        "IRQ"
    )

    data object Ireland : CountryData(
        R.string.ireland,
        R.drawable.ireland_flag,
        "353",
        "IE",
        "IRL"
    )

    data object Israel : CountryData(
        R.string.israel,
        R.drawable.israel_flag,
        "972",
        "IL",
        "ISR"
    )

    data object Italy : CountryData(
        R.string.italy,
        R.drawable.italy_flag,
        "39",
        "IT",
        "ITA"
    )

    data object IvoryCoast : CountryData(
        R.string.ivory_coast,
        R.drawable.ivory_coast_flag,
        "225",
        "CI",
        "CIV"
    )

    data object Jamaica : CountryData(
        R.string.jamaica,
        R.drawable.jamaica_flag,
        "1876",
        "JM",
        "JAM"
    )

    data object Japan : CountryData(
        R.string.japan,
        R.drawable.japan_flag,
        "81",
        "JP",
        "JPN"
    )

    data object Jordan : CountryData(
        R.string.jordan,
        R.drawable.jordan_flag,
        "962",
        "JO",
        "JOR"
    )

    data object Kazakhstan : CountryData(
        R.string.kazakhstan,
        R.drawable.kazakhstan_flag,
        "7",
        "KZ",
        "KAZ"
    )

    data object Kenya : CountryData(
        R.string.kenya,
        R.drawable.kenya_flag,
        "254",
        "KE",
        "KEN"
    )

    data object Kiribati : CountryData(
        R.string.kiribati,
        R.drawable.kiribati_flag,
        "686",
        "KI",
        "KIR"
    )

    data object Kosovo : CountryData(
        R.string.kosovo,
        R.drawable.kosovo_flag,
        "383",
        "XK",
        "XKX"
    )

    data object Kuwait : CountryData(
        R.string.kuwait,
        R.drawable.kuwait_flag,
        "965",
        "KW",
        "KWT"
    )

    data object Kyrgyzstan : CountryData(
        R.string.kyrgyzstan,
        R.drawable.kyrgyzstan_flag,
        "996",
        "KG",
        "KGZ"
    )

    data object Laos : CountryData(
        R.string.laos,
        R.drawable.laos_flag,
        "856",
        "LA",
        "LAO"
    )

    data object Latvia : CountryData(
        R.string.latvia,
        R.drawable.latvia_flag,
        "371",
        "LV",
        "LVA"
    )

    data object Lebanon : CountryData(
        R.string.lebanon,
        R.drawable.lebanon_flag,
        "961",
        "LB",
        "LBN"
    )

    data object Lesotho : CountryData(
        R.string.lesotho,
        R.drawable.lesotho_flag,
        "266",
        "LS",
        "LSO"
    )

    data object Liberia : CountryData(
        R.string.liberia,
        R.drawable.liberia_flag,
        "231",
        "LR",
        "LBR"
    )

    data object Libya : CountryData(
        R.string.libya,
        R.drawable.libya_flag,
        "218",
        "LY",
        "LBY"
    )

    data object Liechtenstein : CountryData(
        R.string.liechtenstein,
        R.drawable.liechtenstein_flag,
        "423",
        "LI",
        "LIE"
    )

    data object Lithuania : CountryData(
        R.string.lithuania,
        R.drawable.lithuania_flag,
        "370",
        "LT",
        "LTU"
    )

    data object Luxembourg : CountryData(
        R.string.luxembourg,
        R.drawable.luxembourg_flag,
        "352",
        "LU",
        "LUX"
    )

    data object Madagascar : CountryData(
        R.string.madagascar,
        R.drawable.madagascar_flag,
        "261",
        "MG",
        "MDG"
    )

    data object Malawi : CountryData(
        R.string.malawi,
        R.drawable.malawi_flag,
        "265",
        "MW",
        "MWI"
    )

    data object Malaysia : CountryData(
        R.string.malaysia,
        R.drawable.malaysia_flag,
        "60",
        "MY",
        "MYS"
    )

    data object Maldives : CountryData(
        R.string.maldives,
        R.drawable.maldives_flag,
        "960",
        "MV",
        "MDV"
    )

    data object Mali : CountryData(
        R.string.mali,
        R.drawable.mali_flag,
        "223",
        "ML",
        "MLI"
    )

    data object Malta : CountryData(
        R.string.malta,
        R.drawable.malta_flag,
        "356",
        "MT",
        "MLT"
    )

    data object MarshallIslands : CountryData(
        R.string.marshall_islands,
        R.drawable.marshall_islands_flag,
        "692",
        "MH",
        "MHL"
    )

    data object Mauritania : CountryData(
        R.string.mauritania,
        R.drawable.mauritania_flag,
        "222",
        "MR",
        "MRT"
    )

    data object Mauritius : CountryData(
        R.string.mauritius,
        R.drawable.mauritius_flag,
        "230",
        "MU",
        "MUS"
    )

    data object Mexico : CountryData(
        R.string.mexico,
        R.drawable.mexico_flag,
        "52",
        "MX",
        "MEX"
    )

    data object Micronesia : CountryData(
        R.string.micronesia,
        R.drawable.micronesia_flag,
        "691",
        "FM",
        "FSM"
    )

    data object Moldova : CountryData(
        R.string.moldova,
        R.drawable.moldova_flag,
        "373",
        "MD",
        "MDA"
    )

    data object Monaco : CountryData(
        R.string.monaco,
        R.drawable.monaco_flag,
        "377",
        "MC",
        "MCO"
    )

    data object Mongolia : CountryData(
        R.string.mongolia,
        R.drawable.mongolia_flag,
        "976",
        "MN",
        "MNG"
    )

    data object Montenegro : CountryData(
        R.string.montenegro,
        R.drawable.montenegro_flag,
        "382",
        "ME",
        "MNE"
    )

    data object Morocco : CountryData(
        R.string.morocco,
        R.drawable.morocco_flag,
        "212",
        "MA",
        "MAR"
    )

    data object Mozambique : CountryData(
        R.string.mozambique,
        R.drawable.mozambique_flag,
        "258",
        "MZ",
        "MOZ"
    )

    data object Myanmar : CountryData(
        R.string.myanmar,
        R.drawable.myanmar_flag,
        "95",
        "MM",
        "MMR"
    )

    data object Namibia : CountryData(
        R.string.namibia,
        R.drawable.namibia_flag,
        "264",
        "NA",
        "NAM"
    )

    data object Nauru : CountryData(
        R.string.nauru,
        R.drawable.nauru_flag,
        "674",
        "NR",
        "NRU"
    )

    data object Nepal : CountryData(
        R.string.nepal,
        R.drawable.nepal_flag,
        "977",
        "NP",
        "NPL"
    )

    data object Netherlands : CountryData(
        R.string.netherlands,
        R.drawable.netherlands_flag,
        "31",
        "NL",
        "NLD"
    )

    data object NewZealand : CountryData(
        R.string.new_zealand,
        R.drawable.new_zealand_flag,
        "64",
        "NZ",
        "NZL"
    )

    data object Nicaragua : CountryData(
        R.string.nicaragua,
        R.drawable.nicaragua_flag,
        "505",
        "NI",
        "NIC"
    )

    data object Niger : CountryData(
        R.string.niger,
        R.drawable.niger_flag,
        "227",
        "NE",
        "NER"
    )

    data object Nigeria : CountryData(
        R.string.nigeria,
        R.drawable.nigeria_flag,
        "234",
        "NG",
        "NGA"
    )

    data object NorthKorea : CountryData(
        R.string.north_korea,
        R.drawable.north_korea_flag,
        "850",
        "KP",
        "PRK"
    )

    data object NorthMacedonia : CountryData(
        R.string.north_macedonia,
        R.drawable.north_macedonia_flag,
        "389",
        "MK",
        "MKD"
    )

    data object Norway : CountryData(
        R.string.norway,
        R.drawable.norway_flag,
        "47",
        "NO",
        "NOR"
    )

    data object Oman : CountryData(
        R.string.oman,
        R.drawable.oman_flag,
        "968",
        "OM",
        "OMN"
    )

    data object Pakistan : CountryData(
        R.string.pakistan,
        R.drawable.pakistan_flag,
        "92",
        "PK",
        "PAK"
    )

    data object Palau : CountryData(
        R.string.palau,
        R.drawable.palau_flag,
        "680",
        "PW",
        "PLW"
    )

    data object Panama : CountryData(
        R.string.panama,
        R.drawable.panama_flag,
        "507",
        "PA",
        "PAN"
    )

    data object PapuaNewGuinea : CountryData(
        R.string.papua_new_guinea,
        R.drawable.papua_new_guinea_flag,
        "675",
        "PG",
        "PNG"
    )

    data object Paraguay : CountryData(
        R.string.paraguay,
        R.drawable.paraguay_flag,
        "595",
        "PY",
        "PRY"
    )

    data object Peru : CountryData(
        R.string.peru,
        R.drawable.peru_flag,
        "51",
        "PE",
        "PER"
    )

    data object Philippines : CountryData(
        R.string.philippines,
        R.drawable.philippines_flag,
        "63",
        "PH",
        "PHL"
    )

    data object Poland : CountryData(
        R.string.poland,
        R.drawable.poland_flag,
        "48",
        "PL",
        "POL"
    )

    data object Portugal : CountryData(
        R.string.portugal,
        R.drawable.portugal_flag,
        "351",
        "PT",
        "PRT"
    )

    data object Qatar : CountryData(
        R.string.qatar,
        R.drawable.qatar_flag,
        "974",
        "QA",
        "QAT"
    )

    data object Romania : CountryData(
        R.string.romania,
        R.drawable.romania_flag,
        "40",
        "RO",
        "ROU"
    )

    data object Russia : CountryData(
        R.string.russia,
        R.drawable.russia_flag,
        "7",
        "RU",
        "RUS"
    )

    data object Rwanda : CountryData(
        R.string.rwanda,
        R.drawable.rwanda_flag,
        "250",
        "RW",
        "RWA"
    )

    data object SaintKittsAndNevis : CountryData(
        R.string.saint_kitts_and_nevis,
        R.drawable.saint_kitts_and_nevis_flag,
        "1869",
        "KN",
        "KNA"
    )

    data object SaintLucia : CountryData(
        R.string.saint_lucia,
        R.drawable.saint_lucia_flag,
        "1758",
        "LC",
        "LCA"
    )

    data object SaintVincentAndTheGrenadines : CountryData(
        R.string.saint_vincent_and_the_grenadines,
        R.drawable.saint_vincent_and_the_grenadines_flag,
        "1784",
        "VC",
        "VCT"
    )

    data object Samoa : CountryData(
        R.string.samoa,
        R.drawable.samoa_flag,
        "685",
        "WS",
        "WSM"
    )

    data object SanMarino : CountryData(
        R.string.san_marino,
        R.drawable.san_marino_flag,
        "378",
        "SM",
        "SMR"
    )

    data object SaoTomeAndPrincipe : CountryData(
        R.string.sao_tome_and_principe,
        R.drawable.sao_tome_and_principe_flag,
        "239",
        "ST",
        "STP"
    )

    data object SaudiArabia : CountryData(
        R.string.saudi_arabia,
        R.drawable.saudi_arabia_flag,
        "966",
        "SA",
        "SAU"
    )

    data object Senegal : CountryData(
        R.string.senegal,
        R.drawable.senegal_flag,
        "221",
        "SN",
        "SEN"
    )

    data object Serbia : CountryData(
        R.string.serbia,
        R.drawable.serbia_flag,
        "381",
        "RS",
        "SRB"
    )

    data object Seychelles : CountryData(
        R.string.seychelles,
        R.drawable.seychelles_flag,
        "248",
        "SC",
        "SYC"
    )

    data object SierraLeone : CountryData(
        R.string.sierra_leone,
        R.drawable.sierra_leone_flag,
        "232",
        "SL",
        "SLE"
    )

    data object Singapore : CountryData(
        R.string.singapore,
        R.drawable.singapore_flag,
        "65",
        "SG",
        "SGP"
    )

    data object Slovakia : CountryData(
        R.string.slovakia,
        R.drawable.slovakia_flag,
        "421",
        "SK",
        "SVK"
    )

    data object Slovenia : CountryData(
        R.string.slovenia,
        R.drawable.slovenia_flag,
        "386",
        "SI",
        "SVN"
    )

    data object SolomonIslands : CountryData(
        R.string.solomon_islands,
        R.drawable.solomon_islands_flag,
        "677",
        "SB",
        "SLB"
    )

    data object Somalia : CountryData(
        R.string.somalia,
        R.drawable.somalia_flag,
        "252",
        "SO",
        "SOM"
    )

    data object SouthAfrica : CountryData(
        R.string.south_africa,
        R.drawable.south_africa_flag,
        "27",
        "ZA",
        "ZAF"
    )

    data object SouthKorea : CountryData(
        R.string.south_korea,
        R.drawable.south_korea_flag,
        "82",
        "KR",
        "KOR"
    )

    data object SouthSudan : CountryData(
        R.string.south_sudan,
        R.drawable.south_sudan_flag,
        "211",
        "SS",
        "SSD"
    )

    data object Spain : CountryData(
        R.string.spain,
        R.drawable.spain_flag,
        "34",
        "ES",
        "ESP"
    )

    data object SriLanka : CountryData(
        R.string.sri_lanka,
        R.drawable.sri_lanka_flag,
        "94",
        "LK",
        "LKA"
    )

    data object Sudan : CountryData(
        R.string.sudan,
        R.drawable.sudan_flag,
        "249",
        "SD",
        "SDN"
    )

    data object Suriname : CountryData(
        R.string.suriname,
        R.drawable.suriname_flag,
        "597",
        "SR",
        "SUR"
    )

    data object Sweden : CountryData(
        R.string.sweden,
        R.drawable.sweden_flag,
        "46",
        "SE",
        "SWE"
    )

    data object Switzerland : CountryData(
        R.string.switzerland,
        R.drawable.switzerland_flag,
        "41",
        "CH",
        "CHE"
    )

    data object Syria : CountryData(
        R.string.syria,
        R.drawable.syria_flag,
        "963",
        "SY",
        "SYR"
    )

    data object Taiwan : CountryData(
        R.string.taiwan,
        R.drawable.taiwan_flag,
        "886",
        "TW",
        "TWN"
    )

    data object Tajikistan : CountryData(
        R.string.tajikistan,
        R.drawable.tajikistan_flag,
        "992",
        "TJ",
        "TJK"
    )

    data object Tanzania : CountryData(
        R.string.tanzania,
        R.drawable.tanzania_flag,
        "255",
        "TZ",
        "TZA"
    )

    data object Thailand : CountryData(
        R.string.thailand,
        R.drawable.thailand_flag,
        "66",
        "TH",
        "THA"
    )

    data object TimorLeste : CountryData(
        R.string.timor_leste,
        R.drawable.timor_leste_flag,
        "670",
        "TL",
        "TLS"
    )

    data object Togo : CountryData(
        R.string.togo,
        R.drawable.togo_flag,
        "228",
        "TG",
        "TGO"
    )

    data object Tonga : CountryData(
        R.string.tonga,
        R.drawable.tonga_flag,
        "676",
        "TO",
        "TON"
    )

    data object TrinidadAndTobago : CountryData(
        R.string.trinidad_and_tobago,
        R.drawable.trinidad_and_tobago_flag,
        "1868",
        "TT",
        "TTO"
    )

    data object Tunisia : CountryData(
        R.string.tunisia,
        R.drawable.tunisia_flag,
        "216",
        "TN",
        "TUN"
    )

    data object Turkey : CountryData(
        R.string.turkey,
        R.drawable.turkey_flag,
        "90",
        "TR",
        "TUR"
    )

    data object Turkmenistan : CountryData(
        R.string.turkmenistan,
        R.drawable.turkmenistan_flag,
        "993",
        "TM",
        "TKM"
    )

    data object Tuvalu : CountryData(
        R.string.tuvalu,
        R.drawable.tuvalu_flag,
        "688",
        "TV",
        "TUV"
    )

    data object Uganda : CountryData(
        R.string.uganda,
        R.drawable.uganda_flag,
        "256",
        "UG",
        "UGA"
    )

    data object Ukraine : CountryData(
        R.string.ukraine,
        R.drawable.ukraine_flag,
        "380",
        "UA",
        "UKR"
    )

    data object UnitedArabEmirates : CountryData(
        R.string.united_arab_emirates,
        R.drawable.united_arab_emirates_flag,
        "971",
        "AE",
        "ARE"
    )

    data object UnitedKingdom : CountryData(
        R.string.united_kingdom,
        R.drawable.united_kingdom_flag,
        "44",
        "GB",
        "GBR"
    )

    data object UnitedStates : CountryData(
        R.string.united_states,
        R.drawable.united_states_flag,
        "1",
        "US",
        "USA"
    )

    data object Uruguay : CountryData(
        R.string.uruguay,
        R.drawable.uruguay_flag,
        "598",
        "UY",
        "URY"
    )

    data object Uzbekistan : CountryData(
        R.string.uzbekistan,
        R.drawable.uzbekistan_flag,
        "998",
        "UZ",
        "UZB"
    )

    data object Vanuatu : CountryData(
        R.string.vanuatu,
        R.drawable.vanuatu_flag,
        "678",
        "VU",
        "VUT"
    )

    data object VaticanCity : CountryData(
        R.string.vatican_city,
        R.drawable.vatican_city_flag,
        "379",
        "VA",
        "VAT"
    )

    data object Vietnam : CountryData(
        R.string.vietnam,
        R.drawable.vietnam_flag,
        "84",
        "VN",
        "VNM"
    )

    data object Venezuela : CountryData(
        R.string.venezuela,
        R.drawable.venezuela_flag,
        "58",
        "VE",
        "VEN"
    )

    data object Yemen : CountryData(
        R.string.yemen,
        R.drawable.yemen_flag,
        "967",
        "YE",
        "YEM"
    )

    data object Zambia : CountryData(
        R.string.zambia,
        R.drawable.zambia_flag,
        "260",
        "ZM",
        "ZMB"
    )

    data object Zimbabwe : CountryData(
        R.string.zimbabwe,
        R.drawable.zimbabwe_flag,
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