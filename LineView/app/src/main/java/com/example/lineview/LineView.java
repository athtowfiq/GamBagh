package com.example.lineview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class LineView extends View
{
    private Paint paint = new Paint();

    private PointF pointA, pointB, pointC, pointD, pointE, pointF, pointG, pointH, pointI, pointJ, pointK, pointL, pointM, pointN;

    public LineView(Context context) {
        super(context);
    }

    public LineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        paint.setColor(Color.DKGRAY);

        paint.setStrokeWidth(20);

        canvas.drawLine(pointA.x, pointA.y, pointB.x, pointB.y, paint);
        canvas.drawLine(pointC.x, pointC.y, pointD.x, pointD.y, paint);
        canvas.drawLine(pointE.x, pointE.y, pointF.x, pointF.y, paint);
        canvas.drawLine(pointG.x, pointG.y, pointH.x, pointH.y, paint);
        canvas.drawLine(pointI.x, pointI.y, pointJ.x, pointJ.y, paint);
        canvas.drawLine(pointK.x, pointK.y, pointL.x, pointL.y, paint);
        canvas.drawLine(pointM.x, pointM.y, pointN.x, pointN.y, paint);

        super.onDraw(canvas);
    }

    public void setPointA(PointF point)
    {
        pointA = point ;
    }

    public void setPointB(PointF point)
    {
        pointB = point ;
    }

    public void setPointC(PointF point)
    {
        pointC = point ;
    }

    public void setPointD(PointF point)
    {
        pointD = point ;
    }

    public void setPointE(PointF point)
    {
        pointE = point ;
    }

    public void setPointF(PointF point)
    {
        pointF = point ;
    }

    public void setPointG(PointF point)
    {
        pointG = point ;
    }

    public void setPointH(PointF point)
    {
        pointH = point ;
    }

    public void setPointI(PointF point)
    {
        pointI = point ;
    }

    public void setPointJ(PointF point)
    {
        pointJ = point ;
    }

    public void setPointK(PointF point)
    {
        pointK = point ;
    }

    public void setPointL(PointF point)
    {
        pointL = point ;
    }

    public void setPointM(PointF point)
    {
        pointM = point ;
    }

    public void setPointN(PointF point)
    {
        pointN = point ;
    }


    public void draw()
    {
        invalidate();
        requestLayout();
    }
}