package neel.com.quranapp.ui.fragments.chapters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import neel.com.quranapp.data.source.QuranDataSource
import neel.com.quranapp.data.source.remote.RemoteQuranDataSource


class ChapterListViewModelFactory(
    val remote : QuranDataSource
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return (ChapterListViewModel(remote) as T)
    }
}