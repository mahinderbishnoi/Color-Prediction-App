package com.example.colorpredictio

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.colorpredictio.databinding.ActivityMain2Binding
import com.example.colorpredictio.databinding.PopupBinding
import layout.RvAdapter
import layout.RvModel
import layout.Object.getData

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var rvAda: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        rvAda = RvAdapter(getData(), ::onOddsAClicked, ::onOddsBClicked)
        binding.rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rv.adapter = rvAda
    }

    @SuppressLint("MissingInflatedId", "InflateParams")
    private fun showBetPopup(match: RvModel, odds: String) {
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.popup, null)

        val popupWindow = PopupWindow(
            popupView,
            RecyclerView.LayoutParams.WRAP_CONTENT,
            RecyclerView.LayoutParams.WRAP_CONTENT,
            true
        )

        val matchDetailsTextView: TextView = popupView.findViewById(R.id.teamname)
        matchDetailsTextView.text = "${match.team1} vs ${match.team2} - Odds: $odds"

        val confirmBetButton: Button = popupView.findViewById(R.id.confirm_button)
        confirmBetButton.setOnClickListener {
            val betAmountEditText: EditText = popupView.findViewById(R.id.betamount)
            val betAmount = betAmountEditText.text.toString()
            if (betAmount.isNotEmpty()) {
                // Handle bet confirmation
                popupWindow.dismiss()
            }
        }

        popupWindow.showAtLocation(findViewById(R.id.rv), Gravity.CENTER, 0, 0)
    }

    private fun onOddsAClicked(match: RvModel) {
        showBetPopup(match, match.odd1)
    }

    private fun onOddsBClicked(match: RvModel) {
        showBetPopup(match, match.odd2)
    }
}
