package jose.cruz.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_primer.setOnClickListener(this)
        b_segundo.setOnClickListener(this)
        b_tercer.setOnClickListener(this)



    } // override fun onCreate

    override fun onClick(p0: View?) {

        // variable fragmento de tipo fragmento que puede ser nula inicializada en null
        var fragmento:Fragment? =null

        when(p0!!.id){
            R.id.b_primer ->{fragmento=PrimerFragment.newInstance("","")}
            R.id.b_segundo ->{fragmento=SegundoFragment.newInstance("","")}
            R.id.b_tercer ->{fragmento=TercerFragment.newInstance("","")}
        }

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragmento!!)
            .commitNow()

    } // override fun onClick


}
