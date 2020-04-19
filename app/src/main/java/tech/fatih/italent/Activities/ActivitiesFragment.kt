package tech.fatih.italent.Activities

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tech.fatih.italent.R

class ActivitiesFragment : Fragment() {

    companion object {
        fun newInstance(): ActivitiesFragment {
            var activitiesFragment = ActivitiesFragment()
            var args = Bundle()
            activitiesFragment.arguments = args
            return activitiesFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_activities, container, false)
        val context: Context? = super.getContext()


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
