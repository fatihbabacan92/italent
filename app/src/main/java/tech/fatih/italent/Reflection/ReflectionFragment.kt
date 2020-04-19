package tech.fatih.italent.Reflection

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tech.fatih.italent.Activities.ActivityDetailFragment
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


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
