package com.example.praktikum1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box // Tambahkan import Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text // Tambahkan import Text untuk placeholder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.praktikum1.ui.theme.Praktikum1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Praktikum1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Panggil composable layout utama
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// =========================================================
// !!! FUNGSI YANG HILANG DITAMBAHKAN DI SINI (PLACEHOLDER) !!!
// Tambahkan komponen kustom yang dipanggil di atas agar tidak error
@Composable
fun TataLetakBoxColumnRow(modifier: Modifier = Modifier) {
    // Anda bisa mengganti ini dengan komponen Column atau Row yang sebenarnya
    Box(modifier = modifier) {
        Text(text = "Tata Letak Berhasil Dipanggil!")
    }
}
// =========================================================

@Preview(showBackground = tre)
@Composable
fun PreviewTataLetak() {
    Praktikum1Theme {
        TataLetakBoxColumnRow(modifier = Modifier)
    }
}