package kg.tutorialapp.hw_40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate((R.menu.menu_item), menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragmentA = FragmentA()
        val fragmentB = FragmentB()
        val fragmentC = FragmentC()

        when (item.itemId) {
            R.id.item_a -> openFragment(fragmentA)
            R.id.item_b -> openFragment(fragmentB)
            R.id.item_c -> openFragment(fragmentC)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun openFragment(fragment: Fragment) : Fragment {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
        return fragment
    }
}