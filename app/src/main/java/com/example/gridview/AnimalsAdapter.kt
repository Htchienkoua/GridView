package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

//the adapter class for the GridView
class AnimalsAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {


    //to get the number of items ot display in the gridview
    override fun getCount(): Int {
        return nameList.size
    }

    //get the data for the specified dataset
    override fun getItem(p0: Int): Any? {
        return null
    }

    //get the position id for the specific items
    override fun getItemId(p0: Int): Long {
        return 0
    }

    //to get the design to display the grid items in the view(to inflate)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.custom_layout, parent,false)

        var animalName : TextView = view.findViewById(R.id.textView)
        var animalImage : ImageView = view.findViewById(R.id.imageView)

        //we now need to get the arrayList index position for each element accessed
        animalName.text= nameList.get(position)   //could also be written like this : animalName.text= nameList[position]
        animalImage.setImageResource(imageList.get(position))

        return view
    }
}