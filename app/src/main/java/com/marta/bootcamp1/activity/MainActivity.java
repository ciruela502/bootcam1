package com.marta.bootcamp1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.marta.bootcamp1.ApiInterface;
import com.marta.bootcamp1.DayApi;
import com.marta.bootcamp1.Days;
import com.marta.bootcamp1.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "onCreate";
    public TextView tv1name;
    public TextView tv2name;
    public TextView tv3name;
    public TextView tv4name;
    public TextView tv5name;
    public TextView tv6name;
    public TextView tv7name;

    public TextView tv1app;
    public TextView tv2app;
    public TextView tv3app;
    public TextView tv4app;
    public TextView tv5app;
    public TextView tv6app;
    public TextView tv7app;

    public Days days;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface api = DayApi.getClient().create(ApiInterface.class);

        Call<Days> call = api.days();
        call.enqueue(new Callback<Days>() {

            @Override
            public void onResponse(Call<Days> call, Response<Days> response) {
                days = response.body();
                Log.d(TAG, "onResponse: pobralo");
                makeView();
            }

            @Override
            public void onFailure(Call<Days> call, Throwable t) {
                Log.d(TAG, "onFailure: failure");
            }
        });

    }

    public void makeView (){
        tv1name = (TextView)findViewById(R.id.TextView_name1);
        tv2name = (TextView)findViewById(R.id.TextView_name2);
        tv3name = (TextView)findViewById(R.id.TextView_name3);
        tv4name = (TextView)findViewById(R.id.TextView_name4);
        tv5name = (TextView)findViewById(R.id.TextView_name5);
        tv6name = (TextView)findViewById(R.id.TextView_name6);
        tv7name = (TextView)findViewById(R.id.TextView_name7);

        tv1app = (TextView)findViewById(R.id.TextView_app1);
        tv2app = (TextView)findViewById(R.id.TextView_app2);
        tv3app = (TextView)findViewById(R.id.TextView_app3);
        tv4app = (TextView)findViewById(R.id.TextView_app4);
        tv5app = (TextView)findViewById(R.id.TextView_app5);
        tv6app = (TextView)findViewById(R.id.TextView_app6);
        tv7app = (TextView)findViewById(R.id.TextView_app7);

        tv1name.setText(days.days.get(0).name);
        tv1app.setText(days.days.get(0).app +"\n" + days.days.get(0).topic +", \n"+ days.days.get(0).plan);

        tv2name.setText(days.days.get(1).name);
        tv2app.setText(days.days.get(1).app +"\n" + days.days.get(1).topic +", \n"+ days.days.get(1).plan);

        tv3name.setText(days.days.get(2).name);
        tv3app.setText(days.days.get(2).app +"\n" + days.days.get(2).topic +", \n"+ days.days.get(2).plan);

        tv4name.setText(days.days.get(3).name);
        tv4app.setText(days.days.get(3).app +"\n" + days.days.get(3).topic +", \n"+ days.days.get(3).plan);

        tv5name.setText(days.days.get(4).name);
        tv5app.setText(days.days.get(4).app +"\n" + days.days.get(4).topic +", \n"+ days.days.get(4).plan);

        tv6name.setText(days.days.get(5).name);
        tv6app.setText(days.days.get(5).app +"\n" + days.days.get(5).topic +", \n"+ days.days.get(5).plan);

        tv7name.setText(days.days.get(6).name);
        tv7app.setText(days.days.get(6).app +"\n" + days.days.get(6).topic +", \n"+ days.days.get(6).plan);


    }
}
