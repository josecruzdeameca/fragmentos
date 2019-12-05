package jose.cruz.fragmentos


import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SegundoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SegundoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_segundo, container, false)

        val num1 = vista.findViewById(R.id.et_sumando_1) as EditText
        val num2 = vista.findViewById(R.id.et_sumando_2) as EditText

        num1.setGravity(Gravity.CENTER)
        num2.setGravity(Gravity.CENTER)

        val tv_suma = vista.findViewById(R.id.tv_suma) as TextView

        val b_sumar = vista.findViewById(R.id.b_sumar) as Button

        b_sumar.setOnClickListener {

            val sum1 = num1.text.toString()
            val sum2 = num2.text.toString()

            if (sum1 == "" || sum2 == "" ) {
                Toast.makeText(activity,"Ingresa los sumandos", Toast.LENGTH_LONG) .show()
            } else {
                //val sumando_1 = java.lang.Float.parseFloat(sum1)
                val sumando_1 = sum1.toInt()
                val sumando_2 = sum2.toInt()

                val suma = sumando_1 + sumando_2

                tv_suma.setText("= " + suma.toString())
            }
        }






        return vista
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SegundoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SegundoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
