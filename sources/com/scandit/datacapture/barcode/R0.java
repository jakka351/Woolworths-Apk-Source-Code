package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class R0 extends FrameLayout implements Animatable {
    private static final N0 g = new N0(0);
    private static final Lazy h = LazyKt.b(M0.f17234a);
    private static final Lazy i = LazyKt.b(J0.f17201a);
    private static final Lazy j = LazyKt.b(I0.f17189a);
    private static final Lazy k = LazyKt.b(H0.f17178a);
    private static final Lazy l = LazyKt.b(K0.f17212a);
    private static final Lazy m = LazyKt.b(L0.f17221a);
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private C0653h9 e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.h(context, "context");
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.sc_barcode_find_dot_default, context.getTheme()));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.b = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(-1);
        this.c = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(-1);
        this.d = paint3;
        setClickable(true);
        setFocusable(true);
        N0 n0 = g;
        setElevation(N0.a(n0));
        setClipChildren(false);
        this.e = AbstractC0605e9.a(this, N0.b(n0), 0, N0.a(n0, h()));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        super.draw(canvas);
        if (this.f) {
            canvas.drawCircle(((Number) h.getD()).floatValue(), ((Number) h.getD()).floatValue(), ((Number) j.getD()).floatValue(), this.d);
        } else {
            canvas.drawCircle(((Number) h.getD()).floatValue(), ((Number) h.getD()).floatValue(), ((Number) h.getD()).floatValue(), this.c);
            canvas.drawCircle(((Number) h.getD()).floatValue(), ((Number) h.getD()).floatValue(), ((Number) h.getD()).floatValue() - ((Number) k.getD()).floatValue(), this.b);
        }
    }

    public final boolean g() {
        return this.f;
    }

    @Override // android.view.View
    public final int getMinimumHeight() {
        return ((Number) i.getD()).intValue();
    }

    @Override // android.view.View
    public final int getMinimumWidth() {
        return ((Number) i.getD()).intValue();
    }

    public final int h() {
        return this.b.getColor();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e.isRunning();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((Number) i.getD()).intValue(), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        setOutlineProvider(new G0(this, i2, i3));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.stop();
    }

    public final void a(int i2) {
        if (i2 == this.d.getColor()) {
            return;
        }
        this.d.setColor(i2);
        if (this.f) {
            ViewExtensionsKt.runOnMainThread(this, new P0(this));
        }
    }

    public final void b(int i2) {
        if (i2 == this.b.getColor()) {
            return;
        }
        this.b.setColor(i2);
        this.e.a(N0.a(g, i2));
        if (this.f) {
            return;
        }
        ViewExtensionsKt.runOnMainThread(this, new Q0(this));
    }

    public final void a(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ViewExtensionsKt.runOnMainThread(this, new O0(this));
    }
}
