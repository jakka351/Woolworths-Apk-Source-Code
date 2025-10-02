package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class E9 extends FrameLayout implements Animatable {
    private static final D9 c = new D9(0);
    private static final Lazy d = LazyKt.b(C9.f17121a);
    private final C0653h9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setForeground(context.getDrawable(R.drawable.sc_button_shutter_play_pause));
        setClipChildren(false);
        this.b = AbstractC0605e9.a(this, D9.a(c), getForeground().getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getForeground().getIntrinsicWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getForeground().getIntrinsicHeight(), 1073741824));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.b.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.b.stop();
    }
}
