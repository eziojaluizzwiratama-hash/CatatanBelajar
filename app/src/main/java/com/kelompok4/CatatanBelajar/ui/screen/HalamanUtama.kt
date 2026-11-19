package com.kelompok4.CatatanBelajar.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelompok4.CatatanBelajar.R
import com.kelompok4.CatatanBelajar.ui.component.BannerIlustrasi

@Composable
fun RingkasanSesi(
    jumlahSelesai: Int,
    onTambah: () -> Unit,
    onReset: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Gambar banner ilustrasi belajar (Modul 3)
        BannerIlustrasi()

        // Teks sapa dari strings.xml dengan placeholder %1$s (Modul 3.4)
        Text(
            text = stringResource(R.string.sapa_pengguna, "Pelajar"),
            style = MaterialTheme.typography.titleMedium
        )

        Text(
            text = "Target Selesai Hari Ini: $jumlahSelesai",
            style = MaterialTheme.typography.headlineSmall
        )
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = onTambah) {
                Text("+1 Target")
            }
            OutlinedButton(onClick = onReset) {
                Text("Reset")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RingkasanSesiPreview() {
    RingkasanSesi(
        jumlahSelesai = 0,
        onTambah = {},
        onReset = {}
    )
}
