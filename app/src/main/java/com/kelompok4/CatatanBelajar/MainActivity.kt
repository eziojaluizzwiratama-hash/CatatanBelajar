package com.kelompok4.CatatanBelajar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kelompok4.CatatanBelajar.ui.theme.CatatanBelajarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CatatanBelajarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SalamPembuka(
                        nama = "CatatanBelajar",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SalamPembuka(nama: String, modifier: Modifier = Modifier) {
    // State: apakah pop-up sedang ditampilkan?
    var tampilkanDialog by remember { mutableStateOf(false) }

    // Box dengan Alignment.Center → semua isi ditaruh di tengah layar
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { tampilkanDialog = true }) {
            Text(text = "Tampilkan Pesan")
        }
    }

    // AlertDialog hanya muncul saat tampilkanDialog = true
    if (tampilkanDialog) {
        AlertDialog(
            onDismissRequest = { tampilkanDialog = false },
            title = {
                Text(
                    text = "Halo Pelajar! 👋",
                    style = MaterialTheme.typography.titleLarge
                )
            },
            text = {
                Text(
                    text = "Semangat belajar Kotlin dan Jetpack Compose hari ini 🚀",
                    style = MaterialTheme.typography.bodyMedium
                )
            },
            confirmButton = {
                TextButton(onClick = { tampilkanDialog = false }) {
                    Text("Tutup")
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSalamPembuka() {
    CatatanBelajarTheme { SalamPembuka("CatatanBelajar") }
}
