<Span><h1>Country Code Chooser (Jetpack Compose)</h1></span>
<span style="margin-left:25.px">
 <a href="https://jitpack.io/#ParveshSandila/CountryCodeChooser" target="_blank">
  <img src="https://jitpack.io/v/ParveshSandila/CountryCodeChooser.svg"/>
 </a>
</span>

The Android library is designed to provide a user-friendly interface for selecting country codes from various countries. The library is specifically built to work seamlessly with Android Jetpack Compose, allowing developers to quickly and easily integrate it into their projects.

One of the standout features of this library is its built-in support for displaying a flag for each country. This is especially useful when building international apps where users may not be familiar with the country codes of other regions.

The library offers a range of customization options, allowing developers to tailor the user interface to match their app's design. For example, developers can customize the TextFiled, font styles, and sizes of the text.

<h2>Example Code:- </h2>

```kotlin
 CountryCodeChooser(
    modifier = Modifier
        .weight(1.5f)
        .height(55.dp)
        .border(
           width = 1.dp,
           shape = RoundedCornerShape(5.dp),
           color = Color.Gray
        ),
    defaultCountryCode = "1",
    countryCodeType = CountryCodeType.FLAG,
    onCountyCodeSelected = { code, codeWithPrefix ->
         Log.d("SelectedCountry","$code, $codeWithPrefix")
    }
)
```

<h2>Preview:- </h2>

<span style="margin:25px">
   <img src="https://github.com/ParveshSandila/CountryCodeChooser/blob/master/app/src/main/res/drawable/ss_1.jpg" 
   alt="Jetpack compose Lazy column example" style="height:300px"/>
</span>
<span style="margin:25px">
  <img src="https://github.com/ParveshSandila/CountryCodeChooser/blob/master/app/src/main/res/drawable/ss_2.jpg" 
  alt="Jetpack compose Lazy column example"
  style="height:300px"
  />
  <span style="margin:25px">
  <img src="https://github.com/ParveshSandila/CountryCodeChooser/blob/master/app/src/main/res/drawable/ss_3.jpg" 
  alt="Jetpack compose Lazy column example"
  style="height:300px"
  />
  <span style="margin:25px">
  <img src="https://github.com/ParveshSandila/CountryCodeChooser/blob/master/app/src/main/res/drawable/ss_4.jpg" 
  alt="Jetpack compose Lazy column example"
  style="height:300px"
  />
  <span style="margin:25px">
  <img src="https://github.com/ParveshSandila/CountryCodeChooser/blob/master/app/src/main/res/drawable/ss_5.jpg" 
  alt="Jetpack compose Lazy column example"
  style="height:300px"
  />
</span>

<h2>Like this? Spread ❤️ by adding a ⭐ on this project.</h2>

<h2>Features:- </h2>

<ul>
   <li>Easy to use</li>
   <li>Customizable</li>
   <li>Three different view options : Text with prefix, Text without prefix, and Only Flag</li>
   <li>Can search using country name or code</li>
   <li>Support languages: English, Korean, Spanish, Chinese, Hindi, Japanese, French, German </li>
</ul>

*Other languages coming soon*

<h2>How to use:- </h2>
To get a Git project into your build:
Step 1. Add the JitPack repository to your build file

```kotlin
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

Step 2. Add the dependency

```kotlin
dependencies {
    implementation 'com.github.ParveshSandila:CountryCodeChooser:1.0.1'
}
```
<a href="https://jitpack.io/#ParveshSandila/CountryCodeChooser" target="_blank">Click here to check on jitpack.io</a>

<h2>Language Contributions:- </h2>
<span><b>Franch:</b></snap></span><a href="https://github.com/VJubert"> Valentin Jubert</a></span>

<h2>License</h2>

<a href="http://www.apache.org/licenses/LICENSE-2.0.html" target="_blank">Apache Version 2.0</a>

```html
Copyright (C) 2023 Parvesh Sandila

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
