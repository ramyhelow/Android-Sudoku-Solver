package dev.ramyhelow.sudokusolver.adapters;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import dev.ramyhelow.sudokusolver.R;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private int[] numbers;
    private LayoutInflater inflater;

    public GridAdapter(Context context, int[] numbers){
        this.context = context;
        this.numbers = numbers;
        this.inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //TextView gridTvValue;
        EditText gridEtValue;

        convertView = inflater.inflate(R.layout.grid_item, null); // inflate the layout
        //gridTvValue = convertView.findViewById(R.id.grid_tv_value); // get the reference of ImageView
        gridEtValue = convertView.findViewById(R.id.grid_et_value); // get the reference of ImageView

        gridEtValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                numbers[position] = Integer.parseInt(s.toString());
            }
        });

        if(numbers[position]==0){
            //gridTvValue.setVisibility(View.INVISIBLE);
        }else{
            //gridTvValue.setText(numbers[position]+""); // set logo images
            //gridEtValue.setVisibility(View.INVISIBLE);
        }

        return convertView;
    }
}
