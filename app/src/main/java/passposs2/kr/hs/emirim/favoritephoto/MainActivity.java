package passposs2.kr.hs.emirim.favoritephoto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    CheckBox checkSelect;
    RadioGroup rg;
    RadioButton radioKotori, radioRin, radioUmi, radioNico;
    Button butOk;
    ImageView imgvPhoto;
    TextView textQuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        textQuest=(TextView) findViewById(R.id.text_quest);
        rg = (RadioGroup) findViewById(R.id.rg);
        radioKotori=(RadioButton) findViewById(R.id.radio_kotori);
        radioRin=(RadioButton) findViewById(R.id.radio_rin);
        radioUmi=(RadioButton) findViewById(R.id.radio_umi);
        radioNico=(RadioButton) findViewById(R.id.radio_niko);
        butOk=(Button) findViewById(R.id.but_ok);
        imgvPhoto=(ImageView) findViewById(R.id.imgv_photo);
        checkSelect.setOnCheckedChangeListener(this);
        butOk.setOnClickListener(this);
    }   //end of onCreate

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvPhoto.setVisibility(View.VISIBLE);
        }else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvPhoto.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (rg.getCheckedRadioButtonId()){
            case R.id.radio_kotori :
                imgvPhoto.setImageResource(R.drawable.lovelivekotori);
                break;
            case R.id.radio_rin :
                imgvPhoto.setImageResource(R.drawable.loveliverin);
                break;
            case R.id.radio_niko :
                imgvPhoto.setImageResource(R.drawable.loveliveniko);
                break;
            case R.id.radio_umi :
                imgvPhoto.setImageResource(R.drawable.loveliveumi);
                break;
            default:
                Toast.makeText(this, "라디오 버튼이 하나도 선택이 안 되었네요 :(", Toast.LENGTH_SHORT).show();
        }
    }
}
