package com.kelompok4.CatatanBelajar.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelompok4.CatatanBelajar.R
import com.kelompok4.CatatanBelajar.ui.theme.CatatanBelajarTheme

@Composable
fun BannerIlustrasi(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ilustrasi_belajar),
        contentDescription = "Ilustrasi catatan belajar",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .fillMaxWidth()
            .height(160.dp)
            .clip(RoundedCornerShape(12.dp))
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewBannerIlustrasi() {
    CatatanBelajarTheme {
        BannerIlustrasi()
    }
}
