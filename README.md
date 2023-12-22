# <p align="center"> CameraXAI  📸 </p>



In this project, I developed a native application using Compose technology and CameraX. Additionally, I integrated a machine learning model using TensorFlow Lite into the application. Our project performs location recognition based on the camera feature, utilizing the capabilities of CameraX for image processing and TensorFlow Lite for artificial intelligence functionality.

<!-- Screenshots -->
## 📸 Screenshots
<p align="center">
  <img src="https://github.com/selincengiz41/cameraxAI/assets/60012262/ba46b6fd-3d78-435f-9bdc-4fae93631073" width="130" height="300"/>
  <img src="https://github.com/selincengiz41/cameraxAI/assets/60012262/ddf55a97-78fd-4e8e-91fe-96384a4c7552" width="130" height="300"/>
 

</p>


## :point_down: Structures 
- Compose
- CameraX
- TensorFlow Lite
- ViewModel
- Coroutines



## :pencil2: Dependency
```
    dependencies {
  implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation(platform("androidx.compose:compose-bom:2023.09.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended:1.5.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    def cameraxVersion = "1.3.0-rc01"

    implementation("androidx.camera:camera-core:$cameraxVersion")
    implementation("androidx.camera:camera-camera2:$cameraxVersion")
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation("androidx.camera:camera-video:$cameraxVersion")

    implementation("androidx.camera:camera-view:$cameraxVersion")
    implementation("androidx.camera:camera-extensions:$cameraxVersion")

    implementation("org.tensorflow:tensorflow-lite-task-vision:0.4.0")
    implementation("org.tensorflow:tensorflow-lite-gpu-delegate-plugin:0.4.0")
    implementation("org.tensorflow:tensorflow-lite-gpu:2.9.0")

}
```

app build.gradle:

```
plugins {
     id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
}

```
project build.gradle:

```
plugins {
         id 'com.android.application' version '8.0.2' apply false
    id 'com.android.library' version '8.0.2' apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}
```
