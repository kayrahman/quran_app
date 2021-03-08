package neel.com.quranapp.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChapterInfoResponse(
        @Json(name = "chapters") val chapters : List<Chapter>
)

@JsonClass(generateAdapter = true)
data class Chapter(
        @Json(name = "id")  val id :Int,
        @Json(name = "revelation_place") val revelation_place:String,
        @Json(name = "revelation_order") val revelation_order:Int,
        @Json(name = "bismillah_pre") val bismillah_pre:Boolean,
        @Json(name = "name_complex") val name_complex:String,
        @Json(name = "name_arabic") val name_arabic:String,
        @Json(name = "verses_count")  val verses_count:Int,
        @Json(name = "pages")  val pages:List<Int>,
        @Json(name = "translated_name")val translated_name:TranslatedName
)
@JsonClass(generateAdapter = true)
data class TranslatedName(
        @Json(name = "language_name")  val lName:String,
        @Json(name = "name")  val name:String,
)