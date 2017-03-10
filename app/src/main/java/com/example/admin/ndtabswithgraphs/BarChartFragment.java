package com.example.admin.ndtabswithgraphs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class BarChartFragment extends Fragment {

    BarChart barChart;
    ArrayList<String> dates;
    Random randomnumber;
    ArrayList<BarEntry> barEntries;


    public BarChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bar_chart, container, false);
        barChart = (BarChart) view.findViewById(R.id.barchart);

        randomBarGraph("2016/06/12", "2016/07/12");

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        return view;
    }

    public void randomBarGraph(String Date1, String Date2)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date date1 = simpleDateFormat.parse(Date1);
            Date date2 = simpleDateFormat.parse(Date2);

            Calendar mdate1 = Calendar.getInstance();
            Calendar mdate2 = Calendar.getInstance();

            mdate1.clear();
            mdate2.clear();

            mdate1.setTime(date1);
            mdate2.setTime(date2);

            dates = new ArrayList<>();
            dates = getList(mdate1, mdate2);


            barEntries = new ArrayList<>();
            float max = 0f;
            float value = 0f;
            randomnumber = new Random();


            for (int i = 0; i < dates.size(); i++) {
                max = 100f;
                value = randomnumber.nextFloat() * max;
                barEntries.add(new BarEntry(value, i));
            }


        } catch (ParseException e) {
            e.printStackTrace();
        }

        BarDataSet barDataSet = new BarDataSet(barEntries, "dates");
        BarData barData = new BarData(dates, barDataSet);
        barChart.setData(barData);
        barChart.setDescription("My First BarGraph");

    }

    public ArrayList<String> getList(Calendar startDate, Calendar endDate)

    {
        ArrayList<String> list = new ArrayList<>();
        while (startDate.compareTo(endDate) <= 0) {
            list.add(getdate(startDate));
            startDate.add(Calendar.DAY_OF_MONTH, 1);
        }

        return list;
    }

    public String getdate(Calendar cl)
    {
        String currDate = cl.get(Calendar.YEAR) + "/" + (cl.get(Calendar.MONTH) + 1) + "/" + (Calendar.DAY_OF_MONTH);

        try
        {
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse(currDate);
            currDate = new SimpleDateFormat("yyyy/MM/dd").format(date);


        } catch (ParseException e) {
            e.printStackTrace();

        }
        return currDate;
    }



}






