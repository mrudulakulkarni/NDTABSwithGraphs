package com.example.admin.ndtabswithgraphs;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BargroupChartFragment extends Fragment {


    public BargroupChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_bargroup_chart, container, false);
        BarChart barChart = (BarChart)view.findViewById(R.id.bargroupchart);

        // HorizontalBarChart barChart= (HorizontalBarChart) findViewById(R.id.chart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));

        //BarDataSet dataset = new BarDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        // for create Grouped Bar chart
        ArrayList<BarEntry> group1 = new ArrayList<>();
        group1.add(new BarEntry(6f, 0));
        group1.add(new BarEntry(8f, 1));
        group1.add(new BarEntry(12f, 2));
        group1.add(new BarEntry(15f, 3));
        group1.add(new BarEntry(17f, 4));
        group1.add(new BarEntry(20f, 5));

        ArrayList<BarEntry> group2 = new ArrayList<>();
        group2.add(new BarEntry(7f, 0));
        group2.add(new BarEntry(8f, 1));
        group2.add(new BarEntry(10f, 2));
        group2.add(new BarEntry(12f, 3));
        group2.add(new BarEntry(15f, 4));
        group2.add(new BarEntry(10f, 5));

        BarDataSet barDataSet1 = new BarDataSet(group1, "Group 1");
        //barDataSet1.setColor(Color.rgb(0, 155, 0));
        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        BarDataSet barDataSet2 = new BarDataSet(group2, "Group 2");
        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        ArrayList<BarDataSet> datasets = new ArrayList<>();
        datasets.add(barDataSet1);
        datasets.add(barDataSet2);


        BarData data = new BarData(labels, datasets);
        // dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        barChart.setData(data);
        barChart.animateY(5000);



        return view;
    }


















    }


