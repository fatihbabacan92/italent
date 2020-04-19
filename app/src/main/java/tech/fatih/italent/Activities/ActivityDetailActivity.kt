package tech.fatih.italent.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import kotlinx.android.synthetic.main.activity_detail.*
import tech.fatih.italent.R

class ActivityDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val activityName = intent.getStringExtra("activityName")

        when (activityName) {
            "innovatie" -> {
                activity_textview.setText(resources.getString(R.string.innovatieroute_text))
                activity_title.setText(resources.getString(R.string.innovatieroute_title))
            }
            "blockchain" -> {
                activity_textview.setText(resources.getString(R.string.blockchain_text))
                activity_title.setText(resources.getString(R.string.blockchain_title))
            }
            "ai" -> {
                activity_textview.setText(resources.getString(R.string.ai_text))
                activity_title.setText(resources.getString(R.string.ai_title))
            }
            "stage" -> {
                activity_textview.setText(resources.getString(R.string.stage_text))
                activity_title.setText(resources.getString(R.string.stage_title))
            }
            "oneclock" -> {
                activity_textview.setText(resources.getString(R.string.oneclock_text))
                activity_title.setText(resources.getString(R.string.oneclock_title))
            }
            "omnibuzz" -> {
                activity_textview.setText(resources.getString(R.string.omnibuzz_text))
                activity_title.setText(resources.getString(R.string.omnibuzz_title))
            }
        }

        activity_textview.movementMethod = ScrollingMovementMethod()
    }

    fun onButtonClick(v: View) {
        onBackPressed()
    }
}
