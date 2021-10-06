package learn.idn.kotlinapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val datasGambar = arrayOf("https://ds393qgzrxwzn.cloudfront.net/resize/m500x500/cat1/img/images/0/W4XMxSTwLd.jpg",
                                  "https://ds393qgzrxwzn.cloudfront.net/resize/m500x500/cat1/img/images/0/W4XMxSTwLd.jpg")
        val datasJudul = arrayOf("baju naruto anak", "baju naruto jepang")
        val datasBuyer = arrayOf("3000","11000")

        val rvItem : RecyclerView = findViewById(R.id.rv_item)
        rvItem.adapter = AdapterRecyclerView(this, datasGambar, datasJudul, datasBuyer)
        rvItem.layoutManager = LinearLayoutManager(this)
        rvItem.setHasFixedSize(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.bahasa -> {
                Toast.makeText(this,"Penganturan Bahasa", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.tampilan -> {
                Toast.makeText(this,"Penganturan Tampilan", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.logout -> {
                startActivity(Intent(this, LoginActivity::class.java))
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}