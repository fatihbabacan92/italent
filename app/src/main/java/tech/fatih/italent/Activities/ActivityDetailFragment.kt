package tech.fatih.italent.Activities

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import tech.fatih.italent.R

class ActivityDetailFragment : Fragment() {

    companion object {
        fun newInstance(): ActivityDetailFragment {
            var activityDetailFragment = ActivityDetailFragment()
            var args = Bundle()
            activityDetailFragment.arguments = args
            return activityDetailFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_activity_detail, container, false)
        val context: Context? = super.getContext()


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}
