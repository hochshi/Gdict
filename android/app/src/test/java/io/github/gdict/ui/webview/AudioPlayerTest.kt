package io.github.gdict.ui.webview

import org.junit.Assert.assertEquals
import org.junit.Test

class AudioPlayerTest {
    @Test
    fun detectsWavContainer() {
        val wav = "RIFF\u0000\u0000\u0000\u0000WAVE".toByteArray()

        assertEquals("wav", AudioPlayer.audioFileExtension(wav))
    }
}
