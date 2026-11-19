package com.kelompok4.CatatanBelajar.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelompok4.CatatanBelajar.ui.theme.CatatanBelajarTheme

// 1. Kolom Judul Materi (Keyboard Teks Biasa + Huruf Kapital di Awal Kalimat + Tombol Next)
@Composable
fun KolomJudul(
    nilai: String,
    onUbah: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = nilai,
        onValueChange = onUbah,
        label = { Text("Judul Materi") },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Sentences,
            imeAction = ImeAction.Next
        ),
        modifier = modifier.fillMaxWidth()
    )
}

// 2. Kolom Target Menit Belajar (Keyboard Khusus Angka + Tombol Done/Selesai)
@Composable
fun KolomTargetMenit(
    nilai: String,
    onUbah: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = nilai,
        onValueChange = onUbah,
        label = { Text("Target Menit Belajar") },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done
        ),
        modifier = modifier.fillMaxWidth()
    )
}

// Komponen form lengkap yang menampung kedua input kolom
@Composable
fun FormInputMateri(
    modifier: Modifier = Modifier
) {
    var judul by remember { mutableStateOf("") }
    var targetMenit by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        KolomJudul(
            nilai = judul,
            onUbah = { judul = it }
        )
        KolomTargetMenit(
            nilai = targetMenit,
            onUbah = { targetMenit = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFormInputMateri() {
    CatatanBelajarTheme {
        FormInputMateri()
    }
}
