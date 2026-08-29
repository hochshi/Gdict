package io.github.gdict.core

import java.nio.file.Files
import org.junit.Assert.assertEquals
import org.junit.Test

class DictFileImporterTest {
    @Test
    fun findsSoleMddWhenSafPrefixesDiffer() {
        val dir = Files.createTempDirectory("gdict-mdd").toFile()
        try {
            val mdx = dir.resolve("saf_import_100_Duden.mdx").apply { writeText("mdx") }
            val mdd = dir.resolve("saf_import_101_Duden.mdd").apply { writeText("mdd") }
            val importer = DictFileImporter(object : FileSystemAccess {
                override fun selectDictionaryFiles() = null
                override fun selectDictionaryDirectory() = null
                override fun listFilesInDirectory(dirPath: String) = emptyList<String>()
            })

            assertEquals(mdd, importer.findCompanionMdd(mdx))
        } finally {
            dir.deleteRecursively()
        }
    }
}
