package hn.edu.ujcv.pdm_2022_i_i1_2018130213

import android.app.Dialog
import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.os.Bundle
import android.text.format.DateFormat
import androidx.fragment.app.DialogFragment
import java.util.*


class TimePickerFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val hour = c[Calendar.HOUR_OF_DAY]
        val minute = c[Calendar.MINUTE]
        return TimePickerDialog(
            getActivity(),
            getActivity() as OnTimeSetListener?,
            hour,
            minute,
            DateFormat.is24HourFormat(getActivity())
        )
    }
}