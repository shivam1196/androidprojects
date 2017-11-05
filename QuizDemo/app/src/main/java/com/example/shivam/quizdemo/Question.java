package com.example.shivam.quizdemo;

/**
 * Created by shivam on 30/10/17.
 */

public class Question {
   private String quesId;
    private boolean answerId;


    public String getQuesId() {
        return quesId;
    }

    public void setQuesId(String quesId) {
        this.quesId = quesId;
    }

    public boolean isAnswerId() {
        return answerId;
    }

    public void setAnswerId(boolean answerId) {
        this.answerId = answerId;
    }

    public Question(String ques, boolean ans)
    {
        quesId=ques;
        answerId=ans;
    }
}
