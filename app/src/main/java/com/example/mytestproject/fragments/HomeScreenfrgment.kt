package com.example.mytestproject.fragments

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytestproject.R
import com.example.mytestproject.adapters.AdapterSample
import com.example.mytestproject.databinding.FragmentHomeScreenfrgmentBinding
import com.example.mytestproject.modelclasses.LstMtfDates
import com.example.mytestproject.viewmodels.VmViewPageRequ

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeScreenfrgment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeScreenfrgment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentHomeScreenfrgmentBinding
    private lateinit var viewPageRequ:VmViewPageRequ
    private lateinit var list: ArrayList<LstMtfDates>
    private lateinit var adapterSample: AdapterSample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        loadData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentHomeScreenfrgmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapterSample=AdapterSample(ArrayList())

        binding.apply {
            recyler.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = adapterSample
            }
        }
    }
    private fun loadData() {
        viewPageRequ = ViewModelProvider(this)[VmViewPageRequ::class.java]
        viewPageRequ.apiCallEmpViewList(Activity(), "36800000000222")
        viewPageRequ.getMutableLiveData().observe(this, Observer { value ->
            if (value.data!=null){
                list= value.data!!.LstMtfDates
                adapterSample.updateList(list)
            }
        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeScreenfrgment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeScreenfrgment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}