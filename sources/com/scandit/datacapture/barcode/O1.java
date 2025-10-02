package com.scandit.datacapture.barcode;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final O1 f17253a = new O1();

    public O1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.h(it, "it");
        W1 w1 = new W1(it, null, 0);
        w1.setId(R.id.sc_zoom_control);
        w1.setVisibility(8);
        return w1;
    }
}
