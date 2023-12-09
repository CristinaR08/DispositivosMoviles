package com.rivera.dispositivostest.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.rivera.dispositivostest.databinding.ActivityLoginBinding
import com.rivera.dispositivostest.logic.login.LoginUseCase
import com.rivera.dispositivostest.ui.core.Constants
import com.rivera.dispositivostest.ui.core.My_Application

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initControls()
    }

    fun initControls(){
        binding.btnLogin.setOnClickListener {
            val check = LoginUseCase(
                My_Application.getConnectionDB()!!).checkUserandPassword(
                binding.txtUsuario.text.toString(),
                binding.txtContraseA.text.toString())

            if(check > 0){
                val intent = Intent(this, PrincipalActivity::class.java)
                intent.putExtra(Constants.USRID, check)
                startActivity(intent)
            }
            else{
                Snackbar.make(binding.btnLogin,
                    "Usuario o contraseña incorrecto",
                    Snackbar.LENGTH_SHORT).show()
                binding.txtUsuario.text?.clear()
                binding.txtContraseA.text?.clear()
            }
        }

    }


}