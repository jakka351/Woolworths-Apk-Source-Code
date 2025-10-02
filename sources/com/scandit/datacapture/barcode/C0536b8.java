package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.b8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0536b8 implements W7 {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewUiLayoutHelper f17388a;
    private boolean b;
    private Function0 c;
    private S7 d;
    private final He e;

    public C0536b8(C0692k0 layoutHelper, RelativeLayout container) {
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(container, "container");
        this.f17388a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.b = barcodeCountViewDefaults.getShouldShowListButton();
        barcodeCountViewDefaults.getListButtonContentDescription();
        this.c = Z7.f17367a;
        this.e = new He(container);
    }

    private final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.e.a()).getContext();
        Intrinsics.g(context, "presenter.container.context");
        if (AbstractC0682j6.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(H.b(), -2);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = this.f17388a.e();
            layoutParams.setMarginEnd(this.f17388a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(H.b(), H.a());
        layoutParams2.addRule(9);
        layoutParams2.addRule(12);
        layoutParams2.setMarginStart(this.f17388a.e());
        layoutParams2.bottomMargin = this.f17388a.a();
        return layoutParams2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Landroid-content-Context--Lcom-scandit-datacapture-barcode-S7-, reason: not valid java name */
    public static /* synthetic */ void m295x9492bc81(C0536b8 c0536b8, View view) {
        Callback.g(view);
        try {
            a(c0536b8, view);
        } finally {
            Callback.h();
        }
    }

    public final void d() {
        S7 s7 = this.d;
        if (s7 != null) {
            s7.setVisibility(this.b ? 0 : 4);
        }
        S7 s72 = this.d;
        if (s72 == null) {
            return;
        }
        s72.setLayoutParams(c());
    }

    public final void b(Function0 function0) {
        Intrinsics.h(function0, "<set-?>");
        this.c = function0;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void b() {
        this.e.a(new Y7(this), this.d);
    }

    public final void a(String value) {
        Intrinsics.h(value, "value");
        S7 s7 = this.d;
        if (s7 == null) {
            return;
        }
        s7.setContentDescription(value);
    }

    private static final void a(C0536b8 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.c.invoke();
    }

    public final S7 a() {
        return this.d;
    }

    public final void a(InternalBarcodeCountSession session, Function0 onFinished) {
        Unit unit;
        Intrinsics.h(session, "session");
        Intrinsics.h(onFinished, "onFinished");
        int scannedBarcodeCount = session.a().getScannedBarcodeCount();
        synchronized (this) {
            try {
                S7 s7 = this.d;
                if (s7 != null && scannedBarcodeCount == s7.a()) {
                    onFinished.invoke();
                } else {
                    if (this.d != null) {
                        this.e.a(new C0520a8(this, scannedBarcodeCount, onFinished));
                        unit = Unit.f24250a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        onFinished.invoke();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S7 a(Context context) {
        S7 s7 = new S7(context, null, 0);
        s7.setLayoutParams(c());
        s7.setVisibility(4);
        s7.setOnClickListener(new df(this, 11));
        this.d = s7;
        return s7;
    }

    public final void a(Function0 onFinished) {
        Unit unit;
        Intrinsics.h(onFinished, "onFinished");
        synchronized (this) {
            try {
                S7 s7 = this.d;
                if (s7 != null && s7.a() == 0) {
                    onFinished.invoke();
                } else {
                    if (this.d != null) {
                        this.e.a(new C0520a8(this, 0, onFinished));
                        unit = Unit.f24250a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        onFinished.invoke();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
