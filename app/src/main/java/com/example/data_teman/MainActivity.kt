package com.example.data_teman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.example.data_teman.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val  menuText = arrayOf("Teman", "GitHub", "Profile")
    val menuIcon = arrayOf(R.drawable.home_1_svgrepo_com, R.drawable.add_folder_svgrepo_com, R.drawable.profile_round_1342_svgrepo_com)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(this)
        binding.viewPager.setAdapter(adapter);
        TabLayoutMediator(binding.tabLayout, binding.viewPager,{ tab, position ->
                tab.text=menuText[position]
                tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()

    }
}