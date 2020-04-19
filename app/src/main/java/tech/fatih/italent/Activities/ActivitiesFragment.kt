package tech.fatih.italent.Activities

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_activities.*
import kotlinx.android.synthetic.main.fragment_activities.view.*
import kotlinx.android.synthetic.main.fragment_activities.view.innovatieroute_card
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

        return rootView
    }

    fun onClick(v: View) {
        val intent = Intent(context, ActivityDetailActivity::class.java)
        var activityName = ""
        when (v) {
            innovatieroute_card -> {
                activityName = "innovatie"
                intent.putExtra("activity", activityName)
            }
            blockchain_card -> {
                activityName = "blockchain"
                intent.putExtra("activity", activityName)
            }
            ai_card -> {
                activityName = "ai"
                intent.putExtra("activity", activityName)
            }
            stage_card -> {
                activityName = "stage"
                intent.putExtra("activity", activityName)
            }
            oneclock_card -> {
                activityName = "oneclock"
                intent.putExtra("activity", activityName)
            }
            omnibuzz_card -> {
                activityName = "omnibuzz"
                intent.putExtra("activity", activityName)
            }
        }

        startActivity(intent)
    }
}
