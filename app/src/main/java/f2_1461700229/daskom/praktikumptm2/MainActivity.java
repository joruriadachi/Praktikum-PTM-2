package f2_1461700229.daskom.praktikumptm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MainActivityView {
    EditText input1, input2, input3;
    Button ok;
    MainActivityPresenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        input1 = findViewById(R.id.et_nilai1);
        input2 = findViewById(R.id.et_nilai2);
        input3 = findViewById(R.id.et_nilai3);
        ok = findViewById(R.id.btn_ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.olahData(input1.getText().toString(), input2.getText().toString(), input3.getText().toString());
            }
        });
    }

    @Override
    public void setHasil(double hitung) {
        Intent intent = new Intent(MainActivity. this, Main2Activity.class);
        intent.putExtra("hasil", hitung);
        startActivity(intent);


    }
}
