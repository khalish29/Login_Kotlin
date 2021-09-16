package learn.idn.kotlinapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtPassword : EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        progressBar = findViewById(R.id.progress)
        val btnRegister : Button = findViewById(R.id.btn_register)
        val btnForgetPass : TextView = findViewById(R.id.forgot_password)
        val radioRemember : RadioButton = findViewById(R.id.rememberme)

        dataEmail = arrayOf("khalish","tianto","wiriadinata")
        dataPassword = arrayOf("1234", "4321", "1423")

        btnLogin.setOnClickListener{
            progressBar?.visibility = View.VISIBLE
            signIn(edtEmail.text.toString(), edtPassword.text.toString())
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }



    }

    fun signIn(email:String, Password:String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email || takeDataPass == Password){
//                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()

                progressBar?.visibility = View.GONE
                startActivity(Intent(this, HomeActivity::class.java))
                break
            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Akun salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}