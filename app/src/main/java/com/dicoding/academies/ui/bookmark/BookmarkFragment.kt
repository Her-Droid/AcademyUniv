package com.dicoding.academies.ui.bookmark


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.dicoding.academies.R
import com.dicoding.academies.data.DataModule
import kotlinx.android.synthetic.main.fragment_bookmark.*

class BookmarkFragment : Fragment(), BookmarkFragmentCallback {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bookmark, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[BookmarkViewModel::class.java]
            val module = viewModel.getBookmarks()

            val adapter = BookmarkAdapter(this)
            adapter.setModule(module)

            rv_bookmark.layoutManager = LinearLayoutManager(context)
            rv_bookmark.setHasFixedSize(true)
            rv_bookmark.adapter = adapter
        }
    }

    override fun onShareClick(module: DataModule) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                    .from(activity)
                    .setType(mimeType)
                    .setChooserTitle("Bagikan aplikasi ini sekarang.")
                    .setText("Segera daftar kelas ${module.title} di edutech.com")
                    .startChooser()
        }
    }
}

