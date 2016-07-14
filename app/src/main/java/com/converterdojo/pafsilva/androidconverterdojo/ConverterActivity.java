package com.converterdojo.pafsilva.androidconverterdojo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.converterdojo.pafsilva.androidconverterdojo.arabic2roman.ArabicToRomanConverter;
import com.converterdojo.pafsilva.androidconverterdojo.common.Converter;
import com.converterdojo.pafsilva.androidconverterdojo.common.ConverterFactory;
import com.converterdojo.pafsilva.androidconverterdojo.common.NumericSystem;

public class ConverterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtInput;
    private Spinner spinnerFrom;
    private Spinner spinnerTo;
    private Button btnConvert;
    private TextView txtAnswer;

    private String[] numericSystems = {NumericSystem.Arabic.toString(), NumericSystem.Roman.toString()};

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

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,
                numericSystems);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
        spinnerTo.setSelection(1);
        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String input = edtInput.getText().toString();
        Converter converter = selectConverter();

        txtAnswer.setText(converter.convert(input));
    }

    private Converter selectConverter() {
        NumericSystem from = NumericSystem.valueOf(spinnerFrom.getSelectedItem().toString());
        NumericSystem to = NumericSystem.valueOf(spinnerTo.getSelectedItem().toString());

        return ConverterFactory.createConverter(from, to);
    }
}
