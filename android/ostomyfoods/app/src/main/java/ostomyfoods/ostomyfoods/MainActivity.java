package ostomyfoods.ostomyfoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonPreventBlockages;
    Button buttonReduceDiarrhea;
    Button buttonCauseDiarrhea;
    Button buttonCauseGas;
    Button buttonCauseOdors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPreventBlockages = (Button)findViewById(R.id.buttonPreventBlockages);
        buttonReduceDiarrhea = (Button)findViewById(R.id.buttonReduceDiarrhea);
        buttonCauseDiarrhea = (Button)findViewById(R.id.buttonCauseDiarrhea);
        buttonCauseGas = (Button)findViewById(R.id.buttonCauseGas);
        buttonCauseOdors = (Button)findViewById(R.id.buttonCauseOdors);

        buttonPreventBlockages.setOnClickListener(this);
        buttonReduceDiarrhea.setOnClickListener(this);
        buttonCauseDiarrhea.setOnClickListener(this);
        buttonCauseGas.setOnClickListener(this);
        buttonCauseOdors.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, DetailsActivity.class);

        if (v == buttonPreventBlockages) {
            intent.putExtra("title", "Foods that can cause blockages");
            intent.putExtra("foods", FoodArrayFactory.createPreventBlockagesFoodArray());
        } else if (v == buttonReduceDiarrhea) {
            intent.putExtra("title", "Foods that reduce diarrhea");
            intent.putExtra("foods", FoodArrayFactory.createReduceDiarrheaFoodArray());
        } else if (v == buttonCauseDiarrhea) {
            intent.putExtra("title", "Foods that cause diarrhea");
            intent.putExtra("foods", FoodArrayFactory.createCauseDiarrheaFoodArray());
        } else if (v == buttonCauseGas) {
            intent.putExtra("title", "Foods that cause gas");
            intent.putExtra("foods", FoodArrayFactory.createCauseGasFoodArray());
        } else if (v == buttonCauseOdors) {
            intent.putExtra("title", "Foods that cause odors");
            intent.putExtra("foods", FoodArrayFactory.createCauseOdorsFoodArray());
        } else {
            intent.putExtra("title", "");
            intent.putExtra("foods", new String[] {});
        }

        startActivity(intent);
    }
}
