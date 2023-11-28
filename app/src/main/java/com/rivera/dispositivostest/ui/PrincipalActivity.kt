package com.rivera.dispositivostest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rivera.dispositivostest.R
import com.rivera.dispositivostest.databinding.ActivityLoginBinding
import com.rivera.dispositivostest.databinding.ActivityPrincipalBinding
import com.rivera.dispositivostest.logic.login.LoginUserCase
import com.rivera.dispositivostest.ui.core.Constants

class PrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras.let {
            val userId = it?.getInt(Constants.USER_ID)
            if (userId != null){

            

            }
        }
    }
}