package android.example.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 1;


    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage1(String thx) {
        TextView priceTextView = (TextView) findViewById(R.id.thx_text_view);
        priceTextView.setText(thx);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void plus(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void minus(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int numberOfCoffees = 7;
        if (quantity <= 0) {
            displayMessage("Free");
            String thx = "";
            displayMessage1(thx);

        } else {
            String message = "Total: " + "$" + (numberOfCoffees * quantity);
            String thx = "Thank You!";
            displayMessage(message);
            displayMessage1(thx);
        }


    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void Price(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity);
        quantityTextView.setText("" + number);
    }


}
