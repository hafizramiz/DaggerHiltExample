package com.example.daggerhiltexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.daggerhiltexample.ui.theme.DaggerHiltExampleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            var myObject:ImplementClass=ImplementClass(DenemeClass())
//            myObject.f()
            DaggerHiltExampleTheme {

            }
        }
    }
}




  interface  DenemeInterface{
    fun printDeneme()
}

class DenemeClass:DenemeInterface{
    override fun printDeneme(){
        println("print ~deneme Calisti")
    }
}


class ImplementClass(private val denemeClass: DenemeClass){
    fun f(){
        denemeClass.printDeneme()
    }
}