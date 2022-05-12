package com.my.jetpackexample

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.my.jetpackexample.ui.theme.JetpackExampleTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ExpandableCard()
                    }
                }
            }
        }
    }
}

@Composable
fun MyClickView(myColor: Color = MaterialTheme.colors.primary) {
    androidx.compose.material.Surface(
        modifier = Modifier
            .height(100.dp)
            .width(200.dp), color = myColor
    ) {
      CustomText()
    }
}

@Composable
fun CustomText(){
    Text(text = stringResource(id = R.string.app_name), modifier = Modifier
        .padding(20.dp),
        color = Color.Green,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}
@Composable
fun SelectionCustomText(){
    SelectionContainer() {
        Text(text = "Hello Android!!")
    }
}

@Composable
fun MyRowView() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        MyClickView()
        MyClickView(MaterialTheme.colors.secondary)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       SelectionCustomText()

    }
}