plugins {
    alias(libs.plugins.androidApplication)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.whatsapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.whatsapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Scalable Size Unit(support for different screen sizes )
//    implementation("com.intuit.sdp:sdp-android:1.0.6")
//    implementation("com.intuit.ssp:ssp-android:1.0.6")
    implementation(libs.sdp.android)
    implementation(libs.ssp.android)

    //Rounded ImageView
    implementation(libs.makeramen.roundedimageview)
//    implementation(libs.roundedimageview)

    //Firebase
    implementation(libs.firebase.bom)
    implementation(libs.firebase.messaging)
    implementation(libs.firebase.firestore)

    //Multidesk
    implementation("androidx.multidex:multidex:2.0.1")

    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.scalars)


}
