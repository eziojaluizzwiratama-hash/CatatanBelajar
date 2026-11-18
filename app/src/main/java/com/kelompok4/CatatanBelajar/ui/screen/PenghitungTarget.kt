package com.kelompok4.CatatanBelajar.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kelompok4.CatatanBelajar.ui.theme.CatatanBelajarTheme

@Composable
fun PenghitungTarget(modifier: Modifier = Modifier) {
    var jumlah by remember { mutableStateOf(0) }

    RingkasanSesi(
        jumlahSelesai = jumlah,
        onTambah = { jumlah++ },
        onReset = { jumlah = 0 },
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PenghitungTargetPreview() {
    CatatanBelajarTheme {
        PenghitungTarget()
    }
}
