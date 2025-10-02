package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.nd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0753nd extends FrameLayout {
    private final TextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753nd(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        View.inflate(context, R.layout.sc_spark_scan_toast_view, this);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = Gc.o();
        }
        setBackground(new ShapeDrawable(new RoundRectShape(fArr, null, null)));
        setVisibility(4);
        View viewFindViewById = findViewById(R.id.toastText);
        Intrinsics.g(viewFindViewById, "findViewById(R.id.toastText)");
        this.b = (TextView) viewFindViewById;
    }

    public final void a(int i, int i2, String text) {
        Intrinsics.h(text, "text");
        this.b.setText(text);
        Drawable background = getBackground();
        Intrinsics.f(background, "null cannot be cast to non-null type android.graphics.drawable.ShapeDrawable");
        ((ShapeDrawable) background).getPaint().setColor(i);
        this.b.setTextColor(i2);
        if (getVisibility() != 4) {
            animate().cancel();
            setAlpha(1.0f);
            setVisibility(0);
        } else {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
            setVisibility(0);
            animate().alpha(1.0f).setListener(new C0705kd(new C0737md(this)));
        }
    }

    public final void a() {
        animate().alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C0705kd(new C0721ld(this)));
    }
}
