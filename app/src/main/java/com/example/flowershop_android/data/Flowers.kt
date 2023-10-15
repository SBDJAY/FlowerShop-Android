package com.example.flowershop_android.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.flowershop_android.R

data class Flower(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val price: Double,
    @StringRes val description: Int
)



val flowers = listOf(
    Flower(R.drawable.aster, R.string.flower_name_1, 2.99, R.string.flower_description_1),
    Flower(R.drawable.carnation, R.string.flower_name_2, 2.99, R.string.flower_description_2),
    Flower(R.drawable.daffodil, R.string.flower_name_3, 2.99, R.string.flower_description_3),
    Flower(R.drawable.rose, R.string.flower_name_4, 2.99, R.string.flower_description_4),
    Flower(R.drawable.orchid, R.string.flower_name_5, 2.99, R.string.flower_description_5),


    )