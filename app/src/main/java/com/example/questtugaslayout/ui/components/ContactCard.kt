
package com.example.questtugaslayout.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import com.example.questtugaslayout.R
import com.example.questtugaslayout.data.Contact

@Composable
fun ContactCard(
    contact: Contact,
    modifier: Modifier = Modifier
) {
    val cardColor = colorResource(contact.cardColorRes)
    val nameColor = colorResource(contact.nameColorRes)
    val addressColor = colorResource(contact.addressColorRes)

    // Nama Nur menggunakan font tulisan sambung
    val nameFontFamily =
        if (contact.nameRes == R.string.contact_nur) {
            FontFamily.Cursive
        } else {
            FontFamily.Default
        }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(dimensionResource(R.dimen.card_height))
            .clip(
                RoundedCornerShape(
                    dimensionResource(R.dimen.card_corner_radius)
                )
            )
            .background(cardColor)
            .padding(dimensionResource(R.dimen.card_spacing)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            dimensionResource(R.dimen.logo_text_spacing)
        )
    ) {
        // Logo UMY sebelah kiri
        Image(
            painter = painterResource(R.drawable.logo_umy),
            contentDescription = stringResource(
                R.string.campus_logo_description
            ),
            modifier = Modifier.size(
                dimensionResource(R.dimen.logo_size)
            )
        )

        // Informasi kontak diturunkan sedikit
        Column(
            modifier = Modifier
                .weight(1f)
                .offset(
                    y = dimensionResource(R.dimen.card_text_offset)
                ),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(contact.nameRes),
                color = nameColor,
                fontSize = TextUnit(
                    dimensionResource(R.dimen.name_text_size).value,
                    TextUnitType.Sp
                ),
                lineHeight = TextUnit(
                    dimensionResource(R.dimen.name_text_size).value,
                    TextUnitType.Sp
                ),
                fontWeight = FontWeight.Bold,
                fontFamily = nameFontFamily,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            }
