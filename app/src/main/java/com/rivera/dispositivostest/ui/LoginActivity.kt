package com.rivera.dispositivostest.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.rivera.dispositivostest.databinding.ActivityLoginBinding
import com.rivera.dispositivostest.logic.login.Singin
import com.rivera.dispositivostest.ui.core.Constants

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val singIn : Singin = Singin()
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
            var us = binding.txtUsuario.text.toString()
            var pass = binding.txtContraseA.text.toString()
            singIn.checkUserAndPassword(us, pass)

            if (!singIn.checkUserAndPassword(us,pass))
                Snackbar.make(
                    binding.btnLogin,
                    "Usuario o password incorrecto",
                    Snackbar.LENGTH_LONG
                ).show()

            else{
               val intent =  Intent(this,MainActivity::class.java)
                startActivity(intent)

                val intentImpl = Intent()
                intentImpl.action = Intent.ACTION_VIEW
                intentImpl.putExtra(Intent.EXTRA_TEXT, "Mi primera chamba")

                intentImpl.type = "text/plain"
                startActivity(intentImpl)

                val intentExp = Intent(
                    this,
                    MainActivity::class.java
                )
                intentExp.putExtra(Constants.TEXT_VARIABLE,"Mi primera chamba")
                startActivity(intentExp)
            }
        }

    }

    }