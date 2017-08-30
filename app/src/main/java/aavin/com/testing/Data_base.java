package aavin.com.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import kotlin.jvm.internal.Ref;

public class Data_base extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView textView;
    private DatabaseReference reference;
    private DatabaseReference databaseReference;
    private ValueEventListener valueEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);
        reference=FirebaseDatabase.getInstance().getReference().child("data");
        databaseReference=FirebaseDatabase.getInstance().getReference().child("data1");
        button=(Button)findViewById(R.id.butn_add);
        textView=(TextView)findViewById(R.id.edit_name);
        button.setOnClickListener(this);


        //  FirebaseDatabase firebaseDatabase= FirebaseDatabase.getInstance();

        //reference=firebaseDatabase.getReference("message");
       // reference.setValue("hi this a demo app");
//        reference.child("this is a data");



       /*\ reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.e("get data","getting");
                // String value = dataSnapshot.getValue(String.class);
                Model post = dataSnapshot.getValue(Model.class);
                Log.e("data",""+post);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e("error",""+databaseError.toException());

            }
        });*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        valueEventListener=new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Model model=dataSnapshot.getValue(Model.class);
                Log.e("model",""+model);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e("error",""+databaseError.toException());

            }

        };
        reference.addValueEventListener(valueEventListener);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.butn_add:
                Write_data();

        }
    }
    public void Write_data(){
        FirebaseDatabase.getInstance().getReference().child("user").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
              /*  Model model=dataSnapshot.getValue(Model.class);
                Log.e("model",""+model);
                String data=model.getName();
                Log.e("data",""+data);
*/
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

       /* Model model=new Model(id,name);
        reference.child("this is demo").child("data").setValue(model);*/


    }



}
