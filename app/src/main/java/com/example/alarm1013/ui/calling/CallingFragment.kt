package com.example.alarm1013.ui.calling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.alarm1013.databinding.FragmentCallingBinding

class CallingFragment : Fragment() {

    private var _binding: FragmentCallingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val callingViewModel =
            ViewModelProvider(this).get(CallingViewModel::class.java)

        _binding = FragmentCallingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCalling
        callingViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}