package com.example.data_teman

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.recyclerview.widget.RecyclerView
import com.example.data_teman.databinding.MyFriendItemBinding

class MyFriendAdapter(
    private val items: List<MyFriend>
) : RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: MyFriendItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindItem(item: MyFriend) {
            binding.txtFriendName.text = item.nama
            binding.txtFriendEmail.text = item.email
            binding.txtFriendTlp.text = item.telp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MyFriendItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}