package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S6 implements M6 {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewUiLayoutHelper f17296a;
    private boolean b;
    private Function0 c;
    private J6 d;
    private String e;
    private final He f;

    public S6(C0692k0 layoutHelper, RelativeLayout container) {
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(container, "container");
        this.f17296a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.b = barcodeCountViewDefaults.getShouldShowExitButton();
        barcodeCountViewDefaults.getExitButtonContentDescription();
        this.c = P6.f17268a;
        this.e = barcodeCountViewDefaults.getExitButtonText();
        this.f = new He(container);
    }

    private final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f.a()).getContext();
        Intrinsics.g(context, "presenter.container.context");
        if (AbstractC0682j6.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(H.b(), H.a());
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f17296a.e();
            layoutParams.setMarginEnd(this.f17296a.a());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(H.b(), H.a());
        layoutParams2.addRule(11);
        layoutParams2.addRule(12);
        layoutParams2.setMarginEnd(this.f17296a.e());
        layoutParams2.bottomMargin = this.f17296a.a();
        return layoutParams2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Landroid-content-Context--Lcom-scandit-datacapture-barcode-J6-, reason: not valid java name */
    public static /* synthetic */ void m286x94929a99(S6 s6, View view) {
        Callback.g(view);
        try {
            a(s6, view);
        } finally {
            Callback.h();
        }
    }

    public final void d() {
        J6 j6 = this.d;
        if (j6 != null) {
            j6.setVisibility(this.b ? 0 : 4);
        }
        J6 j62 = this.d;
        if (j62 == null) {
            return;
        }
        j62.setLayoutParams(c());
    }

    public final void b() {
        this.f.a(new O6(this), this.d);
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void b(String value) {
        Intrinsics.h(value, "value");
        Q6 onFinished = Q6.f17278a;
        Intrinsics.h(onFinished, "onFinished");
        this.e = value;
        this.f.a(new R6(this, value, onFinished));
    }

    public final void a(String value) {
        Intrinsics.h(value, "value");
        J6 j6 = this.d;
        if (j6 == null) {
            return;
        }
        j6.setContentDescription(value);
    }

    private static final void a(S6 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.c.invoke();
    }

    public final void a(Function0 function0) {
        Intrinsics.h(function0, "<set-?>");
        this.c = function0;
    }

    public final J6 a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final J6 a(Context context) {
        J6 j6 = new J6(context, null, 0);
        j6.setLayoutParams(c());
        j6.setVisibility(4);
        j6.setOnClickListener(new df(this, 8));
        j6.a(this.e);
        j6.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getExitButtonContentDescription());
        this.d = j6;
        return j6;
    }
}
