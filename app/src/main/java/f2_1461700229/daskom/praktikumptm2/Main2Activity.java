package f2_1461700229.daskom.praktikumptm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        double hasil = getIntent().getDoubleExtra("hasil", 0);

        Toast.makeText(this, "Luas Trapesium Adalah "+hasil, Toast.LENGTH_LONG).show();
    }
}
