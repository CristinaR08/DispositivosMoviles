package com.rivera.dispositivostest.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.rivera.dispositivostest.R
import com.rivera.dispositivostest.databinding.ActivityPrincipalBinding
import com.rivera.dispositivostest.logic.login.LoginUseCase
import com.rivera.dispositivostest.ui.core.Constants
import com.rivera.dispositivostest.ui.core.My_Application
import com.rivera.dispositivostest.ui.fragments.FavoritesFragment
import com.rivera.dispositivostest.ui.fragments.ListFragment

class PrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listFragment  =ListFragment()
        val favoritesFragment  =FavoritesFragment()
        val transaction = supportFragmentManager.beginTransaction()

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.item_1 -> {
                    transaction.replace(binding.frmContainer.id, listFragment)
                    transaction.commit()
                    true
                }
                R.id.item_2 -> {
                    transaction.replace(binding.frmContainer.id, favoritesFragment)
                    transaction.commit()
                    true
                }
                else -> false
            }
        }

     /*   intent.extras.let {
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
        }*/
    }
}