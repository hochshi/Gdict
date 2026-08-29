package io.github.gdict.ui.screens

import org.junit.Assert.assertEquals
import org.junit.Test

class WordDetailScreenTest {
    @Test
    fun extractsDudenAudioSrc() {
        assertEquals(
            "ID4115778_303232826.wav",
            extractDefinitionAudioPath(
                """<object type="audio/x-wav" data="ID4115778_303232826.wav" width="40" height="40"></object>"""
            )
        )
    }
}
