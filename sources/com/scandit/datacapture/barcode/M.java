package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17233a = Color.parseColor("#80000000");

    public static final void a(TextView textView) {
        Intrinsics.h(textView, "<this>");
        textView.setTextSize(2, 16.0f);
        textView.setTextColor(-1);
        textView.setBackgroundColor(0);
        textView.setShadowLayer(PixelExtensionsKt.pxFromDp$default(4, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(0, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(2, (Context) null, 1, (Object) null), f17233a);
    }
}
