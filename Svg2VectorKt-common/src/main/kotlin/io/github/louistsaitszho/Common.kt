package io.github.louistsaitszho

class SvgGroupNode

//TODO this is a wrapper right?
interface File {
    fun getName(): String
}

//TODO this is a wrapper right?
interface Document

interface PositionXmlParser {
    //TODO this requires kotlin 1.3 to work -_-
//    companion object {
//        fun parse()
//    }
}

class SvgTree {
    val w: Float = 0F
    val h: Float = 0F
    val matrix: FloatArray = emptyArray<Float>().toFloatArray()
    val viewBox: FloatArray = emptyArray<Float>().toFloatArray()
    val mScaleFactor: Float = 1F
    private val mRoot: SvgGroupNode? = null //TODO is this actually nullable?
    private var mFileName: String = ""
    private val mErrorLines = emptyList<String>()

    enum class SvgLogLevel {
        ERROR,
        WARNING
    }

    fun parse(f: File): Document {
        mFileName = f.getName()
        val doc = PositionXmlParser.parse() //TODO https://android.googlesource.com/platform/tools/base/+/1faa4af/common/src/main/java/com/android/utils/PositionXmlParser.java
    }
}