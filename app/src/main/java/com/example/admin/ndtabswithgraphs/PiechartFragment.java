package com.example.admin.ndtabswithgraphs;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PiechartFragment extends Fragment {


    public PiechartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_piechart, container, false);

        PieChart pieChart = (PieChart) view.findViewById(R.id.piechart);


        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(13f,3));
        entries.add(new Entry(18f,4));
        entries.add(new Entry(9f, 5));
        entries.add(new Entry(12f,6));


        PieDataSet dataset = new PieDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("Jul");

        PieData data = new PieData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //


        pieChart.setData(data);
        pieChart.animateY(5000);
        pieChart.setCenterTextSize(12);


        return view;


    }
    }


