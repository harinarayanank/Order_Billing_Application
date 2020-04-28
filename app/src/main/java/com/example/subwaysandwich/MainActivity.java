package com.example.subwaysandwich;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView date,time,tdrink,tlength,cust,top,obill,heading;

    RadioGroup toppings,length;
    RadioButton len1,len2,paneer,mush,onion,jalapeno;
    EditText customer;
    Button order;
    AutoCompleteTextView autoCompleteTextView;

    String text;

    private int blen15=100 , blen30=200 , top1=50 , top2=30 , drinks=40 , total=0;

    private static final String[] drink = new String[] {"Coke" , "Pepsi" , "Fanta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.auto);
        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,drink);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);


        date=(TextView)findViewById(R.id.date);
        time=(TextView)findViewById(R.id.time);
        tdrink=(TextView)findViewById(R.id.drink);
        obill=(TextView)findViewById(R.id.head);
        heading=(TextView)findViewById(R.id.head1);

        String cdate = DateFormat.getDateInstance().format(new Date());
        date.setText(cdate);

        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
        String ctime = simpleDateFormat.format(d);
        time.setText(ctime);

        tlength=(TextView)findViewById(R.id.length);
        cust=(TextView)findViewById(R.id.tcname);
        top=(TextView)findViewById(R.id.ttop);

        customer=(EditText)findViewById(R.id.ecname);

        length=(RadioGroup)findViewById(R.id.rlength);
        toppings=(RadioGroup)findViewById(R.id.rtop);

        len1=(RadioButton)findViewById(R.id.rlen1);
        len2=(RadioButton)findViewById(R.id.rlen2);
        paneer=(RadioButton)findViewById(R.id.rpaneer);
        mush=(RadioButton)findViewById(R.id.rmush);
        onion=(RadioButton)findViewById(R.id.ronion);
        jalapeno=(RadioButton)findViewById(R.id.rjalapeno);

        order=(Button)findViewById(R.id.button1);

//        text=this.autoCompleteTextView.getEditableText().toString();

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                if(len1.isChecked() && paneer.isChecked()  && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen15+top1+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len1.getText().toString() + " and topping "+paneer.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }

                else if(len1.isChecked() && mush.isChecked() && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen15+top1+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len1.getText().toString() + " and topping "+mush.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }

                else if(len1.isChecked() && onion.isChecked() && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen15+top2+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len1.getText().toString() + " and topping "+onion.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }

                else if(len1.isChecked() && jalapeno.isChecked() && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen15+top2+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len1.getText().toString() + " and topping "+jalapeno.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }
                else if(len2.isChecked() && paneer.isChecked() && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen30+top1+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len2.getText().toString() + " and topping "+paneer.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }
                else if(len2.isChecked() && mush.isChecked() && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen30+top1+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len2.getText().toString() + " and topping "+mush.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }

                else if(len2.isChecked() && onion.isChecked() && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen30+top2+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len2.getText().toString() + " and topping "+onion.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }
                else if(len2.isChecked() && jalapeno.isChecked() && autoCompleteTextView.getText().toString().equals("Coke") ^
                        autoCompleteTextView.getText().toString().equals("Pepsi") ^ autoCompleteTextView.getText().toString().equals("Fanta"))
                {
                    total=blen30+top2+drinks;
                    alertDialog.setTitle("Order Details");
                    alertDialog.setMessage("Your Name is : "+customer.getText().toString() +
                            "\n" + "You have ordered bread " +len2.getText().toString() + " and topping "+jalapeno.getText().toString() + " with drink " +autoCompleteTextView.getText().toString()  +
                            "\n" + "Your Total cost is " +total);

                }
                alertDialog.show();








            }
        });

}
}

