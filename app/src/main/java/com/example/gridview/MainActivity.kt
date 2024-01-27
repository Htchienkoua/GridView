package com.example.gridview


//Android GridView shows items in tow dimensional scrolling grid(rows and columns and the
//the grid items are not necessarily predetermined but they automatically inserted to the
//layout using a List Adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView : GridView

    //we will create two arrayLists for our grid view:
    // One for the animal names and the other for the animal pictures

    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        fillArrays()

        val adapter = AnimalsAdapter(this, nameList, imageList)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->

            Toast.makeText(applicationContext,
                "You have selected the ${nameList.get(position)}",
                Toast.LENGTH_LONG).show()
        }

    }


    //

    fun fillArrays(){
      nameList.add("Bird")
        nameList.add("Cat")
        nameList.add("Chicken")
        nameList.add("Dog")
        nameList.add("Fish")
        nameList.add("Monkey")
        nameList.add("Rabbit")
        nameList.add("Sheep")
        nameList.add("Lion")

        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.chicken)
        imageList.add(R.drawable.Dog)
        imageList.add(R.drawable.Fish)
        imageList.add(R.drawable.Monkey)
        imageList.add(R.drawable.Rabbit)
        imageList.add(R.drawable.Sheep)
        imageList.add(R.drawable.Lion)
    }
}