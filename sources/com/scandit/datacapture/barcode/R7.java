package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final class R7 extends NativeBarcodeFindListener {

    /* renamed from: a, reason: collision with root package name */
    private final InternalBarcodeFindListener f17288a;
    private final ProxyCache b;
    private final WeakReference c;

    public /* synthetic */ R7(InternalBarcodeFindListener internalBarcodeFindListener, BarcodeFind barcodeFind) {
        this(internalBarcodeFindListener, barcodeFind, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onObservationStarted(NativeBarcodeFind mode) {
        Intrinsics.h(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.c.get();
        if (barcodeFind != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodeFind.class), null, mode, new N7(barcodeFind));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f17288a.a((BarcodeFind) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onObservationStopped(NativeBarcodeFind mode) {
        Intrinsics.h(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.c.get();
        if (barcodeFind != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodeFind.class), null, mode, new O7(barcodeFind));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f17288a.b((BarcodeFind) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchPaused(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        if (((BarcodeFind) this.c.get()) != null) {
            this.f17288a.a(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchStarted() {
        if (((BarcodeFind) this.c.get()) != null) {
            this.f17288a.onSearchStarted();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSearchStopped(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        if (((BarcodeFind) this.c.get()) != null) {
            this.f17288a.b(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindListener
    public final void onSessionUpdated(NativeBarcodeFind mode, NativeBarcodeFindSession session, NativeFrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeFind barcodeFind = (BarcodeFind) this.c.get();
        if (barcodeFind != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeFind.class), null, mode, new P7(barcodeFind));
            Intrinsics.g(orPut, "{\n            val _0 = p…0, session, _1)\n        }");
            FrameData frameData = (FrameData) this.b.getOrPut(reflectionFactory.b(NativeFrameData.class), null, data, new Q7(data));
            this.f17288a.a((BarcodeFind) orPut, session, frameData);
        }
    }

    public R7(InternalBarcodeFindListener _InternalBarcodeFindListener, BarcodeFind _BarcodeFind, ProxyCache proxyCache) {
        Intrinsics.h(_InternalBarcodeFindListener, "_InternalBarcodeFindListener");
        Intrinsics.h(_BarcodeFind, "_BarcodeFind");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17288a = _InternalBarcodeFindListener;
        this.b = proxyCache;
        this.c = new WeakReference(_BarcodeFind);
    }
}
