package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.e6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0602e6 implements Y5 {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewUiLayoutHelper f17626a;
    private boolean b;
    private String c;
    private Function0 d;
    private U5 e;
    private String f;
    private final He g;

    public C0602e6(C0692k0 layoutHelper, RelativeLayout container) {
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(container, "container");
        this.f17626a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.b = barcodeCountViewDefaults.getShouldShowClearHighlightsButton();
        this.c = barcodeCountViewDefaults.getListButtonContentDescription();
        this.d = C0534b6.f17387a;
        this.f = barcodeCountViewDefaults.getClearHighlightsButtonText();
        this.g = new He(container);
    }

    private final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.g.a()).getContext();
        Intrinsics.g(context, "presenter.container.context");
        if (AbstractC0682j6.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f17626a.h());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f17626a.h();
        return layoutParams2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Landroid-content-Context--Lcom-scandit-datacapture-barcode-U5-, reason: not valid java name */
    public static /* synthetic */ void m296x9492c3c5(C0602e6 c0602e6, View view) {
        Callback.g(view);
        try {
            a(c0602e6, view);
        } finally {
            Callback.h();
        }
    }

    public final void d() {
        U5 u5;
        U5 u52 = this.e;
        if (u52 != null) {
            u52.setVisibility(this.b ? 0 : 4);
        }
        if (this.b && (u5 = this.e) != null) {
            Context context = ((RelativeLayout) this.g.a()).getContext();
            Intrinsics.g(context, "presenter.container.context");
            u5.setRotation(AbstractC0682j6.a(context) ? 270.0f : BitmapDescriptorFactory.HUE_RED);
        }
        U5 u53 = this.e;
        if (u53 != null) {
            u53.setLayoutParams(c());
        }
        U5 u54 = this.e;
        if (u54 != null) {
            RelativeLayout.LayoutParams layoutParamsC = c();
            Context context2 = ((RelativeLayout) this.g.a()).getContext();
            Intrinsics.g(context2, "presenter.container.context");
            if (AbstractC0682j6.a(context2)) {
                layoutParamsC.setMarginEnd(layoutParamsC.getMarginEnd() - ((u54.getWidth() - u54.getHeight()) / 2));
            }
            u54.setLayoutParams(layoutParamsC);
        }
    }

    public final void b(String value) {
        Intrinsics.h(value, "value");
        a(value, W5.f17333a);
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void a(String value) {
        Intrinsics.h(value, "value");
        this.c = value;
        U5 u5 = this.e;
        if (u5 == null) {
            return;
        }
        u5.setContentDescription(value);
    }

    public final void b() {
        this.g.a(new C0518a6(this), this.e);
    }

    private static final void a(C0602e6 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.d.invoke();
    }

    public final void a(Function0 function0) {
        Intrinsics.h(function0, "<set-?>");
        this.d = function0;
    }

    public final U5 a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U5 a(Context context) {
        U5 u5 = new U5(context, null, 0);
        u5.setLayoutParams(c());
        U5 u52 = this.e;
        if (u52 != null) {
            Context context2 = ((RelativeLayout) this.g.a()).getContext();
            Intrinsics.g(context2, "presenter.container.context");
            u52.setRotation(AbstractC0682j6.a(context2) ? 270.0f : BitmapDescriptorFactory.HUE_RED);
        }
        u5.setVisibility(4);
        u5.setOnClickListener(new df(this, 12));
        u5.a(this.f);
        u5.setContentDescription(this.c);
        this.e = u5;
        return u5;
    }

    public final void a(boolean z, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        this.g.a(new C0586d6(this, z, onFinished));
    }

    public final void a(String text, Function0 onFinished) {
        Intrinsics.h(text, "text");
        Intrinsics.h(onFinished, "onFinished");
        this.f = text;
        this.g.a(new C0550c6(this, text, onFinished));
    }
}
