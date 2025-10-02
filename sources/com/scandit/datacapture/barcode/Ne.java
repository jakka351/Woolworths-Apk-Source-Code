package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.Button;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class Ne extends Button {
    private static final int d = Color.parseColor("#40000000");
    private static final int e = Color.parseColor("#FFFBC02C");
    private static final int f = Color.parseColor("#FFFFFFFF");
    private static final Lazy g = LazyKt.b(Le.f17232a);
    private static final Lazy h = LazyKt.b(Me.f17243a);
    private final DecimalFormat b;
    private float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ne(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
        this.b = decimalFormat;
        setPadding(0, 0, 0, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(d);
        gradientDrawable.setCornerRadius(90.0f);
        setBackground(gradientDrawable);
        setAllCaps(false);
        this.c = 1.0f;
    }

    public final float a() {
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z) {
        int i;
        Typeface typefaceCreate;
        ViewGroup.LayoutParams layoutParams;
        float f2;
        super.setSelected(z);
        if (z) {
            i = e;
            typefaceCreate = Typeface.create(getTypeface(), 1);
            Intrinsics.g(typefaceCreate, "create(typeface, Typeface.BOLD)");
            layoutParams = getLayoutParams();
            Lazy lazy = g;
            layoutParams.width = ((Number) lazy.getD()).intValue();
            layoutParams.height = ((Number) lazy.getD()).intValue();
            f2 = 13.0f;
        } else {
            i = f;
            typefaceCreate = Typeface.create(getTypeface(), 500, false);
            Intrinsics.g(typefaceCreate, "create(typeface, UNSELECTED_TEXT_WEIGHT, false)");
            layoutParams = getLayoutParams();
            Lazy lazy2 = h;
            layoutParams.width = ((Number) lazy2.getD()).intValue();
            layoutParams.height = ((Number) lazy2.getD()).intValue();
            f2 = 12.0f;
        }
        setTextColor(i);
        setTextSize(2, f2);
        setTypeface(typefaceCreate);
        setLayoutParams(layoutParams);
        String str = this.b.format(Float.valueOf(this.c));
        if (!isSelected()) {
            setText(str);
            return;
        }
        setText(str + 'x');
    }

    public final void a(float f2) {
        this.c = f2;
        String str = this.b.format(Float.valueOf(f2));
        if (!isSelected()) {
            setText(str);
            return;
        }
        setText(str + 'x');
    }
}
