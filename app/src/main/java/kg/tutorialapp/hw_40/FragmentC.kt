package kg.tutorialapp.hw_40

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentC : Fragment(R.layout.fragment_c) {

    lateinit var tvTextC: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvTextC = view.findViewById(R.id.tv_text_c)
    }

    companion object {
        const val TAG = "fragment C"
    }
}