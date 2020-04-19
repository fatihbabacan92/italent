package tech.fatih.italent.Reflection

import android.content.Context
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_reflection.view.*
import tech.fatih.italent.R

class ReflectionFragment : Fragment() {

    companion object {
        fun newInstance(): ReflectionFragment {
            var reflectionFragment = ReflectionFragment()
            var args = Bundle()
            reflectionFragment.arguments = args
            return reflectionFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_reflection, container, false)
        val context: Context? = super.getContext()

        rootView.reflection_textview.movementMethod = ScrollingMovementMethod()

        return rootView
    }
}
