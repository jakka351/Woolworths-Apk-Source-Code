package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.h8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0652h8 implements InterfaceC0588d8 {
    private static final int e = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);
    private static final int f = PixelExtensionsKt.pxFromDp$default(80, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f17696a;
    private boolean b;
    private C0552c8 c;
    private final He d;

    public C0652h8(FrameLayout container) {
        Intrinsics.h(container, "container");
        this.f17696a = BarcodeCountViewDefaults.INSTANCE.getShouldShowListProgressBar();
        this.b = true;
        this.d = new He(container);
    }

    public static final C0552c8 a(C0652h8 c0652h8, Context context) {
        c0652h8.getClass();
        C0552c8 c0552c8 = new C0552c8(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, PixelExtensionsKt.pxFromDp$default(48, (Context) null, 1, (Object) null), 48);
        Context context2 = ((FrameLayout) c0652h8.d.a()).getContext();
        Intrinsics.g(context2, "presenter.container.context");
        int i = AbstractC0682j6.a(context2) ? f : e;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        c0552c8.setLayoutParams(layoutParams);
        c0552c8.setVisibility(4);
        c0652h8.c = c0552c8;
        return c0552c8;
    }

    public final void b(boolean z) {
        this.f17696a = z;
    }

    public final void c() {
        C0552c8 c0552c8;
        C0552c8 c0552c82 = this.c;
        if (c0552c82 != null) {
            c0552c82.setVisibility((this.b && this.f17696a) ? 0 : 4);
        }
        if (this.b && this.f17696a && (c0552c8 = this.c) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, PixelExtensionsKt.pxFromDp$default(48, (Context) null, 1, (Object) null), 48);
            Context context = ((FrameLayout) this.d.a()).getContext();
            Intrinsics.g(context, "presenter.container.context");
            int i = AbstractC0682j6.a(context) ? f : e;
            layoutParams.setMarginStart(i);
            layoutParams.setMarginEnd(i);
            c0552c8.setLayoutParams(layoutParams);
        }
    }

    public final void b() {
        this.d.a(new C0620f8(this), this.c);
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final C0552c8 a() {
        return this.c;
    }

    public final void a(int i, int i2) {
        this.d.a(new C0636g8(this, i2, i));
    }
}
