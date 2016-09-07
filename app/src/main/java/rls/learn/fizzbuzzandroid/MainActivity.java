package rls.learn.fizzbuzzandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void fizzBuzz(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String inputString = editText.getText().toString();
        Integer fbNumber = Integer.parseInt(inputString);

        String message = FizzBuzz.getResult(fbNumber);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }

}
