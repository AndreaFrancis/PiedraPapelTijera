package org.scystl.piedrapapeltijera;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    private int numNegro = 0;
    private int numBlanco = 0;
    private Random ran;
    private TextView textoNegro;
    private TextView textoBlanco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoNegro = (TextView)findViewById(R.id.negro);
        textoBlanco = (TextView)findViewById(R.id.blanco);
        ran = new Random();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void lanzar(View view) {
        cambiarValores();
    }

    private void cambiarValores() {
        numNegro = (int)(ran.nextDouble() * 3 + 1);
        numBlanco = (int)(ran.nextDouble() * 3 + 1);
        textoNegro.setText(String.valueOf(numNegro));
        textoBlanco.setText(String.valueOf(numBlanco));
    }

}
