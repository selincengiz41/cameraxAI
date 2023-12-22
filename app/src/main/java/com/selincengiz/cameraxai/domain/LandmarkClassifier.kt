package com.selincengiz.cameraxai.domain

import android.graphics.Bitmap

interface LandmarkClassifier {
    fun classify(bitmap: Bitmap,rotation:Int) :List<Classification>
}