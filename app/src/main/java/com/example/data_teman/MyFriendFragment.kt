package com.example.data_teman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data_teman.databinding.FragmentMyFriendBinding

class MyFriendFragment : Fragment() {
    private lateinit var binding: FragmentMyFriendBinding
    private lateinit var listTeman: ArrayList<MyFriend>
    private lateinit var myFriendAdapter: MyFriendAdapter

    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(MyFriend("Hendrico Surya", "hendricosurya16@gmail.com", "081907393302"))
        listTeman.add(MyFriend("Rizky Fajar", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("Kunlang", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("CakNo", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("Asfi", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("Rara", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("CaneToad", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("Budi", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("Andi", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("WKWKWKW", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("ksksksk", "rizky@gmail.com", "0810000000"))
        listTeman.add(MyFriend("Jan", "rizky@gmail.com", "0810000000"))

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun tampilTeman() {
        myFriendAdapter = MyFriendAdapter(listTeman)
        binding.rvListMyFriend.layoutManager = LinearLayoutManager(requireContext())
        binding.rvListMyFriend.adapter = myFriendAdapter
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyFriendBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}


