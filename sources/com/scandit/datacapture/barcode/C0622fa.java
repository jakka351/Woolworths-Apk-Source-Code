package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.fa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0622fa implements InterfaceC0538ba {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewUiLayoutHelper f17640a;
    private boolean b;
    private String c;
    private Function0 d;
    private C0522aa e;
    private final He f;

    public C0622fa(C0692k0 layoutHelper, RelativeLayout container) {
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(container, "container");
        this.f17640a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.b = barcodeCountViewDefaults.getShouldShowExitButton();
        this.c = barcodeCountViewDefaults.getSingleScanButtonContentDescription();
        this.d = C0606ea.f17629a;
        this.f = new He(container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Landroid-content-Context--Lcom-scandit-datacapture-barcode-aa-, reason: not valid java name */
    public static /* synthetic */ void m297x9492f625(C0622fa c0622fa, View view) {
        Callback.g(view);
        try {
            a(c0622fa, view);
        } finally {
            Callback.h();
        }
    }

    public final void c() {
        C0522aa c0522aa;
        C0522aa c0522aa2 = this.e;
        if (c0522aa2 != null) {
            c0522aa2.setVisibility(this.b ? 0 : 4);
        }
        if (this.b && (c0522aa = this.e) != null) {
            c0522aa.setLayoutParams(b());
        }
        C0522aa c0522aa3 = this.e;
        if (c0522aa3 == null) {
            return;
        }
        c0522aa3.setLayoutParams(b());
    }

    private final RelativeLayout.LayoutParams b() {
        Context context = ((RelativeLayout) this.f.a()).getContext();
        Intrinsics.g(context, "presenter.container.context");
        if (AbstractC0682j6.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = this.f17640a.f();
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f17640a.h());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(20);
        layoutParams2.setMarginStart(H.e());
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f17640a.h();
        return layoutParams2;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void a(String value) {
        Intrinsics.h(value, "value");
        this.c = value;
        C0522aa c0522aa = this.e;
        if (c0522aa == null) {
            return;
        }
        c0522aa.setContentDescription(value);
    }

    private static final void a(C0622fa this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.d.invoke();
    }

    public final void a(Function0 function0) {
        Intrinsics.h(function0, "<set-?>");
        this.d = function0;
    }

    public final void a() {
        this.f.a(new C0590da(this), this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0522aa a(Context context) {
        C0522aa c0522aa = new C0522aa(context, null, 0);
        c0522aa.setLayoutParams(b());
        c0522aa.setVisibility(4);
        c0522aa.setOnClickListener(new df(this, 13));
        c0522aa.setContentDescription(this.c);
        c0522aa.setId(H.c());
        this.e = c0522aa;
        return c0522aa;
    }
}
