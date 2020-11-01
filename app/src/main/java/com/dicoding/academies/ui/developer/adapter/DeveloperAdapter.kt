package com.dicoding.academies.ui.developer.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.academies.R
import com.dicoding.academies.data.UserModel
import com.dicoding.academies.ui.developer.activity.DetailDeveloperActivity
import kotlinx.android.synthetic.main.list_developer.view.*
import java.util.ArrayList

class DeveloperAdapter: RecyclerView.Adapter<DeveloperAdapter.DeveloperViewHolder>() {
    private var listCourses = ArrayList<UserModel>()

    fun setUser(user: List<UserModel>?) {
        if (user == null) return
        this.listCourses.clear()
        this.listCourses.addAll(user)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_developer, parent, false)
        return DeveloperViewHolder(view)
    }

    override fun onBindViewHolder(holder: DeveloperViewHolder, position: Int) {
        val course = listCourses[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listCourses.size


    class DeveloperViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: UserModel) {
            with(itemView) {
                nameUser.text = user.name
                tvProfession.text = user.profession
                emailUser.text = user.email
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailDeveloperActivity::class.java)
                    intent.putExtra(DetailDeveloperActivity.EXTRA_USER, user.userId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(user.imageUser)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .into(img_user)
            }
        }
    }
}