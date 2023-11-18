package com.rivera.dispositivostest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.rivera.dispositivostest.R
import com.rivera.dispositivostest.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initControls()

        }
    fun initControls(){

        binding.btnLogin.setOnClickListener {
            var u = binding.txtUsuario.text.toString()
            Toast.makeText(this, "Usuario incorrecto >:c", Toast.LENGTH_SHORT).show()
        }

    }

    }