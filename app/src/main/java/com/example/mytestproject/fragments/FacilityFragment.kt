package com.example.mytestproject.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytestproject.R
import com.example.mytestproject.databinding.FragmentFacilityBinding
import com.example.mytestproject.databinding.SampleDialogOneBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FacilityFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FacilityFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentFacilityBinding
    private lateinit var sampleDialogOneBinding: SampleDialogOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFacilityBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            btnSampleOne.setOnClickListener {
                  openBottomSheet()
            }
        }
    }

    private fun openBottomSheet() {
          val dialog =BottomSheetDialog(binding.root.context)
            sampleDialogOneBinding= SampleDialogOneBinding.inflate(layoutInflater)
             dialog.setContentView(sampleDialogOneBinding.root)
            sampleDialogOneBinding.apply {
                  rlEdit.setOnClickListener {

                  }
                 rlDelete.setOnClickListener {

                 }
                rlAdd.setOnClickListener {

                }
            }

           dialog.setCanceledOnTouchOutside(false)
           dialog.show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FacilityFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FacilityFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}