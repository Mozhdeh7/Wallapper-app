package com.moj.mywallpaper.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.moj.mywallpaper.Model.Category
import com.moj.mywallpaper.R

class RecyclerViewAdapter(
    val context: Context,
    val categories: List<Category>,
    val itemClicked: (Category) -> Unit
) :
    RecyclerView.Adapter<RecyclerViewAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_category, parent, false)
        return Holder(view, itemClicked)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder?.bindCategory(categories[position], context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder(itemView: View, val itemClicked: (Category) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        var name = itemView?.findViewById<TextView>(R.id.nameTextView)
        var image = itemView?.findViewById<ImageView>(R.id.imageImageView)

        fun bindCategory(category: Category, context: Context) {

            var resourceID =
                context.resources.getIdentifier(category.image, "drawable", context.packageName)

            image?.setImageResource(resourceID)
            name?.text = category.name

            itemView.setOnClickListener { itemClicked(category) }


        }
    }
}