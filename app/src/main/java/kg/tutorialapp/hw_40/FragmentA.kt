package kg.tutorialapp.hw_40

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class FragmentA : Fragment(R.layout.fragment_a) {

    lateinit var tvTextA: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvTextA = view.findViewById(R.id.tv_text_a)
    }

    companion object {
        const val TAG = "fragment A"
    }
}