package neel.com.quranapp.data.source

import neel.com.quranapp.models.ChapterInfoResponse

interface QuranDataSource {
   suspend fun getChaptersFromRemote(): Result<ChapterInfoResponse>
}