package com.scandit.datacapture.barcode;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0511a {
    public static C0527b a(View view) {
        Intrinsics.h(view, "view");
        return new C0527b(view.getAlpha(), view.getElevation(), view.getScaleX(), view.getTranslationY());
    }
}
