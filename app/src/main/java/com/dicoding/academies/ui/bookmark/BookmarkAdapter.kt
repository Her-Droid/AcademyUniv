package com.dicoding.academies.ui.bookmark

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.academies.R
import com.dicoding.academies.data.DataModule
import com.dicoding.academies.ui.detail.DetailCourseActivity
import kotlinx.android.synthetic.main.items_bookmark.view.*

import java.util.ArrayList

class BookmarkAdapter(private val callback: BookmarkFragmentCallback) : RecyclerView.Adapter<BookmarkAdapter.ModuleViewHolder>() {
    private val listCourses = ArrayList<DataModule>()

    fun setModule(module: List<DataModule>?) {
        if (module == null) return
        this.listCourses.clear()
        this.listCourses.addAll(module)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_bookmark, parent, false)
        return ModuleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = listCourses[position]
        holder.bind(module)
    }

    override fun getItemCount(): Int = listCourses.size

    inner class ModuleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(module: DataModule){
            with(itemView){
                tv_item_title_bookmark.text = module.title
                tv_item_description_bookmark.text = module.description
                tv_item_date_bookmark.text = itemView.resources.getString(R.string.deadline_date, module.deadline)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailCourseActivity::class.java)
                    intent.putExtra(DetailCourseActivity.EXTRA_COURSE, module.dataModuleId)
                    itemView.context.startActivity(intent)
                }
                img_share.setOnClickListener { callback.onShareClick(module) }
                Glide.with(itemView.context)
                        .load(module.imagePath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .into(img_bookmark)
            }
        }
    }
}

