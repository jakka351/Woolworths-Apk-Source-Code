package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.l8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0716l8 extends FrameLayout {
    private final C0700k8 b;
    private final TextView c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0716l8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        C0700k8 c0700k8 = new C0700k8(context, attributeSet, i);
        c0700k8.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.b = c0700k8;
        addView(c0700k8);
        TextView textView = new TextView(context, attributeSet, i);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        M.a(textView);
        this.c = textView;
        addView(textView);
    }

    public final void a() {
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d) {
            C0700k8.a(this.b);
        }
    }

    public final void a(String str) {
        this.c.setText(str);
    }

    public final void a(float f) {
        this.b.a(f);
    }
}
