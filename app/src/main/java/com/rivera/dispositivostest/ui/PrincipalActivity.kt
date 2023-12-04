package com.rivera.dispositivostest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.rivera.dispositivostest.databinding.ActivityPrincipalBinding
import com.rivera.dispositivostest.logic.login.LoginUseCase
import com.rivera.dispositivostest.ui.core.Constants
import com.rivera.dispositivostest.ui.core.My_Application

class PrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.extras.let {
            My_Application
                .getConnectionDB()!!
                .getUsersDAO()
                .getOneUser(1)

            val userId = it?.getInt(Constants.USRID)
            if(userId != null){
                val  user = LoginUseCase(My_Application.getConnectionDB()!!)
                    .getUserNAme(userId)
                binding.txtUsrId.text = "Bienvenido " + user.firstName.toString() + " " + user.lastName.toString()
            }
            else{
                Snackbar.make(
                    binding.txtUsrId,
                    "Ocurrio un error",
                    Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}