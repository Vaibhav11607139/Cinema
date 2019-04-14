package com.example.vaibhav.cinema;

public class RecycleItemAdd {
    private int mImageR;
    private String mText1,mText2;
    public  RecycleItemAdd(int ImageR,String Text1,String Text2)
    {
        mImageR=ImageR;
        mText1=Text1;
        mText2=Text2;

    }
    public int getmImageR(){
        return  mImageR;
    }
    public String getmText1()
    {
        return mText1;
    }
    public String getmText2()
    {
        return mText2;
    }
}
