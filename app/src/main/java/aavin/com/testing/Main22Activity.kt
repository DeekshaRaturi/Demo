package aavin.com.testing

import android.R.attr.mode
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.R.attr.name
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.R.attr.name
import android.content.Context
import android.R.attr.name






class Main22Activity : AppCompatActivity() {
    private var button: Button? = null
  //  private var realm: Realm?=null
    private var textview:TextView?=null
    private var edit_name: EditText?=null
    private var context: Context?=null
  //  private var model:Data_Class?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context=this

        setContentView(R.layout.activity_main22)
        button = findViewById(R.id.butn_add) as Button
        textview=findViewById(R.id.display)as TextView
        edit_name=findViewById(R.id.edit_name)as EditText

      /*  try {
            realm = Realm.getDefaultInstance()
        } catch (e: Exception) {
            val configuration = RealmConfiguration.Builder(this).deleteRealmIfMigrationNeeded().build()
            realm = Realm.getInstance(configuration)
        }*/





        button!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
             //   Add()

            }
        })

    }

   /* fun addRecord() {
        realm.beginTransaction()

        val student = realm.createObject(Student::class.java)
        student.setRoll_no(Integer.parseInt(roll_no.getText().toString()))
        student.setName(name.getText().toString())

        realm.commitTransaction()
    }*/


      /*  fun Add(){
            realm!!.beginTransaction()
            model= realm!!.createObject(Data_Class::class.java)
            model!!.name
            Log.e("modle",""+model!!.name)
            realm!!.commitTransaction()
        }*/
}
