package com.example.todayfeeling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.todayfeeling.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // 로그인 성공 확인 하기 추가
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        // db에서 데이터 받아와서 true false 설정
        val isReady = false

        val content = findViewById<View>(android.R.id.content)
        content.viewTreeObserver.addOnPreDrawListener(
            object : ViewTreeObserver.OnPreDrawListener {
                override fun onPreDraw(): Boolean {
                    // 자동 로그인 성공 시 홈 프래그먼트로 이동
                    return if (isReady) {
                        content.viewTreeObserver.removeOnPreDrawListener(this)
                        navController.navigate(R.id.action_loginFragment_to_homeFragment)
                        true
                        // 자동 로그인 실패 시 로그인 프래그먼트로 이동
                    } else {
                        content.viewTreeObserver.removeOnPreDrawListener(this)
                        false
                    }
                }
            }
        )
    }
}