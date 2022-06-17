package com.example.foodlist.Model

import android.annotation.SuppressLint
import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Declaration(@DrawableRes val imageResources: Int, val name: String, val price: Int, @StringRes val details: String)
