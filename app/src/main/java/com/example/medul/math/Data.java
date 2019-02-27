package com.example.medul.math;

import com.example.medul.math.Model.Question;

import java.util.ArrayList;


/**
 * Created by Medul on 04-Aug-17.
 */
public class Data {

    ArrayList<Question> questionArrayList = new ArrayList<>();
    String [] questionAnswer1 = {"30","40","50"};
    String [] questionAnswer2 = {"10","290","230"};
    String [] questionAnswer3 = {"1000","2000","4000"};
    String [] questionAnswer4 = {"35","80","120"};
    String [] questionAnswer5 = {"350","560","980"};
    String [] questionAnswer6 = {"420","660","1280"};
    String [] questionAnswer7 = {"420","660","1280"};
    String [] questionAnswer8 = {"350","560","980"};
    String [] questionAnswer9 = {"35","80","120"};


    public void addQuestion(){
        questionArrayList.add(new Question(1, "10+20",20,1,questionAnswer1,"30"));
        questionArrayList.add(new Question(2,"40-30",10,1,questionAnswer2,"10"));
        questionArrayList.add(new Question(3, "5000-3000",10,1,questionAnswer3,"2000"));
        questionArrayList.add(new Question(4,"70-35",10,1,questionAnswer4,"35"));
        questionArrayList.add(new Question(5,"1780-800",15,1,questionAnswer5,"980"));
        questionArrayList.add(new Question(6,"2270-1610",16,1,questionAnswer6,"660"));
        questionArrayList.add(new Question(7,"2270-1610",16,1,questionAnswer7,"660"));
        questionArrayList.add(new Question(8,"1780-800",15,1,questionAnswer8,"980"));
        questionArrayList.add(new Question(9,"70-35",10,1,questionAnswer9,"35"));
    }

    public ArrayList<Question> getAllQuestion(){
        return questionArrayList;
    }

}
