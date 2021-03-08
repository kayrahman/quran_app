package neel.com.quranapp.data.source.remote

import neel.com.quranapp.data.source.QuranDataSource
import neel.com.quranapp.data.source.Result
import neel.com.quranapp.models.ChapterInfoResponse
import neel.com.quranapp.network.QuranApi


class RemoteQuranDataSource : QuranDataSource {

    override suspend fun getChaptersFromRemote(): Result<ChapterInfoResponse> {
        try {
            val chapterInfoResponse = QuranApi.retrofitService.getChapters().await()
            return Result.Success(chapterInfoResponse)
        }catch (e:Exception){
            return Result.Error(e)
        }
        }

}