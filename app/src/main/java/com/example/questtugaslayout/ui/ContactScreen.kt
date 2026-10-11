
package com.example.questtugaslayout.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import com.example.questtugaslayout.R
import com.example.questtugaslayout.data.Contact
import com.example.questtugaslayout.ui.components.ContactCard

@Composable
fun ContactScreen() {
    val contacts = listOf(
        Contact(
            R.string.contact_nur,
            R.string.phone_nur,
            R.string.address_nur,
            R.color.card_gray,
            R.color.text_white,
            R.color.text_yellow
        ),
        Contact(
            R.string.contact_sukma,
            R.string.phone_sukma,
            R.string.address_sukma,
            R.color.card_purple,
            R.color.text_white,
            R.color.text_white
        ),
        Contact(
            R.string.contact_rara,
            R.string.phone_rara,
            R.string.address_rara,
            R.color.card_blue,
            R.color.text_white,
            R.color.text_white
        ),
        Contact(
            R.string.contact_salwa,
            R.string.phone_salwa,
            R.string.address_salwa,
            R.color.card_green,
            R.color.text_white,
            R.color.text_white
        )
    )

    }