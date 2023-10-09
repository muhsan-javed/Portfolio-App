package com.muhsantech.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val and var
        val btnSkills = findViewById<MaterialButton>(R.id.btnSkills)
        btnSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
            //Toast.makeText(this@MainActivity,"Hi ClickListener", Toast.LENGTH_LONG).show()
        }

        btnSkills.setOnLongClickListener(View.OnLongClickListener {

            Toast.makeText(this@MainActivity, "SkillsActivity", Toast.LENGTH_LONG).show()

            true
        })

    }
}