package com.app.diagnoU

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.app.diagnoU.calendar.CalendarFragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)



                        val buttonOpenCalendar = findViewById<Button>(R.id.button2)

                        buttonOpenCalendar.setOnClickListener {

                            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
                            fragmentTransaction.replace(R.id.fragment_container, CalendarFragment())
                            fragmentTransaction.addToBackStack(null)
                            fragmentTransaction.commit()
                        }
                    }
                }

