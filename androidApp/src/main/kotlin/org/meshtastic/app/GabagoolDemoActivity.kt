package org.meshtastic.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.meshtastic.core.ui.theme.AppTheme

/** Standalone, offline screenshot/demo surface. No radio connection, messaging or network calls. */
class GabagoolDemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme(darkTheme = true, dynamicColor = false) {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(28.dp),
                        verticalArrangement = Arrangement.spacedBy(20.dp),
                    ) {
                        Text("GABAGOOL RADIO", style = MaterialTheme.typography.headlineLarge, color = MaterialTheme.colorScheme.primary)
                        Text("WHAT EXIT? WHAT NODE?", style = MaterialTheme.typography.titleLarge)
                        Text("THE GARDEN STATE MESH", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.secondary)
                        Text("DEMO MODE • SIMULATED DATA", color = MaterialTheme.colorScheme.tertiary)
                        Text("📡  Exit 13A Repeater     •     Online (simulated)")
                        Text("📻  Boardwalk Relay       •     Online (simulated)")
                        Text("🛰  Parkway Mobile        •     Offline (simulated)")
                        Text("NO RADIO CONNECTED • NO MESSAGES SENT")
                        Text("FUGGEDABOUTIT! 🤌", style = MaterialTheme.typography.headlineSmall, color = MaterialTheme.colorScheme.primary)
                    }
                }
            }
        }
    }
}
