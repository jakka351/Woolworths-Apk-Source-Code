package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class I6 implements H6 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17193a;

    public I6(Context context) {
        Intrinsics.h(context, "context");
        this.f17193a = context;
    }

    public final J6 a() {
        J6 j6 = new J6(this.f17193a);
        j6.setId(View.generateViewId());
        return j6;
    }
}
