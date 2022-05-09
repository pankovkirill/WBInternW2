package com.example.wbinternw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.wbinternw2.databinding.ActivityMainBinding

/**
 * Для чего нужен жизненный цикл активити.
 *
 * В системе андроид каждое приложение работает в собственном процессе, и при открытии нового приложения системе необходимы ресурсы
 * которые могут занимать ранее открытые приложения, по этому система может закрывать старые приложения.
 * При закрытии приложения могут терятся данные, я думаю что именно для этого и нужен жизненный цикл,
 * чтобы мы могли сохранить данные и избежать их утери.
 * Так же телефон зачастую ограничен в энергоресурсах, система пытается как можно дольше сохранять заряд батареи
 * в связи с чем минимализирует ее расход закрывая или ограничевая процессы.
 *
 * Отличия жизненного цикла Активити от Фрагмента
 *
 * Фрагмент не может существовать без активити, и по этому ЖЦ фрагмента встраивается в ЖЦ активити,
 * именно по этому в ЖЦ фрагмента появляются новые методы, чтобы мы могли отследить моменты присоединения, создания, открытия и тд. фрагмента
 *
 * Примеры использования ЖЦ в реальных проектах
 *
 *  1) Любые приложения которые поддерживают поворот экрана, сохраняют состояние, а затем его восстанавливают(некоторые могут использовать LiveData)
 * к примеру YouTube
 *
 *  2) Так же в приложении YouTube при его сворачивании, приложение это отслеживает и запускает воспроизведение видео в бэграунде
 *
 *  3) Телеграмм при смене темы приложения, сохраняет свое состояние.
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        Log.d(TAG, "MainActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity - onDestroy")
    }
}