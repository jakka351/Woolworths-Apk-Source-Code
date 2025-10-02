package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountStateListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStateListener;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "mode", "", "onObservationStarted", "onObservationStopped", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountState;", "oldState", "newState", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "frameData", "onStateChanged", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountStateListener;", "_BarcodeCountStateListener", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "_BarcodeCount", "<init>", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountStateListener;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountStateListenerReversedAdapter extends NativeBarcodeCountStateListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountStateListener f17477a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeCountStateListenerReversedAdapter(BarcodeCountStateListener barcodeCountStateListener, BarcodeCount barcodeCount, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountStateListener, barcodeCount, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener
    public void onObservationStarted(@NotNull NativeBarcodeCount mode) {
        Intrinsics.h(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCount.class), null, mode, new j(barcodeCount));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStarted(_0)\n        }");
            this.f17477a.onObservationStarted((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener
    public void onObservationStopped(@NotNull NativeBarcodeCount mode) {
        Intrinsics.h(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeBarcodeCount.class), null, mode, new k(barcodeCount));
            Intrinsics.g(orPut, "{\n            val _0 = p…tionStopped(_0)\n        }");
            this.f17477a.onObservationStopped((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener
    public void onStateChanged(@NotNull BarcodeCountState oldState, @NotNull BarcodeCountState newState, @NotNull NativeFrameData frameData, @NotNull NativeBarcodeCount mode) {
        Intrinsics.h(oldState, "oldState");
        Intrinsics.h(newState, "newState");
        Intrinsics.h(frameData, "frameData");
        Intrinsics.h(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.c.get();
        if (barcodeCount != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            FrameData frameData2 = (FrameData) proxyCache.getOrPut(reflectionFactory.b(NativeFrameData.class), null, frameData, new l(frameData));
            Object orPut = this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCount.class), null, mode, new m(barcodeCount));
            Intrinsics.g(orPut, "{\n            val _0 = p…wState, _0, _1)\n        }");
            this.f17477a.onStateChanged(oldState, newState, frameData2, (BarcodeCount) orPut);
        }
    }

    public BarcodeCountStateListenerReversedAdapter(@NotNull BarcodeCountStateListener _BarcodeCountStateListener, @NotNull BarcodeCount _BarcodeCount, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCountStateListener, "_BarcodeCountStateListener");
        Intrinsics.h(_BarcodeCount, "_BarcodeCount");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17477a = _BarcodeCountStateListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeCount);
    }
}
