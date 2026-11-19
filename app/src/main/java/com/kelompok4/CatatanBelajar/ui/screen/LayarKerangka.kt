package com.kelompok4.CatatanBelajar.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kelompok4.CatatanBelajar.R
import com.kelompok4.CatatanBelajar.ui.component.TombolInfoIkon
import com.kelompok4.CatatanBelajar.ui.component.TombolTambahIkon
import com.kelompok4.CatatanBelajar.ui.theme.CatatanBelajarTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayarUtamaScaffold(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.judul_app)) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                // actions → slot di kanan TopAppBar untuk ikon-ikon aksi
                actions = {
                    TombolTambahIkon(onClick = { /* TODO: navigasi ke tambah catatan */ })
                    TombolInfoIkon(onClick = { /* TODO: tampilkan info aplikasi */ })
                }
            )
        }
    ) { innerPadding ->
        PenghitungTarget(modifier = Modifier.padding(innerPadding))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayarUtamaScaffoldPreview() {
    CatatanBelajarTheme {
        LayarUtamaScaffold()
    }
}
