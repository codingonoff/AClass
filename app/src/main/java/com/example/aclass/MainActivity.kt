package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataUser = DataUser("hong", 21)
        val dataUser1 = dataUser.copy("kim", 10)
    }
}

//데이터 클래스는 기본적으로 getter, setter함수 생성
// java Object 클래스에 정의된 함수들을 자동으로 생성한다.
data class DataUser(var name:String, var age : Int)


