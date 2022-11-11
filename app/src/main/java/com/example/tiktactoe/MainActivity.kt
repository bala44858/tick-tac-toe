package com.example.tiktactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.ButtonBarLayout
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    var flag1 by Delegates.notNull<Boolean>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        flag1=true

        var box1 = findViewById<TextView>(R.id.b1)
        var box2 = findViewById<TextView>(R.id.b2)
        var box3 = findViewById<TextView>(R.id.b3)
        var box4 = findViewById<TextView>(R.id.b4)
        var box5 = findViewById<TextView>(R.id.b5)
        var box6 = findViewById<TextView>(R.id.b6)
        var box7 = findViewById<TextView>(R.id.b7)
        var box8 = findViewById<TextView>(R.id.b8)
        var box9 = findViewById<TextView>(R.id.b9)
        var count=1
        var playerName=findViewById<TextView>(R.id.player)
        if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
        box1.setOnClickListener{
            if (box1.text=="" && flag1!=false) {
                if (count % 2 == 0 ) box1.text = "X" else box1.text = "O"
                count += 1
                if (count%2==1){
                    playerName.text="Player O "
                } else {
                    playerName.text="Player X"
                }

               check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)
                var t : TextView = findViewById(R.id.test)
//                t.text="working "+count
            }

        }
        box2.setOnClickListener{
            if ( box2.text=="" && flag1!=false) {
                if (count % 2 == 0) box2.text = "X" else box2.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
        box3.setOnClickListener{
            if ( box3.text=="" && flag1!=false) {
                if (count % 2 == 0) box3.text = "X" else box3.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
        box4.setOnClickListener{
            if ( box4.text==""&& flag1!=false) {
                if (count % 2 == 0) box4.text = "X" else box4.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
        box5.setOnClickListener{
            if ( box5.text==""&& flag1!=false) {
                if (count % 2 == 0) box5.text = "X" else box5.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
        box6.setOnClickListener{
            if ( box6.text==""&& flag1!=false) {
                if (count % 2 == 0) box6.text = "X" else box6.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
        box7.setOnClickListener{
            if (box7.text==""&& flag1!=false) {
                if (count % 2 == 0) box7.text = "X" else box7.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
        box8.setOnClickListener{
            if ( box8.text==""&& flag1!=false) {
                if (count % 2 == 0) box8.text = "X" else box8.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
        box9.setOnClickListener{
            if (box9.text==""&& flag1!=false) {
                if (count % 2 == 0) box9.text = "X" else box9.text = "O"
                count += 1
                if (count%2==1) playerName.text="Player O " else playerName.text="Player X"
                check(count, box1, box2, box3, box4, box5, box6, box7, box8, box9)

            }
        }
//        this code for restart thr game
        var b=findViewById<Button>(R.id.btn1)
        b.setOnClickListener {
            box1.text=""
            box2.text=""
            box3.text=""
            box4.text=""
            box5.text=""
            box6.text=""
            box7.text=""
            box8.text=""
            box9.text=""
            flag1=true
            findViewById<TextView>(R.id.finalText).text=""
            count=1
            if (count%2==1) playerName.text="Player O " else playerName.text="Player X"

        }


    }

    fun check(count:Int,box1:TextView,box2: TextView,box3: TextView,box4: TextView,box5: TextView,box6: TextView,box7: TextView,box8: TextView,box9: TextView){
        var checkLable : TextView=findViewById(R.id.finalText)
        flag1=true
//        findViewById<TextView>(R.id.test).text="enter into the checking "
        if (box1.text==box2.text && box2.text==box3.text && box1.text!=""){
            box1.setTextColor(Color.parseColor("#70E880"))
            box2.setTextColor(Color.parseColor("#70E880"))
            box3.setTextColor(Color.parseColor("#70E880"))
            checkLable.text= "WON "+ box1.text+""
            findViewById<TextView>(R.id.player).text="Game Over"
            flag1=false
        }

        if (box5.text==box4.text && box4.text==box6.text&& box4.text!=""){
            checkLable.text= "WON "+ box4.text+""
            box4.setTextColor(Color.parseColor("#70E880"))
            box5.setTextColor(Color.parseColor("#70E880"))
            box6.setTextColor(Color.parseColor("#70E880"))
            findViewById<TextView>(R.id.player).text="Game Over"

            flag1=false
        }
        if (box7.text==box8.text && box7.text==box9.text && box9.text!=""){
            checkLable.text= "WON "+ box7.text+""
            box7.setTextColor(Color.parseColor("#70E880"))
            box8.setTextColor(Color.parseColor("#70E880"))
            box9.setTextColor(Color.parseColor("#70E880"))
            findViewById<TextView>(R.id.player).text="Game Over"

            flag1=false
        }
//        vertical start
        if (box1.text==box4.text && box4.text==box7.text && box1.text!=""){
            checkLable.text= "WON "+ box4.text+""
            box1.setTextColor(Color.parseColor("#70E880"))
            box4.setTextColor(Color.parseColor("#70E880"))
            box7.setTextColor(Color.parseColor("#70E880"))
            flag1=false
        }
        if (box2.text==box5.text && box2.text==box8.text && box2.text!=""){
            checkLable.text= "WON "+ box2.text+""
            box5.setTextColor(Color.parseColor("#70E880"))
            box2.setTextColor(Color.parseColor("#70E880"))
            box8.setTextColor(Color.parseColor("#70E880"))
            findViewById<TextView>(R.id.player).text="Game Over"

            flag1=false
        }
        if (box3.text==box6.text && box3.text==box9.text && box3.text!=""){
            checkLable.text= "WON "+ box3.text+""
            box6.setTextColor(Color.parseColor("#70E880"))
            box9.setTextColor(Color.parseColor("#70E880"))
            box3.setTextColor(Color.parseColor("#70E880"))
            findViewById<TextView>(R.id.player).text="Game Over"

            flag1=false
        }
//        cross region
        if (box1.text==box5.text && box1.text==box9.text && box1.text!=""){
            checkLable.text= "WON "+ box1.text+""
            box1.setTextColor(Color.parseColor("#70E880"))
            box5.setTextColor(Color.parseColor("#70E880"))
            box9.setTextColor(Color.parseColor("#70E880"))
            findViewById<TextView>(R.id.player).text="Game Over"

            flag1=false
        }
        if (box3.text==box5.text && box3.text==box7.text && box3.text!=""){
            checkLable.text= "WON "+ box3.text+""
            box5.setTextColor(Color.parseColor("#70E880"))
            box7.setTextColor(Color.parseColor("#70E880"))
            box3.setTextColor(Color.parseColor("#70E880"))
            findViewById<TextView>(R.id.player).text="Game Over"

            flag1=false
        }
//        if (box1.text==box2.text && box1.text==box3.text) {
//            checkLable.text=box1.text
//            flag1=false
//        }
//        if (box4.text==box5.text && box4.text==box6.text) {
//            checkLable.text=box4.text
//            flag1=false
//        }
//        if (box7.text==box8.text && box7.text==box9.text) {
//            checkLable.text=box7.text
//            flag1=false
//        }
//        if (box1.text==box4.text && box4.text==box7.text) {
//            checkLable.text=box7.text
//            findViewById<TextView>(R.id.test).text="try changhe on last box 1"
//            flag1=false
//        }
//        if (box2.text==box5.text && box2.text==box8.text) {
//            checkLable.text=box2.text
//            flag1=false
//        }
//        if (box3.text==box6.text && box3.text==box9.text) {
//            checkLable.text=box3.text
//            flag1=false
//        }
//        if (box1.text==box5.text && box5.text==box9.text) {
//            checkLable.text=box5.text
//            flag1=false
//        }
//        if (box3.text==box5.text && box5.text==box7.text) {
//            checkLable.text=box5.text
//            flag1=false
//        }
//
        if (count==10 && flag1) {
            box1.setTextColor(Color.parseColor("#D62929"))
            box2.setTextColor(Color.parseColor("#D62929"))
            box3.setTextColor(Color.parseColor("#D62929"))
            box4.setTextColor(Color.parseColor("#D62929"))
            box5.setTextColor(Color.parseColor("#D62929"))
            box6.setTextColor(Color.parseColor("#D62929"))
            box7.setTextColor(Color.parseColor("#D62929"))
            box8.setTextColor(Color.parseColor("#D62929"))
            findViewById<TextView>(R.id.player).text="Game Over"

            box9.setTextColor(Color.parseColor("#D62929"))
            checkLable.text="draw.."
        }
    }


}