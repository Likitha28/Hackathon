package com.example.root.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;

public class Hazard extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState)

    {
        final EditText et1,et2,et3,et4,et5,et6,et7;
        final TextView tv1,textView1;
        Button button;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazard);
        /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        et1=(EditText) findViewById(R.id.edittext);
        et2=(EditText) findViewById(R.id.editText2);
        et3=(EditText) findViewById(R.id.editText3);
        et4=(EditText) findViewById(R.id.editText4);
        et5=(EditText) findViewById(R.id.editText5);
        et6=(EditText) findViewById(R.id.editText6);
        et7=(EditText) findViewById(R.id.editText7);
        //tv1=(TextView) findViewById(R.id.tv);
        button=(Button )findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double t1=0;double t2=0;double t3=0;double t4=0;double t5=0;double t6=0;double t7=0;
                t1= Integer.parseInt(et1.getText().toString());
                t2= Integer.parseInt(et2.getText().toString());
                t3= Integer.parseInt(et3.getText().toString());
                t4= Integer.parseInt(et4.getText().toString());
                t5= Integer.parseInt(et5.getText().toString());
                t6= Integer.parseInt(et6.getText().toString());
                t7= Integer.parseInt(et7.getText().toString());


                Laptop computer=new Laptop();
                Computer computer1=new Computer(t3);
                CRT crt=new CRT(t2);
                Displays dis=new Displays(t4);
                Mobile mob=new Mobile(t5);
                Image img=new Image(t6);
                Other oth=new Other(t7);



                computer.calculatebyComponentCount(t1);
                computer1.calculatebyComponentCount(t3);
                crt.calculatebyComponentCount(t2);
                dis.calculatebyComponentCount(t4);
                mob.calculatebyComponentCount(t5);
                img.calculatebyComponentCount(t6);
                oth.calculatebyComponentCount(t7);

                double d4=computer.getSteelAmount()+computer1.getSteelAmount()+crt.getSteelAmount()+dis.getSteelAmount()+img.getSteelAmount()+oth.getSteelAmount()+mob.getSteelAmount();
                double d5= computer.getGreenHouseGasesAmount()+computer1.getGreenHouseGasesAmount()+img.getGreenHouseGasesAmount()+dis.getGreenHouseGasesAmount()+mob.getGreenHouseGasesAmount()+oth.getGreenHouseGasesAmount()+crt.getGreenHouseGasesAmount();
                double d6=   computer.getAluminumAmount()+computer1.getAluminumAmount()+crt.getAluminumAmount()+dis.getAluminumAmount()+mob.getAluminumAmount()+img.getAluminumAmount()+oth.getAluminumAmount();
                double d7= computer.getArsenicAmount()+computer1.getArsenicAmount()+crt.getArsenicAmount()+dis.getArsenicAmount()+mob.getArsenicAmount()+img.getArsenicAmount()+oth.getArsenicAmount();
                double d8= computer.getCadmiumAmount()+computer1.getCadmiumAmount()+crt.getCadmiumAmount()+dis.getCadmiumAmount()+mob.getCadmiumAmount()+img.getCadmiumAmount()+oth.getCadmiumAmount();
                double d9= computer.getCopperAmount()+computer.getCopperAmount()+computer1.getCopperAmount()+crt.getCopperAmount()+dis.getCopperAmount()+img.getCopperAmount()+mob.getCopperAmount()+oth.getCopperAmount();
                double d10= computer.getGoldAmount()+ computer1.getGoldAmount()+crt.getGoldAmount()+dis.getGoldAmount()+img.getGoldAmount()+mob.getGoldAmount()+oth.getGoldAmount();
                double d11= computer.getLeadAmount()+computer1.getLeadAmount()+crt.getLeadAmount()+dis.getLeadAmount()+img.getLeadAmount()+mob.getLeadAmount()+oth.getLeadAmount();
                double d12=  computer.getMercuryAmount()+computer1.getMercuryAmount()+crt.getMercuryAmount()+dis.getMercuryAmount()+img.getMercuryAmount()+mob.getMercuryAmount()+oth.getMercuryAmount();
                double d13= computer.getPalladiumAmount()+computer1.getPalladiumAmount()+crt.getPalladiumAmount()+dis.getPalladiumAmount()+img.getPalladiumAmount()+mob.getPalladiumAmount()+oth.getPalladiumAmount();
                double d14=  computer.getPlatinumAmount()+  computer1.getPlatinumAmount()+  crt.getPlatinumAmount()+ dis.getPlatinumAmount()+ img.getPlatinumAmount()+ mob.getPlatinumAmount()+ oth.getPlatinumAmount();

                String s=String.format("%.2f",d4);
                String s1=String.format("%.3f",d5);
                String s2=String.format("%.3f",d6);
                String s3=String.format("%.3f",d7);
                String s4=String.format("%.3f",d8);
                String s5=String.format("%.3f",d9);
                String s6=String.format("%.3f",d10);
                String s7=String.format("%.3f",d11);
                String s8=String.format("%.3f",d12);
                String s9=String.format("%.3f",d13);
                String s10=String.format("%.3f",d14);


               // String result = "\n Green house gases :"+s1+ "kgs\n"+" \n Aliminium Amount :" + s2+"kgs\n" +"\n Arsenic Amount : "+s3+ "kgs\n"+" \n Cadmium Amount: "+s4+  "kgs\n"+"\n Copper Amount : " +s5+" kgs\n"+"\n Gold Amount: "+s6+  "kgs\n"+"\n Lead Amount:  "+s7+ "kgs\n"+"\n Mercury Amount:  "+s8+  "kgs\n"+"\n Palladium Amount: " +s9+  "kgs\n"+"\n Platinium Amount: " +s10+"kgs\n"+"\nSteel Amount"+s+"kgs\n";

Intent i =new Intent(getApplicationContext(),Graph.class);
                i.putExtra("s",s);
                i.putExtra("s1",s1);
                i.putExtra("s2",s2);
                i.putExtra("s3",s3);
                i.putExtra("s4",s4);
                i.putExtra("s5",s5);
                i.putExtra("s6",s6);
                i.putExtra("s7",s7);
                i.putExtra("s8",s8);
                i.putExtra("s9",s9);
                i.putExtra("s10",s10);
                startActivity(i);





             /*   Intent i = new Intent(getApplicationContext(), Result.class);
                i.putExtra("result", result);
                startActivity(i);
                */
            }
        });

    }

    //Intent i=new Intent(this,MainActivity.class);


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
