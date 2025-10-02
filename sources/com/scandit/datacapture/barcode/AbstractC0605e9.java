package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.e9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0605e9 {
    public static C0653h9 a(FrameLayout container, int i, int i2, int[] gradientColors) {
        Intrinsics.h(container, "container");
        Intrinsics.h(gradientColors, "gradientColors");
        Context context = container.getContext();
        Intrinsics.g(context, "container.context");
        C0653h9 c0653h9 = new C0653h9(context, i, i2, gradientColors, 0);
        container.addView(c0653h9, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        c0653h9.setLayoutParams(layoutParams);
        return c0653h9;
    }

    public static C0653h9 a(FrameLayout container, int i, int i2) {
        Intrinsics.h(container, "container");
        return a(container, i, i2, new int[]{(RangesKt.c(0, 0, 255) << 24) | 16777215, (RangesKt.c(0, 0, 255) << 24) | 16777215, -1});
    }
}
