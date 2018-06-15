package com.omaroid.dagger2.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.omaroid.dagger2.App;
import com.omaroid.dagger2.R;
import com.omaroid.dagger2.model.SharedPrefModel;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {
    @Inject
    Context context;
    @BindView(R.id.tvAppName)
    TextView tvAppName;
    @Inject
    SharedPrefModel sharedPrefModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        sharedPrefModel.putData("test", 123);
        tvAppName.setText(context.getString(R.string.app_name)+" "+sharedPrefModel.getData("test"));
    }
}
