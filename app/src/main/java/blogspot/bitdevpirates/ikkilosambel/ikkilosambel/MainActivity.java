package blogspot.bitdevpirates.ikkilosambel.ikkilosambel;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Ikkilo Sambel");
        }



    }



    /*
     public boolean onCreateOptionsMenu(Menu menu){

            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_menu, menu);

            return  true;

        }


    public void onCterasi(View view){

        ImageButton imgB_terasi = (ImageButton)findViewById(R.id.imgBsatu);

        TextView tampil = (TextView)findViewById(R.id.txtVterasi);

        Boolean tekan = false;

        if(tekan == true)
        tampil.setText("tersi di tekan");
        else
            tampil.setText("terasi tidak di tekan");



    }*/


}



