package com.john.android_assignment_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.john.android_assignment_1.databinding.ActivityFacebookRecyclerviewBinding

class FacebookTimeLine : AppCompatActivity() {

    private lateinit var binding: ActivityFacebookRecyclerviewBinding
    private lateinit var postsAdapter: FacebookPostsTimeLineAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFacebookRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        postsAdapter = FacebookPostsTimeLineAdapter(createPostsList())
        binding.facebooKTimelineRv.adapter = postsAdapter
    }


    private fun createPostsList(): List<FaceBookPostDTO> {

        val posts = arrayListOf<FaceBookPostDTO>()
        for (i in 1..10000) {
            posts.add(
                FaceBookPostDTO(
                    name = "User $i",
                    postTitle = "This is post number $i i hope you like it",
                    likesCount = i
                )
            )
        }
        return posts

    }

}