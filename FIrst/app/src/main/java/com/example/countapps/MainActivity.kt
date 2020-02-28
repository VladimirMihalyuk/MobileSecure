package com.example.countapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.attr.name
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pm = packageManager
        val packages = pm.getInstalledApplications(0)

        textView.text = "Installed apps: ${packages.size}"
    }
}
