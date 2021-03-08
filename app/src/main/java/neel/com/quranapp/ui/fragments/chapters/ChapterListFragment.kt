package neel.com.quranapp.ui.fragments.chapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import kotlinx.android.synthetic.main.fragment_chapter_list.*
import neel.com.quranapp.R
import neel.com.quranapp.data.source.QuranDataSource
import neel.com.quranapp.data.source.remote.RemoteQuranDataSource


class ChapterListFragment : Fragment() {

    private val viewModel by viewModels<ChapterListViewModel>{
        ChapterListViewModelFactory(RemoteQuranDataSource())
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chapter_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_call_chapter_list.setOnClickListener {
            viewModel.getQuranChapters()
        }



    }


}