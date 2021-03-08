package neel.com.quranapp.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import neel.com.quranapp.models.ChapterInfoResponse
import neel.com.quranapp.network.jsonAdapter.ChapterInfoAdapter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


private const val BASE_URL = "https://api.quran.com/api/v4/"


private val moshi = Moshi.Builder()
   // .add(ChapterInfoAdapter())
    .add(KotlinJsonAdapterFactory())
    .build()



private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .build()


interface QuranApiService {
    // get all the list from
    @GET("chapters")
    fun getChapters(
    ) : Deferred<ChapterInfoResponse>

}

object QuranApi{
    val retrofitService : QuranApiService by lazy {
        retrofit.create(QuranApiService::class.java)
    }
}




