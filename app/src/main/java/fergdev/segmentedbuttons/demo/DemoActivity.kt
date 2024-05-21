package fergdev.segmentedbuttons.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fergdev.segmentedbuttons.SegmentedButtonItem
import fergdev.segmentedbuttons.SegmentedButtons

class DemoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SegmentedButtons(modifier = Modifier.padding(16.dp)) {
                    var selectedItem by remember { mutableIntStateOf(0) }
                    SegmentedButtonItem(
                        selected = selectedItem == 0,
                        onClick = { selectedItem = 0 },
                        label = {
                            Text(text = "wowow 1")
                        }
                    )
                    SegmentedButtonItem(
                        selected = selectedItem == 1,
                        onClick = { selectedItem = 1 },
                        label = {
                            Text(text = "wowow 2")
                        }
                    )
                    SegmentedButtonItem(
                        selected = selectedItem == 2,
                        onClick = { selectedItem = 2 },
                        label = {
                            Text(text = "wowow 3")
                        }
                    )
                }
            }
        }
    }
}