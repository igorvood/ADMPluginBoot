package ru.vood.admplugin.infrastructure.generateCode.impl.createFiles

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@ContextConfiguration(classes = arrayOf(GeterateFileTestConfiguration::class))
class GeterateFileTest {

    @Autowired
    lateinit var geterateFile: GeterateFile
//    lateinit var geterateFile: GeterateFile
//    @Before
//    fun bef() {
//        geterateFile = LoadedCTX.getService(GeterateFile::class.java)
//    }

    @Test
    fun createDirs() {
        geterateFile.createDirs("ru.vood.test")
    }
}

