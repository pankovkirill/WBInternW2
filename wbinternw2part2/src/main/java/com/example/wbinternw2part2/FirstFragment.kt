package com.example.wbinternw2part2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wbinternw2part2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "FirstFragment - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "FirstFragment - onStart")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "FirstFragment - onCreateView")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "FirstFragment - onViewCreated")

        binding.btnStart.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.container, SecondFragment())
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "FirstFragment - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "FirstFragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "FirstFragment - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "FirstFragment - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "FirstFragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "FirstFragment - onDestroy")
        _binding = null
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "FirstFragment - onDetach")
    }
}