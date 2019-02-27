package com.example.medul.math;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medul.math.Model.Question;

import java.util.ArrayList;

public class SubLevel1 extends AppCompatActivity {

    RadioGroup rg;
    //    RadioButton rb;
    Data data ;
    ArrayList<Question> questionArrayList = new ArrayList<>();
    RadioButton answer4 , answer5, answer6 ;
    int totalMark = 0 ;
    int questionIndex = 0 ;
    int questionCount = 0 ;
    int totalQuestionCount = 0;
    int totalCorrectAnswer = 0 ;
    TextView questionText ;
    String givenAnswerByUser ="" ;
    Button btnSubmit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlevel1);
        data= new Data();
        data.addQuestion();
        questionArrayList = data.getAllQuestion();
        totalQuestionCount = questionArrayList.size();
        rg = (RadioGroup) findViewById(R.id.rGroup);
        answer4 = (RadioButton) findViewById(R.id.radioButton1);
        answer5 = (RadioButton) findViewById(R.id.radioButton2);
        answer6 = (RadioButton) findViewById(R.id.radioButton3);
        questionText = (TextView) findViewById(R.id.txt_question);
        btnSubmit = (Button) findViewById(R.id.btn_suubmit);
        questionSet(questionIndex);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton1:
                        givenAnswerByUser = answer4.getText().toString();
                        break ;
                    case R.id.radioButton2 :
                        givenAnswerByUser = answer5.getText().toString();
                        break ;
                    case R.id.radioButton3 :
                        givenAnswerByUser = answer6.getText().toString();
                        break ;
                    default:
                        break;
                }
            }
        });


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmitClick();
            }
        });

    }

    private void questionSet(int questionNo) {
        String[] answerArray = questionArrayList.get(questionNo).getAnswer() ;
        questionText.setText(questionArrayList.get(questionNo).getQuestionText());
        answer4.setText(answerArray[0]);
        answer5.setText(answerArray[1]);
        answer6.setText(answerArray[2]);

    }

    private void onSubmitClick(){

        questionCount ++;
        // find  if the selected answer is right or wrong

        if(questionCount<questionArrayList.size()){
            rg.clearCheck();
            if(givenAnswerByUser.equalsIgnoreCase(questionArrayList.get(questionIndex).getCorrectAnswer())){
                // If Correct Than Add Mark To Total mark.
                totalMark += questionArrayList.get(questionIndex).getMark();
                totalCorrectAnswer++;
                Toast.makeText(SubLevel1.this, "Right Answer", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(SubLevel1.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
            }

            //set the next question to the view
            questionIndex++;
            questionSet(questionIndex);

            // If total number of question limit reach than show the user a dialog with total mark and total correct answer

        }
        else {
            Toast.makeText(SubLevel1.this,"Total Mark: "+ totalMark + "Total Correct Answer: "+totalCorrectAnswer, Toast.LENGTH_SHORT).show();
        }


    }
}
