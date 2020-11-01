package com.dicoding.academies.ui.developer.activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.academies.R
import com.dicoding.academies.data.UserModel
import com.dicoding.academies.ui.developer.adapter.DetailDeveloperAdapter
import com.dicoding.academies.ui.developer.viewmodel.DetailDeveloperViewModel
import kotlinx.android.synthetic.main.activity_detail_developer.*


class DetailDeveloperActivity : AppCompatActivity(){

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_developer)
        val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
        )[DetailDeveloperViewModel::class.java]

        val adapter = DetailDeveloperAdapter()
        val extras = intent.extras
        if (extras != null) {
            val userId = extras.getString(EXTRA_USER)
            if (userId != null) {
                viewModel.setSelectedUser(userId)
                val userId = viewModel.getUser()
                adapter.setUser(userId)
                viewModel.getUser()?.let { item ->
                    populateUser(item)
                }
            }
        } else {
            val extras = intent.extras
            if (extras != null) {
                val userId = extras.getString(EXTRA_USER)
                if (userId != null) {
                    viewModel.setSelectedUser(userId)
                    viewModel.getUser()?.let { item ->
                        populateUser(item)
                    }
                }
            }
        }
    }


    private fun populateUser(user: UserModel) {
        nameUser.text = user.name
        tvProfession.text = user.profession
        emailUser.text = user.email
        contact.text = user.contact
        work_experience.text = user.workExperience
        text_office.text = user.office
        dateWork.text = user.date
        Glide.with(this).load(user.imageUser).apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
                .into(imageUser)
    }

}