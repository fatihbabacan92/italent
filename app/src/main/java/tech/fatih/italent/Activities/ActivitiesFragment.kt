package tech.fatih.italent.Activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_activities.*
import kotlinx.android.synthetic.main.fragment_activities.view.*
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

        setClickListeners(rootView)

        return rootView
    }

    fun setClickListeners(v: View) {
        val intent = Intent(context, ActivityDetailActivity::class.java)
        var activityName = ""
        v.innovatieroute_card.setOnClickListener { f ->
            activityName = "innovatie"
            intent.putExtra("activityName", activityName)
            startActivity(intent)
        }
        v.blockchain_card.setOnClickListener { f ->
            activityName = "blockchain"
            intent.putExtra("activityName", activityName)
            startActivity(intent)
        }
        v.ai_card.setOnClickListener { f ->
            activityName = "ai"
            intent.putExtra("activityName", activityName)
            startActivity(intent)
        }
        v.stage_card.setOnClickListener { f ->
            activityName = "stage"
            intent.putExtra("activityName", activityName)
            startActivity(intent)
        }
        v.oneclock_card.setOnClickListener { f ->
            activityName = "oneclock"
            intent.putExtra("activityName", activityName)
            startActivity(intent)
        }
        v.omnibuzz_card.setOnClickListener { f ->
            activityName = "omnibuzz"
            intent.putExtra("activityName", activityName)
            startActivity(intent)
        }
    }
}
