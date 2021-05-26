package kg.tutorialapp.hw_40

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentB : Fragment(R.layout.fragment_b) {

    lateinit var tvTextB: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvTextB = view.findViewById(R.id.tv_text_b)
    }

    companion object {
        const val TAG = "fragment B"
    }
}