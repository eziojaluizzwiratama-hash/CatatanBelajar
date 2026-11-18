package com.kelompok4.CatatanBelajar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kelompok4.CatatanBelajar.ui.screen.LayarUtamaScaffold
import com.kelompok4.CatatanBelajar.ui.theme.CatatanBelajarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CatatanBelajarTheme {
                LayarUtamaScaffold()
            }
        }
    }
}
