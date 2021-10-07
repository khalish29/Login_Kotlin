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

        val datasGambar = arrayOf("https://cdn.pixabay.com/photo/2019/01/12/07/31/mornang-3928116_960_720.jpg",
                                  "https://i.pinimg.com/originals/62/3a/a8/623aa8f9933ee9a286871bf6e0782538.jpg",
                                   "https://cdn-icons-png.flaticon.com/512/149/149071.png",
                                  "https://img.freepik.com/free-vector/abstract-banner-background-with-red-shapes_1361-3348.jpg?size=626&ext=jpg",
                                   "https://cdn.pixabay.com/photo/2017/08/30/01/05/milky-way-2695569__480.jpg",
                                   "https://images.ctfassets.net/hrltx12pl8hq/58CIvG6Whv49bsmRbqaEZ6/e42a73d8ddef6f9c126fa49d384be678/6.jpg?fit=fill&w=480&h=270",
                                   "https://cdn-icons-png.flaticon.com/512/149/149071.png",
                                    "https://cdn-icons-png.flaticon.com/512/149/149071.png")
        val datasJudul = arrayOf("Umar andhika", "Arsyil", "Unknown", "nuno", "adhi", "lutpi", "dafi", "Isham")
        val datasBuyer = arrayOf("yok belajar bareng lis","p", "nongskuy", "pppppp", "nqediqndqoindqonwdoqwdnqodnqnd", "hallo", "LIS sini lis", "biasalah")
        val datasJam = arrayOf("30 Sep","29 Agu", "2 Sep", "12 Okt", "3 Des", "20 Jan", "1 Feb", "Baru Saja")

        val rvItem : RecyclerView = findViewById(R.id.rv_item)
        rvItem.adapter = AdapterRecyclerView(this, datasGambar, datasJudul, datasBuyer, datasJam)
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