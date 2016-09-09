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
    CheckBox cbWater, cbFire, cbGround, cbFly, cbGhost, cbDragon, cbGrass, cbBug, cbSteel;
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
        cbBug   =   (CheckBox) findViewById(R.id.checkBoxBug);
        cbDragon   =   (CheckBox) findViewById(R.id.checkBoxDragon);
        cbFire   =   (CheckBox) findViewById(R.id.checkBoxFire);
        cbFly    =   (CheckBox) findViewById(R.id.checkBoxFly);
        cbGhost   =   (CheckBox) findViewById(R.id.checkBoxGhost);
        cbGround   =   (CheckBox) findViewById(R.id.checkBoxGround);
        cbGrass   =   (CheckBox) findViewById(R.id.checkBoxGrass);
        cbSteel   =   (CheckBox) findViewById(R.id.checkBoxSteel);
        cbWater   =   (CheckBox) findViewById(R.id.checkBoxWater);
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

                String type = "Your Pokemon Type:\n";
                int lentype = type.length();
                if (cbBug.isChecked()) type+=cbBug.getText() + "\n";
                if (cbDragon.isChecked()) type+=cbDragon.getText() + "\n";
                if (cbFire.isChecked()) type+=cbFire.getText() + "\n";
                if (cbFly.isChecked()) type+=cbFly.getText() + "\n";
                if (cbGhost.isChecked()) type+=cbGhost.getText() + "\n";
                if (cbGround.isChecked()) type+=cbGround.getText() + "\n";
                if (cbGrass.isChecked()) type+=cbGrass.getText() + "\n";
                if (cbSteel.isChecked()) type+=cbSteel.getText() + "\n";
                if (cbWater.isChecked()) type+=cbWater.getText() + "\n";

                if (name == null || id == null || gym == null || type == null) {
                    tvResult.setText("You haven't fill the form completely");
                }
                else {
                    tvResult.setText("You joined with us!, your info :" + "\nYour name is " + name + " with ID number " + id + "." + "\nYou are from team " + gym + " in " + "\n" + type);
                }
            }
        });


    }
}
