package ostomyfoods.ostomyfoods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String[] foods = intent.getStringArrayExtra("foods");
        StringBuilder sb = new StringBuilder();

        for (String food: foods) {
            sb.append(food);
            sb.append(System.getProperty("line.separator"));
        }

        ((TextView)findViewById(R.id.textViewFoods)).setText(sb.toString());System.getProperty("line.separator");
        ((TextView)findViewById(R.id.textViewTitle)).setText(intent.getStringExtra("title"));
    }
}
