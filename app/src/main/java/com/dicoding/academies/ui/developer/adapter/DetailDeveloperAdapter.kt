package com.dicoding.academies.ui.developer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.academies.R
import com.dicoding.academies.data.UserModel
import kotlinx.android.synthetic.main.activity_detail_developer.view.*
import kotlinx.android.synthetic.main.activity_detail_developer.view.emailUser
import kotlinx.android.synthetic.main.activity_detail_developer.view.nameUser
import kotlinx.android.synthetic.main.activity_detail_developer.view.tvProfession
import java.util.ArrayList

class DetailDeveloperAdapter : RecyclerView.Adapter<DetailDeveloperAdapter.DeveloperViewHolder>() {

    private val listUser = ArrayList<UserModel>()

    fun setUser(modules: UserModel) {
        if (modules == null) return
        this.listUser.clear()
        this.listUser.addAll(modules)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_developer, parent, false)
        return DeveloperViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: DeveloperViewHolder, position: Int) {
        val module = listUser[position]
        viewHolder.bind(module)
    }

    override fun getItemCount(): Int = listUser.size

    inner class DeveloperViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: UserModel) {
            with(itemView) {
                nameUser.text = user.name
                tvProfession.text = user.profession
                emailUser.text = user.email
                contact.text = user.contact
                work_experience.text = user.workExperience
                text_office.text = user.office
                dateWork.text = user.date
                Glide.with(itemView.context)
                        .load(user.imageUser)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .into(imageUser)
            }
        }
    }
}