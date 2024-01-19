package com.john.android_assignment_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FacebookPostsTimeLineAdapter(private var posts:List<FaceBookPostDTO>) :
    RecyclerView.Adapter<FacebookPostsTimeLineAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.user_name)
        var postContent: TextView = itemView.findViewById(R.id.post_text)
        var likesNumber: TextView = itemView.findViewById(R.id.likes_number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_facebook_post , parent , false))
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = posts[position].name
        holder.postContent.text = posts[position].postTitle
        holder.likesNumber.text = posts[position].likesCount.toString()
    }

}