package com.kelompok4.CatatanBelajar.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kelompok4.CatatanBelajar.ui.theme.CatatanBelajarTheme




// Tombol ikon "+" untuk menambah catatan
// onClick → lambda yang dijalankan saat ikon diklik (efek ripple Material otomatis)
@Composable
fun TombolTambahIkon(onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Tambah catatan",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

// Tombol ikon "ℹ" untuk info / keterangan
@Composable
fun TombolInfoIkon(onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Default.Info,
            contentDescription = "Info aplikasi",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTombolTambahIkon() {
    CatatanBelajarTheme {
        TombolTambahIkon(onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTombolInfoIkon() {
    CatatanBelajarTheme {
        TombolInfoIkon(onClick = {})
    }
}
