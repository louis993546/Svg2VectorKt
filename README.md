#Svg2VectorKt

I am trying to recreate the `Svg2Vector` in Kotlin/Multiplatform (JVM + JS for now)

## Why

This is the first step towards the ultimate goal of a Sketch Plugin that export artboards to `VectorDrawable` for 
Android. Once this is running, I can move on to step 2 to provide suggestions/guides on what is/is not available in 
Android XML and assist users to adjust their artboards accordingly.

## References
- [Someone made a version of it before Google did in JS](https://github.com/inloop/svg2android)
- [The official Svg2Vector in Google Git](https://android.googlesource.com/platform/tools/base/+/master/sdk-common/src/main/java/com/android/ide/common/vectordrawable/Svg2Vector.java)
- [Node.js module that does the exact same thing, but also up to date](https://github.com/Ashung/svg2vectordrawable)