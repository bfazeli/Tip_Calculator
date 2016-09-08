package edu.orangecoastcollege.cs273.bfazeli.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Associate the controller with the needed views
    private EditText amountEditText;
    private TextView amountTextView;
    private TextView tipTextView;
    private TextView percentTextView;
    private TextView taxTextView;
    private SeekBar percentSeekBar;
    private TextView totalTextView;

    // Associate the controller with the needed model
    RestaurantBill currentBill = new RestaurantBill();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect the controller with the widgets in our app
        amountEditText = (EditText) findViewById(R.id.amountEditText);
        amountTextView = (TextView) findViewById(R.id.amountTextView);
        tipTextView = (TextView) findViewById(R.id.tipTextView);
        percentTextView = (TextView) findViewById(R.id.percentTextView);
        taxTextView = (TextView) findViewById(R.id.taxTextView);
        percentSeekBar = (SeekBar) findViewById(R.id.percentSeekBar);
        totalTextView = (TextView) findViewById(R.id.totalTextView);

        // Define a listener for the amountEditText (onTextChanged)
        amountEditText.addTextChangedListener(amountTextChangedListener);
    }

    private TextWatcher amountTextChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // Try to get the amount from the amountEditText:
            try {
                double amount = Double.parseDouble(s.toString()) / 100.0;
                currentBill.setAmount(amount);
            } catch (NumberFormatException e) {
                amountEditText.setText("");
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
