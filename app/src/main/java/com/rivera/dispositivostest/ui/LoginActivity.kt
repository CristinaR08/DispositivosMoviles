package com.rivera.dispositivostest.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.rivera.dispositivostest.data.entities.repository.DBUsers
import com.rivera.dispositivostest.databinding.ActivityLoginBinding
import com.rivera.dispositivostest.logic.login.LoginUserCase

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val dbUser = DBUsers()
    private val singIn : LoginUserCase = LoginUserCase(dbUser)
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

            if (us.isEmpty()||pass.isEmpty()){
                Toast.makeText(this,"Ningun campo puede estar vacio!",Toast.LENGTH_LONG).show()
            }

            else if (!singIn.checkUserAndPassword(us,pass))
                Snackbar.make(
                    binding.btnLogin,
                    "Usuario o password incorrecto",
                    Snackbar.LENGTH_LONG
                ).show()

            else{

                val intent =  Intent(this,MainActivity::class.java)
                intent.putExtra("name", us)
                startActivity(intent)

            }
        }

    }


}