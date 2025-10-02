package com.swrve.sdk.messaging;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class SwrveInAppStoryView extends View {
    public static final /* synthetic */ int t = 0;
    public int d;
    public int e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public RectF n;
    public Paint o;
    public Paint p;
    public Thread q;
    public ArrayList r;
    public WeakReference s;

    public class AnimationThread extends Thread {
        public final int d = 15;
        public long e = System.currentTimeMillis();

        public AnimationThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException {
            float segmentDuration = ((100.0f - SwrveInAppStoryView.this.f) / 100.0f) * SwrveInAppStoryView.this.getSegmentDuration();
            while (!isInterrupted()) {
                SwrveInAppStoryView swrveInAppStoryView = SwrveInAppStoryView.this;
                swrveInAppStoryView.f += (((int) (System.currentTimeMillis() - this.e)) / segmentDuration) * 100.0f;
                swrveInAppStoryView.postInvalidate();
                this.e = System.currentTimeMillis();
                SwrveInAppStoryView swrveInAppStoryView2 = SwrveInAppStoryView.this;
                if (swrveInAppStoryView2.f >= 100.0f) {
                    swrveInAppStoryView2.f = 100.0f;
                    Thread thread = swrveInAppStoryView2.q;
                    if (thread != null) {
                        thread.interrupt();
                        swrveInAppStoryView2.q = null;
                    }
                    synchronized (SwrveInAppStoryView.this.s) {
                        try {
                            if (SwrveInAppStoryView.this.s.get() != null) {
                                ((SwrveInAppStorySegmentListener) SwrveInAppStoryView.this.s.get()).a(SwrveInAppStoryView.this.e);
                                if (isInterrupted()) {
                                    return;
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    try {
                        join(this.d);
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        }
    }

    public interface SwrveInAppStorySegmentListener {
        void a(int i);
    }

    public final void a() {
        Thread thread = this.q;
        if (thread == null || thread.isInterrupted()) {
            AnimationThread animationThread = new AnimationThread();
            this.q = animationThread;
            animationThread.start();
        }
    }

    public int getCurrentIndex() {
        return this.e;
    }

    public int getNumberOfSegments() {
        return this.d;
    }

    public int getSegmentDuration() {
        ArrayList arrayList = this.r;
        if (arrayList != null && this.e >= 0) {
            int size = arrayList.size();
            int i = this.e;
            if (size > i) {
                return ((Integer) this.r.get(i)).intValue();
            }
        }
        return this.h;
    }

    public int getSegmentProgress() {
        return (int) this.f;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Thread thread = this.q;
        if (thread != null) {
            thread.interrupt();
            this.q = null;
        }
        synchronized (this.s) {
            this.s.clear();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.n;
        int i = this.l;
        canvas.drawRoundRect(rectF, i, i, this.o);
        RectF rectF2 = this.n;
        this.p.setColor(this.j);
        for (int i2 = 0; i2 < this.d; i2++) {
            float f = (this.m + this.g) * i2;
            RectF rectF3 = new RectF(f, rectF2.top, this.m + r3, rectF2.bottom);
            int i3 = this.e;
            if (i2 == i3) {
                RectF rectF4 = new RectF(f, BitmapDescriptorFactory.HUE_RED, r3 + ((int) ((this.m / 100.0f) * this.f)), getMeasuredHeight());
                this.p.setColor(this.k);
                float f2 = this.l;
                canvas.drawRoundRect(rectF3, f2, f2, this.p);
                this.p.setColor(this.j);
                float f3 = this.l;
                Paint paint = this.p;
                Path path = new Path();
                float f4 = rectF3.left;
                float f5 = 2.0f * f3;
                path.arcTo(new RectF(f4, rectF3.top, f4 + f5, rectF3.bottom), 90.0f, 180.0f, false);
                float f6 = rectF3.right;
                path.arcTo(new RectF(f6 - f5, rectF3.top, f6, rectF3.bottom), 270.0f, 180.0f, false);
                path.lineTo(f3, rectF3.bottom);
                path.close();
                canvas.save();
                canvas.clipPath(path);
                if (rectF4.width() < rectF4.height()) {
                    rectF4.left -= rectF4.height() - rectF4.width();
                }
                canvas.drawRoundRect(rectF4, f3, f3, paint);
                canvas.restore();
            } else {
                if (i2 < i3) {
                    this.p.setColor(this.j);
                } else {
                    this.p.setColor(this.k);
                }
                float f7 = this.l;
                canvas.drawRoundRect(rectF3, f7, f7, this.p);
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int measuredWidth = getMeasuredWidth();
            int i5 = this.g;
            this.m = (int) ((measuredWidth - ((r4 - 1) * i5)) / this.d);
            this.l = getMeasuredHeight() / 2;
            this.n = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getMeasuredWidth(), getMeasuredHeight());
            Paint paint = new Paint();
            this.o = paint;
            paint.setColor(0);
            this.o.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.p = paint2;
            paint2.setColor(this.j);
            this.p.setAntiAlias(true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.i);
    }

    @VisibleForTesting
    public void setListener(SwrveInAppStorySegmentListener swrveInAppStorySegmentListener) {
        this.s = new WeakReference(swrveInAppStorySegmentListener);
    }
}
