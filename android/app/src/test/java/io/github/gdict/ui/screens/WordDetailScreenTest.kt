package io.github.gdict.ui.screens

import org.junit.Assert.assertEquals
import org.junit.Test

class WordDetailScreenTest {
    @Test
    fun extractsDudenAudioSrc() {
        assertEquals(
            "/ID4110066_199489530.wav",
            extractDefinitionAudioPath("""<audio src="/ID4110066_199489530.wav"></audio>""")
        )
    }
}
