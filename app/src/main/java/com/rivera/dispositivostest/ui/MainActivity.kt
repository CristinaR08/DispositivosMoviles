package com.rivera.dispositivostest.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.creative.ipfyandroid.Ipfy
import com.creative.ipfyandroid.IpfyClass
import com.google.android.material.snackbar.Snackbar
import com.rivera.dispositivostest.R
import com.rivera.dispositivostest.databinding.ActivityLoginBinding
import com.rivera.dispositivostest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Ipfy.init(this) // this is a context of application
        //or you can also pass IpfyClass type to get either IPv4 address only or universal address IPv4/v6 as
        Ipfy.init(this,IpfyClass.IPv4) //to get only IPv4 address
        //and
        Ipfy.init(this,IpfyClass.UniversalIP) //to get Universal address in IPv4/v6

        getIpAdress()

    }

    private fun getIpAdress(){

        Ipfy.getInstance().getPublicIpObserver().observe(this, { ipData ->
           binding.txtIp.text=
               ipData.currentIpAddress
        })
    }

    override fun onStart() {
        super.onStart()
        initControls()
    }

    fun initControls(){
        binding.button.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }


    }

}