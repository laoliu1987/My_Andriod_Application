package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        button1.setOnClickListener {
            Toast.makeText(this,"You clicked Button",Toast.LENGTH_SHORT).show()
            val data="hello SecondActivity"
            val intent= Intent(this,MainSecondActivity::class.java)
            intent.putExtra("extra_data",data)
            startActivity(intent)

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item->Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show()
            R.id.remove_item->Toast.makeText(this,"You clicked remove",Toast.LENGTH_SHORT).show()
        }
        return true;
    }
}
