<Span><h1>Country Code Chooser (Jetpack Compose)</h1></span>
<span style="margin-left:25.px">
 <a href="https://jitpack.io/#ParveshSandila/CountryCodeChooser" target="_blank">
  <img src="https://jitpack.io/v/ParveshSandila/CountryCodeChooser.svg"/>
 </a>
</span>
<span>
[![GitHub stars](https://img.shields.io/github/stars/ParveshSandila/CountryCodeChooser.svg)](https://github.com/ParveshSandila/CountryCodeChooser/stargazers)
 </span>
 <span>
[![GitHub issues](https://img.shields.io/github/issues/ParveshSandila/CountryCodeChooser.svg)](https://github.com/ParveshSandila/CountryCodeChooser/issues)
 </span>
 <span>
<!-- [![GitHub license](https://img.shields.io/github/license/ParveshSandila/CountryCodeChooser.svg)](https://github.com/ParveshSandila/CountryCodeChooser/blob/master/LICENSE)
 </span>
 -->
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
    defaultCountry = "CA",
    countryCodeType = CountryCodeType.FLAG,
    onCountySelected = { countryCodeWithoutPrefix, iso2Code, iso3Code ->
        Log.d("SelectedCountry","$countryCodeWithoutPrefix, $iso2Code, $iso3Code")
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
   <li>Support languages:
      <ul>
        <li>Arabic</li>
        <li>Chinese</li>
        <li>English</li>
        <li>French</li>
        <li>German</li>
        <li>Hindi</li>
        <li>Italian</li>
        <li>Japanese</li>
        <li>Korean</li>
        <li>Portuguese</li>
        <li>Punjabi</li>
        <li>Spanish</li>
      </ul>
   </li>
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
    implementation 'com.github.ParveshSandila:CountryCodeChooser:1.0.2'
}
```
<a href="https://jitpack.io/#ParveshSandila/CountryCodeChooser" target="_blank">Click here to check on jitpack.io</a>

<h2>Language Contributions:- </h2>
<ul>
 <li><span><b>Franch:</b></snap></span><a href="https://github.com/VJubert"> Valentin Jubert</a></span></li>
 <li><span><b>Portuguese:</b></snap></span><a href="https://github.com/GuilhE"> Guilherme Delgado</a></span></li>
</ul>

<h2>Contributions</h2>
<p>Contributions to the CountryCodeChooser library are highly appreciated! If you have any bug fixes, new features, or improvements to offer, please feel free to submit a pull request. Together, we can make this library even better.</p>

<h2>Contact</h2>
<p>For any inquiries or support regarding the library, you can reach out to the author, Parvesh Sandila, via email at parveshsandila@gmail.com.</p>

<p>Let the CountryCodeChooser Android Library enhance your app with seamless country code selection. Download it now and give your users a convenient and efficient experience.</p>

#AndroidDevelopment #CountryCodeSelection #OpenSourceLibrary #CountryCodeChooser #JetpackCompose #ComposeLibraray

<h2>License</h2>

<a href="http://www.apache.org/licenses/LICENSE-2.0.html" target="_blank">Apache Version 2.0</a>

```html
Copyright (C) 2026 Parvesh Sandila

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
