package com.example.wbinternw2part2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wbinternw2part2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "SecondFragment - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "SecondFragment - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "SecondFragment - onCreateView")

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "SecondFragment - onViewCreated")

        binding.btnStart.setOnClickListener {
            AlertDialogFragment().show(parentFragmentManager, "123")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "SecondFragment - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "SecondFragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "SecondFragment - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "SecondFragment - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "SecondFragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "SecondFragment - onDestroy")
        _binding = null
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "SecondFragment - onDetach")
    }
}