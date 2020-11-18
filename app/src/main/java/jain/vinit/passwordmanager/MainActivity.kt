package jain.vinit.passwordmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.LoginPageLogin)
        textView.setOnClickListener{
            Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show()
        }
//        val textView = findViewById<TextView>(R.id.textView)
//        textView.setText("Hello")
    }
}