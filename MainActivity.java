package rasmussen.alarmclockv10;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.FileOutputStream;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    public final static Vector<String> aList = new Vector<>(5,1);
    private String aFile = "Alarm_List";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
    }
    @Override
    protected void onResume(){
        super.onResume();

        Bundle data = getIntent().getExtras();
        if(data != null) {
            String aName = data.getString("Name");
            String aTime = data.getString("Time");

            aList.add(aName);
            aList.add(aTime);
        }

        ArrayAdapter adapter = new ArrayAdapter<>(this,R.layout.activity_listview,aList);

        ListView listView = (ListView) findViewById(R.id.alarm_name);
        listView.setAdapter(adapter);
    }
    @Override
    protected void onPause(){
        super.onPause();

 //       String aFile = "Alarm_List";
//        FileOutputStream alarmOut = openFileOutput(aFile,MODE_PRIVATE);
    }
    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    protected void onRestart() {

        super.onRestart();
    }

    public void newAlarm(View view){
        Intent newAlarm = new Intent(this,set_Alarms_Activity.class);
        startActivity(newAlarm);
    }

}
