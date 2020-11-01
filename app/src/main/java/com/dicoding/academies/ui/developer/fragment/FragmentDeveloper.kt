package com.dicoding.academies.ui.developer.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.academies.R
import com.dicoding.academies.ui.developer.adapter.DeveloperAdapter
import com.dicoding.academies.ui.developer.viewmodel.DeveloperViewModel
import kotlinx.android.synthetic.main.fragment_developer.*
/**
 * A simple [Fragment] subclass.
 */
class FragmentDeveloper : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_developer, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DeveloperViewModel::class.java]
            val courses = viewModel.getUser()

            val developerAdapter = DeveloperAdapter()
            developerAdapter.setUser(courses)

            rv_developer.layoutManager = LinearLayoutManager(context)
            rv_developer.setHasFixedSize(true)
            rv_developer.adapter = developerAdapter
        }
    }
}

