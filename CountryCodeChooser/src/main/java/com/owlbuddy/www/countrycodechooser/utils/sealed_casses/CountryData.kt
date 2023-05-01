package com.owlbuddy.www.countrycodechooser.utils.sealed_casses
import com.owlbuddy.www.countrycodechooser.R

sealed class CountryData(
    val countryNameResId: Int,
    val flagResId: Int,
    val countryCodeWithPrefix: String,
    val countryCodeWithoutPrefix: String
) {
    object Afghanistan : CountryData(
        R.string.afghanistan,
        R.drawable.afghanistan_flag,
        "+93",
        "93"
    )

    object Albania : CountryData(
        R.string.albania,
        R.drawable.albania_flag,
        "+355",
        "355"
    )

    object Algeria : CountryData(
        R.string.algeria,
        R.drawable.algeria_flag,
        "+213",
        "213"
    )

    object Andorra : CountryData(
        R.string.andorra,
        R.drawable.andorra_flag,
        "+376",
        "376"
    )

    object Angola : CountryData(
        R.string.angola,
        R.drawable.angola_flag,
        "+244",
        "244"
    )

    object AntiguaAndBarbuda : CountryData(
        R.string.antigua_and_barbuda,
        R.drawable.antigua_and_barbuda_flag,
        "+1 268",
        "1268"
    )

    object Argentina : CountryData(
        R.string.argentina,
        R.drawable.argentina_flag,
        "+54",
        "54"
    )

    object Armenia : CountryData(
        R.string.armenia,
        R.drawable.armenia_flag,
        "+374",
        "374"
    )

    object Australia : CountryData(
        R.string.australia,
        R.drawable.australia_flag,
        "+61",
        "61"
    )

    object Austria : CountryData(
        R.string.austria,
        R.drawable.austria_flag,
        "+43",
        "43"
    )

    object Azerbaijan : CountryData(
        R.string.azerbaijan,
        R.drawable.azerbaijan_flag,
        "+994",
        "994"
    )

    object Bahamas : CountryData(
        R.string.bahamas,
        R.drawable.bahamas_flag,
        "+1 242",
        "1242"
    )

    object Bahrain : CountryData(
        R.string.bahrain,
        R.drawable.bahrain_flag,
        "+973",
        "973"
    )

    object Bangladesh : CountryData(
        R.string.bangladesh,
        R.drawable.bangladesh_flag,
        "+880",
        "880"
    )

    object Barbados : CountryData(
        R.string.barbados,
        R.drawable.barbados_flag,
        "+1 246",
        "1246"
    )

    object Belarus : CountryData(
        R.string.belarus,
        R.drawable.belarus_flag,
        "+375",
        "375"
    )

    object Belgium : CountryData(
        R.string.belgium,
        R.drawable.belgium_flag,
        "+32",
        "32"
    )

    object Belize : CountryData(
        R.string.belize,
        R.drawable.belize_flag,
        "+501",
        "501"
    )

    object Benin : CountryData(
        R.string.benin,
        R.drawable.benin_flag,
        "+229",
        "229"
    )

    object Bhutan : CountryData(
        R.string.bhutan,
        R.drawable.bhutan_flag,
        "+975",
        "975"
    )

    object Bolivia : CountryData(
        R.string.bolivia,
        R.drawable.bolivia_flag,
        "+591",
        "591"
    )

    object BosniaAndHerzegovina : CountryData(
        R.string.bosnia_and_herzegovina,
        R.drawable.bosnia_and_herzegovina_flag,
        "+387",
        "387"
    )

    object Botswana : CountryData(
        R.string.botswana,
        R.drawable.botswana_flag,
        "+267",
        "267"
    )

    object Brazil : CountryData(
        R.string.brazil,
        R.drawable.brazil_flag,
        "+55",
        "55"
    )

    object Brunei : CountryData(
        R.string.brunei,
        R.drawable.brunei_flag,
        "+673",
        "673"
    )

    object Bulgaria : CountryData(
        R.string.bulgaria,
        R.drawable.bulgaria_flag,
        "+359",
        "359"
    )

    object BurkinaFaso : CountryData(
        R.string.burkina_faso,
        R.drawable.burkina_faso_flag,
        "+226",
        "226"
    )

    object Burundi : CountryData(
        R.string.burundi,
        R.drawable.burundi_flag,
        "+257",
        "257"
    )

    object Cambodia : CountryData(
        R.string.cambodia,
        R.drawable.cambodia_flag,
        "+855",
        "855"
    )

    object Cameroon : CountryData(
        R.string.cameroon,
        R.drawable.cameroon_flag,
        "+237",
        "237"
    )

    object Canada : CountryData(
        R.string.canada,
        R.drawable.canada_flag,
        "+1",
        "1"
    )

    object CapeVerde : CountryData(
        R.string.cape_verde,
        R.drawable.cape_verde_flag,
        "+238",
        "238"
    )

    object CentralAfricanRepublic : CountryData(
        R.string.central_african_republic,
        R.drawable.central_african_republic_flag,
        "+236",
        "236"
    )

    object Chad : CountryData(
        R.string.chad,
        R.drawable.chad_flag,
        "+235",
        "235"
    )

    object Chile : CountryData(
        R.string.chile,
        R.drawable.chile_flag,
        "+56",
        "56"
    )

    object China : CountryData(
        R.string.china,
        R.drawable.china_flag,
        "+86",
        "86"
    )

    object Colombia : CountryData(
        R.string.colombia,
        R.drawable.colombia_flag,
        "+57",
        "57"
    )

    object Comoros : CountryData(
        R.string.comoros,
        R.drawable.comoros_flag,
        "+269",
        "269"
    )

    object Congo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.congo_flag,
        "+242",
        "242"
    )

    object CostaRica : CountryData(
        R.string.costa_rica,
        R.drawable.costa_rica_flag,
        "+506",
        "506"
    )

    object Croatia : CountryData(
        R.string.croatia,
        R.drawable.croatia_flag,
        "+385",
        "385"
    )

    object Cuba : CountryData(
        R.string.cuba,
        R.drawable.cuba_flag,
        "+53",
        "53"
    )

    object Cyprus : CountryData(
        R.string.cyprus,
        R.drawable.cyprus_flag,
        "+357",
        "357"
    )

    object CzechRepublic : CountryData(
        R.string.czech_republic,
        R.drawable.czech_republic_flag,
        "+420",
        "420"
    )

    object DemocraticRepublicOfCongo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.democratic_republic_of_congo_flag,
        "+243",
        "243"
    )

    object Denmark : CountryData(
        R.string.denmark,
        R.drawable.denmark_flag,
        "+45",
        "45"
    )

    object Djibouti : CountryData(
        R.string.djibouti,
        R.drawable.djibouti_flag,
        "+253",
        "253"
    )

    object Dominica : CountryData(
        R.string.dominica,
        R.drawable.dominica_flag,
        "+1 767",
        "1767"
    )

    object DominicanRepublic : CountryData(
        R.string.dominican_republic,
        R.drawable.dominican_republic_flag,
        "+1 809",
        "1809"
    )

    object Ecuador : CountryData(
        R.string.ecuador,
        R.drawable.ecuador_flag,
        "+593",
        "593"
    )

    object Egypt : CountryData(
        R.string.egypt,
        R.drawable.egypt_flag,
        "+20",
        "20"
    )

    object ElSalvador : CountryData(
        R.string.el_salvador,
        R.drawable.el_salvador_flag,
        "+503",
        "503"
    )

    object EquatorialGuinea : CountryData(
        R.string.equatorial_guinea,
        R.drawable.equatorial_guinea_flag,
        "+240",
        "240"
    )

    object Eritrea : CountryData(
        R.string.eritrea,
        R.drawable.eritrea_flag,
        "+291",
        "291"
    )

    object Estonia : CountryData(
        R.string.estonia,
        R.drawable.estonia_flag,
        "+372",
        "372"
    )

    object Eswatini : CountryData(
        R.string.eswatini,
        R.drawable.eswatini_flag,
        "+268",
        "268"
    )

    object Ethiopia : CountryData(
        R.string.ethiopia,
        R.drawable.ethiopia_flag,
        "+251",
        "251"
    )

    object Fiji : CountryData(
        R.string.fiji,
        R.drawable.fiji_flag,
        "+679",
        "679"
    )

    object Finland : CountryData(
        R.string.finland,
        R.drawable.finland_flag,
        "+358",
        "358"
    )

    object France : CountryData(
        R.string.france,
        R.drawable.france_flag,
        "+33",
        "33"
    )

    object Gabon : CountryData(
        R.string.gabon,
        R.drawable.gabon_flag,
        "+241",
        "241"
    )

    object Gambia : CountryData(
        R.string.gambia,
        R.drawable.gambia_flag,
        "+220",
        "220"
    )

    object Georgia : CountryData(
        R.string.georgia,
        R.drawable.georgia_flag,
        "+995",
        "995"
    )

    object Germany : CountryData(
        R.string.germany,
        R.drawable.germany_flag,
        "+49",
        "49"
    )

    object Ghana : CountryData(
        R.string.ghana,
        R.drawable.ghana_flag,
        "+233",
        "233"
    )

    object Greece : CountryData(
        R.string.greece,
        R.drawable.greece_flag,
        "+30",
        "30"
    )

    object Grenada : CountryData(
        R.string.grenada,
        R.drawable.grenada_flag,
        "+1 473",
        "1473"
    )

    object Guatemala : CountryData(
        R.string.guatemala,
        R.drawable.guatemala_flag,
        "+502",
        "502"
    )

    object Guinea : CountryData(
        R.string.guinea,
        R.drawable.guinea_flag,
        "+224",
        "224"
    )

    object GuineaBissau : CountryData(
        R.string.guinea_bissau,
        R.drawable.guinea_bissau_flag,
        "+245",
        "245"
    )

    object Guyana : CountryData(
        R.string.guyana,
        R.drawable.guyana_flag,
        "+592",
        "592"
    )

    object Haiti : CountryData(
        R.string.haiti,
        R.drawable.haiti_flag,
        "+509",
        "509"
    )

    object Honduras : CountryData(
        R.string.honduras,
        R.drawable.honduras_flag,
        "+504",
        "504"
    )

    object Hungary : CountryData(
        R.string.hungary,
        R.drawable.hungary_flag,
        "+36",
        "36"
    )

    object Iceland : CountryData(
        R.string.iceland,
        R.drawable.iceland_flag,
        "+354",
        "354"
    )

    object India : CountryData(
        R.string.india,
        R.drawable.india_flag,
        "+91",
        "91"
    )

    object Indonesia : CountryData(
        R.string.indonesia,
        R.drawable.indonesia_flag,
        "+62",
        "62"
    )

    object Iran : CountryData(
        R.string.iran,
        R.drawable.iran_flag,
        "+98",
        "98"
    )

    object Iraq : CountryData(
        R.string.iraq,
        R.drawable.iraq_flag,
        "+964",
        "964"
    )

    object Ireland : CountryData(
        R.string.ireland,
        R.drawable.ireland_flag,
        "+353",
        "353"
    )

    object Israel : CountryData(
        R.string.israel,
        R.drawable.israel_flag,
        "+972",
        "972"
    )

    object Italy : CountryData(
        R.string.italy,
        R.drawable.italy_flag,
        "+39",
        "39"
    )

    object IvoryCoast : CountryData(
        R.string.ivory_coast,
        R.drawable.ivory_coast_flag,
        "+225",
        "225"
    )

    object Jamaica : CountryData(
        R.string.jamaica,
        R.drawable.jamaica_flag,
        "+1 876",
        "1876"
    )

    object Japan : CountryData(
        R.string.japan,
        R.drawable.japan_flag,
        "+81",
        "81"
    )

    object Jordan : CountryData(
        R.string.jordan,
        R.drawable.jordan_flag,
        "+962",
        "962"
    )

    object Kazakhstan : CountryData(
        R.string.kazakhstan,
        R.drawable.kazakhstan_flag,
        "+7",
        "7"
    )

    object Kenya : CountryData(
        R.string.kenya,
        R.drawable.kenya_flag,
        "+254",
        "254"
    )

    object Kiribati : CountryData(
        R.string.kiribati,
        R.drawable.kiribati_flag,
        "+686",
        "686"
    )

    object Kosovo : CountryData(
        R.string.kosovo,
        R.drawable.kosovo_flag,
        "+383",
        "383"
    )

    object Kuwait : CountryData(
        R.string.kuwait,
        R.drawable.kuwait_flag,
        "+965",
        "965"
    )

    object Kyrgyzstan : CountryData(
        R.string.kyrgyzstan,
        R.drawable.kyrgyzstan_flag,
        "+996",
        "996"
    )

    object Laos : CountryData(
        R.string.laos,
        R.drawable.laos_flag,
        "+856",
        "856"
    )

    object Latvia : CountryData(
        R.string.latvia,
        R.drawable.latvia_flag,
        "+371",
        "371"
    )

    object Lebanon : CountryData(
        R.string.lebanon,
        R.drawable.lebanon_flag,
        "+961",
        "961"
    )

    object Lesotho : CountryData(
        R.string.lesotho,
        R.drawable.lesotho_flag,
        "+266",
        "266"
    )

    object Liberia : CountryData(
        R.string.liberia,
        R.drawable.liberia_flag,
        "+231",
        "231"
    )

    object Libya : CountryData(
        R.string.libya,
        R.drawable.libya_flag,
        "+218",
        "218"
    )

    object Liechtenstein : CountryData(
        R.string.liechtenstein,
        R.drawable.liechtenstein_flag,
        "+423",
        "423"
    )

    object Lithuania : CountryData(
        R.string.lithuania,
        R.drawable.lithuania_flag,
        "+370",
        "370"
    )

    object Luxembourg : CountryData(
        R.string.luxembourg,
        R.drawable.luxembourg_flag,
        "+352",
        "352"
    )

    object Madagascar : CountryData(
        R.string.madagascar,
        R.drawable.madagascar_flag,
        "+261",
        "261"
    )

    object Malawi : CountryData(
        R.string.malawi,
        R.drawable.malawi_flag,
        "+265",
        "265"
    )

    object Malaysia : CountryData(
        R.string.malaysia,
        R.drawable.malaysia_flag,
        "+60",
        "60"
    )

    object Maldives : CountryData(
        R.string.maldives,
        R.drawable.maldives_flag,
        "+960",
        "960"
    )

    object Mali : CountryData(
        R.string.mali,
        R.drawable.mali_flag,
        "+223",
        "223"
    )

    object Malta : CountryData(
        R.string.malta,
        R.drawable.malta_flag,
        "+356",
        "356"
    )

    object MarshallIslands : CountryData(
        R.string.marshall_islands,
        R.drawable.marshall_islands_flag,
        "+692",
        "692"
    )

    object Mauritius : CountryData(
        R.string.mauritius,
        R.drawable.mauritius_flag,
        "+230",
        "230"
    )

    object Mexico : CountryData(
        R.string.mexico,
        R.drawable.mexico_flag,
        "+52",
        "52"
    )

    object Micronesia : CountryData(
        R.string.micronesia,
        R.drawable.micronesia_flag,
        "+691",
        "691"
    )

    object Moldova : CountryData(
        R.string.moldova,
        R.drawable.moldova_flag,
        "+373",
        "373"
    )

    object Monaco : CountryData(
        R.string.monaco,
        R.drawable.monaco_flag,
        "+377",
        "377"
    )

    object Mongolia : CountryData(
        R.string.mongolia,
        R.drawable.mongolia_flag,
        "+976",
        "976"
    )

    object Montenegro : CountryData(
        R.string.montenegro,
        R.drawable.montenegro_flag,
        "+382",
        "382"
    )

    object Morocco : CountryData(
        R.string.morocco,
        R.drawable.morocco_flag,
        "+212",
        "212"
    )

    object Mozambique : CountryData(
        R.string.mozambique,
        R.drawable.mozambique_flag,
        "+258",
        "258"
    )

    object Myanmar : CountryData(
        R.string.myanmar,
        R.drawable.myanmar_flag,
        "+95",
        "95"
    )

    object Namibia : CountryData(
        R.string.namibia,
        R.drawable.namibia_flag,
        "+264",
        "264"
    )

    object Nauru : CountryData(
        R.string.nauru,
        R.drawable.nauru_flag,
        "+674",
        "674"
    )

    object Nepal : CountryData(
        R.string.nepal,
        R.drawable.nepal_flag,
        "+977",
        "977"
    )

    object Netherlands : CountryData(
        R.string.netherlands,
        R.drawable.netherlands_flag,
        "+31",
        "31"
    )

    object NewZealand : CountryData(
        R.string.new_zealand,
        R.drawable.new_zealand_flag,
        "+64",
        "64"
    )

    object Nicaragua : CountryData(
        R.string.nicaragua,
        R.drawable.nicaragua_flag,
        "+505",
        "505"
    )

    object Niger : CountryData(
        R.string.niger,
        R.drawable.niger_flag,
        "+227",
        "227"
    )

    object Nigeria : CountryData(
        R.string.nigeria,
        R.drawable.nigeria_flag,
        "+234",
        "234"
    )

    object NorthKorea : CountryData(
        R.string.north_korea,
        R.drawable.north_korea_flag,
        "+850",
        "850"
    )

    object NorthMacedonia : CountryData(
        R.string.north_macedonia,
        R.drawable.north_macedonia_flag,
        "+389",
        "389"
    )

    object Norway : CountryData(
        R.string.norway,
        R.drawable.norway_flag,
        "+47",
        "47"
    )

    object Oman : CountryData(
        R.string.oman,
        R.drawable.oman_flag,
        "+968",
        "968"
    )

    object Pakistan : CountryData(
        R.string.pakistan,
        R.drawable.pakistan_flag,
        "+92",
        "92"
    )

    object Palau : CountryData(
        R.string.palau,
        R.drawable.palau_flag,
        "+680",
        "680"
    )

    object Panama : CountryData(
        R.string.panama,
        R.drawable.panama_flag,
        "+507",
        "507"
    )

    object PapuaNewGuinea : CountryData(
        R.string.papua_new_guinea,
        R.drawable.papua_new_guinea_flag,
        "+675",
        "675"
    )

    object Paraguay : CountryData(
        R.string.paraguay,
        R.drawable.paraguay_flag,
        "+595",
        "595"
    )

    object Peru : CountryData(
        R.string.peru,
        R.drawable.peru_flag,
        "+51",
        "51"
    )

    object Philippines : CountryData(
        R.string.philippines,
        R.drawable.philippines_flag,
        "+63",
        "63"
    )

    object Poland : CountryData(
        R.string.poland,
        R.drawable.poland_flag,
        "+48",
        "48"
    )

    object Portugal : CountryData(
        R.string.portugal,
        R.drawable.portugal_flag,
        "+351",
        "351"
    )

    object Qatar : CountryData(
        R.string.qatar,
        R.drawable.qatar_flag,
        "+974",
        "974"
    )

    object Romania : CountryData(
        R.string.romania,
        R.drawable.romania_flag,
        "+40",
        "40"
    )

    object Russia : CountryData(
        R.string.russia,
        R.drawable.russia_flag,
        "+7",
        "7"
    )

    object Rwanda : CountryData(
        R.string.rwanda,
        R.drawable.rwanda_flag,
        "+250",
        "250"
    )

    object SaintKittsAndNevis : CountryData(
        R.string.saint_kitts_and_nevis,
        R.drawable.saint_kitts_and_nevis_flag,
        "+1869",
        "1869"
    )

    object SaintLucia : CountryData(
        R.string.saint_lucia,
        R.drawable.saint_lucia_flag,
        "+1758",
        "1758"
    )

    object SaintVincentAndTheGrenadines : CountryData(
        R.string.saint_vincent_and_the_grenadines,
        R.drawable.saint_vincent_and_the_grenadines_flag,
        "+1784",
        "1784"
    )

    object Samoa : CountryData(
        R.string.samoa,
        R.drawable.samoa_flag,
        "+685",
        "685"
    )

    object SanMarino : CountryData(
        R.string.san_marino,
        R.drawable.san_marino_flag,
        "+378",
        "378"
    )

    object SaoTomeAndPrincipe : CountryData(
        R.string.sao_tome_and_principe,
        R.drawable.sao_tome_and_principe_flag,
        "+239",
        "239"
    )

    object SaudiArabia : CountryData(
        R.string.saudi_arabia,
        R.drawable.saudi_arabia_flag,
        "+966",
        "966"
    )

    object Senegal : CountryData(
        R.string.senegal,
        R.drawable.senegal_flag,
        "+221",
        "221"
    )

    object Serbia : CountryData(
        R.string.serbia,
        R.drawable.serbia_flag,
        "+381",
        "381"
    )

    object Seychelles : CountryData(
        R.string.seychelles,
        R.drawable.seychelles_flag,
        "+248",
        "248"
    )

    object SierraLeone : CountryData(
        R.string.sierra_leone,
        R.drawable.sierra_leone_flag,
        "+232",
        "232"
    )

    object Singapore : CountryData(
        R.string.singapore,
        R.drawable.singapore_flag,
        "+65",
        "65"
    )

    object Slovakia : CountryData(
        R.string.slovakia,
        R.drawable.slovakia_flag,
        "+421",
        "421"
    )

    object Slovenia : CountryData(
        R.string.slovenia,
        R.drawable.slovenia_flag,
        "+386",
        "386"
    )

    object SolomonIslands : CountryData(
        R.string.solomon_islands,
        R.drawable.solomon_islands_flag,
        "+677",
        "677"
    )

    object Somalia : CountryData(
        R.string.somalia,
        R.drawable.somalia_flag,
        "+252",
        "252"
    )

    object SouthAfrica : CountryData(
        R.string.south_africa,
        R.drawable.south_africa_flag,
        "+27",
        "27"
    )

    object SouthKorea : CountryData(
        R.string.south_korea,
         R.drawable.south_korea_flag,
        "+82",
        "82"
    )

    object SouthSudan : CountryData(
        R.string.south_sudan,
        R.drawable.south_sudan_flag,
        "+211",
        "211"
    )

    object Spain : CountryData(
        R.string.spain,
        R.drawable.spain_flag,
        "+34",
        "34"
    )

    object SriLanka : CountryData(
        R.string.sri_lanka,
        R.drawable.sri_lanka_flag,
        "+94",
        "94"
    )

    object Sudan : CountryData(
        R.string.sudan,
        R.drawable.sudan_flag,
        "+249",
        "249"
    )

    object Suriname : CountryData(
        R.string.suriname,
        R.drawable.suriname_flag,
        "+597",
        "597"
    )

    object Sweden : CountryData(
        R.string.sweden,
        R.drawable.sweden_flag,
        "+46",
        "46"
    )

    object Switzerland : CountryData(
        R.string.switzerland,
        R.drawable.switzerland_flag,
        "+41",
        "41"
    )

    object Syria : CountryData(
        R.string.syria,
        R.drawable.syria_flag,
        "+963",
        "963"
    )

    object Taiwan : CountryData(
        R.string.taiwan,
        R.drawable.taiwan_flag,
        "+886",
        "886"
    )

    object Tajikistan : CountryData(
        R.string.tajikistan,
        R.drawable.tajikistan_flag,
        "+992",
        "992"
    )

    object Tanzania : CountryData(
        R.string.tanzania,
        R.drawable.tanzania_flag,
        "+255",
        "255"
    )

    object Thailand : CountryData(
        R.string.thailand,
        R.drawable.thailand_flag,
        "+66",
        "66"
    )

    object TimorLeste : CountryData(
        R.string.timor_leste,
        R.drawable.timor_leste_flag,
        "+670",
        "670"
    )

    object Togo : CountryData(
        R.string.togo,
        R.drawable.togo_flag,
        "+228",
        "228"
    )

    object Tonga : CountryData(
        R.string.tonga,
        R.drawable.tonga_flag,
        "+676",
        "676"
    )

    object TrinidadAndTobago : CountryData(
        R.string.trinidad_and_tobago,
        R.drawable.trinidad_and_tobago_flag,
        "+1 868",
        "1868"
    )

    object Tunisia : CountryData(
        R.string.tunisia,
        R.drawable.tunisia_flag,
        "+216",
        "216"
    )

    object Turkey : CountryData(
        R.string.turkey,
        R.drawable.turkey_flag,
        "+90",
        "90"
    )

    object Turkmenistan : CountryData(
        R.string.turkmenistan,
        R.drawable.turkmenistan_flag,
        "+993",
        "993"
    )

    object Tuvalu : CountryData(
        R.string.tuvalu,
        R.drawable.tuvalu_flag,
        "+688",
        "688"
    )

    object Uganda : CountryData(
        R.string.uganda,
        R.drawable.uganda_flag,
        "+256",
        "256"
    )

    object Ukraine : CountryData(
        R.string.ukraine,
        R.drawable.ukraine_flag,
        "+380",
        "380"
    )

    object UnitedArabEmirates : CountryData(
        R.string.united_arab_emirates,
        R.drawable.united_arab_emirates_flag,
        "+971",
        "971"
    )

    object UnitedKingdom : CountryData(
        R.string.united_kingdom,
        R.drawable.united_kingdom_flag,
        "+44",
        "44"
    )

    object UnitedStates : CountryData(
        R.string.united_states,
        R.drawable.united_states_flag,
        "+1",
        "1"
    )

    object Uruguay : CountryData(
        R.string.uruguay,
        R.drawable.uruguay_flag,
        "+598",
        "598"
    )

    object Uzbekistan : CountryData(
        R.string.uzbekistan,
        R.drawable.uzbekistan_flag,
        "+998",
        "998"
    )

    object Vanuatu : CountryData(
        R.string.vanuatu,
        R.drawable.vanuatu_flag,
        "+678",
        "678"
    )

    object VaticanCity : CountryData(
        R.string.vatican_city,
        R.drawable.vatican_city_flag,
        "+379",
        "379"
    )

    object Vietnam : CountryData(
        R.string.vietnam,
        R.drawable.vietnam_flag,
        "+84",
        "84"
    )

    object Yemen : CountryData(
        R.string.yemen,
        R.drawable.yemen_flag,
        "+967",
        "967"
    )

    object Zambia : CountryData(
        R.string.zambia,
        R.drawable.zambia_flag,
        "+260",
        "260"
    )

    object Zimbabwe : CountryData(
        R.string.zimbabwe,
        R.drawable.zimbabwe_flag,
        "+263",
        "263"
    )
}