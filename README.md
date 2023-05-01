<h1>Country Code Chooser (Jetpack Compose)</h1>

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

<h2>Features:- </h2>
<ul>
   <li>Easy to use</li>
   <li>Customizable</li>
   <li>Three differnt view options : Text with prefix, Text without prefix, and Only Flag</li>
   <li>Can search using country name or code</li>
   <li>Supoport languages such as : English, Korean, Spanish, Chinese</li>
</ul>

*Other laguages coming soon*



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
    implementation 'com.github.ParveshSandila:CountryCodeChooser:Tag'
}
```
<a href="https://jitpack.io/#ParveshSandila/CountryCodeChooser" target="_black">Click here to check on jitpack.io</a>
