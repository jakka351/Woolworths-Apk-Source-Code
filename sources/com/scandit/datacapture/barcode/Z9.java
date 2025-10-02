package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Z9 implements N9 {
    private static final int m = PixelExtensionsKt.pxFromDp$default(112, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountViewUiLayoutHelper f17368a;
    private final FrameLayout b;
    private boolean c;
    private boolean d;
    private Function1 e;
    private final He f;
    private final He g;
    private C0903w9 h;
    private C0903w9 i;
    private Boolean j;
    private boolean k;
    private final Lazy l;

    public Z9(C0692k0 layoutHelper, RelativeLayout shutterButtonContainer, FrameLayout floatingShutterButtonContainer) {
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(shutterButtonContainer, "shutterButtonContainer");
        Intrinsics.h(floatingShutterButtonContainer, "floatingShutterButtonContainer");
        this.f17368a = layoutHelper;
        this.b = floatingShutterButtonContainer;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.c = barcodeCountViewDefaults.getShouldShowShutterButton();
        this.d = barcodeCountViewDefaults.getShouldShowFloatingShutterButton();
        barcodeCountViewDefaults.getShutterButtonContentDescription();
        barcodeCountViewDefaults.getFloatingShutterButtonContentDescription();
        this.e = T9.f17306a;
        this.f = new He(shutterButtonContainer);
        this.g = new He(floatingShutterButtonContainer);
        this.l = LazyKt.b(new S9(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Landroid-content-Context--Lcom-scandit-datacapture-barcode-w9-, reason: not valid java name */
    public static /* synthetic */ void m293x949343e3(Z9 z9, View view) {
        Callback.g(view);
        try {
            a(z9, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$b$-Landroid-content-Context--Lcom-scandit-datacapture-barcode-w9-, reason: not valid java name */
    public static /* synthetic */ void m294xe252bbe4(Z9 z9, View view) {
        Callback.g(view);
        try {
            b(z9, view);
        } finally {
            Callback.h();
        }
    }

    public final void g() {
        I i;
        Size2 size = ObjectOverlayUtilsKt.getSize(this.b);
        if (size == null || (i = (I) this.l.getD()) == null) {
            return;
        }
        i.a(new Size((int) size.getWidth(), (int) size.getHeight()));
    }

    public final void h() {
        this.k = true;
    }

    public final void i() {
        C0903w9 c0903w9;
        I i;
        C0903w9 c0903w92 = this.h;
        if (c0903w92 != null) {
            c0903w92.setVisibility(this.c ? 0 : 4);
        }
        C0903w9 c0903w93 = this.i;
        if (c0903w93 != null) {
            c0903w93.setVisibility(this.d ? 0 : 4);
        }
        Boolean bool = this.j;
        if (bool != null) {
            b(bool.booleanValue(), L9.f17229a);
        }
        if (this.d && (c0903w9 = this.i) != null) {
            Size2 size = ObjectOverlayUtilsKt.getSize(this.g.a());
            if (size != null && (i = (I) this.l.getD()) != null) {
                i.a(new Size((int) size.getWidth(), (int) size.getHeight()));
            }
            I i2 = (I) this.l.getD();
            if (i2 != null) {
                c0903w9.a(i2);
                c0903w9.setX(i2.a());
                c0903w9.setY(i2.b());
            }
        }
        C0903w9 c0903w94 = this.h;
        if (c0903w94 == null) {
            return;
        }
        c0903w94.setLayoutParams(f());
    }

    private final RelativeLayout.LayoutParams f() {
        Context context = ((RelativeLayout) this.f.a()).getContext();
        Intrinsics.g(context, "shutterButtonPresenter.container.context");
        if (AbstractC0682j6.a(context)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(H.g(), H.g());
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f17368a.b());
            return layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(H.g(), H.g());
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f17368a.b();
        return layoutParams2;
    }

    public final void b(boolean z) {
        this.c = z;
    }

    public final void e() {
        this.f.a(new R9(this), this.h);
        this.g.a(new P9(this), this.i);
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void b(String value) {
        Intrinsics.h(value, "value");
        C0903w9 c0903w9 = this.h;
        if (c0903w9 == null) {
            return;
        }
        c0903w9.setContentDescription(value);
    }

    public final C0903w9 c() {
        return this.i;
    }

    public final C0903w9 d() {
        return this.h;
    }

    public static final float b(Z9 z9) {
        return (float) ((z9.f17368a.d().getHeight() * 0.6d) - (m / 2));
    }

    public final void a(String value) {
        Intrinsics.h(value, "value");
        C0903w9 c0903w9 = this.i;
        if (c0903w9 == null) {
            return;
        }
        c0903w9.setContentDescription(value);
    }

    public final void c(boolean z, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        this.f.a(new X9(this, z, new Y9(this, z, onFinished)));
    }

    public final void a(Function1 function1) {
        Intrinsics.h(function1, "<set-?>");
        this.e = function1;
    }

    public static final float a(Z9 z9) {
        return z9.f17368a.d().getWidth() - m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0903w9 b(Context context) {
        int i = C0903w9.h;
        EnumC0873u9 mode = EnumC0873u9.FIXED;
        Intrinsics.h(context, "context");
        Intrinsics.h(mode, "mode");
        C0903w9 c0903w9 = new C0903w9(context, 80, 140, mode, 0);
        c0903w9.setId(100);
        c0903w9.setVisibility(4);
        c0903w9.setLayoutParams(f());
        c0903w9.setOnClickListener(new nf(this, 0));
        c0903w9.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getShutterButtonContentDescription());
        this.h = c0903w9;
        return c0903w9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0903w9 a(Context context) {
        int i = C0903w9.h;
        EnumC0873u9 mode = EnumC0873u9.FLOATING;
        Intrinsics.h(context, "context");
        Intrinsics.h(mode, "mode");
        C0903w9 c0903w9 = new C0903w9(context, 56, 112, mode, 0);
        int i2 = m;
        c0903w9.setLayoutParams(new FrameLayout.LayoutParams(i2, i2, 8388661));
        c0903w9.setVisibility(4);
        c0903w9.setOnClickListener(new nf(this, 1));
        c0903w9.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getFloatingShutterButtonContentDescription());
        this.i = c0903w9;
        return c0903w9;
    }

    public final void b(boolean z, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        synchronized (this) {
            try {
                this.j = Boolean.valueOf(z);
                if (this.d) {
                    this.g.a(new V9(this, z, onFinished));
                } else {
                    this.f.a(new W9(this, z, onFinished));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(boolean z, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        this.f.a(new U9(this, z, onFinished));
    }

    private static final void a(Z9 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.k = false;
        this$0.e.invoke(Boolean.TRUE);
    }

    public final void b() {
        this.k = false;
        this.e.invoke(Boolean.FALSE);
    }

    private static final void b(Z9 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.k = false;
        this$0.e.invoke(Boolean.FALSE);
    }
}
