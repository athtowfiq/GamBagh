package com.example.lineview;

import android.graphics.PointF;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    PointF pointA = new PointF(10,100);

    PointF pointB = new PointF(960,1700);

    PointF pointC = new PointF(10,1700);

    PointF pointD = new PointF(960,100);

    PointF pointE = new PointF(5,100);

    PointF pointF = new PointF(965,100);

    PointF pointG = new PointF(240,500);

    PointF pointH = new PointF(720,500);

    PointF pointI= new PointF(240,1300);

    PointF pointJ = new PointF(720,1300);

    PointF pointK = new PointF(4,1700);

    PointF pointL = new PointF(967,1700);

    PointF pointM = new PointF(485,100);

    PointF pointN = new PointF(485,1700);

    private LineView mLineView ;


    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mLineView = findViewById(R.id.lineView);

        mLineView.setPointA(pointA);

        mLineView.setPointB(pointB);

        mLineView.setPointC(pointC);

        mLineView.setPointD(pointD);

        mLineView.setPointE(pointE);

        mLineView.setPointF(pointF);

        mLineView.setPointG(pointG);

        mLineView.setPointH(pointH);

        mLineView.setPointI(pointI);

        mLineView.setPointJ(pointJ);

        mLineView.setPointK(pointK);

        mLineView.setPointL(pointL);

        mLineView.setPointM(pointM);

        mLineView.setPointN(pointN);

        mLineView.draw();

    }

}