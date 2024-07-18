package com.example.colorpredictio

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AlertDialog

class BetDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Bet Details")
            .setMessage("Static data: This is a bet dialog")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
        return builder.create()
    }
}
