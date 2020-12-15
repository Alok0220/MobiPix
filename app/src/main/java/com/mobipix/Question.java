package com.mobipix;

public class Question {

    private int mTextResId;
    private Boolean mAnswerTrue;

    public Question(int testResId, boolean answerTrue){
        mTextResId = testResId;
        mAnswerTrue = answerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public Boolean getmAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(Boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }


}
