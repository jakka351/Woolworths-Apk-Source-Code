package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes6.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {

    /* renamed from: a, reason: collision with root package name */
    public final BaseProgressIndicatorSpec f14619a;

    public static class ActiveIndicator {

        /* renamed from: a, reason: collision with root package name */
        public float f14620a;
        public float b;
        public int c;
        public int d;
    }

    public DrawingDelegate(BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f14619a = baseProgressIndicatorSpec;
    }

    public abstract void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract void b(Canvas canvas, Paint paint, int i, int i2);

    public abstract void c(Canvas canvas, Paint paint, ActiveIndicator activeIndicator, int i);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public abstract int e();

    public abstract int f();
}
