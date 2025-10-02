package com.scandit.datacapture.core.internal.module.ui.control.torch;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.T7;
import com.scandit.datacapture.core.U7;
import com.scandit.datacapture.core.V7;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TorchControlIconsHandler {

    /* renamed from: a, reason: collision with root package name */
    private final T7 f18629a;
    private U7 b;
    private Bitmap c;
    private Bitmap d;
    private Bitmap e;
    private Bitmap f;

    public TorchControlIconsHandler(T7 defaults) {
        Intrinsics.h(defaults, "defaults");
        this.f18629a = defaults;
        this.c = BitmapExtensionsKt.bitmapFromResource(defaults.c());
        this.d = BitmapExtensionsKt.bitmapFromResource(defaults.d());
        this.e = BitmapExtensionsKt.bitmapFromResource(defaults.a());
        this.f = BitmapExtensionsKt.bitmapFromResource(defaults.b());
    }

    public final void a(TorchSwitchControl.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public final void b(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.f)) {
            return;
        }
        this.f = value;
        U7 u7 = this.b;
        if (u7 != null) {
            u7.onIconsChanged(TorchState.OFF, value, true);
        }
    }

    public final void c(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.c)) {
            return;
        }
        this.c = value;
        U7 u7 = this.b;
        if (u7 != null) {
            u7.onIconsChanged(TorchState.ON, value, false);
        }
    }

    public final void d(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.d)) {
            return;
        }
        this.d = value;
        U7 u7 = this.b;
        if (u7 != null) {
            u7.onIconsChanged(TorchState.ON, value, true);
        }
    }

    public final Bitmap e() {
        return this.e;
    }

    public final Bitmap f() {
        return this.f;
    }

    public final Bitmap g() {
        return this.c;
    }

    public final Bitmap h() {
        return this.d;
    }

    public final Bitmap a(TorchState torchState, boolean z) {
        Intrinsics.h(torchState, "torchState");
        int i = V7.f18388a[torchState.ordinal()];
        if (i == 1) {
            return !z ? this.c : this.d;
        }
        if (i == 2) {
            return !z ? this.e : this.f;
        }
        if (i == 3) {
            return !z ? this.e : this.f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Bitmap b() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18629a.b());
    }

    public final Bitmap c() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18629a.c());
    }

    public final Bitmap d() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18629a.d());
    }

    public /* synthetic */ TorchControlIconsHandler() {
        this(new T7());
    }

    public final void a(Bitmap value) {
        Intrinsics.h(value, "value");
        if (value.equals(this.e)) {
            return;
        }
        this.e = value;
        U7 u7 = this.b;
        if (u7 != null) {
            u7.onIconsChanged(TorchState.OFF, value, false);
        }
    }

    public final Bitmap a() {
        return BitmapExtensionsKt.bitmapFromResource(this.f18629a.a());
    }
}
