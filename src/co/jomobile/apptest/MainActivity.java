package co.jomobile.apptest;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements OnClickListener {
	Button btnPausa;
	Button btnRepro;
	MediaPlayer audio1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        LinearLayout layout = new LinearLayout(this);
        btnRepro = new Button(this);
        btnRepro.setText("Reproducir");
        btnPausa = new Button(this);
        btnPausa.setText("Pausa");
        btnRepro.setOnClickListener(this);
        btnPausa.setOnClickListener(this);
        layout.addView(btnRepro);
        layout.addView(btnPausa);
        setContentView(layout);
        audio1 =  MediaPlayer.create(this, R.raw.s1 );
        audio1.setLooping(true);
    }

    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		if(v==btnRepro){
			audio1.start();
		}else{
			if(v==btnPausa){
				audio1.pause();
			}
		}
		
	}

    
    
}
