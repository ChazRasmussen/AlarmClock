package rasmussen.alarmclockv10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class set_Alarms_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set__alarms_);
    }

    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @Override
    protected void onRestart() {

        super.onRestart();
    }

    public void saveAlarm(View view){
        Intent backToHome = new Intent(this,MainActivity.class);

        EditText edit_Name = (EditText) findViewById(R.id.enter_name);
        EditText edit_Time = (EditText) findViewById(R.id.enter_time);

        backToHome.putExtra("Name",edit_Name.getText().toString());
        backToHome.putExtra("Time",edit_Time.getText().toString());
        startActivity(backToHome);
    }

    public void cancel(View view){
        Intent backToHome = new Intent(this, MainActivity.class);
        startActivity(backToHome);
    }

}
