package aavin.com.testing;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  //  private Realm realm;
    private RecyclerView recyclerView;
 //   private static ArrayList<Model> list = new ArrayList<>();
   // private Adapter adapter;
    private static MainActivity instance;
    private AlertDialog.Builder subDialog;
    private Context context;
    private Button button;
  //  private Model model;
    private static int id=0;
    private TextView textView;
    private EditText editText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        initialize_data();
      //  RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(context).build();

        //realm=Realm.getDefaultInstance();




        // realm=Realm.getInstance(context);
        /*  try {
              realm=Realm.getDefaultInstance();
          }
          catch (Exception e){
              RealmConfiguration configuration=new RealmConfiguration.Builder(context).deleteRealmIfMigrationNeeded().build();
              realm=Realm.getInstance(configuration);
          }*/
        instance = this;
      //  model=new Model();
    }

    public void initialize_data(){

        button=(Button)findViewById(R.id.butn_add);
        editText=(EditText)findViewById(R.id.edit_name);
        textView=(TextView)findViewById(R.id.display);
       // recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        button.setOnClickListener(this);

       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
       // adapter = new Adapter(list, context);
       // recyclerView.setAdapter(adapter);
    }

    //method to add data

    /*   public void add_data_to_database(Model model){
       *//* realm.beginTransaction();
        Model model2=realm.createObject(Model.class);
           Log.e("model",""+model2);
           model2.setId(id);
        model2.setName(model.getName());
           Log.e("name",model.getName());
        model2.setAddress(model.getAddress());
           Log.e("addrss",model.getAddress());
           list.add(model2);
        realm.commitTransaction();
        adapter.notifyDataSetChanged();
           id++;*//*

       }*/

       //update data method
     /*  public void update_database(Model model,int position,int first_id) {
        *//*   Model model1 = realm.where(Model.class).equalTo("id", first_id).findFirst();
           Log.e("model",""+model1);
           realm.beginTransaction();
           model1.setId(id);
           model1.setName(model.getName());
           Log.e("name", model.getName());
           model1.setAddress(model.getAddress());
           realm.commitTransaction();
           list.set(position,model1);
*//*
       }*/

    //for opening dialog
    public void dialog() {
        subDialog = new AlertDialog.Builder(MainActivity.this)
                .setMessage("Please enter all the details")
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dlg2, int which) {
                        dlg2.cancel();
                    }
                });
        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        View view = inflater.inflate(R.layout.dialog, null);
        AlertDialog.Builder mainDialog = new AlertDialog.Builder(MainActivity.this);
        mainDialog.setView(view);
        //mainDialog.show();

        final EditText Name = (EditText) view.findViewById(R.id.et_name);
        final EditText address = (EditText) view.findViewById(R.id.et_address);

        /*if (model != null) {

//            Name.setText(model.getName());
//            address.setText(model.getAddress());
//            Log.e("getname", model.getName() + "" + model.getAddress());

        } else {
            Log.e("empty", "empty");
        }
*/

        mainDialog.setCancelable(false)
                .setPositiveButton("Ok", null)
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });


        final AlertDialog dialog = mainDialog.create();
        dialog.show();
        Button b = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(Name.getText().toString()) && !TextUtils.isEmpty(address.getText().toString())) {

                 /*   Model detail = new Model();
                    detail.setName(Name.getText().toString());
                    detail.setAddress(address.getText().toString());
                    Log.e("setname", Name.getText().toString() + "" + address.getText().toString());
                    if (model == null) {
                        Log.e("null", "not  null");
                        //add_data_to_database(detail);
                    }
                    else {
                        Log.e("null", "null");
                       // add_data_to_database(detail);
                       //update_database(detail,position,model.getId());
                        Log.e("id",""+model.getId());
                        dialog.cancel();
                    }*/
                }
                else {
                    subDialog.show();
                }
            }

        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.butn_add:
                //dialog();
         //       add();
                break;


        }

    }
    private void add(){
     /*   realm.beginTransaction();
        Model model = realm.createObject(Model.class);

        model.setName(editText.getText().toString());
//        student.setRoll_no(Integer.parseInt(roll_no.getText().toString()));
//        student.setName(name.getText().toString());

        realm.commitTransaction();*/
    }
}
