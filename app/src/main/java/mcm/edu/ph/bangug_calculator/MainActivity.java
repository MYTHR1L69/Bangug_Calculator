package mcm.edu.ph.bangug_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtVariable1, txtVariable2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo;
    TextView txtAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnModulo = findViewById(R.id.btnModulo);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        double txtVariable1=0;
        double txtVariable2=0;
        double txtAnswer=0;

        EditText txtVar1 = findViewById(R.id.txtVariable1);
        EditText txtVar2 = findViewById(R.id.txtVariable2);
        TextView txtAns = findViewById(R.id.txtAnswer);

        txtVariable1 = Double.parseDouble(txtVar1.getText().toString());
        txtVariable2 = Double.parseDouble(txtVar2.getText().toString());

        switch (view.getId()){
            case R.id.btnAdd:
                txtAnswer = txtVariable1 + txtVariable2;
                txtAns.setText(Double.toString(txtAnswer));
                break;
            case R.id.btnSubtract:
                txtAnswer = txtVariable1 - txtVariable2;
                txtAns.setText(Double.toString(txtAnswer));
                break;
            case R.id.btnMultiply:
                txtAnswer = txtVariable1 * txtVariable2;
                txtAns.setText(Double.toString(txtAnswer));
                break;
            case R.id.btnDivide:
                txtAnswer = txtVariable1 / txtVariable2;
                txtAns.setText(Double.toString(txtAnswer));
                break;
            case R.id.btnModulo:
                txtAnswer = txtVariable1 % txtVariable2;
                txtAns.setText(Double.toString(txtAnswer));
                break;
        }
    }
}