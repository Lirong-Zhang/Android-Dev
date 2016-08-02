package app.com.example.android.learntrivia;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radio_g1;
    private static RadioGroup radio_g2;
    private static RadioGroup radio_g3;
    private static RadioGroup radio_g4;
    private static RadioGroup radio_g5;
    private static RadioGroup radio_g6;
    private static RadioGroup radio_g7;
    private static RadioButton radio_7;
    private static Button button_sbm1;
    private static Button button_sbm2;
    private static Button button_sbm3;
    private static TextView answer_1;
    private static TextView answer_2;
    private static TextView answer_3;
    private static TextView answer_4;
    private static TextView answer_5;
    private static TextView answer_6;
    private static TextView answer_7;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
    }

    public void onClickListenerButton(){
        radio_g1 = (RadioGroup)findViewById(R.id.rg_1);
        radio_g2 = (RadioGroup)findViewById(R.id.rg_2);
        radio_g3 = (RadioGroup)findViewById(R.id.rg_3);
        radio_g4 = (RadioGroup)findViewById(R.id.rg_4);
        radio_g5 = (RadioGroup)findViewById(R.id.rg_5);
        radio_g6 = (RadioGroup)findViewById(R.id.rg_6);
        radio_g7 = (RadioGroup)findViewById(R.id.rg_7);
        button_sbm1 = (Button)findViewById(R.id.button1);
        button_sbm2 = (Button)findViewById(R.id.button2);
        button_sbm3 = (Button)findViewById(R.id.button3);
        answer_1 = (TextView)findViewById(R.id.answer1);
        answer_2 = (TextView)findViewById(R.id.answer2);
        answer_3 = (TextView)findViewById(R.id.answer3);
        answer_4 = (TextView)findViewById(R.id.answer4);
        answer_5 = (TextView)findViewById(R.id.answer5);
        answer_6 = (TextView)findViewById(R.id.answer6);
        answer_7 = (TextView)findViewById(R.id.answer7);
        //answer_8 = (TextView)findViewById(R.id.answer8);
        
        radio_g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                resetAnswer(answer_1);
            }
        });
    }

        public void checkAnswer1(View view) {
            int selected_id = radio_g1.getCheckedRadioButtonId();
            if (selected_id == R.id.lemon) {
                show_answer_correct(answer_1);
            }
            else{
                show_answer_wrong(answer_1);
            }
        }

        public void checkAnswer2(View view) {
            int selected_id = radio_g2.getCheckedRadioButtonId();
            if (selected_id == R.id.august) {
                show_answer_correct(answer_2);
            }
            else{
                show_answer_wrong(answer_2);
            }
        }


        public void checkAnswer3(View view) {
            int selected_id = radio_g3.getCheckedRadioButtonId();
            if (selected_id == R.id.e) {
                show_answer_correct(answer_3);
            } else {
                show_answer_wrong(answer_3);
            }
        }

        public void checkAnswer4(View view) {
            int selected_id = radio_g4.getCheckedRadioButtonId();
            if (selected_id == R.id.m) {
                show_answer_correct(answer_4);
            } else {
                show_answer_wrong(answer_4);
            }
        }


        public void checkAnswer5(View view) {
            int selected_id = radio_g5.getCheckedRadioButtonId();
            if (selected_id == R.id.longest) {
                show_answer_correct(answer_5);
            } else {
                show_answer_wrong(answer_5);
            }
        }

        public void checkAnswer6(View view) {
            int selected_id = radio_g6.getCheckedRadioButtonId();
            if (selected_id == R.id.money) {
                show_answer_correct(answer_6);
            } else {
                show_answer_wrong(answer_6);
            }
        }

        public void checkAnswer7(View view) {
            int selected_id = radio_g7.getCheckedRadioButtonId();
            if (selected_id == R.id.max) {
                show_answer_correct(answer_7);
            } else {
                show_answer_wrong(answer_7);
            }
        }

        private void show_answer_correct(TextView answer_textView) {

                answer_textView.setTextColor(Color.BLUE);
                answer_textView.setText("Great!");

                //if (score < 1) {
                    score++;
                    Toast.makeText(getApplicationContext(), score + " points!", Toast.LENGTH_LONG).show();
                //}

        }

        private void show_answer_wrong(TextView answer_textView){
                answer_textView.setText("Oops, no point!");
                answer_textView.setTextColor(Color.MAGENTA);
                //Toast.makeText(this, score + " point!", Toast.LENGTH_LONG).show();

        }


        private void resetAnswer(TextView answer_textView){
            answer_textView.setText("");
        }
        //private void checkAnswer(int checked_radio_button_id, int correct_choice, ) {}

        /*button_sbm1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selected_id = radio_g1.getCheckedRadioButtonId();
                        RadioButton radio_b1 = (RadioButton) findViewById(selected_id);
                        //Toast.makeText(MainActivity.this,
                          //      radio_b.getText().toString(), Toast.LENGTH_SHORT).show();
                        checkAnswer();
                    }

                }
        );


    }

    private void checkAnswer(){
        if (radio_g.getCheckedRadioButtonId() == R.id.lemon ){
            answer.setTextColor(getResources().getColor(android.R.color.holo_green_light));
            answer.setText("Great!");

            if (score < 1) {
                score++;
                Toast.makeText(this, score + " points!", Toast.LENGTH_LONG).show();
            }
        }

        else if (radio_g.getCheckedRadioButtonId() ==  R.id.august ){
            answer.setTextColor(getResources().getColor(android.R.color.holo_green_light));
            answer.setText("Great!");

            if (score < 1) {
                score++;
                Toast.makeText(this, score + " points!", Toast.LENGTH_LONG).show();
            }
        }

        else if (radio_g.getCheckedRadioButtonId() ==  R.id.e ){
            answer.setTextColor(getResources().getColor(android.R.color.holo_green_light));
            answer.setText("Great!");

            if (score < 1) {
                score++;
                Toast.makeText(this, score + " points!", Toast.LENGTH_LONG).show();
            }
        }

        else {
            answer.setText("Oops, no point!");
            answer.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            Toast.makeText(this, score + " point!", Toast.LENGTH_LONG).show();
        }
    }*/

}
