package com.owlbuddy.www.countrycodechooser

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.owlbuddy.www.countrycodechooser.utils.enums.CountryCodeType
import com.owlbuddy.www.countrycodechooser.utils.sealed_casses.CountryData
import kotlinx.coroutines.delay

@Composable
fun CountryCodeChooser(
    modifier : Modifier = Modifier,
    defaultCountryCode : String = "1",
    flagSize : DpSize = DpSize(
        height = 20.dp,
        width = 30.dp
    ),
    textStyle: TextStyle = TextStyle(
        fontSize = 16.sp
    ),
    countryCodeType: CountryCodeType = CountryCodeType.FLAG,
    onCountyCodeSelected : (code:String,codeWithPrefix:String) -> Unit
) {

    var selectedCountry by remember {
        mutableStateOf<CountryData?>(null)
    }

    var popupState by remember {
        mutableStateOf(false)
    }

    var listOfCountryData by remember {
        mutableStateOf<List<CountryData>>(emptyList())
    }

    LaunchedEffect(key1 = true){
        listOfCountryData = CountryData::class.sealedSubclasses.mapNotNull {
            it.objectInstance
        }
    }

    LaunchedEffect(key1 = defaultCountryCode, key2 = listOfCountryData){
        listOfCountryData.firstOrNull { it.countryCodeWithoutPrefix == defaultCountryCode }?.let {
            selectedCountry = it
        }
    }

    Box(
        modifier = modifier
            .clickable {
                popupState = true
            },
        contentAlignment = Alignment.Center
    ){
        when(countryCodeType){
            CountryCodeType.TEXT, CountryCodeType.TEXT_WITHOUT_PREFIX -> {
                BasicTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = selectedCountry?.let {
                        if(countryCodeType ==CountryCodeType.TEXT) {
                            it.countryCodeWithPrefix
                        }else{
                            it.countryCodeWithoutPrefix
                        }
                    } ?: "",
                    singleLine = true,
                    maxLines = 1,
                    enabled = false,
                    readOnly = true,
                    textStyle = textStyle.copy(
                        textAlign = TextAlign.Center
                    ),
                    onValueChange = {}
                )
            }
            CountryCodeType.FLAG-> {
                selectedCountry?.let { countryData ->
                    Image(
                        modifier = Modifier
                            .width(flagSize.width)
                            .height(flagSize.height)
                            .clip(
                                RoundedCornerShape(2.dp)
                            ),
                        painter = painterResource(id = countryData.flagResId),
                        contentScale = ContentScale.FillBounds,
                        contentDescription = "Country Flag"
                    )
                }
            }
        }
    }

    if(popupState){
        CountriesPopup(
            listOfCountryData = listOfCountryData,
            onCountrySelected = {
                selectedCountry = it
                popupState = false
                onCountyCodeSelected(
                    it.countryCodeWithoutPrefix,
                    it.countryCodeWithPrefix
                )
            },
            onDismissRequest = {
                popupState = false
            }
        )
    }
}

@Composable
private fun CountriesPopup(
    listOfCountryData : List<CountryData>,
    onCountrySelected : (CountryData) -> Unit,
    onDismissRequest:() -> Unit
){
    var searchedText by remember {
        mutableStateOf("")
    }

    var filteredList by remember {
        mutableStateOf(listOfCountryData)
    }

    val context = LocalContext.current

    LaunchedEffect(key1 = searchedText){
        delay(200)
        filteredList = listOfCountryData.filter {
            context.getString(it.countryNameResId).contains(searchedText.trim(),true)
                    || it.countryCodeWithPrefix.contains(searchedText.trim(),true)
        }
    }

    Popup(
        alignment = Alignment.Center,
        properties = PopupProperties(
            focusable = true
        ),
        onDismissRequest = {
            onDismissRequest()
        },
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    15.dp
                )
        ){

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = Color(0xFFE9E9E9),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(
                        20.dp
                    )
            ){
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = searchedText,
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.search_county_code),
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    },
                    singleLine = true,
                    maxLines = 1,
                    enabled = true,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    onValueChange = {
                        searchedText = it
                    }
                )

                Spacer(modifier = Modifier.height(10.dp))

                LazyColumn{
                    items(filteredList){ countryData ->
                        ListItem(
                            countryData = countryData,
                            onClick = {
                                onCountrySelected(it)
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ListItem(
    countryData: CountryData,
    onClick : (CountryData) -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                onClick(countryData)
            }
            .padding(
                vertical = 15.dp,
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .width(30.dp)
                .height(20.dp)
                .clip(
                    RoundedCornerShape(2.dp)
                ),
            painter = painterResource(id = countryData.flagResId),
            contentScale = ContentScale.FillBounds,
            contentDescription = "Country Flag"
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Gray,
                        fontWeight = FontWeight.Medium
                    )
                ){
                    append("(${countryData.countryCodeWithPrefix }) ")
                }
                append(stringResource(id = countryData.countryNameResId))
            },
            style = TextStyle(
                color = Color.DarkGray,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
    }
}