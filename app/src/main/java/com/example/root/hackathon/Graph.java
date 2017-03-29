package com.example.root.hackathon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Graph extends AppCompatActivity {
private static String TAG ="Graph";
    PieChart pieChart;
    float ydata[]= new float[50];
    String xdata[]=new String[50];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent i = getIntent();
        String s = i.getStringExtra("s");
        String s1 = i.getStringExtra("s1");
        String s2 = i.getStringExtra("s2");
        String s3 = i.getStringExtra("s3");
        String s4 = i.getStringExtra("s4");
        String s5 = i.getStringExtra("s5");
        String s6 = i.getStringExtra("s6");
        String s7 = i.getStringExtra("s7");
        String s8 = i.getStringExtra("s8");
        String s9 = i.getStringExtra("s9");
        String s10 = i.getStringExtra("s10");
        ydata[0] =Float.parseFloat(s1);
        ydata[1] = Float.parseFloat(s5);
        ydata[2]=Float.parseFloat(s2)+Float.parseFloat(s3)+Float.parseFloat(s9)+Float.parseFloat(s10)+Float.parseFloat(s4);
        ydata[3]=Float.parseFloat(s6);
        ydata[4]=Float.parseFloat(s7);
        ydata[5]=Float.parseFloat(s8);
        ydata[6]=Float.parseFloat(s);
                //,Float.parseFloat(s2),Float.parseFloat(s3),Float.parseFloat(s4),Float.parseFloat(s5),Float.parseFloat(s6),Float.parseFloat(s7),Float.parseFloat(s8),Float.parseFloat(s9),Float.parseFloat(s10),};
         xdata[0]="Green house gases";
        xdata[1]="Copper Amount";
        xdata[2]="Other Metals(aluminium,Paladium,Arsenic,Cadmium)";
       xdata[3]= " Gold Amount";
        xdata[4]=" Lead Amount";
        xdata[5]=" Mercury Amount";
        xdata[6]=" Steel Amount";



        //," Aliminium Amount","Arsenic Amount ","Cadmium Amount","Copper Amount","Gold Amount","Lead Amount","Mercury Amount","Palladium Amount","Platinium Amount","Steel Amount"};


        Log.d(TAG, "oncreate:create chrt");
        pieChart = (PieChart) findViewById(R.id.idpie);

        pieChart.setDescription("Weight in kgs ");
        pieChart.setRotationEnabled(true);
        pieChart.setHoleRadius(15f);
        pieChart.setTransparentCircleRadius(50f);
        pieChart.setTransparentCircleAlpha(0);
        pieChart.setCenterText("Emissions");
        pieChart.setCenterTextSize(10);
        pieChart.setDescriptionTextSize(15);
        pieChart.setDrawEntryLabels(true);
        pieChart.setEntryLabelTextSize(10);
        pieChart.setEntryLabelColor(getColor(R.color.colorPrimary));
        addDataSet(pieChart);


        pieChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                Log.d(TAG,"select value from chart");
                Log.d(TAG,"onvalueselected" +e.toString());
                Log.d(TAG,"onvalueselected:" +h.toString());

                int pos1=e.toString().indexOf("(sum):");
              String sale=  e.toString().substring(pos1+10);

                for(int i=0;i<ydata.length;i++){
                    if(ydata[i]==Float.parseFloat(sale)){
                        pos1=i;
                        break;
                    }
                }
                String employee=xdata[pos1+1];

            }


            @Override
            public void onNothingSelected() {

            }
        });
    }
    private void setupPiechart(PieChart pieChart)
    {

    }
    private void addDataSet(PieChart pieChart) {

        Log.d(TAG,"addet");
        ArrayList<PieEntry> al=new ArrayList<>();
        ArrayList<String> al1=new ArrayList<>();
for(int i=0;i<ydata.length;i++)

 if (ydata[i]>0.0) {

    al.add(new PieEntry(ydata[i], xdata[i]));
}
else
 {

 }

for (int i=1;i<xdata.length;i++)
{
    al1.add((xdata[i]));
}
PieDataSet piechart=new PieDataSet(al,"Emissions of E-Waste");
        piechart.setSliceSpace(15);
        piechart.setValueTextSize(20);
        piechart.setColor(getColor(R.color.colorPrimaryDark));
    //    pieChart.setUsePercentValues(true);

        ArrayList<Integer> colors=new ArrayList<>();
      /*  colors.add(Color.BLUE);
        colors.add(Color.CYAN);
        colors.add(Color.rgb(300,60,200));
        colors.add(Color.GREEN);
        colors.add(Color.RED);
        colors.add(Color.YELLOW);
        colors.add(Color.GREEN);
        colors.add(Color.MAGENTA);
        colors.add(Color.rgb(1,8,4));
        colors.add(Color.rgb(110,80,200));*/
      for(int c: ColorTemplate.VORDIPLOM_COLORS)
          colors.add(c);
        for(int c: ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for(int c: ColorTemplate.COLORFUL_COLORS)
            colors.add(c);
        for(int c: ColorTemplate.MATERIAL_COLORS)
            colors.add(c);
        for(int c: ColorTemplate.PASTEL_COLORS)
            colors.add(c);
        for(int c: ColorTemplate.LIBERTY_COLORS)
            colors.add(c);


        piechart.setColors(colors);
        Legend legend=pieChart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);

        legend.setPosition(Legend.LegendPosition.LEFT_OF_CHART);

        PieData piedata=new PieData(piechart);
        pieChart.setData(piedata);
        pieChart.invalidate();
      }



    /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/

    }


