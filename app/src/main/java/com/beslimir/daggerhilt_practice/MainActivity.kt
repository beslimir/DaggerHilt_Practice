package com.beslimir.daggerhilt_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.beslimir.daggerhilt_practice.ui.theme.DaggerHilt_PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //The string is the dependency, because the class depends on it
        //This is called constructor injection
        val example01 = SimpleDependency("This is my first example")

        setContent {
            DaggerHilt_PracticeTheme {

            }
        }
    }
}

class SimpleDependency(val someString: String)