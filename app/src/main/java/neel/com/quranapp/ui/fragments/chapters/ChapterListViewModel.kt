package neel.com.quranapp.ui.fragments.chapters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import neel.com.quranapp.data.source.QuranDataSource
import neel.com.quranapp.data.source.Result
import neel.com.quranapp.data.source.remote.RemoteQuranDataSource
import timber.log.Timber


class ChapterListViewModel(val remote : QuranDataSource ) : ViewModel() {

    fun getQuranChapters() = viewModelScope.launch {
        val response = remote.getChaptersFromRemote()
        when(response){
            is Result.Success ->{
                Timber.d("result_list :${response.data.toString()}")
            }
            is Result.Error -> {
                Timber.d("result_list :${response.exception.toString()}")
            }

            is Result.Loading -> {
                Timber.d("result_list: Loading")
            }
        }
    }

}