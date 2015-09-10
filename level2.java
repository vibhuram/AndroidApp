package com.example.srivibhu.areyousmart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class level2 extends AppCompatActivity {

    int xyz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
    }

    public void lvl2_chkbut(View View){
        TextView lvl2_msg = (TextView) findViewById(R.id.lvl2_msg);
        EditText lvl2_ans = (EditText) findViewById(R.id.lvl2_ans);
        if (xyz == 0) {
            if (lvl2_ans.getText().toString().equals("science")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 1) {
            if (lvl2_ans.getText().toString().equals("terminator")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 2) {
            if (lvl2_ans.getText().toString().equals("armstrong")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 3) {
            if (lvl2_ans.getText().toString().equals("watch")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 4) {
            if (lvl2_ans.getText().toString().equals("domain")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 5) {
            if (lvl2_ans.getText().toString().equals("4153201518")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 6) {
            if (lvl2_ans.getText().toString().equals("be prepared")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 7) {
            if (lvl2_ans.getText().toString().equals("baggage")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 8) {
            if (lvl2_ans.getText().toString().equals("solve")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        } else if (xyz == 9) {
            if (lvl2_ans.getText().toString().equals("next")) {
                lvl2_msg.setText("correct... press next level to move on");
                xyz++;
            } else {
                lvl2_msg.setText("wrong...try again");
            }
        }
    }

    public void lvl2_nxtbut(View View){
        TextView lvl2_hnt = (TextView) findViewById(R.id.lvl2_hnt);
        TextView lvl2_msg = (TextView) findViewById(R.id.lvl2_msg);
        EditText lvl2_ans = (EditText) findViewById(R.id.lvl2_ans);
        if (xyz == 1){
            lvl2_hnt.setText("-3: whuplqdwrv");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 2){
            lvl2_hnt.setText("abc=1_2_3: 1_18_13_19_20_18_15_14_7");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 3){
            lvl2_hnt.setText("a=c,b=d: ycvej");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 4){
            lvl2_hnt.setText("abc=2_4_6: 8_30_26_2_18_28");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 5){
            lvl2_hnt.setText("123=abc: doctor");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 6){
            lvl2_hnt.setText("mirror the words: eb deraperp");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 7){
            lvl2_hnt.setText("unscramble: gabagge");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 8){
            lvl2_hnt.setText("-1: tpmwf");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 9){
            lvl2_hnt.setText("+1: mdws");
            lvl2_msg.setText("");
            lvl2_ans.setText("");
        } else if (xyz == 10){
            Intent i = new Intent(this, lvl3_ins.class);
            startActivity(i);
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_level2, menu);
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
