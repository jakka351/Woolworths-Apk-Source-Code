package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C8 implements InterfaceC0872u8 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17120a;
    private C0716l8 b;
    private C0716l8 c;
    private final He d;

    public C8(FrameLayout container) {
        Intrinsics.h(container, "container");
        this.f17120a = BarcodeCountViewDefaults.INSTANCE.getShouldShowUserGuidanceView();
        this.d = new He(container);
    }

    public static final C0716l8 a(C8 c8, Context context) {
        c8.getClass();
        C0716l8 c0716l8 = new C0716l8(context, null, 0);
        c0716l8.setLayoutParams(new FrameLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null), 17));
        c0716l8.a();
        c8.c = c0716l8;
        return c0716l8;
    }

    public static final C0716l8 b(C8 c8, Context context) {
        c8.getClass();
        C0716l8 c0716l8 = new C0716l8(context, null, 0);
        c0716l8.setLayoutParams(new FrameLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null), 17));
        c8.b = c0716l8;
        return c0716l8;
    }

    public final void c() {
        this.d.a(new C0932y8(this), this.b);
        this.d.a(new C0902w8(this), this.c);
    }

    public final void b(boolean z, String str, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        if (this.f17120a) {
            this.d.a(new B8(this, z, str, onFinished));
        }
    }

    public static final void b(C8 c8, boolean z, String str) {
        C0716l8 c0716l8 = c8.b;
        if (c0716l8 != null) {
            c0716l8.setVisibility(z ? 0 : 4);
            c0716l8.a(str);
        }
    }

    public final void a(boolean z, String str, Function0 onFinished) {
        Intrinsics.h(onFinished, "onFinished");
        if (this.f17120a) {
            this.d.a(new C0947z8(this, z, str, onFinished));
        }
    }

    public final void a(float f) {
        if (this.f17120a) {
            this.d.a(new A8(this, f));
        }
    }

    public final void b() {
        C0716l8 c0716l8 = this.b;
        if (c0716l8 != null) {
            c0716l8.setVisibility(4);
        }
        C0716l8 c0716l82 = this.c;
        if (c0716l82 == null) {
            return;
        }
        c0716l82.setVisibility(4);
    }

    public final void a(boolean z) {
        this.f17120a = z;
    }

    public final C0716l8 a() {
        return this.b;
    }

    public static final void a(C8 c8, boolean z, String str) {
        C0716l8 c0716l8 = c8.c;
        if (c0716l8 != null) {
            c0716l8.setVisibility(z ? 0 : 4);
            c0716l8.a(str);
        }
    }
}
