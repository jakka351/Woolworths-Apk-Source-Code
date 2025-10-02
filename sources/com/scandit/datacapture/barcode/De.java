package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class De implements xe {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17141a;
    private re b;
    private final He c;

    public De(FrameLayout container) {
        Intrinsics.h(container, "container");
        this.f17141a = BarcodeCountViewDefaults.INSTANCE.getShouldShowUserGuidanceView();
        this.c = new He(container);
    }

    public static final re a(De de, Context context) {
        de.getClass();
        re reVar = new re(context, null, 0);
        reVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        de.b = reVar;
        return reVar;
    }

    public final void b(boolean z, String str, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        if (this.f17141a) {
            this.c.a(new Be(z, this, str, onFinished));
        }
    }

    public final void c(boolean z, String str, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        if (this.f17141a) {
            this.c.a(new Ce(z, this, str, onFinished));
        }
    }

    public final void b() {
        re reVar = this.b;
        if (reVar == null) {
            return;
        }
        reVar.setVisibility(4);
    }

    public final void c() {
        this.c.a(new ze(this), this.b);
    }

    public final void a(boolean z, String str, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        if (this.f17141a) {
            this.c.a(new Ae(z, this, str, onFinished));
        }
    }

    public final void a(boolean z) {
        this.f17141a = z;
    }

    public final re a() {
        return this.b;
    }
}
