package id.sch.smktelkom_mlg.tugas01.xiirpl1033.newrecruit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etId;
    RadioButton rbV, rbM, rbI;
    Button bOk;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName  =   (EditText) findViewById(R.id.editName);
        etId    =   (EditText) findViewById(R.id.editId);
        rbV     =   (RadioButton) findViewById(R.id.radioButtonV);
        rbM     =   (RadioButton) findViewById(R.id.radioButtonM);
        rbI     =   (RadioButton) findViewById(R.id.radioButtonI);

        bOk =   (Button) findViewById(R.id.buttonOk);
        tvResult = (TextView) findViewById(R.id.textViewResult);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String id = etId.getText().toString();

                String gym = null;
                if (rbV.isChecked()) {
                    gym = rbV.getText().toString();
                }
                else if(rbM.isChecked()) {
                    gym = rbM.getText().toString();
                }
                else if(rbI.isChecked()) {
                    gym = rbI.getText().toString();
                }



                if (name == null || id == null || gym == null) {
                    tvResult.setText("You haven't fill the form completely");
                }
                else {
                    tvResult.setText("You joined with us!, your info :" + "\nYour name is " + name + " with ID number " + id + "." + "\nYou are from team " + gym + " in ");
                }
            }
        });


    }
}
