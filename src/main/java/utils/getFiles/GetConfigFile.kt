package utils.getFiles

import java.io.FileInputStream
import java.io.IOException
import java.util.*

object GetConfigFile {

    private var properties: Properties? = null

    fun loadProperties(): Unit {
        try {
            properties = Properties()
            properties?.load(FileInputStream("naranjaX/resources/conf/config.properties"))
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun getProperties(properties: String): String {
        loadProperties()
        return GetConfigFile.properties?.getProperty(properties).toString()
    }
}