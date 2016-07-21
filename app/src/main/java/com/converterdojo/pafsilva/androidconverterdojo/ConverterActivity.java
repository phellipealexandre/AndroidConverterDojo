package com.converterdojo.pafsilva.androidconverterdojo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.converterdojo.pafsilva.androidconverterdojo.converter.ArabicToRomanConverter;
import com.converterdojo.pafsilva.androidconverterdojo.converter.NumericConverter;
import com.converterdojo.pafsilva.androidconverterdojo.converter.RomanToArabicConverter;

public class ConverterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtInput;
    private Spinner spinnerFrom;
    private Spinner spinnerTo;
    private Button btnConvert;
    private TextView txtAnswer;

    private String[] numericSystems = {"Arabic", "Roman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        initComponents();
    }

    private void initComponents() {
        edtInput = (EditText) findViewById(R.id.edtInput);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        txtAnswer = (TextView) findViewById(R.id.txtAnswer);
        spinnerFrom = (Spinner) findViewById(R.id.spinnerFrom);
        spinnerTo = (Spinner) findViewById(R.id.spinnerTo);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,
                numericSystems);

        spinnerFrom.setAdapter(adapter);

        spinnerTo.setAdapter(adapter);
        spinnerTo.setSelection(1);
        btnConvert.setOnClickListener(this);
    }

    //TODO: Implementar aqui o clique do botão
    @Override
    public void onClick(View view) {
        String input = edtInput.getText().toString();

        String numericBaseFrom = (String)spinnerFrom.getSelectedItem();
        String numericBaseTo = spinnerTo.getSelectedItem().toString();

        NumericConverter converter = null;
        if (numericBaseFrom.equals("Arabic") && numericBaseTo.equals("Roman")) {
            converter = new ArabicToRomanConverter();
        }

        if (numericBaseFrom.equals("Roman") && numericBaseTo.equals("Arabic")) {
            converter = new RomanToArabicConverter();
        }

        if (input.length() > 0){
            txtAnswer.setText(converter.convert(input));
        } else{
            txtAnswer.setText("Empty Number!");
        }
    }
}
