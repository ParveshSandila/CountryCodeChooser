package com.owlbuddy.www.countrycodechooser.utils.sealed_casses
import com.owlbuddy.www.countrycodechooser.R

sealed class CountryData(
    val countryNameResId: Int,
    val flagResId: Int,
    val countryCodeWithPrefix: String,
    val countryCodeWithoutPrefix: String,
    val iso2Code : String,
    val iso3Code : String,
    val currencyCode: String,
    val currencyName: String,
    val currencySymbol: String,
    val capitalCity: String,
    val continent: String,
    val phoneMask: String
) {

    object Afghanistan : CountryData(
        R.string.afghanistan,
        R.drawable.afghanistan_flag,
        "+93",
        "93",
        "AF",
        "AFG",
        "AFN",
        "Afghan afghani",
        "؋",
        "Kabul",
        "Asia",
        "+93-XX-XXX-XXXX"
    )

    object Albania : CountryData(
        R.string.albania,
        R.drawable.albania_flag,
        "+355",
        "355",
        "AL",
        "ALB",
        "ALL",
        "Albanian lek",
        "L",
        "Tirana",
        "Europe",
        "+355(XXX)XXX-XXX"
    )

    object Algeria : CountryData(
        R.string.algeria,
        R.drawable.algeria_flag,
        "+213",
        "213",
        "DZ",
        "DZA",
        "DZD",
        "Algerian dinar",
        "د.ج",
        "Algiers",
        "Africa",
        "+213-XX-XXX-XXXX"
    )

    object Andorra : CountryData(
        R.string.andorra,
        R.drawable.andorra_flag,
        "+376",
        "376",
        "AD",
        "AND",
        "EUR",
        "euro",
        "€",
        "Andorra la Vella",
        "Europe",
        "+376-XXX-XXX"
    )

    object Angola : CountryData(
        R.string.angola,
        R.drawable.angola_flag,
        "+244",
        "244",
        "AO",
        "AGO",
        "AOA",
        "Angolan kwanza",
        "Kz",
        "Luanda",
        "Africa",
        "+244(XXX)XXX-XXX"
    )

    object AntiguaAndBarbuda : CountryData(
        R.string.antigua_and_barbuda,
        R.drawable.antigua_and_barbuda_flag,
        "+1 268",
        "1268",
        "AG",
        "ATG",
        "XCD",
        "Eastern Caribbean dollar",
        "$",
        "Saint John's",
        "North America",
        "+1(268)XXX-XXXX"
    )

    object Argentina : CountryData(
        R.string.argentina,
        R.drawable.argentina_flag,
        "+54",
        "54",
        "AR",
        "ARG",
        "ARS",
        "Argentine peso",
        "$",
        "Buenos Aires",
        "South America",
        "+54(XXX)XXX-XXXX"
    )

    object Armenia : CountryData(
        R.string.armenia,
        R.drawable.armenia_flag,
        "+374",
        "374",
        "AM",
        "ARM",
        "AMD",
        "Armenian dram",
        "֏",
        "Yerevan",
        "Asia",
        "+374-XX-XXX-XXX"
    )

    object Australia : CountryData(
        R.string.australia,
        R.drawable.australia_flag,
        "+61",
        "61",
        "AU",
        "AUS",
        "AUD",
        "Australian dollar",
        "$",
        "Canberra",
        "Oceania",
        "+61-X-XXXX-XXXX"
    )

    object Austria : CountryData(
        R.string.austria,
        R.drawable.austria_flag,
        "+43",
        "43",
        "AT",
        "AUT",
        "EUR",
        "euro",
        "€",
        "Vienna",
        "Europe",
        "+43(XXX)XXX-XXXX"
    )

    object Azerbaijan : CountryData(
        R.string.azerbaijan,
        R.drawable.azerbaijan_flag,
        "+994",
        "994",
        "AZ",
        "AZE",
        "AZN",
        "Azerbaijani manat",
        "₼",
        "Baku",
        "Europe",
        "+994-XX-XXX-XX-XX"
    )

    object Bahamas : CountryData(
        R.string.bahamas,
        R.drawable.bahamas_flag,
        "+1 242",
        "1242",
        "BS",
        "BHS",
        "BSD",
        "Bahamian dollar",
        "$",
        "Nassau",
        "North America",
        "+1(242)XXX-XXXX"
    )

    object Bahrain : CountryData(
        R.string.bahrain,
        R.drawable.bahrain_flag,
        "+973",
        "973",
        "BH",
        "BHR",
        "BHD",
        "Bahraini dinar",
        ".د.ب",
        "Manama",
        "Asia",
        "+973-XXXX-XXXX"
    )

    object Bangladesh : CountryData(
        R.string.bangladesh,
        R.drawable.bangladesh_flag,
        "+880",
        "880",
        "BD",
        "BGD",
        "BDT",
        "Bangladeshi taka",
        "৳",
        "Dhaka",
        "Asia",
        "+880-XX-XXX-XXX"
    )

    object Barbados : CountryData(
        R.string.barbados,
        R.drawable.barbados_flag,
        "+1 246",
        "1246",
        "BB",
        "BRB",
        "BBD",
        "Barbadian dollar",
        "$",
        "Bridgetown",
        "North America",
        "+1(246)XXX-XXXX"
    )

    object Belarus : CountryData(
        R.string.belarus,
        R.drawable.belarus_flag,
        "+375",
        "375",
        "BY",
        "BLR",
        "BYN",
        "Belarusian ruble",
        "Br",
        "Minsk",
        "Europe",
        "+375(XX)XXX-XX-XX"
    )

    object Belgium : CountryData(
        R.string.belgium,
        R.drawable.belgium_flag,
        "+32",
        "32",
        "BE",
        "BEL",
        "EUR",
        "euro",
        "€",
        "Brussels",
        "Europe",
        "+32(XXX)XXX-XXX"
    )

    object Belize : CountryData(
        R.string.belize,
        R.drawable.belize_flag,
        "+501",
        "501",
        "BZ",
        "BLZ",
        "BZD",
        "Belize dollar",
        "$",
        "Belmopan",
        "North America",
        "+501-XXX-XXXX"
    )

    object Benin : CountryData(
        R.string.benin,
        R.drawable.benin_flag,
        "+229",
        "229",
        "BJ",
        "BEN",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Porto-Novo",
        "Africa",
        "+229-XX-XX-XXXX"
    )

    object Bhutan : CountryData(
        R.string.bhutan,
        R.drawable.bhutan_flag,
        "+975",
        "975",
        "BT",
        "BTN",
        "BTN",
        "Bhutanese ngultrum",
        "Nu.",
        "Thimphu",
        "Asia",
        "+975-X-XXX-XXX"
    )

    object Bolivia : CountryData(
        R.string.bolivia,
        R.drawable.bolivia_flag,
        "+591",
        "591",
        "BO",
        "BOL",
        "BOB",
        "Bolivian boliviano",
        "Bs.",
        "Sucre",
        "South America",
        "+591-X-XXX-XXXX"
    )

    object BosniaAndHerzegovina : CountryData(
        R.string.bosnia_and_herzegovina,
        R.drawable.bosnia_and_herzegovina_flag,
        "+387",
        "387",
        "BA",
        "BIH",
        "BAM",
        "Bosnia and Herzegovina convertible mark",
        "KM",
        "Sarajevo",
        "Europe",
        "+387-XX-XXXX"
    )

    object Botswana : CountryData(
        R.string.botswana,
        R.drawable.botswana_flag,
        "+267",
        "267",
        "BW",
        "BWA",
        "BWP",
        "Botswana pula",
        "P",
        "Gaborone",
        "Africa",
        "+267-XX-XXX-XXX"
    )

    object Brazil : CountryData(
        R.string.brazil,
        R.drawable.brazil_flag,
        "+55",
        "55",
        "BR",
        "BRA",
        "BRL",
        "Brazilian real",
        "R$",
        "Brasília",
        "South America",
        "+55(XX)9XXXX-XXXX"
    )

    object Brunei : CountryData(
        R.string.brunei,
        R.drawable.brunei_flag,
        "+673",
        "673",
        "BN",
        "BRN",
        "BND",
        "Brunei dollar",
        "$",
        "Bandar Seri Begawan",
        "Asia",
        "+673-XXX-XXXX"
    )

    object Bulgaria : CountryData(
        R.string.bulgaria,
        R.drawable.bulgaria_flag,
        "+359",
        "359",
        "BG",
        "BGR",
        "BGN",
        "Bulgarian lev",
        "лв",
        "Sofia",
        "Europe",
        "+359(XXX)XXX-XXX"
    )

    object BurkinaFaso : CountryData(
        R.string.burkina_faso,
        R.drawable.burkina_faso_flag,
        "+226",
        "226",
        "BF",
        "BFA",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Ouagadougou",
        "Africa",
        "+226-XX-XX-XXXX"
    )

    object Burundi : CountryData(
        R.string.burundi,
        R.drawable.burundi_flag,
        "+257",
        "257",
        "BI",
        "BDI",
        "BIF",
        "Burundian franc",
        "Fr",
        "Gitega",
        "Africa",
        "+257-XX-XX-XXXX"
    )

    object Cambodia : CountryData(
        R.string.cambodia,
        R.drawable.cambodia_flag,
        "+855",
        "855",
        "KH",
        "KHM",
        "KHR",
        "Cambodian riel",
        "៛",
        "Phnom Penh",
        "Asia",
        "+855-XX-XXX-XXX"
    )

    object Cameroon : CountryData(
        R.string.cameroon,
        R.drawable.cameroon_flag,
        "+237",
        "237",
        "CM",
        "CMR",
        "XAF",
        "Central African CFA franc",
        "Fr",
        "Yaoundé",
        "Africa",
        "+237-XXXX-XXXX"
    )

    object Canada : CountryData(
        R.string.canada,
        R.drawable.canada_flag,
        "+1",
        "1",
        "CA",
        "CAN",
        "CAD",
        "Canadian dollar",
        "$",
        "Ottawa",
        "North America",
        "+1(XXX)XXX-XXXX"
    )

    object CapeVerde : CountryData(
        R.string.cape_verde,
        R.drawable.cape_verde_flag,
        "+238",
        "238",
        "CV",
        "CPV",
        "CVE",
        "Cape Verdean escudo",
        "Esc",
        "Praia",
        "Africa",
        "+238(XXX)XX-XX"
    )

    object CentralAfricanRepublic : CountryData(
        R.string.central_african_republic,
        R.drawable.central_african_republic_flag,
        "+236",
        "236",
        "CF",
        "CAF",
        "XAF",
        "Central African CFA franc",
        "Fr",
        "Bangui",
        "Africa",
        "+236-XX-XX-XXXX"
    )

    object Chad : CountryData(
        R.string.chad,
        R.drawable.chad_flag,
        "+235",
        "235",
        "TD",
        "TCD",
        "XAF",
        "Central African CFA franc",
        "Fr",
        "N'Djamena",
        "Africa",
        "+235-XX-XX-XX-XX"
    )

    object Chile : CountryData(
        R.string.chile,
        R.drawable.chile_flag,
        "+56",
        "56",
        "CL",
        "CHL",
        "CLP",
        "Chilean peso",
        "$",
        "Santiago",
        "South America",
        "+56-X-XXXX-XXXX"
    )

    object China : CountryData(
        R.string.china,
        R.drawable.china_flag,
        "+86",
        "86",
        "CN",
        "CHN",
        "CNY",
        "Chinese yuan",
        "¥",
        "Beijing",
        "Asia",
        "+86-XX-XXXXX-XXXXX"
    )

    object Colombia : CountryData(
        R.string.colombia,
        R.drawable.colombia_flag,
        "+57",
        "57",
        "CO",
        "COL",
        "COP",
        "Colombian peso",
        "$",
        "Bogotá",
        "South America",
        "+57(XXX)XXX-XXXX"
    )

    object Comoros : CountryData(
        R.string.comoros,
        R.drawable.comoros_flag,
        "+269",
        "269",
        "KM",
        "COM",
        "KMF",
        "Comorian franc",
        "Fr",
        "Moroni",
        "Africa",
        "+269-XX-XXXXX"
    )

    object Congo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.congo_flag,
        "+242",
        "242",
        "CG",
        "COG",
        "XAF",
        "Central African CFA franc",
        "Fr",
        "Brazzaville",
        "Africa",
        "+242-XX-XXX-XXXX"
    )

    object CostaRica : CountryData(
        R.string.costa_rica,
        R.drawable.costa_rica_flag,
        "+506",
        "506",
        "CR",
        "CRI",
        "CRC",
        "Costa Rican colón",
        "₡",
        "San José",
        "North America",
        "+506-XXXX-XXXX"
    )

    object Croatia : CountryData(
        R.string.croatia,
        R.drawable.croatia_flag,
        "+385",
        "385",
        "HR",
        "HRV",
        "EUR",
        "euro",
        "€",
        "Zagreb",
        "Europe",
        "+385-XX-XXX-XXX"
    )

    object Cuba : CountryData(
        R.string.cuba,
        R.drawable.cuba_flag,
        "+53",
        "53",
        "CU",
        "CUB",
        "CUC",
        "Cuban convertible peso",
        "$",
        "Havana",
        "North America",
        "+53-X-XXX-XXXX"
    )

    object Cyprus : CountryData(
        R.string.cyprus,
        R.drawable.cyprus_flag,
        "+357",
        "357",
        "CY",
        "CYP",
        "EUR",
        "euro",
        "€",
        "Nicosia",
        "Europe",
        "+357-XX-XXX-XXX"
    )

    object CzechRepublic : CountryData(
        R.string.czech_republic,
        R.drawable.czech_republic_flag,
        "+420",
        "420",
        "CZ",
        "CZE",
        "CZK",
        "Czech koruna",
        "Kč",
        "Prague",
        "Europe",
        "+420(XXX)XXX-XXX"
    )

    object DemocraticRepublicOfCongo : CountryData(
        R.string.democratic_republic_of_congo,
        R.drawable.democratic_republic_of_congo_flag,
        "+243",
        "243",
        "CD",
        "COD",
        "CDF",
        "Congolese franc",
        "FC",
        "Kinshasa",
        "Africa",
        "+243(XXX)XXX-XXX"
    )

    object Denmark : CountryData(
        R.string.denmark,
        R.drawable.denmark_flag,
        "+45",
        "45",
        "DK",
        "DNK",
        "DKK",
        "Danish krone",
        "kr",
        "Copenhagen",
        "Europe",
        "+45-XX-XX-XX-XX"
    )

    object Djibouti : CountryData(
        R.string.djibouti,
        R.drawable.djibouti_flag,
        "+253",
        "253",
        "DJ",
        "DJI",
        "DJF",
        "Djiboutian franc",
        "Fr",
        "Djibouti",
        "Africa",
        "+253-XX-XX-XX-XX"
    )

    object Dominica : CountryData(
        R.string.dominica,
        R.drawable.dominica_flag,
        "+1 767",
        "1767",
        "DM",
        "DMA",
        "XCD",
        "Eastern Caribbean dollar",
        "$",
        "Roseau",
        "North America",
        "+1(767)XXX-XXXX"
    )

    object DominicanRepublic : CountryData(
        R.string.dominican_republic,
        R.drawable.dominican_republic_flag,
        "+1 809",
        "1809",
        "DO",
        "DOM",
        "DOP",
        "Dominican peso",
        "$",
        "Santo Domingo",
        "North America",
        "+1(849)XXX-XXXX"
    )

    object Ecuador : CountryData(
        R.string.ecuador,
        R.drawable.ecuador_flag,
        "+593",
        "593",
        "EC",
        "ECU",
        "USD",
        "United States dollar",
        "$",
        "Quito",
        "South America",
        "+593-X-XXX-XXXX"
    )

    object Egypt : CountryData(
        R.string.egypt,
        R.drawable.egypt_flag,
        "+20",
        "20",
        "EG",
        "EGY",
        "EGP",
        "Egyptian pound",
        "£",
        "Cairo",
        "Africa",
        "+20(XXX)XXX-XXXX"
    )

    object ElSalvador : CountryData(
        R.string.el_salvador,
        R.drawable.el_salvador_flag,
        "+503",
        "503",
        "SV",
        "SLV",
        "USD",
        "United States dollar",
        "$",
        "San Salvador",
        "North America",
        "+503-XX-XX-XXXX"
    )

    object EquatorialGuinea : CountryData(
        R.string.equatorial_guinea,
        R.drawable.equatorial_guinea_flag,
        "+240",
        "240",
        "GQ",
        "GNQ",
        "XAF",
        "Central African CFA franc",
        "Fr",
        "Malabo",
        "Africa",
        "+240-XX-XXX-XXXX"
    )

    object Eritrea : CountryData(
        R.string.eritrea,
        R.drawable.eritrea_flag,
        "+291",
        "291",
        "ER",
        "ERI",
        "ERN",
        "Eritrean nakfa",
        "Nfk",
        "Asmara",
        "Africa",
        "+291-X-XXX-XXX"
    )

    object Estonia : CountryData(
        R.string.estonia,
        R.drawable.estonia_flag,
        "+372",
        "372",
        "EE",
        "EST",
        "EUR",
        "euro",
        "€",
        "Tallinn",
        "Europe",
        "+372-XXX-XXXX"
    )

    object Eswatini : CountryData(
        R.string.eswatini,
        R.drawable.eswatini_flag,
        "+268",
        "268",
        "SZ",
        "SWZ",
        "SZL",
        "Swazi lilangeni",
        "L",
        "Mbabane",
        "Africa",
        "+268-XX-XX-XXXX"
    )

    object Ethiopia : CountryData(
        R.string.ethiopia,
        R.drawable.ethiopia_flag,
        "+251",
        "251",
        "ET",
        "ETH",
        "ETB",
        "Ethiopian birr",
        "Br",
        "Addis Ababa",
        "Africa",
        "+251-XX-XXX-XXXX"
    )

    object Fiji : CountryData(
        R.string.fiji,
        R.drawable.fiji_flag,
        "+679",
        "679",
        "FJ",
        "FJI",
        "FJD",
        "Fijian dollar",
        "$",
        "Suva",
        "Oceania",
        "+679-XX-XXXXX"
    )

    object Finland : CountryData(
        R.string.finland,
        R.drawable.finland_flag,
        "+358",
        "358",
        "FI",
        "FIN",
        "EUR",
        "euro",
        "€",
        "Helsinki",
        "Europe",
        "+358(XXX)XXX-XX-XX"
    )

    object France : CountryData(
        R.string.france,
        R.drawable.france_flag,
        "+33",
        "33",
        "FR",
        "FRA",
        "EUR",
        "euro",
        "€",
        "Paris",
        "Europe",
        "+590(XXX)XXX-XXX"
    )

    object Gabon : CountryData(
        R.string.gabon,
        R.drawable.gabon_flag,
        "+241",
        "241",
        "GA",
        "GAB",
        "XAF",
        "Central African CFA franc",
        "Fr",
        "Libreville",
        "Africa",
        "+241-X-XX-XX-XX"
    )

    object Gambia : CountryData(
        R.string.gambia,
        R.drawable.gambia_flag,
        "+220",
        "220",
        "GM",
        "GMB",
        "GMD",
        "dalasi",
        "D",
        "Banjul",
        "Africa",
        "+220(XXX)XX-XX"
    )

    object Georgia : CountryData(
        R.string.georgia,
        R.drawable.georgia_flag,
        "+995",
        "995",
        "GE",
        "GEO",
        "GEL",
        "lari",
        "₾",
        "Tbilisi",
        "Asia",
        "+995(XXX)XXX-XXX"
    )

    object Germany : CountryData(
        R.string.germany,
        R.drawable.germany_flag,
        "+49",
        "49",
        "DE",
        "DEU",
        "EUR",
        "euro",
        "€",
        "Berlin",
        "Europe",
        "+49-XXX-XXX"
    )

    object Ghana : CountryData(
        R.string.ghana,
        R.drawable.ghana_flag,
        "+233",
        "233",
        "GH",
        "GHA",
        "GHS",
        "Ghanaian cedi",
        "₵",
        "Accra",
        "Africa",
        "+233(XXX)XXX-XXX"
    )

    object Greece : CountryData(
        R.string.greece,
        R.drawable.greece_flag,
        "+30",
        "30",
        "GR",
        "GRC",
        "EUR",
        "euro",
        "€",
        "Athens",
        "Europe",
        "+30(XXX)XXX-XXXX"
    )

    object Grenada : CountryData(
        R.string.grenada,
        R.drawable.grenada_flag,
        "+1 473",
        "1473",
        "GD",
        "GRD",
        "XCD",
        "Eastern Caribbean dollar",
        "$",
        "St. George's",
        "North America",
        "+1(473)XXX-XXXX"
    )

    object Guatemala : CountryData(
        R.string.guatemala,
        R.drawable.guatemala_flag,
        "+502",
        "502",
        "GT",
        "GTM",
        "GTQ",
        "Guatemalan quetzal",
        "Q",
        "Guatemala City",
        "North America",
        "+502-X-XXX-XXXX"
    )

    object Guinea : CountryData(
        R.string.guinea,
        R.drawable.guinea_flag,
        "+224",
        "224",
        "GN",
        "GIN",
        "GNF",
        "Guinean franc",
        "Fr",
        "Conakry",
        "Africa",
        "+224-XX-XXX-XXX"
    )

    object GuineaBissau : CountryData(
        R.string.guinea_bissau,
        R.drawable.guinea_bissau_flag,
        "+245",
        "245",
        "GW",
        "GNB",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Bissau",
        "Africa",
        "+245-X-XXXXXX"
    )

    object Guyana : CountryData(
        R.string.guyana,
        R.drawable.guyana_flag,
        "+592",
        "592",
        "GY",
        "GUY",
        "GYD",
        "Guyanese dollar",
        "$",
        "Georgetown",
        "South America",
        "+592-XXX-XXXX"
    )

    object Haiti : CountryData(
        R.string.haiti,
        R.drawable.haiti_flag,
        "+509",
        "509",
        "HT",
        "HTI",
        "HTG",
        "Haitian gourde",
        "G",
        "Port-au-Prince",
        "North America",
        "+509-XX-XX-XXXX"
    )

    object Honduras : CountryData(
        R.string.honduras,
        R.drawable.honduras_flag,
        "+504",
        "504",
        "HN",
        "HND",
        "HNL",
        "Honduran lempira",
        "L",
        "Tegucigalpa",
        "North America",
        "+504-XXXX-XXXX"
    )

    object Hungary : CountryData(
        R.string.hungary,
        R.drawable.hungary_flag,
        "+36",
        "36",
        "HU",
        "HUN",
        "HUF",
        "Hungarian forint",
        "Ft",
        "Budapest",
        "Europe",
        "+36(XXX)XXX-XXX"
    )

    object Iceland : CountryData(
        R.string.iceland,
        R.drawable.iceland_flag,
        "+354",
        "354",
        "IS",
        "ISL",
        "ISK",
        "Icelandic króna",
        "kr",
        "Reykjavik",
        "Europe",
        "+354-XXX-XXXX"
    )

    object India : CountryData(
        R.string.india,
        R.drawable.india_flag,
        "+91",
        "91",
        "IN",
        "IND",
        "INR",
        "Indian rupee",
        "₹",
        "New Delhi",
        "Asia",
        "+91(XXXX)XXX-XXX"
    )

    object Indonesia : CountryData(
        R.string.indonesia,
        R.drawable.indonesia_flag,
        "+62",
        "62",
        "ID",
        "IDN",
        "IDR",
        "Indonesian rupiah",
        "Rp",
        "Jakarta",
        "Asia",
        "+62(8XX)XXX-XX-XXX"
    )

    object Iran : CountryData(
        R.string.iran,
        R.drawable.iran_flag,
        "+98",
        "98",
        "IR",
        "IRN",
        "IRR",
        "Iranian rial",
        "﷼",
        "Tehran",
        "Asia",
        "+98(XXX)XXX-XXXX"
    )

    object Iraq : CountryData(
        R.string.iraq,
        R.drawable.iraq_flag,
        "+964",
        "964",
        "IQ",
        "IRQ",
        "IQD",
        "Iraqi dinar",
        "ع.د",
        "Baghdad",
        "Asia",
        "+964(XXX)XXX-XXXX"
    )

    object Ireland : CountryData(
        R.string.ireland,
        R.drawable.ireland_flag,
        "+353",
        "353",
        "IE",
        "IRL",
        "EUR",
        "euro",
        "€",
        "Dublin",
        "Europe",
        "+353(XXX)XXX-XXX"
    )

    object Israel : CountryData(
        R.string.israel,
        R.drawable.israel_flag,
        "+972",
        "972",
        "IL",
        "ISR",
        "ILS",
        "Israeli new shekel",
        "₪",
        "Jerusalem",
        "Asia",
        "+972-X-XXX-XXXX"
    )

    object Italy : CountryData(
        R.string.italy,
        R.drawable.italy_flag,
        "+39",
        "39",
        "IT",
        "ITA",
        "EUR",
        "euro",
        "€",
        "Rome",
        "Europe",
        "+39(XXX)XXXX-XXX"
    )

    object IvoryCoast : CountryData(
        R.string.ivory_coast,
        R.drawable.ivory_coast_flag,
        "+225",
        "225",
        "CI",
        "CIV",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Yamoussoukro",
        "Africa",
        "+225-XX-XXX-XXX"
    )

    object Jamaica : CountryData(
        R.string.jamaica,
        R.drawable.jamaica_flag,
        "+1 876",
        "1876",
        "JM",
        "JAM",
        "JMD",
        "Jamaican dollar",
        "$",
        "Kingston",
        "North America",
        "+1(876)XXX-XXXX"
    )

    object Japan : CountryData(
        R.string.japan,
        R.drawable.japan_flag,
        "+81",
        "81",
        "JP",
        "JPN",
        "JPY",
        "Japanese yen",
        "¥",
        "Tokyo",
        "Asia",
        "+81(XXX)XXX-XXX"
    )

    object Jordan : CountryData(
        R.string.jordan,
        R.drawable.jordan_flag,
        "+962",
        "962",
        "JO",
        "JOR",
        "JOD",
        "Jordanian dinar",
        "د.ا",
        "Amman",
        "Asia",
        "+962-X-XXXX-XXXX"
    )

    object Kazakhstan : CountryData(
        R.string.kazakhstan,
        R.drawable.kazakhstan_flag,
        "+7",
        "7",
        "KZ",
        "KAZ",
        "KZT",
        "Kazakhstani tenge",
        "₸",
        "Astana",
        "Asia",
        "+7(7XX)XXX-XX-XX"
    )

    object Kenya : CountryData(
        R.string.kenya,
        R.drawable.kenya_flag,
        "+254",
        "254",
        "KE",
        "KEN",
        "KES",
        "Kenyan shilling",
        "Sh",
        "Nairobi",
        "Africa",
        "+254-XXX-XXXXXX"
    )

    object Kiribati : CountryData(
        R.string.kiribati,
        R.drawable.kiribati_flag,
        "+686",
        "686",
        "KI",
        "KIR",
        "AUD",
        "Australian dollar",
        "$",
        "South Tarawa",
        "Oceania",
        "+686-XX-XXX"
    )

    object Kosovo : CountryData(
        R.string.kosovo,
        R.drawable.kosovo_flag,
        "+383",
        "383",
        "XK",
        "XKX",
        "EUR",
        "euro",
        "€",
        "Pristina",
        "Europe",
        ""
    )

    object Kuwait : CountryData(
        R.string.kuwait,
        R.drawable.kuwait_flag,
        "+965",
        "965",
        "KW",
        "KWT",
        "KWD",
        "Kuwaiti dinar",
        "د.ك",
        "Kuwait City",
        "Asia",
        "+965-XXXX-XXXX"
    )

    object Kyrgyzstan : CountryData(
        R.string.kyrgyzstan,
        R.drawable.kyrgyzstan_flag,
        "+996",
        "996",
        "KG",
        "KGZ",
        "KGS",
        "Kyrgyzstani som",
        "с",
        "Bishkek",
        "Asia",
        "+996(XXX)XXX-XXX"
    )

    object Laos : CountryData(
        R.string.laos,
        R.drawable.laos_flag,
        "+856",
        "856",
        "LA",
        "LAO",
        "LAK",
        "Lao kip",
        "₭",
        "Vientiane",
        "Asia",
        "+856-XX-XXX-XXX"
    )

    object Latvia : CountryData(
        R.string.latvia,
        R.drawable.latvia_flag,
        "+371",
        "371",
        "LV",
        "LVA",
        "EUR",
        "euro",
        "€",
        "Riga",
        "Europe",
        "+371-XX-XXX-XXX"
    )

    object Lebanon : CountryData(
        R.string.lebanon,
        R.drawable.lebanon_flag,
        "+961",
        "961",
        "LB",
        "LBN",
        "LBP",
        "Lebanese pound",
        "ل.ل",
        "Beirut",
        "Asia",
        "+961-X-XXX-XXX"
    )

    object Lesotho : CountryData(
        R.string.lesotho,
        R.drawable.lesotho_flag,
        "+266",
        "266",
        "LS",
        "LSO",
        "LSL",
        "Lesotho loti",
        "L",
        "Maseru",
        "Africa",
        "+266-X-XXX-XXXX"
    )

    object Liberia : CountryData(
        R.string.liberia,
        R.drawable.liberia_flag,
        "+231",
        "231",
        "LR",
        "LBR",
        "LRD",
        "Liberian dollar",
        "$",
        "Monrovia",
        "Africa",
        "+231-XX-XXX-XXX"
    )

    object Libya : CountryData(
        R.string.libya,
        R.drawable.libya_flag,
        "+218",
        "218",
        "LY",
        "LBY",
        "LYD",
        "Libyan dinar",
        "ل.د",
        "Tripoli",
        "Africa",
        "+218-21-XXX-XXXX"
    )

    object Liechtenstein : CountryData(
        R.string.liechtenstein,
        R.drawable.liechtenstein_flag,
        "+423",
        "423",
        "LI",
        "LIE",
        "CHF",
        "Swiss franc",
        "Fr",
        "Vaduz",
        "Europe",
        "+423(XXX)XXX-XXXX"
    )

    object Lithuania : CountryData(
        R.string.lithuania,
        R.drawable.lithuania_flag,
        "+370",
        "370",
        "LT",
        "LTU",
        "EUR",
        "euro",
        "€",
        "Vilnius",
        "Europe",
        "+370(XXX)XX-XXX"
    )

    object Luxembourg : CountryData(
        R.string.luxembourg,
        R.drawable.luxembourg_flag,
        "+352",
        "352",
        "LU",
        "LUX",
        "EUR",
        "euro",
        "€",
        "Luxembourg",
        "Europe",
        "+352(XXX)XXX-XXX"
    )

    object Madagascar : CountryData(
        R.string.madagascar,
        R.drawable.madagascar_flag,
        "+261",
        "261",
        "MG",
        "MDG",
        "MGA",
        "Malagasy ariary",
        "Ar",
        "Antananarivo",
        "Africa",
        "+261-XX-XX-XXXXX"
    )

    object Malawi : CountryData(
        R.string.malawi,
        R.drawable.malawi_flag,
        "+265",
        "265",
        "MW",
        "MWI",
        "MWK",
        "Malawian kwacha",
        "MK",
        "Lilongwe",
        "Africa",
        "+265-X-XXXX-XXXX"
    )

    object Malaysia : CountryData(
        R.string.malaysia,
        R.drawable.malaysia_flag,
        "+60",
        "60",
        "MY",
        "MYS",
        "MYR",
        "Malaysian ringgit",
        "RM",
        "Kuala Lumpur",
        "Asia",
        "+60-X-XXX-XXX"
    )

    object Maldives : CountryData(
        R.string.maldives,
        R.drawable.maldives_flag,
        "+960",
        "960",
        "MV",
        "MDV",
        "MVR",
        "Maldivian rufiyaa",
        ".ރ",
        "Malé",
        "Asia",
        "+960-XXX-XXXX"
    )

    object Mali : CountryData(
        R.string.mali,
        R.drawable.mali_flag,
        "+223",
        "223",
        "ML",
        "MLI",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Bamako",
        "Africa",
        "+223-XX-XX-XXXX"
    )

    object Malta : CountryData(
        R.string.malta,
        R.drawable.malta_flag,
        "+356",
        "356",
        "MT",
        "MLT",
        "EUR",
        "euro",
        "€",
        "Valletta",
        "Europe",
        "+356-XXXX-XXXX"
    )

    object MarshallIslands : CountryData(
        R.string.marshall_islands,
        R.drawable.marshall_islands_flag,
        "+692",
        "692",
        "MH",
        "MHL",
        "USD",
        "United States dollar",
        "$",
        "Majuro",
        "Oceania",
        "+692-XXX-XXXX"
    )

    object Mauritania : CountryData(
        R.string.mauritania,
        R.drawable.mauritania_flag,
        "+222",
        "222",
        "MR",
        "MRT",
        "MRU",
        "Mauritanian ouguiya",
        "UM",
        "Nouakchott",
        "Africa",
        "+222-XX-XX-XXXX"
    )

    object Mauritius : CountryData(
        R.string.mauritius,
        R.drawable.mauritius_flag,
        "+230",
        "230",
        "MU",
        "MUS",
        "MUR",
        "Mauritian rupee",
        "₨",
        "Port Louis",
        "Africa",
        "+230-XXX-XXXX"
    )

    object Mexico : CountryData(
        R.string.mexico,
        R.drawable.mexico_flag,
        "+52",
        "52",
        "MX",
        "MEX",
        "MXN",
        "Mexican peso",
        "$",
        "Mexico City",
        "North America",
        "+52-XX-XX-XXXX"
    )

    object Micronesia : CountryData(
        R.string.micronesia,
        R.drawable.micronesia_flag,
        "+691",
        "691",
        "FM",
        "FSM",
        "USD",
        "United States dollar",
        "$",
        "Palikir",
        "Oceania",
        "+691-XXX-XXXX"
    )

    object Moldova : CountryData(
        R.string.moldova,
        R.drawable.moldova_flag,
        "+373",
        "373",
        "MD",
        "MDA",
        "MDL",
        "Moldovan leu",
        "L",
        "Chișinău",
        "Europe",
        "+373-XXXX-XXXX"
    )

    object Monaco : CountryData(
        R.string.monaco,
        R.drawable.monaco_flag,
        "+377",
        "377",
        "MC",
        "MCO",
        "EUR",
        "euro",
        "€",
        "Monaco",
        "Europe",
        "+377-XX-XXX-XXX"
    )

    object Mongolia : CountryData(
        R.string.mongolia,
        R.drawable.mongolia_flag,
        "+976",
        "976",
        "MN",
        "MNG",
        "MNT",
        "Mongolian tögrög",
        "₮",
        "Ulan Bator",
        "Asia",
        "+976-XX-XX-XXXX"
    )

    object Montenegro : CountryData(
        R.string.montenegro,
        R.drawable.montenegro_flag,
        "+382",
        "382",
        "ME",
        "MNE",
        "EUR",
        "euro",
        "€",
        "Podgorica",
        "Europe",
        "+382-XX-XXX-XXX"
    )

    object Morocco : CountryData(
        R.string.morocco,
        R.drawable.morocco_flag,
        "+212",
        "212",
        "MA",
        "MAR",
        "MAD",
        "Moroccan dirham",
        "د.م.",
        "Rabat",
        "Africa",
        "+212-XX-XXXX-XXX"
    )

    object Mozambique : CountryData(
        R.string.mozambique,
        R.drawable.mozambique_flag,
        "+258",
        "258",
        "MZ",
        "MOZ",
        "MZN",
        "Mozambican metical",
        "MT",
        "Maputo",
        "Africa",
        "+258-XX-XXX-XXX"
    )

    object Myanmar : CountryData(
        R.string.myanmar,
        R.drawable.myanmar_flag,
        "+95",
        "95",
        "MM",
        "MMR",
        "MMK",
        "Burmese kyat",
        "Ks",
        "Naypyidaw",
        "Asia",
        "+95-XXX-XXX"
    )

    object Namibia : CountryData(
        R.string.namibia,
        R.drawable.namibia_flag,
        "+264",
        "264",
        "NA",
        "NAM",
        "NAD",
        "Namibian dollar",
        "$",
        "Windhoek",
        "Africa",
        "+264-XX-XXX-XXXX"
    )

    object Nauru : CountryData(
        R.string.nauru,
        R.drawable.nauru_flag,
        "+674",
        "674",
        "NR",
        "NRU",
        "AUD",
        "Australian dollar",
        "$",
        "Yaren",
        "Oceania",
        "+674-XXX-XXXX"
    )

    object Nepal : CountryData(
        R.string.nepal,
        R.drawable.nepal_flag,
        "+977",
        "977",
        "NP",
        "NPL",
        "NPR",
        "Nepalese rupee",
        "₨",
        "Kathmandu",
        "Asia",
        "+977-XX-XXX-XXX"
    )

    object Netherlands : CountryData(
        R.string.netherlands,
        R.drawable.netherlands_flag,
        "+31",
        "31",
        "NL",
        "NLD",
        "EUR",
        "euro",
        "€",
        "Amsterdam",
        "Europe",
        "+31-XX-XXX-XXXX"
    )

    object NewZealand : CountryData(
        R.string.new_zealand,
        R.drawable.new_zealand_flag,
        "+64",
        "64",
        "NZ",
        "NZL",
        "NZD",
        "New Zealand dollar",
        "$",
        "Wellington",
        "Oceania",
        "+64(XXX)XXX-XXXX"
    )

    object Nicaragua : CountryData(
        R.string.nicaragua,
        R.drawable.nicaragua_flag,
        "+505",
        "505",
        "NI",
        "NIC",
        "NIO",
        "Nicaraguan córdoba",
        "C$",
        "Managua",
        "North America",
        "+505-XXXX-XXXX"
    )

    object Niger : CountryData(
        R.string.niger,
        R.drawable.niger_flag,
        "+227",
        "227",
        "NE",
        "NER",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Niamey",
        "Africa",
        "+227-XX-XX-XXXX"
    )

    object Nigeria : CountryData(
        R.string.nigeria,
        R.drawable.nigeria_flag,
        "+234",
        "234",
        "NG",
        "NGA",
        "NGN",
        "Nigerian naira",
        "₦",
        "Abuja",
        "Africa",
        "+234(XXX)XXX-XXXX"
    )

    object NorthKorea : CountryData(
        R.string.north_korea,
        R.drawable.north_korea_flag,
        "+850",
        "850",
        "KP",
        "PRK",
        "KPW",
        "North Korean won",
        "₩",
        "Pyongyang",
        "Asia",
        "+850-XXXX-XXXXXXXXXXXXX"
    )

    object NorthMacedonia : CountryData(
        R.string.north_macedonia,
        R.drawable.north_macedonia_flag,
        "+389",
        "389",
        "MK",
        "MKD",
        "MKD",
        "denar",
        "den",
        "Skopje",
        "Europe",
        "+389-XX-XXX-XXX"
    )

    object Norway : CountryData(
        R.string.norway,
        R.drawable.norway_flag,
        "+47",
        "47",
        "NO",
        "NOR",
        "NOK",
        "Norwegian krone",
        "kr",
        "Oslo",
        "Europe",
        "+47(XXX)XX-XXX"
    )

    object Oman : CountryData(
        R.string.oman,
        R.drawable.oman_flag,
        "+968",
        "968",
        "OM",
        "OMN",
        "OMR",
        "Omani rial",
        "ر.ع.",
        "Muscat",
        "Asia",
        "+968-XX-XXX-XXX"
    )

    object Pakistan : CountryData(
        R.string.pakistan,
        R.drawable.pakistan_flag,
        "+92",
        "92",
        "PK",
        "PAK",
        "PKR",
        "Pakistani rupee",
        "₨",
        "Islamabad",
        "Asia",
        "+92(XXX)XXX-XXXX"
    )

    object Palau : CountryData(
        R.string.palau,
        R.drawable.palau_flag,
        "+680",
        "680",
        "PW",
        "PLW",
        "USD",
        "United States dollar",
        "$",
        "Ngerulmud",
        "Oceania",
        "+680-XXX-XXXX"
    )

    object Panama : CountryData(
        R.string.panama,
        R.drawable.panama_flag,
        "+507",
        "507",
        "PA",
        "PAN",
        "PAB",
        "Panamanian balboa",
        "B/.",
        "Panama City",
        "North America",
        "+507-XXX-XXXX"
    )

    object PapuaNewGuinea : CountryData(
        R.string.papua_new_guinea,
        R.drawable.papua_new_guinea_flag,
        "+675",
        "675",
        "PG",
        "PNG",
        "PGK",
        "Papua New Guinean kina",
        "K",
        "Port Moresby",
        "Oceania",
        "+675(XXX)XX-XXX"
    )

    object Paraguay : CountryData(
        R.string.paraguay,
        R.drawable.paraguay_flag,
        "+595",
        "595",
        "PY",
        "PRY",
        "PYG",
        "Paraguayan guaraní",
        "₲",
        "Asunción",
        "South America",
        "+595(XXX)XXX-XXX"
    )

    object Peru : CountryData(
        R.string.peru,
        R.drawable.peru_flag,
        "+51",
        "51",
        "PE",
        "PER",
        "PEN",
        "Peruvian sol",
        "S/ ",
        "Lima",
        "South America",
        "+51(XXX)XXX-XXX"
    )

    object Philippines : CountryData(
        R.string.philippines,
        R.drawable.philippines_flag,
        "+63",
        "63",
        "PH",
        "PHL",
        "PHP",
        "Philippine peso",
        "₱",
        "Manila",
        "Asia",
        "+63(XXX)XXX-XXXX"
    )

    object Poland : CountryData(
        R.string.poland,
        R.drawable.poland_flag,
        "+48",
        "48",
        "PL",
        "POL",
        "PLN",
        "Polish złoty",
        "zł",
        "Warsaw",
        "Europe",
        "+48(XXX)XXX-XXX"
    )

    object Portugal : CountryData(
        R.string.portugal,
        R.drawable.portugal_flag,
        "+351",
        "351",
        "PT",
        "PRT",
        "EUR",
        "euro",
        "€",
        "Lisbon",
        "Europe",
        "+351-XX-XXX-XXXX"
    )

    object Qatar : CountryData(
        R.string.qatar,
        R.drawable.qatar_flag,
        "+974",
        "974",
        "QA",
        "QAT",
        "QAR",
        "Qatari riyal",
        "ر.ق",
        "Doha",
        "Asia",
        "+974-XXXX-XXXX"
    )

    object Romania : CountryData(
        R.string.romania,
        R.drawable.romania_flag,
        "+40",
        "40",
        "RO",
        "ROU",
        "RON",
        "Romanian leu",
        "lei",
        "Bucharest",
        "Europe",
        "+40-XX-XXX-XXXX"
    )

    object Russia : CountryData(
        R.string.russia,
        R.drawable.russia_flag,
        "+7",
        "7",
        "RU",
        "RUS",
        "RUB",
        "Russian ruble",
        "₽",
        "Moscow",
        "Europe",
        "+7(XXX)XXX-XX-XX"
    )

    object Rwanda : CountryData(
        R.string.rwanda,
        R.drawable.rwanda_flag,
        "+250",
        "250",
        "RW",
        "RWA",
        "RWF",
        "Rwandan franc",
        "Fr",
        "Kigali",
        "Africa",
        "+250(XXX)XXX-XXX"
    )

    object SaintKittsAndNevis : CountryData(
        R.string.saint_kitts_and_nevis,
        R.drawable.saint_kitts_and_nevis_flag,
        "+1869",
        "1869",
        "KN",
        "KNA",
        "XCD",
        "Eastern Caribbean dollar",
        "$",
        "Basseterre",
        "North America",
        "+1(869)XXX-XXXX"
    )

    object SaintLucia : CountryData(
        R.string.saint_lucia,
        R.drawable.saint_lucia_flag,
        "+1758",
        "1758",
        "LC",
        "LCA",
        "XCD",
        "Eastern Caribbean dollar",
        "$",
        "Castries",
        "North America",
        "+1(758)XXX-XXXX"
    )

    object SaintVincentAndTheGrenadines : CountryData(
        R.string.saint_vincent_and_the_grenadines,
        R.drawable.saint_vincent_and_the_grenadines_flag,
        "+1784",
        "1784",
        "VC",
        "VCT",
        "XCD",
        "Eastern Caribbean dollar",
        "$",
        "Kingstown",
        "North America",
        "+1(784)XXX-XXXX"
    )

    object Samoa : CountryData(
        R.string.samoa,
        R.drawable.samoa_flag,
        "+685",
        "685",
        "WS",
        "WSM",
        "WST",
        "Samoan tālā",
        "T",
        "Apia",
        "Oceania",
        "+685-XX-XXXX"
    )

    object SanMarino : CountryData(
        R.string.san_marino,
        R.drawable.san_marino_flag,
        "+378",
        "378",
        "SM",
        "SMR",
        "EUR",
        "euro",
        "€",
        "City of San Marino",
        "Europe",
        "+378-XXXX-XXXXXX"
    )

    object SaoTomeAndPrincipe : CountryData(
        R.string.sao_tome_and_principe,
        R.drawable.sao_tome_and_principe_flag,
        "+239",
        "239",
        "ST",
        "STP",
        "STN",
        "São Tomé and Príncipe dobra",
        "Db",
        "São Tomé",
        "Africa",
        "+239-XX-XXXXX"
    )

    object SaudiArabia : CountryData(
        R.string.saudi_arabia,
        R.drawable.saudi_arabia_flag,
        "+966",
        "966",
        "SA",
        "SAU",
        "SAR",
        "Saudi riyal",
        "ر.س",
        "Riyadh",
        "Asia",
        "+966-X-XXX-XXXX"
    )

    object Senegal : CountryData(
        R.string.senegal,
        R.drawable.senegal_flag,
        "+221",
        "221",
        "SN",
        "SEN",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Dakar",
        "Africa",
        "+221-XX-XXX-XXXX"
    )

    object Serbia : CountryData(
        R.string.serbia,
        R.drawable.serbia_flag,
        "+381",
        "381",
        "RS",
        "SRB",
        "RSD",
        "Serbian dinar",
        "дин.",
        "Belgrade",
        "Europe",
        "+381-XX-XXX-XXXX"
    )

    object Seychelles : CountryData(
        R.string.seychelles,
        R.drawable.seychelles_flag,
        "+248",
        "248",
        "SC",
        "SYC",
        "SCR",
        "Seychellois rupee",
        "₨",
        "Victoria",
        "Africa",
        "+248-X-XXX-XXX"
    )

    object SierraLeone : CountryData(
        R.string.sierra_leone,
        R.drawable.sierra_leone_flag,
        "+232",
        "232",
        "SL",
        "SLE",
        "SLE",
        "Leone",
        "Le",
        "Freetown",
        "Africa",
        "+232-XX-XXXXXX"
    )

    object Singapore : CountryData(
        R.string.singapore,
        R.drawable.singapore_flag,
        "+65",
        "65",
        "SG",
        "SGP",
        "SGD",
        "Singapore dollar",
        "$",
        "Singapore",
        "Asia",
        "+65-XXXX-XXXX"
    )

    object Slovakia : CountryData(
        R.string.slovakia,
        R.drawable.slovakia_flag,
        "+421",
        "421",
        "SK",
        "SVK",
        "EUR",
        "euro",
        "€",
        "Bratislava",
        "Europe",
        "+421(XXX)XXX-XXX"
    )

    object Slovenia : CountryData(
        R.string.slovenia,
        R.drawable.slovenia_flag,
        "+386",
        "386",
        "SI",
        "SVN",
        "EUR",
        "euro",
        "€",
        "Ljubljana",
        "Europe",
        "+386-XX-XXX-XXX"
    )

    object SolomonIslands : CountryData(
        R.string.solomon_islands,
        R.drawable.solomon_islands_flag,
        "+677",
        "677",
        "SB",
        "SLB",
        "SBD",
        "Solomon Islands dollar",
        "$",
        "Honiara",
        "Oceania",
        "+677-XXXXX"
    )

    object Somalia : CountryData(
        R.string.somalia,
        R.drawable.somalia_flag,
        "+252",
        "252",
        "SO",
        "SOM",
        "SOS",
        "Somali shilling",
        "Sh",
        "Mogadishu",
        "Africa",
        "+252-X-XXX-XXX"
    )

    object SouthAfrica : CountryData(
        R.string.south_africa,
        R.drawable.south_africa_flag,
        "+27",
        "27",
        "ZA",
        "ZAF",
        "ZAR",
        "South African rand",
        "R",
        "Pretoria",
        "Africa",
        "+27-XX-XXX-XXXX"
    )

    object SouthKorea : CountryData(
        R.string.south_korea,
        R.drawable.south_korea_flag,
        "+82",
        "82",
        "KR",
        "KOR",
        "KRW",
        "South Korean won",
        "₩",
        "Seoul",
        "Asia",
        "+82-XX-XXX-XXXX"
    )

    object SouthSudan : CountryData(
        R.string.south_sudan,
        R.drawable.south_sudan_flag,
        "+211",
        "211",
        "SS",
        "SSD",
        "SSP",
        "South Sudanese pound",
        "£",
        "Juba",
        "Africa",
        "+211-XX-XXX-XXXX"
    )

    object Spain : CountryData(
        R.string.spain,
        R.drawable.spain_flag,
        "+34",
        "34",
        "ES",
        "ESP",
        "EUR",
        "euro",
        "€",
        "Madrid",
        "Europe",
        "+34(XXX)XXX-XXX"
    )

    object SriLanka : CountryData(
        R.string.sri_lanka,
        R.drawable.sri_lanka_flag,
        "+94",
        "94",
        "LK",
        "LKA",
        "LKR",
        "Sri Lankan rupee",
        "Rs  රු",
        "Sri Jayawardenepura Kotte",
        "Asia",
        "+94-XX-XXX-XXXX"
    )

    object Sudan : CountryData(
        R.string.sudan,
        R.drawable.sudan_flag,
        "+249",
        "249",
        "SD",
        "SDN",
        "SDG",
        "Sudanese pound",
        "ج.س",
        "Khartoum",
        "Africa",
        "+249-XX-XXX-XXXX"
    )

    object Suriname : CountryData(
        R.string.suriname,
        R.drawable.suriname_flag,
        "+597",
        "597",
        "SR",
        "SUR",
        "SRD",
        "Surinamese dollar",
        "$",
        "Paramaribo",
        "South America",
        "+597-XXX-XXX"
    )

    object Sweden : CountryData(
        R.string.sweden,
        R.drawable.sweden_flag,
        "+46",
        "46",
        "SE",
        "SWE",
        "SEK",
        "Swedish krona",
        "kr",
        "Stockholm",
        "Europe",
        "+46-XX-XXX-XXXX"
    )

    object Switzerland : CountryData(
        R.string.switzerland,
        R.drawable.switzerland_flag,
        "+41",
        "41",
        "CH",
        "CHE",
        "CHF",
        "Swiss franc",
        "Fr.",
        "Bern",
        "Europe",
        "+41-XX-XXX-XXXX"
    )

    object Syria : CountryData(
        R.string.syria,
        R.drawable.syria_flag,
        "+963",
        "963",
        "SY",
        "SYR",
        "SYP",
        "Syrian pound",
        "£",
        "Damascus",
        "Asia",
        "+963-XX-XXXX-XXX"
    )

    object Taiwan : CountryData(
        R.string.taiwan,
        R.drawable.taiwan_flag,
        "+886",
        "886",
        "TW",
        "TWN",
        "TWD",
        "New Taiwan dollar",
        "$",
        "Taipei",
        "Asia",
        "+886-XXXX-XXXX"
    )

    object Tajikistan : CountryData(
        R.string.tajikistan,
        R.drawable.tajikistan_flag,
        "+992",
        "992",
        "TJ",
        "TJK",
        "TJS",
        "Tajikistani somoni",
        "ЅМ",
        "Dushanbe",
        "Asia",
        "+992-XX-XXX-XXXX"
    )

    object Tanzania : CountryData(
        R.string.tanzania,
        R.drawable.tanzania_flag,
        "+255",
        "255",
        "TZ",
        "TZA",
        "TZS",
        "Tanzanian shilling",
        "Sh",
        "Dodoma",
        "Africa",
        "+255-XX-XXX-XXXX"
    )

    object Thailand : CountryData(
        R.string.thailand,
        R.drawable.thailand_flag,
        "+66",
        "66",
        "TH",
        "THA",
        "THB",
        "Thai baht",
        "฿",
        "Bangkok",
        "Asia",
        "+66-XX-XXX-XXX"
    )

    object TimorLeste : CountryData(
        R.string.timor_leste,
        R.drawable.timor_leste_flag,
        "+670",
        "670",
        "TL",
        "TLS",
        "USD",
        "United States dollar",
        "$",
        "Dili",
        "Oceania",
        "+670-78X-XXXXX"
    )

    object Togo : CountryData(
        R.string.togo,
        R.drawable.togo_flag,
        "+228",
        "228",
        "TG",
        "TGO",
        "XOF",
        "West African CFA franc",
        "Fr",
        "Lomé",
        "Africa",
        "+228-XX-XXX-XXX"
    )

    object Tonga : CountryData(
        R.string.tonga,
        R.drawable.tonga_flag,
        "+676",
        "676",
        "TO",
        "TON",
        "TOP",
        "Tongan paʻanga",
        "T$",
        "Nuku'alofa",
        "Oceania",
        "+676-XXXXX"
    )

    object TrinidadAndTobago : CountryData(
        R.string.trinidad_and_tobago,
        R.drawable.trinidad_and_tobago_flag,
        "+1 868",
        "1868",
        "TT",
        "TTO",
        "TTD",
        "Trinidad and Tobago dollar",
        "$",
        "Port of Spain",
        "North America",
        "+1(868)XXX-XXXX"
    )

    object Tunisia : CountryData(
        R.string.tunisia,
        R.drawable.tunisia_flag,
        "+216",
        "216",
        "TN",
        "TUN",
        "TND",
        "Tunisian dinar",
        "د.ت",
        "Tunis",
        "Africa",
        "+216-XX-XXX-XXX"
    )

    object Turkey : CountryData(
        R.string.turkey,
        R.drawable.turkey_flag,
        "+90",
        "90",
        "TR",
        "TUR",
        "TRY",
        "Turkish lira",
        "₺",
        "Ankara",
        "Europe",
        "+90(XXX)XXX-XXXX"
    )

    object Turkmenistan : CountryData(
        R.string.turkmenistan,
        R.drawable.turkmenistan_flag,
        "+993",
        "993",
        "TM",
        "TKM",
        "TMT",
        "Turkmenistan manat",
        "m",
        "Ashgabat",
        "Asia",
        "+993-X-XXX-XXXX"
    )

    object Tuvalu : CountryData(
        R.string.tuvalu,
        R.drawable.tuvalu_flag,
        "+688",
        "688",
        "TV",
        "TUV",
        "AUD",
        "Australian dollar",
        "$",
        "Funafuti",
        "Oceania",
        "+688-2XXXX"
    )

    object Uganda : CountryData(
        R.string.uganda,
        R.drawable.uganda_flag,
        "+256",
        "256",
        "UG",
        "UGA",
        "UGX",
        "Ugandan shilling",
        "Sh",
        "Kampala",
        "Africa",
        "+256(XXX)XXX-XXX"
    )

    object Ukraine : CountryData(
        R.string.ukraine,
        R.drawable.ukraine_flag,
        "+380",
        "380",
        "UA",
        "UKR",
        "UAH",
        "Ukrainian hryvnia",
        "₴",
        "Kyiv",
        "Europe",
        "+380(XX)XXX-XX-XX"
    )

    object UnitedArabEmirates : CountryData(
        R.string.united_arab_emirates,
        R.drawable.united_arab_emirates_flag,
        "+971",
        "971",
        "AE",
        "ARE",
        "AED",
        "United Arab Emirates dirham",
        "د.إ",
        "Abu Dhabi",
        "Asia",
        "+971-X-XXX-XXXX"
    )

    object UnitedKingdom : CountryData(
        R.string.united_kingdom,
        R.drawable.united_kingdom_flag,
        "+44",
        "44",
        "GB",
        "GBR",
        "GBP",
        "British pound",
        "£",
        "London",
        "Europe",
        ""
    )

    object UnitedStates : CountryData(
        R.string.united_states,
        R.drawable.united_states_flag,
        "+1",
        "1",
        "US",
        "USA",
        "USD",
        "United States dollar",
        "$",
        "Washington, D.C.",
        "North America",
        "+1(XXX)XXX-XXXX"
    )

    object Uruguay : CountryData(
        R.string.uruguay,
        R.drawable.uruguay_flag,
        "+598",
        "598",
        "UY",
        "URY",
        "UYU",
        "Uruguayan peso",
        "$",
        "Montevideo",
        "South America",
        "+598-X-XXX-XX-XX"
    )

    object Uzbekistan : CountryData(
        R.string.uzbekistan,
        R.drawable.uzbekistan_flag,
        "+998",
        "998",
        "UZ",
        "UZB",
        "UZS",
        "Uzbekistani soʻm",
        "so'm",
        "Tashkent",
        "Asia",
        "+998-XX-XXX-XXXX"
    )

    object Vanuatu : CountryData(
        R.string.vanuatu,
        R.drawable.vanuatu_flag,
        "+678",
        "678",
        "VU",
        "VUT",
        "VUV",
        "Vanuatu vatu",
        "Vt",
        "Port Vila",
        "Oceania",
        "+678-XXXXX"
    )

    object VaticanCity : CountryData(
        R.string.vatican_city,
        R.drawable.vatican_city_flag,
        "+379",
        "379",
        "VA",
        "VAT",
        "EUR",
        "euro",
        "€",
        "Vatican City",
        "Europe",
        "+39-6-698-XXXXX"
    )

    object Venezuela : CountryData(
        R.string.venezuela,
        R.drawable.venezuela_flag,
        "+58",
        "58",
        "VE",
        "VEN",
        "VES",
        "Venezuelan bolívar soberano",
        "Bs.S.",
        "Caracas",
        "South America",
        "+58(XXX)XXX-XXXX"
    )

    object Vietnam : CountryData(
        R.string.vietnam,
        R.drawable.vietnam_flag,
        "+84",
        "84",
        "VN",
        "VNM",
        "VND",
        "Vietnamese đồng",
        "₫",
        "Hanoi",
        "Asia",
        "+84(XXX)XXXX-XXX"
    )

    object Yemen : CountryData(
        R.string.yemen,
        R.drawable.yemen_flag,
        "+967",
        "967",
        "YE",
        "YEM",
        "YER",
        "Yemeni rial",
        "﷼",
        "Sana'a",
        "Asia",
        "+967-XX-XXX-XXX"
    )

    object Zambia : CountryData(
        R.string.zambia,
        R.drawable.zambia_flag,
        "+260",
        "260",
        "ZM",
        "ZMB",
        "ZMW",
        "Zambian kwacha",
        "ZK",
        "Lusaka",
        "Africa",
        "+260-XX-XXX-XXXX"
    )

    object Zimbabwe : CountryData(
        R.string.zimbabwe,
        R.drawable.zimbabwe_flag,
        "+263",
        "263",
        "ZW",
        "ZWE",
        "ZWL",
        "Zimbabwean dollar",
        "$",
        "Harare",
        "Africa",
        "+263-X-XXXXXX"
    )
}