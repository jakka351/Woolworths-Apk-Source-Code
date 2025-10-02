package com.scandit.datacapture.barcode;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class A9 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final A9 f17094a = new A9();

    public A9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(View.generateViewId());
    }
}
