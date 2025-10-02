package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickSession;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* renamed from: com.scandit.datacapture.barcode.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0943z4 extends NativeBarcodePickListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickListener f18284a;
    private final ProxyCache b;
    private final WeakReference c;

    public /* synthetic */ C0943z4(BarcodePickListener barcodePickListener, BarcodePickInternal barcodePickInternal) {
        this(barcodePickListener, barcodePickInternal, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onItemResponseReceived(NativeBarcodePick mode, String id, boolean z) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(id, "id");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodePick.class), null, mode, new C0775p4(barcodePickInternal));
            Intrinsics.g(orPut, "{\n            val cached…edMode, id, ok)\n        }");
            this.f18284a.a((BarcodePickInternal) orPut, id, z);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onObservationStarted(NativeBarcodePick mode) {
        Intrinsics.h(mode, "mode");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodePick.class), null, mode, new C0793q4(barcodePickInternal));
            Intrinsics.g(orPut, "{\n            val cached…ted(cachedMode)\n        }");
            this.f18284a.a((BarcodePickInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onObservationStopped(NativeBarcodePick mode) {
        Intrinsics.h(mode, "mode");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodePick.class), null, mode, new C0808r4(barcodePickInternal));
            Intrinsics.g(orPut, "{\n            val cached…ped(cachedMode)\n        }");
            this.f18284a.b((BarcodePickInternal) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onPickUpdated(NativeBarcodePick mode, NativeBarcodePickSession session, NativeFrameData nativeFrameData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.c.get();
        if (barcodePickInternal != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodePick.class), null, mode, new C0845t4(barcodePickInternal));
            Intrinsics.g(orPut, "{\n            val cached…achedFrameData)\n        }");
            this.f18284a.a((BarcodePickInternal) orPut, (BarcodePickSession) this.b.getOrPut(reflectionFactory.b(NativeBarcodePickSession.class), null, session, new C0868u4(barcodePickInternal)), nativeFrameData != null ? (FrameData) this.b.getOrPut(reflectionFactory.b(NativeFrameData.class), null, nativeFrameData, new C0823s4(nativeFrameData)) : null);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onSessionUpdated(NativeBarcodePick mode, NativeBarcodePickSession session, NativeFrameData frameData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(frameData, "frameData");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.c.get();
        if (barcodePickInternal != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodePick.class), null, mode, new C0898w4(barcodePickInternal));
            Intrinsics.g(orPut, "{\n            val cached…achedFrameData)\n        }");
            BarcodePickSession barcodePickSession = (BarcodePickSession) this.b.getOrPut(reflectionFactory.b(NativeBarcodePickSession.class), null, session, new C0913x4(barcodePickInternal));
            FrameData frameData2 = (FrameData) this.b.getOrPut(reflectionFactory.b(NativeFrameData.class), null, frameData, new C0883v4(frameData));
            this.f18284a.b((BarcodePickInternal) orPut, barcodePickSession, frameData2);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickListener
    public final void onStyleShouldBeRequested(NativeBarcodePick mode, HashMap requestedData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(requestedData, "requestedData");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.c.get();
        if (barcodePickInternal != null) {
            Object orPut = this.b.getOrPut(Reflection.f24268a.b(NativeBarcodePick.class), null, mode, new C0928y4(barcodePickInternal));
            Intrinsics.g(orPut, "{\n            val cached… requestedData)\n        }");
            this.f18284a.a((BarcodePickInternal) orPut, requestedData);
        }
    }

    public C0943z4(BarcodePickListener barcodePickListener, BarcodePickInternal mode, ProxyCache proxyCache) {
        Intrinsics.h(barcodePickListener, "barcodePickListener");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18284a = barcodePickListener;
        this.b = proxyCache;
        this.c = new WeakReference(mode);
    }
}
