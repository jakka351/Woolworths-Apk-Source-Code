package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class B4 {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePick f17104a;
    private final ProxyCache b;
    private final NativeDataCaptureMode c;

    public B4(NativeBarcodePick _NativeBarcodePick, ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePick, "_NativeBarcodePick");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17104a = _NativeBarcodePick;
        this.b = proxyCache;
        NativeDataCaptureMode nativeDataCaptureModeAsDataCaptureMode = _NativeBarcodePick.asDataCaptureMode();
        Intrinsics.g(nativeDataCaptureModeAsDataCaptureMode, "_NativeBarcodePick.asDataCaptureMode()");
        this.c = nativeDataCaptureModeAsDataCaptureMode;
    }

    public final void a(boolean z) {
        this.f17104a.setEnabled(z);
    }

    public final NativeBarcodePick b() {
        return this.f17104a;
    }

    public final DataCaptureContext c() {
        NativeDataCaptureContext context = this.f17104a.getContext();
        if (context != null) {
            return (DataCaptureContext) this.b.getOrPut(Reflection.f24268a.b(NativeDataCaptureContext.class), null, context, new A4(context));
        }
        return null;
    }

    public final boolean d() {
        return this.f17104a.isEnabled();
    }

    public final NativeDataCaptureMode a() {
        return this.c;
    }

    public /* synthetic */ B4(NativeBarcodePick nativeBarcodePick) {
        this(nativeBarcodePick, ProxyCacheKt.getGlobalProxyCache());
    }

    public final void a(String itemData, boolean z) {
        Intrinsics.h(itemData, "itemData");
        this.f17104a.completeActionForItem(itemData, z);
    }
}
