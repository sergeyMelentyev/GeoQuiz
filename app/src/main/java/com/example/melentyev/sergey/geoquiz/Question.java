package com.example.melentyev.sergey.geoquiz;

class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    boolean isAnswerTrue() { return mAnswerTrue; }
    int getTextResId() { return mTextResId; }
}