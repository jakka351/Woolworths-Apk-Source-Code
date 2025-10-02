package com.scandit.datacapture.core;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U1 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f18380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.f18380a = LazyKt.b(new T1(this));
    }

    private final void a() {
        CharSequence text;
        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (height <= 0 || width <= 0 || (text = getText()) == null || text.length() == 0) {
            return;
        }
        float textSize = getTextSize();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textSize);
        int height2 = StaticLayout.Builder.obtain(getText(), 0, getText().length(), textPaint, width).build().getHeight();
        while (height2 > height && textSize > ((Number) this.f18380a.getD()).floatValue()) {
            textSize -= 1.0f;
            textPaint.setTextSize(textSize);
            height2 = StaticLayout.Builder.obtain(getText(), 0, getText().length(), textPaint, width).build().getHeight();
        }
        setTextSize(0, textSize);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            a();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a();
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a();
    }
}
