package com.john.android_assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.john.android_assignment_1.databinding.ActivityFacebookLoginBinding;
import com.john.android_assignment_1.databinding.ActivityFacebookPostBinding;

public class FacebookLoginActivity extends AppCompatActivity {

    ActivityFacebookLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFacebookLoginBinding.inflate(getLayoutInflater());
        binding.loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(this , FacebookTimeLine.class);
            startActivity(intent);
            finish();
        });
        setContentView(binding.getRoot());
    }
}