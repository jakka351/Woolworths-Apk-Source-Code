package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Gd implements InterfaceC0952zd {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewUiLayoutHelper f17175a;
    private boolean b;
    private boolean c;
    private Function2 d;
    private C0892vd e;
    private final He f;

    public Gd(C0692k0 layoutHelper, RelativeLayout container) {
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(container, "container");
        this.f17175a = layoutHelper;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.b = barcodeCountViewDefaults.getShouldShowExitButton();
        barcodeCountViewDefaults.getStatusModeButtonContentDescription();
        this.c = true;
        this.d = Dd.f17140a;
        this.f = new He(container);
    }

    public static final C0892vd a(Gd gd, Context context) {
        gd.getClass();
        C0892vd c0892vd = new C0892vd(context, gd.c, new Cd(gd));
        c0892vd.setLayoutParams(gd.d());
        c0892vd.setVisibility(4);
        c0892vd.setEnabled(false);
        c0892vd.setId(H.d());
        gd.e = c0892vd;
        return c0892vd;
    }

    private final RelativeLayout.LayoutParams d() {
        Context context = ((RelativeLayout) this.f.a()).getContext();
        Intrinsics.g(context, "presenter.container.context");
        if (AbstractC0682j6.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.topMargin = this.f17175a.f();
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f17175a.h());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21);
        layoutParams2.setMarginEnd(H.e());
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f17175a.h();
        return layoutParams2;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    public final void c() {
        this.f.a(new Bd(this), this.e);
    }

    public final void e() {
        C0892vd c0892vd;
        C0892vd c0892vd2 = this.e;
        if (c0892vd2 != null) {
            c0892vd2.setVisibility(this.b ? 0 : 4);
        }
        if (this.b && (c0892vd = this.e) != null) {
            c0892vd.setLayoutParams(d());
        }
        C0892vd c0892vd3 = this.e;
        if (c0892vd3 == null) {
            return;
        }
        c0892vd3.setLayoutParams(d());
    }

    public final C0892vd b() {
        return this.e;
    }

    public final void a(String value) {
        Intrinsics.h(value, "value");
        C0892vd c0892vd = this.e;
        if (c0892vd == null) {
            return;
        }
        c0892vd.setContentDescription(value);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final Function2 a() {
        return this.d;
    }

    public final void a(Function2 function2) {
        Intrinsics.h(function2, "<set-?>");
        this.d = function2;
    }

    public final void a(boolean z, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        C0892vd c0892vd = this.e;
        if (c0892vd != null && c0892vd.isEnabled() == z) {
            onFinished.invoke();
        } else {
            this.f.a(new Fd(this, z, onFinished));
        }
    }

    public final void a(Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        this.f.a(new Ed(this, onFinished));
    }
}
