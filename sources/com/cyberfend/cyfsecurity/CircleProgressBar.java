package com.cyberfend.cyfsecurity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class CircleProgressBar extends View {
    public static char[] n;
    public final float d;
    public float e;
    public final int f;
    public final int g;
    public final RectF h;
    public final Paint i;
    public final Paint j;
    public int k;
    public final Handler l;
    public final Runnable m;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 20.0f;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = 100;
        this.g = SubsamplingScaleImageView.ORIENTATION_270;
        this.k = 0;
        Handler handler = new Handler();
        this.l = handler;
        Runnable runnable = new Runnable() { // from class: com.cyberfend.cyfsecurity.CircleProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                CircleProgressBar circleProgressBar = CircleProgressBar.this;
                int i = circleProgressBar.k;
                if (i < 9) {
                    circleProgressBar.k = i + 1;
                    circleProgressBar.e += 1.0f;
                    circleProgressBar.postInvalidate();
                    circleProgressBar.l.postDelayed(circleProgressBar.m, 100L);
                }
            }
        };
        this.m = runnable;
        this.h = new RectF();
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setColor(context.getResources().getColor(com.woolworths.R.color.akamaiCCAcolorProgressBackground));
        Paint paint2 = this.i;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.j = paint3;
        paint3.setColor(context.getResources().getColor(com.woolworths.R.color.akamaiCCAcolorProgressForeground));
        this.j.setStyle(style);
        handler.postDelayed(runnable, 100L);
    }

    public static /* synthetic */ String a(String str) {
        if (n == null) {
            n = new char[32767];
            int i = 3;
            for (int i2 = 0; i2 < 32767; i2++) {
                i = ((i + (i ^ i2)) + 19) % 63;
                n[i2] = (char) i;
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ n[i3])));
        }
        return new String(cArr);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.h, this.i);
        canvas.drawArc(this.h, this.g, (this.e * 360.0f) / this.f, true, this.j);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(iMin, iMin);
        float f = this.d;
        float f2 = iMin;
        this.h.set((f / 2.0f) + BitmapDescriptorFactory.HUE_RED, (f / 2.0f) + BitmapDescriptorFactory.HUE_RED, f2 - (f / 2.0f), f2 - (f / 2.0f));
    }

    public synchronized void setProgress(float f) {
        this.e = f * this.f;
        this.k = 0;
        this.l.postDelayed(this.m, 100L);
        postInvalidate();
    }

    public void setProgressBarColor(int i) {
        this.j.setColor(i);
        this.i.setColor(Color.argb(Math.round(Color.alpha(i) * 0.25f), Color.red(i), Color.green(i), Color.blue(i)));
    }
}
