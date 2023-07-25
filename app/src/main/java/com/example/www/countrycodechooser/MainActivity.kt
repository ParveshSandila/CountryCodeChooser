package com.example.www.countrycodechooser

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.www.countrycodechooser.ui.theme.CountryCodeChooserTheme
import com.owlbuddy.www.countrycodechooser.CountryCodeChooser
import com.owlbuddy.www.countrycodechooser.utils.enums.CountryCodeType

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountryCodeChooserTheme {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        20.dp
                    ) ,
                    contentAlignment = Alignment.Center
                ){
                    Column{

                        Text(
                            text = "Signup Form",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.SemiBold
                        )

                        Spacer(modifier = Modifier.height(35.dp))

                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = "",
                            placeholder = {
                                Text("First Name")
                            },
                            onValueChange = {

                            }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = "",
                            placeholder = {
                                Text("Last Name")
                            },
                            onValueChange = {

                            }
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Row {
                            CountryCodeChooser(
                                modifier = Modifier
                                    .weight(1.5f)
                                    .height(55.dp)
                                    .border(
                                       width = 1.dp,
                                       shape = RoundedCornerShape(5.dp),
                                       color = Color.Gray
                                    ),
                                defaultCountryIsoCode = "CAN",
                                countryCodeType = CountryCodeType.FLAG,
                                onCountrySelected = {
                                    with(it){
                                        Log.d("SelectedCountry","$countryCode, $iso2Code, $iso3Code")
                                    }
                                }
                            )

                            Spacer(modifier = Modifier.weight(0.3f))

                            OutlinedTextField(
                                modifier = Modifier.weight(8.2f),
                                value = "",
                                placeholder = {
                                    Text("Contact Number")
                                },
                                onValueChange = {

                                }
                            )
                        }

                        Spacer(modifier = Modifier.height(30.dp))

                        Button(
                            modifier = Modifier
                                .fillMaxWidth(),
                            onClick = { /*TODO*/ }) {
                            Text(
                                modifier = Modifier.padding(
                                    vertical = 12.dp
                                ),
                                text = "Submit"
                            )
                        }
                    }
                }
            }
        }
    }
}
